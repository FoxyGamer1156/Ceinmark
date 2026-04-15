create database biblio;
use biblio;
create table libros(
codigo numeric(5) primary key,
titulo varchar(40),
autor varchar(30),
editorial varchar(15),
precio numeric(5,2),
cantidad numeric(3)
);
use biblio;
INSERT INTO libros VALUES (1, 'SQL Básico', 'Juan Pérez', 'Planeta', 20.50, 5);
INSERT INTO libros VALUES (2, 'SQL Avanzado', 'Ana López', 'Planeta', 35.00, 3);
INSERT INTO libros VALUES (3, 'Aprende Java', 'Carlos Ruiz', 'Anaya', 28.00, 4);
INSERT INTO libros VALUES (4, 'Java Profesional', 'Laura Gómez', 'Anaya', 45.00, 6);
INSERT INTO libros VALUES (5, 'Python Fácil', 'Miguel Torres', 'Alfaomega', 22.00, 7);
INSERT INTO libros VALUES (6, 'Python Experto', 'Lucía Díaz', 'Alfaomega', 55.00, 2);
INSERT INTO libros VALUES (7, 'Bases de Datos', 'Mario Castro', 'Ra-Ma', 18.00, 8);
INSERT INTO libros VALUES (8, 'Big Data', 'Elena Martín', 'Ra-Ma', 75.00, 1);
INSERT INTO libros VALUES (9, 'Inteligencia Artificial', 'Sofía León', 'Ra-Ma', 120.00, 2);
INSERT INTO libros VALUES (10, 'Redes', 'Andrés Mora', 'McGrawHill', 27.00, 4);
INSERT INTO libros VALUES (11, 'Sistemas Operativos', 'Pedro Gil', 'McGrawHill', 90.00, 3);
INSERT INTO libros VALUES (12, 'Algoritmos', 'Rosa Navarro', 'Anaya', 110.00, 5);
INSERT INTO libros VALUES (13, 'Programación C', 'David Herrera', 'Anaya', NULL, 2);
INSERT INTO libros VALUES (14, 'Cloud Computing', 'Marta Vega', 'Alfaomega', 130.00, 1);
INSERT INTO libros VALUES (15, 'Seguridad Informática', 'Jorge Ramos', 'Planeta', NULL, 4);
-- Ejer_139
select count(codigo) as 'Numero de Libros', editorial
from biblio.libros
group by editorial;

-- Ejer_140
select sum(cantidad) as 'Existencias', editorial
from biblio.libros
group by editorial;

-- Ejer_141
select count(codigo) 'Numero de libros', editorial
from biblio.libros
group by editorial
having count(codigo) > 2;

-- Ejer_142
Select avg(precio), editorial
from biblio.libros
group by editorial
having avg(precio) > 25;

-- Ejer_143
select editorial, count(codigo) 'Numero de libros'
from biblio.libros
where precio < 30
group by editorial;

-- Ejer_144
select editorial, max(precio) 'Precio Maximo', min(precio) 'Precio Minimo'
from biblio.libros
group by editorial;

-- Ejer_145
select count(codigo), editorial
from biblio.libros
where precio is not null
group by editorial
having editorial != "Planeta";
-- Cuando el atributo en la condicion es el que se pone en el group by, la condicion va en el having, aunque se pueda meter en el Where.
-- Ejer_146
select avg(precio) 'Precio promedio', editorial, count(codigo) 'Numero de libros'
from biblio.libros
group by editorial
having count(codigo) > 2;

-- Ejer_147
select max(precio) 'Precio maximo', editorial
from biblio.libros
group by editorial
having max(precio) between 30 and 100;

