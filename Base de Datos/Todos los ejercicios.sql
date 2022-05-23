/*Ejercicios*/
Delimiter $$
Create Procedure holaMundo()
begin
select "Saludo, Hola Mundo" as verSaludo;
End $$
delimiter ;
call holaMundo;
drop procedure holaMundo;

-- Crear función Hola Mundo
Delimiter $$
create function HolaMundoFuncion()
returns  varchar (50)
begin
declare saludo varchar (50);
set saludo ="Hola";
return saludo;
End $$
delimiter ;
select HolaMundoFuncion();
drop function HolaMundoFuncion;


-- Maximos minimos iguales

use jardineria;

delimiter $$
create procedure calcula_valores (in gama varchar(50),
out maximo decimal(6,2), out minimo decimal(6,2), out media decimal(6,2))
begin

set maximo = (select max(precio_venta)from producto where producto.gama = gama);
set media = (select avg(precio_venta) from producto where producto.gama = gama);
set minimo = (select min(precio_venta) from producto where producto.gama = gama);

end $$

delimiter ;

call calcula_valores ('Herramientas',@maximo, @minimo, @media);
select @maximo, @minimo, @media;


-- Crear un procedimiento que reciba un número real de entrada y muestre un mensaje indicando si el número es positivo
-- negativo o cero

Delimiter $$
	create procedure Pos_Neg_Cero(in num real(7,2), out resultado varchar (50))
	begin
		if num>0 then
		set resultado ="positivo";
		elseif num <0 then
		set resultado ="negativo";
		else 
		set resultado ="cero";
		end if;
End $$

delimiter ;
call Pos_Neg_Cero(16, @resultado);
select @resultado;
call Pos_Neg_Cero(-5, @resultado);
select @resultado;
drop procedure  Pos_Neg_Cero;

-- Crear una FUNCION que reciba un número real de entrada y muestre un mensaje indicando si el número es positivo
-- negativo o cero

Delimiter $$
	create function pos_Neg_Cero_Funcion (numero real (7,2))
	returns varchar(20)
	begin
	declare resultado varchar(20);
		if  numero>0 then
		set resultado="postivo";
        return resultado;
		elseif numero<0 then
		set resultado ="negativo";
        return resultado;
		else 
		set resultado ="cero";
		return resultado;
		end if;
End $$

delimiter ;
select pos_Neg_Cero_Funcion (12) ;
select pos_Neg_Cero_Funcion (0) ;
select pos_Neg_Cero_Funcion (-2) ;
drop function pos_Neg_Cero_Funcion;


-- Crear un procedimiento que reciba como parámetro en entrada un valor numérico que represente un día de la semana
-- y devuelva una cadena de caracteres con el nombre del día correspondiente. 

Delimiter $$
	create procedure dias_Semana(in nro int, out dia varchar (12))
	begin
    	 case nro
		 when 1 then
		 select "lunes" as dia;
		 when 2 then
		 select  "martes" as dia;
		 when 3 then
		 select "miercoles" as dia;
		 when 4 then
		 select "jueves" as dia;
		 when 5 then
		 select "viernes" as dia;
		 when 6 then
		 select "sabado" as dia;
		 when 7 then 
		 select "domingo" as dia;     
	 end case;
End $$

delimiter ;
call dias_Semana(1,@dia);
call dias_Semana(3,@dia);
call dias_Semana(7,@dia);
-- select @dia;
drop procedure dias_Semana;

-- Crear una FUNCION  que reciba como parámetro en entrada un valor numérico que represente un día de la semana
-- y devuelva una cadena de caracteres con el nombre del día correspondiente. 

set global log_bin_trust_function_creators = 1;
delimiter $$
create function semana(numero int)
returns varchar(15)
begin
declare dia varchar(15);
if numero = 1 then set dia = "Lunes"; return dia;
elseif numero = 2 then set dia = "Martes"; return dia;
elseif numero = 3 then set dia = "Miércoles"; return dia;
elseif numero = 4 then set dia = "Jueves"; return dia;
elseif numero = 5 then set dia = "Viernes"; return dia;
elseif numero = 6 then set dia = "Sábado"; return dia;
elseif numero = 7 then set dia = "Domingo"; return dia;
end if;
end $$
delimiter ;
select semana(4);

drop function semana;


 -- ########################                      Calculadora
 
 
create database if not exists procedimientos;
# Calculadora

create table calculadora(
id int auto_increment primary key,
resultado decimal (7,2),
operacion varchar (20),
fecha datetime 
);


delimiter $$
create procedure calculadora (in num1 int,in num2 int,in operacion varchar(20))
begin
declare resultado decimal (7,2);
declare registros int;


