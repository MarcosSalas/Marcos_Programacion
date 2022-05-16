create database test1;
use test1;
create table alumnos(
id int not null primary key,
nombre varchar (250),
apellido varchar (100),
apellido2 varchar (100),
fecha_naciento date
);

alter table alumnos add edad int not null;

DELIMITER $$
CREATE FUNCTION calcular_edad(fecha_naciento,fecha_actual
date,now()) RETURNS INT UNSIGNED
BEGIN
RETURN total;
END
$$


DELIMITER $$
create trigger calcular_edad
AFTER UPDATE
ON ALUMNOS FOR EACH ROW
BEGIN
IF old.email not like new.email THEN
	insert into alumnos (fecha_nacimiento,fec) values (old.id,now(),old.email,new.email);
END IF;
END $$

