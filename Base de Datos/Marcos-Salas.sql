



DELIMITER $$
DROP PROCEDURE IF EXISTS sorteo $$ 
CREATE PROCEDURE sorteo(IN num_ganadores INT)
BEGIN
	DECLARE aleatorio INT;
	DECLARE cont INT;
    DECLARE error VARCHAR(100);
    DECLARE mje VARCHAR(100);
DECLARE EXIT HANDLER FOR SQLEXCEPTION
BEGIN
	
    SET mje = 'Error,intente nuevamente';
    ROLLBACK;
    END;
    START TRANSACTION;

	SET cont = 0;
	bucle:LOOP
		IF 	cont > num_ganadores THEN
			LEAVE bucle;
		ELSE
			SET aleatorio = ROUND(RAND()*(38+1),0);
            IF aleatorio = (SELECT codigo_cliente FROM cliente) THEN
				INSERT INTO ganadores(nombre,fecha,cod_cliente) VALUES (cliente.nombre_cliente,
				now(),cliente.codigo_cliente);
            ELSE 
            SET error = 'Error';
            END IF;
		
		END IF;
        SET cont = cont+1;
	END LOOP;
COMMIT;
END$$
DELIMITER ;

SELECT*FROM cliente;

CALL sorteo(3);
SELECT*FROM ganadores;

/* 2. Añade una columna llamada observaciones en la tabla cliente. A continuación crear un trigger llamado trigger_insertar_observaciones que después de insertar un ganador,
inserte automáticamente a cada cliente, en la columna observaciones, el texto “Ha ganado un premio en la fecha...” */
ALTER TABLE ganadores ADD observaciones VARCHAR(100);

DELIMITER $$
DROP TRIGGER IF EXISTS trigger_insertar_observaciones $$
CREATE TRIGGER trigger_insertar_observaciones
AFTER INSERT
ON ganadores FOR EACH ROW
BEGIN
INSERT INTO ganadores (observaciones) VALUES ('Ha ganado un premio en la fecha '+(SELECT fecha FROM ganadores));

END $$
DELIMITER ;

/* 3.Crear un procedimiento llamado productos_ganados que almacene en un parámetro de salida los productos que se van a otorgar a cada ganador.
Los productos que se van a otorgar a los ganadores serán los 3 productos más caros de la tienda. */

DELIMITER $$
DROP PROCEDURE IF EXISTS productos_ganados $$
CREATE PROCEDURE productos_ganados(OUT productos VARCHAR(17))
BEGIN
	SET productos = (SELECT precio_venta FROM producto ORDER BY precio_venta DESC LIMIT 3);
END $$
DELIMITER ;
select * from producto;
SELECT *FROM producto ORDER BY precio_venta desc limit 3;


