create table visitantes(
nombre varchar(30),
edad numeric(2),
sexo char(1),
domicilio varchar(30),
ciudad varchar(20),
telefono varchar(11),
mail varchar(30),
montocompra numeric(6,2)
);
INSERT INTO visitantes VALUES ('Juan Perez', 25, 'M', 'Av. Siempre Viva 123', 'Madrid', '600123456', 'juan@mail.com', 120.50);
INSERT INTO visitantes VALUES ('Ana Lopez', 32, 'F', 'Calle Sol 45', 'Madrid', '600234567', 'ana@mail.com', 80.00);
INSERT INTO visitantes VALUES ('Carlos Ruiz', 45, 'M', 'Gran Via 10', 'Barcelona', '600345678', 'carlos@mail.com', 200.75);
INSERT INTO visitantes VALUES ('Laura Gomez', 29, 'F', 'Diagonal 200', 'Barcelona', '600456789', 'laura@mail.com', 50.00);
INSERT INTO visitantes VALUES ('Miguel Torres', 38, 'M', 'Calle Luna 15', 'Sevilla', '600567890', 'miguel@mail.com', 300.00);
INSERT INTO visitantes VALUES ('Lucia Diaz', 22, 'F', 'Av. Andalucia 50', 'Sevilla', '600678901', 'lucia@mail.com', 25.50);
INSERT INTO visitantes VALUES ('Mario Castro', 41, 'M', 'Calle Norte 8', 'Valencia', '600789012', 'mario@mail.com', 150.00);
INSERT INTO visitantes VALUES ('Elena Martin', 35, 'F', 'Calle Sur 22', 'Valencia', '600890123', 'elena@mail.com', NULL);
INSERT INTO visitantes VALUES ('Sofia Leon', 27, 'F', 'Calle Este 33', 'Madrid', '600901234', 'sofia@mail.com', 75.25);
INSERT INTO visitantes VALUES ('Andres Mora', 50, 'M', 'Av. Central 99', 'Barcelona', '601012345', 'andres@mail.com', 500.00);
INSERT INTO visitantes VALUES ('Pedro Gil', 31, 'M', 'Calle Oeste 44', 'Madrid', '601123456', 'pedro@mail.com', 60.00);
INSERT INTO visitantes VALUES ('Rosa Navarro', 28, 'F', 'Calle Alta 12', 'Sevilla', '601234567', 'rosa@mail.com', 95.00);
INSERT INTO visitantes VALUES ('David Herrera', 19, 'M', 'Calle Baja 5', 'Valencia', '601345678', 'david@mail.com', 40.00);
INSERT INTO visitantes VALUES ('Marta Vega', 42, 'F', 'Av. Libertad 77', 'Madrid', '601456789', 'marta@mail.com', 220.00);
INSERT INTO visitantes VALUES ('Jorge Ramos', 36, 'M', 'Calle Paz 18', 'Barcelona', '601567890', 'jorge@mail.com', NULL);

-- Ejer_148
select count(nombre) 'Ciudadados', ciudad
from biblio.visitantes
group by ciudad;

-- Ejer_149
select count(nombre) 'Ciudadados con numero de telefono', ciudad
from biblio.visitantes
where telefono is not null
group by ciudad;

-- Ejer_150
select max(montocompra) 'Maximo de valor', min(montocompra) 'Minimo de valor', ciudad, sexo
from biblio.visitantes
group by ciudad,sexo;

-- Ejer_151
select avg(montocompra) 'Promedio de valor', ciudad
from biblio.visitantes
group by ciudad;

-- Ejer_152
select count(nombre) 'Ciudadados con mail', ciudad
from biblio.visitantes
where mail is not null
group by ciudad;

-- Ejer_153
select count(montocompra) 'Numero de compras', ciudad,sexo
from biblio.visitantes
where montocompra > 50
group by ciudad,sexo;

-- Ejer_154
select count(nombre) 'Numero de compras', ciudad,sexo
from biblio.visitantes
where montocompra > 50 and telefono is not null
group by ciudad,sexo
having	ciudad != "Cordoba"
order by ciudad;

-- Ejer_155
select max(montocompra) 'Mayor monto', ciudad, sexo
from biblio.visitantes
where sexo="F" and domicilio is not null
group by ciudad
having max(montocompra) > 50;

-- Ejer_156
select count(nombre) 'Numero de visitantes', sum(montocompra) 'Total de compra', avg(montocompra) 'Promedio de compra', ciudad, sexo
from biblio.visitantes
group by ciudad, sexo
having avg(montocompra) > 30
order by sum(montocompra) asc;

 