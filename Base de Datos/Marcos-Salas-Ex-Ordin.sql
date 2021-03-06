/*
1) Crear una función llamada profe_alumno que reciba como parámetro de entrada un
nif y devuelva si es profesor o alumno.
*/
/*
 drop function profe_alumno;*/
delimiter $$
create function profe_alumno (numero varchar (30)) returns varchar (30)
begin

declare resultado varchar (30);
set resultado = (select tipo from persona where nif like numero);
return resultado;
end $$

delimiter ;
select profe_alumno('11105554G');

-- profe 11105554G
-- select nif,tipo from persona where tipo='profesor';

/*
2) Crear un procedimiento donde le pasemos un nif y utilizando la función ya creada
actualice los nombres de las personas, añadiendo la palabra profesor o alumno al
nombre, según sean. Controlar los errores con un handler genérico.
Ej: Profesor Juan
EJ: Alumno Juan*/

delimiter $$ 
create procedure actualizar_nombre(in nifentrada varchar(30))
begin
	declare nombre_tipo varchar(60);
	declare profesor varchar (100);
	declare alumno varchar (100);
    declare exit handler for sqlexception select 'Error';	
    
	set profesor='profesor';
    set alumno='alumno';
    
	set metodo = (select profe_alumno(nifentrada));
    
	if metodo= 'alumno' then    
    update persona set nombre = concat(alumno,' ',nombre) where tipo= 'alumno';
    
    elseif metodo= 'profesor' then
    update persona set nombre = concat(profesor,(metodo),' ',nombre)  where tipo= 'profesor';
    end if;
    
end $$
call actualizar_nombre (11105554G);
-- select actualizar_nombre

-- select nif,tipo from persona where tipo='profesor';

/*
3) Crear un trigger que se llame cambiador_nombres antes de insertar compruebe la
asignatura, si ésta es base de datos o programación que cambie el nombre a ASIGNATURA
ABURRIDA. De lo contrario pone el nombre en mayúsculas en la base de datos.  upper
(parámetro).
*/

delimiter $$
create trigger cambiador_nombres
before insert 
on asignatura for each row
begin
	declare nombreinsrt varchar(60);
    set nombreinsrt = new.nombre;
	if nombreinsrt = 'base de datos' or nombreinsrt = 'programación' then
		set new.nombre = 'ASIGNATURA ABURRIDA';
	else 
		set new.nombre = upper(nombreinsrt);
    end if;
end $$

/*
4) Crear un procedimiento llamado sumatorio_ids que sume los ids de las personas que son
mujeres y viven en una determinada ciudad.
- Recibirá un parámetro de entrada, la ciudad.
- Deberá devolver el resultado en un parámetro de salida.
Ejemplo: Si hay dos personas el id 3 que se llama Ana y el id 44 que se llama Luis, el resultado
será 47.
*/

delimiter $$
create procedure sumatorio_ids( in ciudad varchar(100),out resultado int)
BEGIN
DECLARE termina INT DEFAULT 0;
DECLARE cantidad INT DEFAULT 0;
DECLARE total_payment CURSOR FOR
select id from persona where sexo = 'M' and persona.ciudad = ciudad;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET termina= 1;
set resultado = 0;
OPEN total_payment;
bucle:LOOP
FETCH total_payment INTO cantidad; -- Acá dice que lo que tiene el cursor lo guarde en cantidad
	IF termina= 1 THEN 
	LEAVE bucle;
	END IF;
set resultado = resultado +cantidad; -- y esto seria por cada vuelta lo que tiene cantidad se lo asigno a res(resultado seria una acum)
END LOOP;
CLOSE total_payment;
END $$

DELIMITER ;
CALL sumatorio_ids('Almería',@resultado);
select @resultado;
























