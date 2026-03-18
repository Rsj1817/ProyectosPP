-- insert into select
CREATE DATABASE IF NOT EXISTS curso_edutin;

USE punto_venta;

CREATE TABLE ClientesActivos(
	ID_cliente INT,
    nombre VARCHAR(100),
    email VARCHAR(100)
    );
    
INSERT INTO ClientesActivos(ID_cliente, nombre, email) 
SELECT ID_clientes, nombre, email
FROM clientes
WHERE activo = 1;

    