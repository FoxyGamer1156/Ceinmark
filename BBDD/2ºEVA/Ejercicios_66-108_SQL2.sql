-- Ejercicio 66
Select * from amazon.productos where (categoria='Informatica' and  precio>500) or (categoria='Hogar' and stock>50);

-- Ejercicio 67
Select * from amazon.empleado where (nombre like 'A%' and salario>1500) or apellido1 like 'B%';

-- Ejercicio 68
Select nombre_producto,precio,precio-precio*0.15 'precio_oferta' from amazon.productos;

-- Ejercicio 69
select nombre_producto,precio, round(precio,2) 'Precio redondeado' from amazon.productos;

-- Ejercicio 70
select nombre,length(concat(nombre,' ',apellido1,' ',apellido2)) "Longitud de Nombre y apellidos" from amazon.empleado;

create database Temu;
use Temu;
CREATE TABLE Empleados (
id_empleado INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellido1 VARCHAR(50) NOT NULL,
apellido2 VARCHAR(50) NULL,
salario DECIMAL(10,2) NOT NULL,
departamento VARCHAR(60) NOT NULL,
fecha_alta DATE NOT NULL,
comision DECIMAL(10,2) NULL,
CHECK (salario >= 0)
);
CREATE TABLE Usuarios (
id_usuario INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(80) NOT NULL,
credito DECIMAL(12,2) NOT NULL DEFAULT 0,

localidad VARCHAR(80) NOT NULL,
edad INT NULL,
fecha_registro DATE NOT NULL,
CHECK (credito >= 0),
CHECK (edad IS NULL OR (edad >= 0 AND edad <= 120))
);
CREATE TABLE Productos (
id_producto INT AUTO_INCREMENT PRIMARY KEY,
nombre_producto VARCHAR(120) NOT NULL,
precio DECIMAL(10,2) NOT NULL,
stock INT NOT NULL DEFAULT 0,
categoria VARCHAR(80) NOT NULL,
fecha_alta DATE NOT NULL,
CHECK (precio >= 0),
CHECK (stock >= 0)
);
CREATE TABLE Pedidos (
id_pedido INT AUTO_INCREMENT PRIMARY KEY,
id_usuario INT NOT NULL,
fecha_pedido DATETIME NOT NULL,
total DECIMAL(12,2) NOT NULL,
CHECK (total >= 0),
CONSTRAINT fk_pedidos_usuarios
FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario)
ON UPDATE CASCADE
ON DELETE RESTRICT
);

-- Ejercicio 71
select nombre,salario, abs(comision) from temu.empleados;

-- Ejercicio 72
select nombre_producto, precio, truncate(precio,1) 'Precio con un solo decimal' from temu.productos;

-- Ejercicio 73
select salario, sign(salario) 'Signo del salario' from temu.productos;

-- Ejercicio 74
select nombre,mod(stock,5) 'Resto de dividir el stock' from temu.productos;

-- Ejercicio 75
select salario,power(salario,2)'Salario al cuadrado' from temu.empleados;

-- Ejercicio 76
select nombre_producto,precio, sqrt(precio)'Raiz cuadrada de Salario' from temu.productos;

-- Ejercicio 77
select nombre_producto,precio, precio/3 'Precio/3' , round(precio/3,1) 'Precio/3 y redondeado a 1 decimal' from temu.productos;

-- Ejercicio 78
select upper(nombre) 'Nombre en mayusculas' from temu.empleados;

-- Ejercicio 79
select nombre, length(nombre) 'Longitud de los nombres' from temu.empleados;

-- Ejercicio 80
select nombre_producto, substr(nombre_producto,1,3) '3 primeros caracteres del nombre dle producto' from temu.productos;

-- Ejercicio 81
select nombre_producto, substr(nombre_producto,4,6) 'Caracteres del 4-6' from temu.productos;

-- Ejercicio 82
select nombre, lpad(nombre,10,'*') 'Nombre con *' from temu.empleados;

-- Ejercicio 83
select nombre, rpad(nombre,15,'.') 'Nombre con .' from temu.empleados;

-- Ejercicio 84
select nombre_producto,replace(nombre_producto,"USB", "Cable")'Cambio USB a Cable'
    from temu.productos;

-- Ejercicio 85
select nombre_producto, instr(nombre_producto,'PRO') 'Posicion de la cade PRO en el nombre dle producto'
from temu.productos;

-- Ejercicio 86
select trim(nombre) from temu.empleados;

-- Ejercicio 87
select now();

-- Ejercicio 88
select current_date()'Fecha Actual', date_add(now(), interval(10)day) 'Dentro de 10 días';

-- Ejercicio 89
select current_date()'Fecha Actual', current_date()-interval 30 day 'Fecha de hace 30 días';

-- Ejercicio 90
select nombre, fecha_registro, date_add(fecha_registro,interval(1)MONTH)'La fecha de resgistro mas 1 mes' from temu.usuarios;

-- Ejercicio 91
select nombre, fecha_alta, timestampdiff(month,fecha_alta, now()) from temu.empleados;

-- Ejercicio 92
select current_date(), last_day(current_date());

-- Ejercicio 93
select fecha_pedido, extract(year from fecha_pedido)'AÑO PEDIDO', extract(month from fecha_pedido)'MES PEDIDO' from temu.pedidos;

-- Ejercicio 94
select pedidos from temu.pedidos where extract(year from fecha_pedido) = extract(year from sysdate());

-- Ejercicio 95
select sum(salario)'Suma total de salario' from temu.empleados;

-- Ejercicio 96
select avg(salario)'Media de los salarios' from temu.empleados;

-- Ejercicio 97
select min(salario)'Salario minimo', max(salario)'Salario maximo' from temu.empleados;

-- Ejercicio 98
select count(id_empleados)'Cantidad de empleados' from temu.empleados;

-- Ejercicio 99
select count(comision) from temu.empleados where comision is not null;

-- Ejercicio 100
select sum(credito) from temu.usuarios;

-- Ejercicio 101
select count(id_producto) from temu.productos;

-- Ejercicio 102
select avg(precio) from temu.productos;

-- Ejercicio 103
select variance(salario) from temu.productos;

-- Ejercicio 104
select std(salario) from temu.productos;

-- Ejercicio 105
select count(id_pedido) from temu.pedidos where extract(year from fecha_pedido) = extract(year from now());

-- Ejercicio 106
select avg(total) from temu.pedidos;

-- Ejercicio 107
select nombre, edad,case 
	when edad>=18 then 'SI'
    else 'NO'
    end 'Mayor de edad'
    from temu.usuarios;

-- Ejercicio 108
select nombre, salario, case
	when salario>2000 then 'ALTO'
    when salario between 1000 and 2000 then 'MEDIO'
    else 'Bajo'
	end 'Nivel salarial'
from temu.empleados;