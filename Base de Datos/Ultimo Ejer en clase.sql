/*
1)	Crear un procedimiento llamado tipo_telefonos que reciba un parámetro de entrada, el teléfono del cliente y nos guarde en una variable de salida el tipo de teléfono que es:
-	Si empieza por 6 = ‘Es un móvil’
-	Si empieza por 9 = ‘ Es un fijo’
-	Cualquier otro = ‘ni idea’.

*/

delimiter $$
create procedure tipo_telefono (in phone varchar(20), out tipo varchar (20))
begin
declare resultado varchar (20);
if left(phone,1) = '6' then
set tipo = 'movil';
elseif left(phone,1) = '9' then
set tipo = 'fijo';
else
set tipo = 'ni idea';
end if;
end $$
delimiter ;

/*
2)	Crear un procedimiento llamado beneficios que almacene en un parámetro 
de salida el producto con mayor beneficio (tenemos que tener en cuenta el 
precio de coste y el precio de venta para ello) y en otro parámetro de salida el producto con menor beneficio
El procedimiento informará del texto: “El producto con mayor beneficio es 
PRODUCTO y el producto con menos beneficio es PRODUCTO.

*/

delimiter $$
 create procedure beneficios(out resultado varchar(300))
 begin 
	declare mayor_beneficio varchar(30);
	declare menor_beneficio varchar(30);
		set mayor_beneficio = (select nombre from producto order by (precio_venta-precio_proveedor) desc limit 1);
		set menor_beneficio = (select nombre from producto order by (precio_venta-precio_proveedor) asc limit 1);
		set resultado = concat("El producto con mayor beneficio es  ", mayor_beneficio, " y el producto con menor beneficio es  ", menor_beneficio);
 end $$;
 delimiter ;

call beneficios(@resultado);
select @resultado;

/*
3)	Crear un trigger que al borrar un producto meta el nombre en la tabla productos_borrados. 
Esta tabla se compone de id autoincrementable y el nombre del producto.
 SET FOREIGN_KEY_CHECKS = 0;
*/

create table productos_borrados(
id int auto_increment primary key,
nombre varchar (100)
);

DELIMITER $$
create trigger trigger_borrados
AFTER DELETE
ON producto FOR EACH ROW
BEGIN
INSERT INTO productos_borrados (nombre)
 values (old.nombre);
END $$
 
 SET FOREIGN_KEY_CHECKS = 0;
delete from producto where codigo_producto='11679';
select * from productos_borrados;

/*
4)	Crear un procedimiento que a través de un cursor nos almacene en un parámetro 
de salida el total de pagos del método de pago que le 
pasemos como parámetro de entrada.
*/
delimiter $$
create procedure total_pago( in metodo varchar (50), out resultado decimal(15,2))
BEGIN
DECLARE termina INT DEFAULT 0;
DECLARE cantidad INT DEFAULT 0;
DECLARE total_payment CURSOR FOR
SELECT total from pago where forma_pago like metodo;
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
CALL total_pago('Paypal',@resultado);
select @resultado;