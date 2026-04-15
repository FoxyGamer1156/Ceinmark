create database empresa;
use empresa;
CREATE TABLE Departamentos (
dpto_cod INT PRIMARY KEY,
nombreDpto VARCHAR(50) NOT NULL,
ciudad VARCHAR(50) NOT NULL
);
CREATE TABLE Empleados (
id_empleado INT PRIMARY KEY,
dni VARCHAR(12) UNIQUE NOT NULL,
nombre VARCHAR(50) NOT NULL,
apellido1 VARCHAR(50) NOT NULL,
apellido2 VARCHAR(50),
sueldo DECIMAL(10,2) NOT NULL,
actividad VARCHAR(50),
departamento INT,
fecha_alta DATE NOT NULL,
FOREIGN KEY (departamento)
REFERENCES Departamentos(dpto_cod)
);

CREATE TABLE Historial_laboral (
id_empleado INT,
dpto_cod INT,
fecha_inicio DATE,
fecha_fin DATE,
PRIMARY KEY (id_empleado, dpto_cod, fecha_inicio),
FOREIGN KEY (id_empleado)
REFERENCES Empleados(id_empleado),
FOREIGN KEY (dpto_cod)
REFERENCES Departamentos(dpto_cod)
);

CREATE TABLE Usuarios (
id_usuario INT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
provincia VARCHAR(50),
credito DECIMAL(10,2) DEFAULT 0
);

CREATE TABLE Pedidos (
id_pedido INT PRIMARY KEY,

id_usuario INT,
fecha_pedido DATE NOT NULL,
total DECIMAL(10,2) NOT NULL,
FOREIGN KEY (id_usuario)
REFERENCES Usuarios(id_usuario)
);
CREATE TABLE Proveedores (
id_proveedor INT PRIMARY KEY,
nombreProveedor VARCHAR(100) NOT NULL,
ciudad VARCHAR(100),
pais VARCHAR(100)
);
CREATE TABLE Clientes (
id_cliente INT PRIMARY KEY,
nombreCliente VARCHAR(100) NOT NULL,
ciudad VARCHAR(100),
pais VARCHAR(100)
);
CREATE TABLE Ingles (
nombre VARCHAR(100) NOT NULL,
domicilio VARCHAR(150)
);
CREATE TABLE Frances (
nombre VARCHAR(100) NOT NULL,
domicilio VARCHAR(150)
);
CREATE TABLE Portugues (
nombre VARCHAR(100) NOT NULL,
domicilio VARCHAR(150)
);
-- INSERT PARA LA BASE DE DATOS --
INSERT INTO Departamentos VALUES
(1, 'Informatica', 'Bilbao'),
(2, 'Recursos Humanos', 'Madrid'),
(3, 'Ventas', 'Barcelona'),
(4, 'Marketing', 'Valencia'),
(5, 'Logistica', 'Sevilla'); -- Sin empleados
INSERT INTO Empleados VALUES
(1, '12345678A', 'Juan', 'Perez', 'Gomez', 2000.00, 'Programador', 1, '2020-01-10'),
(2, '23456789B', 'Ana', 'Lopez', 'Martinez', 2200.00, 'RRHH', 2, '2019-03-15'),
(3, '34567890C', 'Luis', 'Garcia', NULL, 1800.00, 'Vendedor', 3, '2021-06-20'),
(4, '45678901D', 'Maria', 'Sanchez', 'Ruiz', 2100.00, 'Marketing', 4, '2018-09-01'),
(5, '56789012E', 'Carlos', 'Diaz', 'Torres', 1900.00, 'Programador', 1, '2022-02-10'),
(6, '67890123F', 'Lucia', 'Fernandez', NULL, 1700.00, 'Soporte', NULL, '2023-01-01'); -- Sin departamento
INSERT INTO Historial_laboral VALUES
(1, 1, '2020-01-10', '2021-12-31'),
(1, 3, '2022-01-01', NULL),
(2, 2, '2019-03-15', NULL),
(3, 3, '2021-06-20', NULL),
(4, 4, '2018-09-01', '2020-12-31'),
(5, 1, '2022-02-10', NULL);
-- El empleado 6 NO tiene historial
INSERT INTO Usuarios VALUES
(1, 'Pedro', 'Bizkaia', 100.00),
(2, 'Laura', 'Madrid', 200.00),
(3, 'Sergio', 'Barcelona', 150.00),
(4, 'Elena', 'Valencia', 50.00),
(5, 'Raul', 'Sevilla', 300.00),
(6, 'Carmen', 'Granada', 120.00); -- Sin pedidos
INSERT INTO Pedidos VALUES
(1, 1, '2024-01-10', 250.00),
(2, 1, '2024-02-15', 150.00),
(3, 2, '2024-03-01', 300.00),
(4, 3, '2024-03-10', 100.00),
(5, 3, '2024-03-15', 200.00),
(6, 3, '2024-03-20', 50.00),
(7, 4, '2024-04-01', 400.00),
(8, 5, '2024-04-05', 500.00);
-- Usuario 6 no tiene pedidos
INSERT INTO Proveedores VALUES
(1, 'Proveedor A', 'Bilbao', 'España'),
(2, 'Proveedor B', 'Madrid', 'España'),
(3, 'Proveedor C', 'Lisboa', 'Portugal');
INSERT INTO Clientes VALUES
(1, 'Cliente A', 'Barcelona', 'España'),
(2, 'Cliente B', 'Valencia', 'España'),
(3, 'Cliente C', 'Paris', 'Francia');
INSERT INTO Ingles VALUES
('John Smith', 'London'),
('Alice Brown', 'Manchester');

INSERT INTO Frances VALUES
('Jean Dupont', 'Paris'),
('Marie Curie', 'Lyon');

INSERT INTO Portugues VALUES
('Joao Silva', 'Lisboa'),
('Ana Costa', 'Porto');