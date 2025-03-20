DROP TABLE TB_Productos;
CREATE TABLE TB_Productos (
    id              NUMBER(5) PRIMARY KEY,
    nombre_producto VARCHAR2(15) NOT NULL,
    tipo_producto   VARCHAR2(15) NOT NULL,
    precio          NUMBER(10,2) NOT NULL,
    cantidad_stock  NUMBER(5) NOT NULL
);
--Insertar productos en la tabla (1 punto)
INSERT INTO TB_Productos VALUES(1,'manzana', 'Alimentación', 15.99, 1);
INSERT INTO TB_Productos VALUES(2, 'ordenador', 'Electrónica', 12.99, 2);
INSERT INTO TB_Productos VALUES(3, 'camisa', 'Ropa', 11.99, 3);
INSERT INTO TB_Productos VALUES(4, 'pantalon', 'Ropa', 5.99, 6);
INSERT INTO TB_Productos VALUES(5, 'huevos', 'Alimentación', 6.99, 8);
INSERT INTO TB_Productos VALUES(6, 'monitor', 'Electrónica', 34.99, 9);

--Consultar todos los productos de la tabla
SELECT id, 
    nombre_producto,
    tipo_producto,
    precio,
    cantidad_stock
FROM TB_Productos;

--Calcular el precio medio y cuantos productos por cada tipo.
SELECT tipo_producto, COUNT(tipo_producto) as TOTAL_EMPLEADOS, 
    SUM(tipo_productos) AS TOTAL_SALARIO, AVG(precio) AS MEDIA_SALARIO
FROM TB_Productos; 