set registros =(select count(id) from calculadora);
if registros <= 5 then
    if operacion = 'Suma' then
        set resultado = num1 +num2;
    elseif operacion = 'Resta' then
        set resultado = num1 - num2;
    elseif operacion = 'Multiplicacion' then
        set resultado = num1 * num2;
    elseif operacion = 'Division' then
        set resultado = num1 / num2;
    else
        set resultado = null;
        set operacion = "Error";
        select "No existe esa operación!!!";

    end if;
    insert into calculadora (resultado,operacion,fecha) values (resultado,operacion,now());
else
    truncate table calculadora;
    select "La tabla ya tiene cinco registros, los borramos!";
end if;
end $$
delimiter ;

call calculadora (3,5,'Suma');
call calculadora (10,5,'Resta');
call calculadora (3,5,'Multiplicacion');
call calculadora (10,4,'Division');
select * from calculadora;

-- Crear una función que calcule el número de registros que tiene la tabla
delimiter $$

#set global log_bin_trust_function_creators = 1;

create function calcular_registros() returns int
begin
declare total_registros int;
set total_registros = (select count(id) from calculadora);
return total_registros;
end $$

delimiter ;

select calcular_registros();


--  ##########################                    procedimiento con whil

create database primitiva;
use primitiva;

create table if not exists pronostico(
numero int
);


-- procedimiento con while

delimiter $$
create procedure numeros_loteria()
begin

declare numeros int;
declare contador_numeros int;
set contador_numeros = 1;

truncate table pronostico; -- vacia la tabla,no la borra

while contador_numeros <= 6 do
	set numeros = rand()*50;
	insert into pronostico values (numeros);
    set contador_numeros = contador_numeros + 1;
end while;

end $$
delimiter ;

call numeros_loteria();
select * from pronostico;


-- procedimiento con loop

delimiter $$
create procedure loteria_loop()
begin

declare numeros int;
declare contador int;
set contador = 0;

truncate table pronostico;

bucle:loop
	if contador >= 6 then
    leave bucle; -- abandona el bucle cuando contador sea >= q 6
    end if;
    set numeros = rand()*50;
    insert into pronostico values (numeros);
    set contador = contador + 1;
    
end loop;
end $$;
delimiter ;

call loteria_loop();
select * from pronostico;

drop procedure loteria_loop;

drop database primitiva;



  # ################### trigger 
  
  
  create database libros_ventas;
use libros_ventas;

create table libros(
  codigo int auto_increment,
  titulo varchar(50),
  autor varchar(50),
  editorial varchar(30),
  precio float, 
  stock int,
  primary key (codigo)
 );

 create table ventas(
  numero int auto_increment,
  codigolibro int,
  precio float,
  cantidad int,
  primary key (numero)
 );

insert into libros(titulo, autor, editorial, precio, stock)
  values('Uno','Richard Bach','Planeta',15,100);   
 insert into libros(titulo, autor, editorial, precio, stock)
  values('Ilusiones','Richard Bach','Planeta',18,50);
 insert into libros(titulo, autor, editorial, precio, stock)
  values('El aleph','Borges','Emece',25,200);
 insert into libros(titulo, autor, editorial, precio, stock)
  values('Aprenda PHP','Mario Molina','Emece',45,200);
  
  # 2. crear una tabla registro_ventas con los siguientes campos: id, fecha, usuario, precio
  
  create table if not exists registro_ventas(
  id int not null auto_increment primary key,
  fecha_hora date,
  usuario varchar(100),
  precio float (7,2)
  );
  
  # 3. crear un trigger de tal manera que cada vez que se realice una venta se inserten los datos en
  -- la tabla registro
  
  delimiter $$
  create trigger insertar_registro_ventas
  after insert
  on ventas for each row -- define lo que se ejecutará cada vez que el disparador se active,
  begin
  
  insert into registro_ventas (fecha_hora, usuario, precio)
  values(now() ,current_user(), new.precio*new.cantidad); -- current_user devuelve el nombre del usuario y el nombre del equipo de la sesión actual, 	
  
  end$$
  delimiter ;
  
insert into ventas (codigolibro, precio, cantidad)
values(1, 15, 2);
  
select * from registro_ventas;
  
  # 4 Crear un trigger de tal manera que cada vez que se produce una venta se disminuye el stock
  
  delimiter $$
  create trigger control_stock
  before insert
  on ventas for each row
  begin
	update libros set stock = libros.stock - new.cantidad
		where new.codigolibro = libros.codigo;
  end$$
  delimiter ;
  
# 5 Crear un triger de tal manera que cada vez que cancelemos esa venta vuelve a aumentar el stock

delimiter $$
create trigger devolucion_libro
before delete
on ventas for each row
begin
	update libros set stock = libros.stock + old.cantidad
		where old.codigolibro = libros.codigo;
end$$
delimiter ;
  
# 1 Crear un procedimiento que devuelva el libro más vendido de cada editorial.
-- para ello le pasaremos por parámetro el nombre de la editorial y nos devolvera por salida
-- el nombre del libro

