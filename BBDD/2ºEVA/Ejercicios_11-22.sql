-- Ejercicio11
use Institutodam;
alter table Alumnos
add column email varchar(40);
-- Ejercicio12
alter table Alumnos
drop column telefono;
-- Ejercicio13
alter table Alumnos
modify column nombre varchar(30);
-- Ejercicio14
use videojuegosdam;
alter table cliente
add constraint nombres_ck check(length(nombre >=3));
-- Ejercicios15
alter table cliente
drop constraint dni;
-- Ejercicio16
drop table reserva;
-- Ejercicio17
drop table Pedidos;
drop table cliente;
-- Ejercicio18
create index EMAILS
on alumnos(email);
-- Ejercicio19
use institutodam;
create index NombreApellido
on alumnos(nombre,apellido1);
-- Ejercicio20
drop index EMAILS
on alumnos;

