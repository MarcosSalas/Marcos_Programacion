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