delimiter $$
create procedure top_libro(in editorial varchar(30),out titulo varchar(50))
begin
set titulo = (select libros.titulo FROM libros INNER JOIN ventas ON libros.codigo = ventas.codigolibro WHERE libros.editorial = editorial ORDER BY ventas.cantidad DESC LIMIT 1);
end $$



# ############################################################                       testCursores        


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
			IF fin= 1 THEN 
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



# ##################################################     creamos procedimiento HIJO

create database empleados_procedimientos;
use empleados_procedimientos;

create table empleados(
  documento char(8),
  nombre varchar(20),
  apellido varchar(20),
  sueldo decimal(6,2),
  cantidadhijos int,
  seccion varchar(20),
  primary key(documento)
 );

--  Ingrese algunos registros:
 insert into empleados values('22222222','Juan','Perez',300,2,'Contaduria');
 insert into empleados values('22333333','Luis','Lopez',700,0,'Contaduria');
 insert into empleados values ('22444444','Marta','Perez',500,1,'Sistemas');
 insert into empleados values('22555555','Susana','Garcia',400,2,'Secretaria');
 insert into empleados values('22666666','Jose Maria','Morales',1200,3,'Secretaria');
 
-- 1 Creamos un procedimiento que recibe un número de documento y un entero como parámetro de entrada y salida
-- y nos devuelva la cantidad de hijos que tenga ese empleado

# creamos procedimiento
delimiter $$
create procedure hijos_empleados(in documento varchar(8), out hijos int)
begin

set hijos = (select cantidadhijos from empleados where documento = empleados.documento);

end $$

delimiter ;
# llamamos procedimiento
call hijos_empleados('22333333', @hijos);
select @hijos;
call hijos_empleados('22666666', @hijos);
select @hijos;

drop procedure hijos_empleados;


# ###############################################  EJEMPLO DE TRIGGER


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


# ###############################  CURSORES


use jardineria;

create table nombres (
id int auto_increment primary key,
nombre varchar(100)
);

delimiter $$
create procedure producto (in param_gama varchar(50))

begin
declare valor varchar (100);
declare hecho int default 0;

#declaramos cursos
declare productos_gama_cursor cursor for
select nombre from producto where gama = param_gama;

# manejar el handler
declare continue handler for not found set hecho = 1;

# abrimos el cursor
open productos_gama_cursor;

# empezamos bucle
bucle:loop
fetch productos_gama_cursor into valor; 
if hecho = 1 then
leave bucle;
end if;

insert into nombres (nombre ) values (valor);
end loop bucle;

close productos_gama_cursor;

end$$

delimiter ;

call producto("Herramientas");
select * from nombres;

-- ---------------------------------- XXX ------------------------------------------------------ --


DROP DATABASE IF EXISTS cine;
CREATE DATABASE cine;

USE cine;
-- Paso 2
CREATE TABLE cuentas (
id_cuenta INTEGER UNSIGNED PRIMARY KEY,
saldo DECIMAL(11,2) UNSIGNED CHECK (saldo >= 0)
);
CREATE TABLE entradas (
id_butaca INTEGER UNSIGNED PRIMARY KEY,
nif VARCHAR(9)
);
INSERT INTO cuentas VALUES(1, 20);
INSERT INTO cuentas VALUES(2, 10);

-- Solución 1: Con DECLARE CONTINUE HANDLER ...
DELIMITER $$
DROP PROCEDURE IF EXISTS comprar_entrada$$
CREATE PROCEDURE comprar_entrada(IN nif VARCHAR(9),
IN id_cuenta INT UNSIGNED,
IN id_butaca INT UNSIGNED,
OUT error TINYINT UNSIGNED)
BEGIN
DECLARE CONTINUE HANDLER FOR 1264, 1062
BEGIN
SET error = 1;
END;
-- Inicio la transacción
START TRANSACTION;
SET error = 0;
-- Cobramos la entrada
UPDATE cuentas SET saldo = saldo - 5
WHERE cuentas.id_cuenta = id_cuenta;
-- Reservo la butaca
INSERT INTO entradas VALUES (id_butaca, nif);
-- Compruebo si ha ocurrido algún error
IF error = 0 THEN
COMMIT;
ELSE
ROLLBACK;
END IF;
END
DELIMITER ;
CALL comprar_entrada('11111111A', 1, 10, @error);
CALL comprar_entrada('11111111A', 1, 11, @error);
CALL comprar_entrada('11111111A', 1, 12, @error);
CALL comprar_entrada('11111111A', 1, 13, @error);
CALL comprar_entrada('11111111A', 1, 14, @error);
CALL comprar_entrada('22222222B', 2, 10, @error);
SELECT @error;
SELECT * FROM cuentas;
SELECT * FROM entradas;





  










