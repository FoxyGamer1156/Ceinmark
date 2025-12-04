-- Ejercicio1
create database EmpresaDAM;
-- Ejercicio2
create database VideojuegosDAM;
create database BibliotecaDAM;
create database InstitutoDAM;
-- Ejericio3
use InstitutoDAM;
create table Alumnos(
    Id_Alumno NUMERIC(4),
    nombre VARCHAR(20), 
    apellido1 VARCHAR(20),
    apellido2 VARCHAR(20),
    fecha_nac DATE ,
    telefono NUMERIC(9)
);
-- Ejericio4
create table Cursos(
    cod_curso VARCHAR (10),
    nombre VARCHAR(30),
    horas numeric(3),
    constraint cod_cursoPK PRIMARY KEY (cod_curso)
);
-- Ejercicio5
create table Módulos(
    cod_modulo varchar(10) primary key,
    nombre varchar(50),
    hora_semanal numeric(2),
    cod_curso varchar(10),
    constraint cod_cursoFK foreign key(cod_curso)
    references Cursos(cod_curso)
    on delete cascade
);
-- Ejercicio6
use VideojuegosDAM;
create table Usuario(
    usurario varchar(20) primary key not null,
    contraseña varchar(20),
    email varchar(50) unique,
    fecha_creación date default current_timestamp
);
-- Ejercicio7
create table Cliente(
    id_cliente numeric(5) primary key,
    nombres varchar(30) not null,
    dni varchar(9) unique
);
-- Ejercicio8
create table Producto(
    id_producto numeric(5) primary key,
    nombres varchar(40),
    precio numeric(6,2),
    stock numeric(4) default 0,
    constraint check_stock check(stock >= 0)
);
-- Ejercicio9
create table Pedido(
    id_pedido varchar(10) primary key
);
create table Detalles_Pedido(
    id_pedido varchar(10),
    id_producto numeric(5),
    cantidad numeric(3),
    constraint Detalles_PedidoPK primary key(id_pedido, id_producto),
    constraint id_pedidoFK foreign key(id_pedido)
    references Pedido(id_pedido)
    on delete cascade,
    constraint id_productoFK foreign key(id_producto)
    references Producto(id_producto) 
    on delete cascade
);
-- Ejercicio10
create table Reserva(
    id_reserva numeric(5) primary key,
    id_cliente numeric(5),
    constraint id_clienteFK foreign key (id_cliente)
    references Cliente(id_cliente)
    on delete cascade
);
