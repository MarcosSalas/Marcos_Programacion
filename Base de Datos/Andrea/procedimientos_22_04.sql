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

