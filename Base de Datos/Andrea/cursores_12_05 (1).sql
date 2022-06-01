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
