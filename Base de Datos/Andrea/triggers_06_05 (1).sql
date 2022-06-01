
-- EJEMPLO DE TRIGGER
create database userkey; 
use userkey;

create table usuarios(
nombre varchar(30),
clave varchar(30),
primary key (nombre)
);

create table clavesanteriores(
numero int auto_increment,
nombre varchar(30),
clave varchar(30),
primary key (numero)
);

delimiter $$
create trigger before_usuarios_update
before update
on usuarios for each row
begin
insert into clavesanteriores (nombre, clave) values (old.nombre, old.clave);
end $$
delimiter ;

insert into usuarios (nombre, clave) values ('marcos', '1234');

select * from usuarios;

update usuarios set clave = 'admin' where nombre like 'marcos';
select * from clavesanteriores;
update usuarios set clave = 'dam' where nombre like 'marcos';


-- EJEMPLO DOS - EJERCICIOS TRIGGER 1
create database if not exists examenesTest;
use examenesTest;

create table alumnos(
id int unsigned auto_increment primary key, 
nombre varchar (30),
apellido1 varchar(30),
apellido2 varchar(30),
nota float
);

delimiter $$
create trigger check_nota_before_insert
BEFORE INSERT
ON alumnos FOR EACH ROW
BEGIN

if new.nota < 0 THEN
set new.nota = 0;
elseif new.nota >10 then
set new.nota = 10;
end if;
end $$
delimiter ;

delimiter $$
create trigger check_nota_before_update
before update
on alumnos for each row
begin
if new.nota < 0 THEN
set new.nota = 0;
elseif new.nota >10 then
set new.nota = 10;
end if;
end $$
delimiter ;

insert into alumnos values (6, 'Pepe', 'López', 'Sanchez', 0);
insert into alumnos values (2, 'María', 'Sanchez', 'Sanchez', 11);
insert into alumnos values (3, 'Juan', 'Perez', 'Sanchez', 8.50);
insert into alumnos values (4, 'Andres', 'Ruiz', 'Sanchez', -1);

select * from alumnos;



# 1 Crea una base de datos llamada testDos que contenga una tabla llamada alumnos con las siguientes columnas
-- Tabla alumno: id, nombre, apellido1, apellido2, email. 
create database if not exists testDos;
use testDos;

create table alumnos(
id int unsigned auto_increment primary key, 
nombre varchar (30),
apellido1 varchar(30),
apellido2 varchar(30),
email varchar(100)
);
-- escribir un procedimiento llamado crear_email que dados los parámetros de entrada: nombre, apellido1, apellido2 y dominio
-- cree una dirección de email y la devuelva como salida

delimiter $$
create procedure crear_email(in nombre varchar (30),in apellido1 varchar (30),
in apellido2 varchar (30),in dominio varchar(30),out email varchar(30))
begin
set email = concat(left(nombre,1),left(apellido1,3),left(apellido2,3),'@',dominio);

end $$
delimiter ;

-- crear un trigger: con las siguientes características
-- crear_email_before_insert
-- se ejecuta sobre la tabla alumnos
-- se ejecuta antes de una operación de inserción
-- si el nuevo valor del mail que se quiere inserta es null, entonces se le creará automáticamnt un email y se insertará
-- en la tabla
-- si el nuevo valor del mail no es null se guardará en la tabla el valor del mail

DELIMITER $$
create trigger trigger_crear_email_before_insert
BEFORE INSERT
ON ALUMNOS FOR EACH ROW
BEGIN

IF new.email is null then
	call crear_email(new.nombre, new.apellido1, new.apellido2, 'gmail', @email);
    set new.email = @email;

END IF;
END $$
delimiter ;


insert into alumnos (nombre,apellido1,apellido2,email)values ('luis','olmo','garcia','info@gmail.com');
insert into alumnos (nombre,apellido1,apellido2,email)values ('luisa','jimenez','jimenez',null);
select * from alumnos;

-- Modifica el ejercicio anterior con las siguientes caracteristicas
-- trigger: guardar_email_after_update:
-- se ejecuta sobre la tabla alumnos
-- se ejecuta después de una operracion de actualización
-- cada vez que un alumno modifique su direccin de email se deberá insertar un nuevo registro en 
-- una tabla llamada log_cambios_email, que incluye
-- id, id_alumno, fecha hora, old_email, new_email;

CREATE TABLE log_cambios_email(
id int auto_increment primary key,
id_alumno int unsigned,
fecha_hora datetime,
old_email varchar(30),
new_email varchar (30),
foreign key(id_alumno) references alumnos(id)
);

DELIMITER $$
create trigger trigger_guardar_email_after_update
AFTER UPDATE
ON ALUMNOS FOR EACH ROW
BEGIN
IF old.email not like new.email THEN
	insert into log_cambios_email (id_alumno,fecha_hora,old_email,new_email) values (old.id,now(),old.email,new.email);
END IF;
END $$
delimiter ;

UPDATE alumnos set email = 'nuevomail@gmail.com' where id= 3;
select * from alumnos;
select * from log_cambios_email;

-- Modifica el ejercicio anterior y añada un nuevo trigger que tenga las siguientes caracterísitcas:
-- Si no puedes borrar ejecuta: SET FOREIGN_KEY_CHECKS = 0;
-- Trigger: trigger_guardad_alumno_eliminados:
-- se ejecuta sobre la tabla alumnos
-- se ejecuta después de una operación de borrado
-- cada vez que se elimine un alumno de la tabla alumnos se deberá insertar un nuevo registro en una tabla
-- llamada log_alumnos_eliminados

-- La tabla log_alumnos_eliminados contiene los siguientes campos
-- id, id_alumno, fecha_hora, nombre, apellido1, apellido2, email

create table if not exists log_alumnos_eliminados(
id int auto_increment not null primary key,
id_alumno int unsigned,
fecha_hora datetime,
nombre varchar(30),
apellido1 varchar(30),
apellido2 varchar(30),
email varchar(100),
foreign key (id_alumno) references alumnos(id)
);

delimiter $$
create trigger guardar_alumnos_eliminados
after delete
on alumnos for each row
begin
insert into log_alumnos_eliminados (id_alumno, fecha_hora, nombre, apellido1, apellido2, email)
values (old.id, now(), old.nombre, old.apellido1, old.apellido2, old.email);
end $$
delimiter ;

set foreign_key_checks = 0;
delete from alumnos where id = 1;