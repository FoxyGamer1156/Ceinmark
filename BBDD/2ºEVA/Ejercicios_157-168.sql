create database tienda;
use tienda;
CREATE TABLE productos(
Id_producto int primary key,
Nombre_producto varchar(30),
Categoria varchar(30),
Precio_unidad decimal(10,2)
);
CREATE TABLE ventas(
Id_venta int primary key,
Id_producto int,
Cantidad_vendida int,
Fecha_venta date,
Precio_total decimal(10,2),
Foreign key (id_producto) references productos(id_producto)
);

-- PRODUCTOS
INSERT INTO productos (Id_producto, Nombre_producto, Categoria, Precio_unidad) VALUES
(1, 'Laptop', 'Tecnologia', 900.00),
(2, 'Mouse', 'Tecnologia', 20.00),
(3, 'Teclado', 'Tecnologia', 35.00),
(4, 'Monitor', 'Tecnologia', 250.00),
(5, 'Auriculares', 'Tecnologia', 80.00),
(6, 'Silla Oficina', 'Muebles', 150.00),
(7, 'Mesa Escritorio', 'Muebles', 300.00),
(8, 'Impresora', 'Tecnologia', 180.00);


-- VENTAS
INSERT INTO ventas (Id_venta, Id_producto, Cantidad_vendida, Fecha_venta, Precio_total) VALUES
(1, 1, 1, '2025-01-03', 900.00),
(2, 2, 2, '2025-01-03', 40.00),
(3, 3, 1, '2025-01-04', 35.00),
(4, 4, 1, '2025-01-05', 250.00),
(5, 5, 3, '2025-01-06', 240.00),
(6, 6, 1, '2025-01-07', 150.00),
(7, 7, 1, '2025-01-08', 300.00),
(8, 2, 5, '2025-01-09', 100.00),
(9, 3, 4, '2025-01-10', 140.00),
(10, 8, 1, '2025-01-11', 180.00),
(11, 5, 2, '2025-01-12', 160.00),
(12, 4, 1, '2025-01-13', 250.00),
(13, 2, 6, '2025-01-14', 120.00),
(14, 3, 2, '2025-01-15', 70.00),
(15, 6, 1, '2025-01-16', 150.00),
(16, 1, 1, '2025-02-02', 900.00),
(17, 2, 3, '2025-02-03', 60.00),
(18, 4, 1, '2025-02-04', 250.00),
(19, 5, 4, '2025-02-05', 320.00),
(20, 8, 2, '2025-02-06', 360.00),
(21, 3, 1, '2025-02-07', 35.00),
(22, 2, 7, '2025-02-08', 140.00),
(23, 7, 1, '2025-02-09', 300.00),
(24, 5, 1, '2025-02-10', 80.00),
(25, 4, 1, '2025-02-11', 250.00),
(26, 3, 5, '2025-02-12', 175.00),
(27, 6, 1, '2025-02-13', 150.00),
(28, 8, 1, '2025-02-14', 180.00),
(29, 2, 4, '2025-02-15', 80.00),
(30, 1, 1, '2025-02-16', 900.00);

-- Ejer_157
select sum(precio_total) 'Ingreso total'
from tienda.ventas;

-- Ejer_158
select avg(precio_unidad) 'Precio unitario promedio'
from tienda.productos;

-- Ejer_159
select sum(cantidad_vendida) 'Cantidad total vendida'
from tienda.ventas;

-- Ejer_160
select fecha_venta 'Dia', count(id_venta) 'Ventas por dia'
from tienda.ventas
group by fecha_venta;

-- Ejer_161
select nombre_producto, precio_unidad
from tienda.productos
order by precio_unidad desc
limit 1;

-- Ejer_162
select id_venta, id_producto, precio_total, cantidad_vendida
from tienda.ventas
where Cantidad_vendida > 4;

-- Ejer_163
select sum(round(precio_total,2))
from tienda.ventas;

-- Ejer_164
select Id_producto, count(Id_venta)
from tienda.ventas
group by id_venta
order by count(id_venta) desc limit 1;

-- Ejer_165
select id_venta, case 
when precio_total > 200 then "Alta"
when precio_total between 100 and 200 then "Media"
else "Baja" end
from tienda.ventas;

-- Ejer_166
select id_venta, timestampdiff(day,now(),fecha_venta)
from tienda.ventas;

-- Ejer_167
select id_venta, case
when dayofweek(fecha_venta) in (1,7) then "Fin de semana"
else "Entre semana" end
from tienda.ventas;