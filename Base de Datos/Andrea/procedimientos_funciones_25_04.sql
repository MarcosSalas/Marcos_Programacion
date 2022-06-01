
-- Crear procedimiento Hola Mundo
delimiter $$
create procedure saludo()
begin
select "Hola Mundo";
end $$
delimiter ;
call saludo();
drop procedure saludo;

-- Crear función Hola Mundo
set global log_bin_trust_function_creators = 1;
delimiter $$
create function saludar()
returns varchar(50)
begin
declare saludo varchar(50);
set saludo =  "Hola Mundo";
return saludo;
end $$
delimiter ;
select saludar();
drop function saludar;

-- Crear un procedimiento que reciba un número real de entrada y muestre un mensaje indicando si el número es positivo
-- negativo o cero

delimiter $$
create procedure tipo_numero(in numero int, out tipo varchar(15))
begin
if numero = 0 then set tipo = "Cero"; 
elseif numero > 0 then set tipo = "Positivo"; 
else set tipo = "Negativo";
end if;
end $$
delimiter ;
call tipo_numero(5, @tipo);
select @tipo;
call tipo_numero(0, @tipo);
select @tipo;

delimiter $$
create function tipo_numero_dos(numero int)
returns varchar(15)
begin
declare tipo varchar(15);
if numero = 0 then set tipo = "Cero"; return tipo;
elseif numero > 0 then set tipo = "Positivo"; return tipo;
else set tipo = "Negativo"; return tipo;
end if;
end $$
delimiter ;
select tipo_numero_dos(8);
select tipo_numero_dos(-35);

-- Crear un procedimiento que reciba como parámetro en entrada un valor numérico que represente un día de la semana
-- y devuelva una cadena de caracteres con el nombre del día correspondiente. 

delimiter $$
create procedure dia_semana(in numero int, out día varchar(15))
begin
if numero = 1 then set dia = "Lunes";
elseif numero = 2 then set dia = "Martes";
elseif numero = 3 then set dia = "Miércoles";
elseif numero = 4 then set dia = "Jueves";
elseif numero = 5 then set dia = "Viernes";
elseif numero = 6 then set dia = "Sábado";
elseif numero = 7 then set dia = "Domingo";
end if;
end $$
delimiter ;
call dia_semana(4, @dia);
select @dia;

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