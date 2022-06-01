create database libros_ventas;
use libros_ventas;

create table libros(
  codigo int auto_increment,
  titulo varchar(50),
  autor varchar(50),
  editorial varchar(30),
  precio float, 
  stock int,
  primary key (codigo)
 );

 create table ventas(
  numero int auto_increment,
  codigolibro int,
  precio float,
  cantidad int,
  primary key (numero)
 );

insert into libros(titulo, autor, editorial, precio, stock)
  values('Uno','Richard Bach','Planeta',15,100);   
 insert into libros(titulo, autor, editorial, precio, stock)
  values('Ilusiones','Richard Bach','Planeta',18,50);
 insert into libros(titulo, autor, editorial, precio, stock)
  values('El aleph','Borges','Emece',25,200);
 insert into libros(titulo, autor, editorial, precio, stock)
  values('Aprenda PHP','Mario Molina','Emece',45,200);
  
  # 2. crear una tabla registro_ventas con los siguientes campos: id, fecha, usuario, precio
  
  create table if not exists registro_ventas(
  id int not null auto_increment primary key,
  fecha_hora date,
  usuario varchar(100),
  precio float (7,2)
  );
  
  # 3. crear un trigger de tal manera que cada vez que se realice una venta se inserten los datos en
  -- la tabla registro
  
  delimiter $$
  create trigger insertar_registro_ventas
  after insert
  on ventas for each row
  begin
  
  insert into registro_ventas (fecha_hora, usuario, precio)
  values(now() ,current_user(), new.precio*new.cantidad);
  
  end$$
  delimiter ;
  
insert into ventas (codigolibro, precio, cantidad)
values(1, 15, 2);
  
select * from registro_ventas;
  
  # 4 Crear un trigger de tal manera que cada vez que se produce una venta se disminuye el stock
  
  delimiter $$
  create trigger control_stock
  before insert
  on ventas for each row
  begin
	update libros set stock = libros.stock - new.cantidad
		where new.codigolibro = libros.codigo;
  end$$
  delimiter ;
  
# 5 Crear un triger de tal manera que cada vez que cancelemos esa venta vuelve a aumentar el stock

delimiter $$
create trigger devolucion_libro
before delete
on ventas for each row
begin
	update libros set stock = libros.stock + old.cantidad
		where old.codigolibro = libros.codigo;
end$$
delimiter ;
  
# 1 Crear un procedimiento que devuelva el libro más vendido de cada editorial.
-- para ello le pasaremos por parámetro el nombre de la editorial y nos devolvera por salida
-- el nombre del libro

delimiter $$
create procedure top_libro(in editorial varchar(30),out titulo varchar(50))
begin
set titulo = (select libros.titulo FROM libros INNER JOIN ventas ON libros.codigo = ventas.codigolibro WHERE libros.editorial = editorial ORDER BY ventas.cantidad DESC LIMIT 1);
end $$