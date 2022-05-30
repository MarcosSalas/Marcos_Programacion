Delimiter $$
create procedure tipo_telefonos(in telefono int,out tipoTel varchar(20))
begin
	if left (telefono,1)=6 then
	set tipoTel ='Es un móvil';
	elseif left (telefono,1)=9 then
	set tipoTel='Es un fijo';
	else  
	set tipoTel ='ni idea';
	end if;
end $$
call tipo_telefonos(962,@tipoTel);
SELECT @tipoTel;

/*Crear un procedimiento llamado beneficios que almacene en un parámetro de salida el
producto con mayor beneficio (tenemos que tener en cuenta el precio de coste y el
precio de venta para ello) y en otro parámetro de salida el producto con menor
beneficio*/

Delimiter $$
create procedure beneficios (out mayorBen int,out menorBen int)
begin
declare guardar int;

select precio_venta from producto;





end $$

select producto.nombre from producto order by precio_venta - precio_proveedor -- desc;-- limit 1;
-- select precio_venta-precio_proveedor from producto order by precio_venta asc; -- limit 1;





