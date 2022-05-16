 /*1.	Escribe las sentencias SQL necesarias para crear una base de datos llamada test, 
una tabla llamada alumnos y 4 sentencias de inserción para inicializar la tabla. 
La tabla alumnos está formada por las siguientes columnas:
•	id (entero sin signo y clave primaria)
•	nombre (cadena de caracteres)
•	apellido1 (cadena de caracteres)
•	apellido2 (cadena de caracteres
•	fecha_nacimiento (fecha)
*/

create database test;
use test;
create table alumnos (
id int auto_increment primary key,
nombre varchar (30),
apellido1 varchar (30),
apellido2 varchar (30),
fecha_nacimiento DATE
);

insert into alumnos (nombre,apellido1,apellido2,fecha_nacimiento) values ('pepe','sanz','sanz','1970-09-10');
insert into alumnos (nombre,apellido1,apellido2,fecha_nacimiento) values ('marta','sanz','sanz','1980-09-09');
insert into alumnos (nombre,apellido1,apellido2,fecha_nacimiento) values ('luis','sanz','sanz','1993-09-12');
insert into alumnos (nombre,apellido1,apellido2,fecha_nacimiento) values ('maria','jimenez','sanz','1990-10-11');
alter table alumnos add edad INT;
select * from alumnos;

/*
Escriba una función llamada calcular_edad que reciba una fecha y devuelva el 
número de años que han pasado desde la fecha actual hasta la fecha pasada como parámetro: TIMESTAMPDIFF
•	Función: calcular_edad
•	Entrada: Fecha
•	Salida: Número de años (entero)

*/

/* Si TIRA ERROR EN EL DELIMITER*/


delimiter $$
create function calcular_edad (fecha date)
returns int
begin
declare edad int;
set edad = timestampdiff(year,fecha,curdate());

return edad;
end $$

/*
Ahora escriba un procedimiento que permita calcular la edad de todos 
los alumnos que ya existen en la tabla. Para esto será necesario crear un
 procedimiento llamado actualizar_columna_edad que calcule la edad de cada alumno y 
 actualice la tabla. Este procedimiento hará uso de 
la función calcular_edad que hemos creado en el paso anterior.
*/
DELIMITER $$
CREATE PROCEDURE actualizar_columna_edad()
BEGIN
DECLARE fecha_nacimiento DATE;
DECLARE edad INT;
DECLARE id INT;
DECLARE fin INT DEFAULT 0;
DECLARE cursor_alumnos CURSOR FOR 
SELECT alumnos.id,alumnos.fecha_nacimiento FROM alumnos;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET fin= 1;
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

-- Ejecutamos el procedimiento y comprobamos el resultado 
CALL actualizar_columna_edad();





