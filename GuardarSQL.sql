USE ventas;
-- procedimientos
-- Triggers
-- Funciones
-- Trasacciones

-- las funciones estan echas para procesar valores no sentencias, las funciones no deberian de tener select, insert , update y delete
-- solo recibir valores hacer algo y devolverlo
DELIMITER //
CREATE FUNCTION generarCorreo(nombre VARCHAR(30), apellidos VARCHAR(30))
RETURNS VARCHAR(100)
BEGIN
	RETURN CONCAT(SUBSTRING())
END //
DELIMITER ;

-- 1 2 3 4 -- asi funciona la cadena
-- R I G O