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

truncate table pronostico;

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
    leave bucle;
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