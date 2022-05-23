-- 1. Crear una tabla que te muestre cuántos alumnos hay en cada curso.
create table CantAlum  select curso_escolar.id, count(alumno_se_matricula_asignatura.id_alumno) as Alumnos_Matr_cantidad  from curso_escolar inner join alumno_se_matricula_asignatura on   curso_escolar.id = alumno_se_matricula_asignatura.id_curso_escolar   group by curso_escolar.id;
-- 2. Modificar el nombre de las profesoras de tal manera que su nombre empiece por Dra. Realizar en una transacción y realizar una cancelación de la transacción. Ej: Dra María
SET @@autocommit = 0;
SELECT @@autocommit;
START TRANSACTION;
UPDATE persona inner join profesor on persona.id = profesor.id_profesor SET persona.nombre = concat("Dra." , persona.nombre)  where persona.sexo = "M";
SELECT * FROM persona inner join profesor on persona.id = profesor.id_profesor  where persona.sexo = "M";
ROLLBACK;
-- 3. Borrar las personas nacidas en el año 2000. Si la consulta te da error activa: ; Realizar una transacción y cancelar el borrado. 
SET @@autocommit = 0;
SELECT @@autocommit;
START TRANSACTION;
DELETE persona.* FROM persona WHERE persona.fecha_nacimiento like '2000%';
ROLLBACK;
-- 4. Crear una vista que te muestre el nombre del alumno y en cuántos créditos se ha matriculado
CREATE VIEW Nom_Cred AS SELECT persona.nombre, sum(asignatura.creditos)as Creditos FROM persona inner join alumno_se_matricula_asignatura on persona.id = alumno_se_matricula_asignatura.id_alumno inner join asignatura on alumno_se_matricula_asignatura.id_asignatura = asignatura.id group by persona.nombre, asignatura.creditos;
DROP view Nom_Cred;
select *from Nom_Cred;
-- 5. Crea una vista que te muestre los profesores de primero: Debe mostrar el id del profesor, el nombre y el nombre de la asignatura.
create view prof_primero as select distinct profesor.id_profesor as ID, persona.nombre as nombre, asignatura.nombre as asignatura from persona inner join profesor on persona.id = profesor.id_profesor  inner join asignatura on profesor.id_profesor = asignatura.id_profesor  where asignatura.curso like 1;
-- 6. Crea una vista que te muestre al personal no docente (Usar multitabla)
create view Pers_docente as select persona.nombre as Docente from persona inner join profesor  on persona.id = profesor.id_profesor;