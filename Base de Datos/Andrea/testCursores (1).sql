create database testCursores;
use testCursores;

create table if not exists alumnos(
id int auto_increment primary key not null,
nombre varchar(30),
apellido1 varchar(30),
apellido2 varchar(30),
fecha_nacimiento date
);

insert into alumnos (nombre, apellido1, apellido2, fecha_nacimiento)
values ('iker', 'elorduy', 'sanchez', "1983-09-09");
insert into alumnos (nombre, apellido1, apellido2, fecha_nacimiento)
values ('andrea','fernandez','perez', "1987-11-04");
insert into alumnos (nombre, apellido1, apellido2, fecha_nacimiento)
values ('miryam', 'fernandez', 'fernandez', "1988-03-24");
insert into alumnos (nombre, apellido1, apellido2, fecha_nacimiento)
values ('igor', 'fernandez', 'elorduy', "1990-03-14");

alter table alumnos add edad int;

set global log_bin_trust_function_creators = 1;

delimiter $$
create function calcular_edad (fecha date) returns int
begin
declare anios int;

set anios = timestampdiff(year, fecha, now());

return anios;
end$$
delimiter ;

select calcular_edad("1983-09-09");

DELIMITER $$
CREATE PROCEDURE actualizar_columna_edad()
BEGIN
#variables
DECLARE fecha_nacimiento DATE;
DECLARE edad INT;
DECLARE id INT;
DECLARE fin INT DEFAULT 0;

#declaramos cursor
DECLARE cursor_alumnos CURSOR FOR 
SELECT alumnos.id,alumnos.fecha_nacimiento FROM alumnos;
#handler obligatorio para el cursor
DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin= 1;
#abrimos cursor
OPEN cursor_alumnos;
bucle:LOOP
FETCH cursor_alumnos INTO id,fecha_nacimiento;
IF
fin= 1
THEN 
LEAVE bucle;
END IF;
SET edad=calcular_edad(fecha_nacimiento);
UPDATE alumnos SET alumnos.edad=edad WHERE alumnos.id=id;
END LOOP;
CLOSE cursor_alumnos;
END $$
DELIMITER ;
call actualizar_columna_edad();

alter table alumnos add email varchar(100);

delimiter $$
create procedure crear_email(in nombre varchar (30),in apellido1 varchar (30),
in apellido2 varchar (30),in dominio varchar(30),out email varchar(30))
begin
set email = concat(left(nombre,1),left(apellido1,3),left(apellido2,3),'@',dominio);

end $$
delimiter ;

delimiter $$
create procedure actualizar_columna_email_alumnos()
begin
#declarar variables
declare fin int default 0;
declare nombre varchar(30);
declare apellido1 varchar(30);
declare apellido2 varchar(30);
declare email varchar(100);
declare id int;

#declar cursor
declare cursor_alumnos cursor for
select alumnos.id, alumnos.nombre, alumnos.apellido1, alumnos.apellido2 from alumnos;

# manejar el handler , obligatorio con cursores
declare continue handler for not found set fin = 1;

#abrimos cursor
open cursor_alumnos;

bucle:loop
fetch cursor_alumnos into id, nombre, apellido1, apellido2;
if fin = 1 then
leave bucle;
end if;
call crear_email(nombre, apellido1, apellido2, 'gmail.com', @email);
set email = @email;
UPDATE alumnos SET alumnos.email=email WHERE alumnos.id=id;
end loop;

close cursor_alumnos;

end$$
delimiter ;
call actualizar_columna_email_alumnos();


delimiter $$
create procedure crear_lista_emails_alumnos(out salida varchar(5000))
begin
#variables
declare terminar int default 0;
declare email varchar(5000);


#declar cursor
declare cursor_alumnos cursor for
select alumnos.email from alumnos;

# manejar el handler , obligatorio con cursores
declare continue handler for not found set terminar = 1;

set salida = '';
# abrimos cursor;
open cursor_alumnos;

bucle:loop
fetch cursor_alumnos into email;
if terminar = 1 then
leave bucle;
end if;

set salida = concat_ws(email, '; ', salida);
end loop;

end$$
delimiter ;

call crear_lista_emails_alumnos(@salida);
select @salida;




select * from alumnos;

drop database testCursores;