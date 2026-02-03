use udemi;
select * from udemi.usuario;
select * from udemi.cursos;
select * from udemi.materias;
-- Ejercicio 31
select nombre,apellidos from udemi.usuario where sexo like 'Mujer' order by apellidos,nombre;

-- Ejercicio 32
select nombre_curso from udemi.cursos	where horas>30 and tipo='On'; 

-- Ejercicio 33
select * from udemi.usuario	where edad>40 order by edad desc;

-- Ejercicio 34
select * from udemi.usuario where localidad like 'Madrid' order by apellidos;

-- Ejercicio 35
select * from udemi.materias where cursos like '%SQL%' order by horas;

/*******************************************************************/
/*********NUEVA BASE DE DATOS PARA LOS EJERCICIOS DEL 41-65*********/
/*******************************************************************/
create database Amazon;
use Amazon;
create table Empleado(
	id_empelado numeric(4) primary key,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    salario numeric(6,2),
    departamento varchar(50),
    fecha_alta date,
    comision numeric(5)
);
create table Usuarios(
	id_usuario numeric(4) primary key,
    nombre varchar(20),
    credito numeric(5),
    localidad varchar(20),
    edad numeric(3)
);
create table Productos(
	id_producto numeric(4),
    nombre_producto varchar(20),
    precio numeric(5,2),
    stock numeric (4),
    categoria varchar(20)
);
insert into Empleado(nombre,apellido1,apellido2,salario,departamento,fecha_alta,comision,id_empleado)
values ('Juanan', 'Agirre','Bengoetxea',2100,'Ventas','1990-03-05',10,4689);
insert into Empleado(nombre,apellido1,apellido2,salario,departamento,fecha_alta,comision,id_empleado)
values ('Javier', 'Vega','Soto',1000,'Marketing','2026-01-19',0, 7734);
insert into Empleado(nombre,apellido1,apellido2,salario,departamento,fecha_alta,comision,id_empleado)
values ('Carmen', 'Goiko','Gamindez',1500,'Marketing','2020-07-16',15,2460);
insert into Empleado(nombre,apellido1,apellido2,salario,departamento,fecha_alta,comision,id_empleado)
values ('Elisa', 'Garrido','Jiménez',1200,'IT','2025-10-11',5,3984);
insert into amazon.Empleado(nombre,apellido1,apellido2,salario,departamento,fecha_alta,comision,id_empleado)
values ('Maria', 'Garrido','Jiménez',900,'IT','2025-10-11',5,3985);

insert into Usuarios(id_usuario,nombre,credito,localidad,edad)
values (1226,'Sofía',20, 'Madrid', 20);
insert into Usuarios(id_usuario,nombre,credito,localidad,edad)
values (4025,'Isabel',20, 'Sevilla', 50);
insert into Usuarios(id_usuario,nombre,credito,localidad,edad)
values (6358,'Mateo',20, 'Valencia', 15);
insert into Usuarios(id_usuario,nombre,credito,localidad,edad)
values (1218,'Diego',20, 'Lugo',70);

insert into Productos(id_producto,nombre_producto,precio,categoria)
values (7689,'Cafetera',46.55,'Electrodomestico');
insert into Productos(id_producto,nombre_producto,precio,categoria)
values (2993,'Auriculares',89.50,'Tecnologia');
insert into Productos(id_producto,nombre_producto,precio,categoria)
values (9571,'La Sombra del Viento',18,'Libros');
insert into Productos(id_producto,nombre_producto,precio,categoria)
values (5162,'Sudadera',32.75,'Ropa');

-- Ejercicio 41
select nombre,salario from amazon.empleado where salario=1200;

-- Ejercicio 42
select * from amazon.empleado where salario!=1000;

-- Ejercicio 43
select * from amazon.empleado where salario>=1500;

-- Ejercicio 44
select * from amazon.empleado where salario between 1000 and 2000;

-- Ejercicio 45
select * from amazon.empleado where salario not between 900 and 1300;

-- Ejercicio 46
select * from amazon.empleado where departamento in('Ventas','Marketing');

-- Ejercicio 47
select * from amazon.empleado where departamento not in('Ventas','Marketing');

-- Ejercicio 48
select * from amazon.empleado where apellido1 like 'G%';

-- Ejercicio 49
select * from amazon.empleado where apellido2 like '%z';

-- Ejercicio 50
select * from amazon.empleado where nombre like '%an%';

-- Ejercicio 51
select * from amazon.productos where categoria in('Informatica','Electronica');

-- Ejercicio 52
select * from amazon.productos where precio is null;

-- Ejercicio 53
select * from amazon.productos where stock is not null;

-- Ejercicio 54
select * from amazon.usuarios where localidad in('Madrid','Sevilla','Valencia');

-- Ejercicio 55
select * from amazon.usuarios where edad not between 18 and 65;

-- Ejercicio 56
select nombre,salario,salario*1.1 "Salario+10%" from amazon.empleado;

-- Ejercicio 57
select nombre,salario,salario-200 "Salario reducido" from amazon.empleado;

-- Ejercicio 58
select nombre_producto,precio,(precio*0.21)+precio "Precio con IVA" from amazon.productos;

-- Ejericicio 59
select nombre_producto,precio*stock "Precio del stock disponible" from amazon.productos;

-- Ejercicio 60
select concat(apellido1,' ',apellido2,' ',nombre) "Apellidos y nombre" from amazon.empleado;

-- Ejercicio 62
select nombre,credito,credito+25 "creditoNuevo" from amazon.usuarios;

-- Ejercicio 63
select nombre_producto, precio*1.1 "Precio en dolares" from amazon.productos;

-- Ejercicio 64
select nombre, truncate((salario*14)/(30*12),2)"Salario diario" from amazon.empleado;

-- Ejercicio 65
select nombre, truncate(credito/2,2)"Creditos a la mitad" from amazon.usuarios;