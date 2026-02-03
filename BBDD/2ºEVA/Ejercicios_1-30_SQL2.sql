create DATABASE Udemi;

use Udemi;
create table usuario(
    id_usuario numeric(7) primary key,
    nombre VARCHAR(20),
    apellidos VARCHAR(20),
    sexo varchar(7),
    localidad varchar(30),
    edad numeric(2)
);
create table cursos(
    id_curso numeric(7) PRIMARY key,
    nombre_curso VARCHAR(30),
    horas numeric(2),
    tipo varchar(30)
);
create table materias(
    id_usuario numeric(7),
    id_curso numeric(7),
    fecha_matricula date,
    CONSTRAINT id_usuarioFK FOREIGN KEY(id_usuario) 
    references usuario(id_usuario),
    CONSTRAINT id_cursoFK FOREIGN KEY(id_curso)
    references cursos(id_curso),
    constraint id_materias PRIMARY KEY(id_usuario,id_curso)
);
use udemi;
insert into usuario(id_usuario,nombre, apellidos, sexo, localidad, edad)
values ('7895631','Jose', 'Luis Lopez', 'Hombre', 'Madrid', '80');
insert into usuario(id_usuario,nombre, apellidos, sexo, localidad, edad)
values ('7895638','Christian', 'Garay Salinas', 'Hombre', 'Berango', '23');
insert into usuario(id_usuario,nombre, apellidos, sexo, localidad, edad)
values ('1982635','Txaro', 'Berreteaga Etxebarri', 'Mujer', 'Plentzia', '70');
insert into usuario(id_usuario,nombre, apellidos, sexo, localidad, edad)
values ('1982636','Maria', null , 'Mujer', 'Plentzia', '70');

use udemi;
insert into cursos(id_curso, nombre_curso, horas, tipo)
values('1140369','DAM','20','Tc');
insert into cursos(id_curso, nombre_curso, horas, tipo)
values('1140370','DAMOnline','20','On');
insert into cursos(id_curso, nombre_curso, horas, tipo)
values('1140371','DAMSemipresencial','40','Semipresencial');
use udemi;
insert into cursos(id_curso, nombre_curso, horas, tipo)
values('1140400','AWS','40','On');
use udemi;
insert into cursos(id_curso, nombre_curso, horas, tipo)
values('2020389','MEL','80','Pr');

insert into materias(id_usuario, id_curso, fecha_matricula)
values(7895638,1140369,'2025-12-17');

-- Ejercicio 1
Select * 
from udemi.usuario;

-- Ejercicio 2
Select nombre, apellidos
from udemi.usuario;

-- Ejercicio 3
Select nombre, localidad Ciudad
from udemi.usuario;

-- Ejercicio 4
Select nombre_curso Cursos, horas Horas
from udemi.cursos;

-- Ejercicio 6
Select nombre , apellidos
from udemi.usuario
order by nombre, apellidos;

-- Ejercicio 7
Select nombre
from udemi.usuario
where localidad in ('Madrid');

-- Ejercicio 8
Select nombre
from udemi.usuario
where sexo in ('Mujer');

-- Ejercicio 9
Select nombre
from udemi.usuario
where edad > 30;

-- Ejercicio 10
Select nombre_curso
from udemi.cursos
where tipo in ('On');

-- Ejercicio 11
Select nombre_curso
from udemi.cursos
where horas > 40;

-- Ejercicio 12
Select nombre
from udemi.usuario
where nombre in ('Ana');

-- Ejercicio 13
select nombre
from udemi.usuario
where localidad not in ('Sevilla');

-- Ejercicio 14
select nombre
from udemi.usuario
where edad > 18 and edad < 25;

-- Ejercicio 15
select * from udemi.usuario where apellidos is null;

-- Ejercicio 16
select * from udemi.cursos where tipo not like 'Pr';

-- Ejercicio 17
select * from udemi.usuario where nombre like 'A%';

-- Ejercicio 18
select * from udemi.cursos where horas>20 and horas<60;

-- Ejercicio 19
select * from udemi.usuario where localidad like 'Madrid' and localidad like 'Barcelona';

-- Ejercicio 20
select * from udemi.usuario where edad>30 and sexo like 'Hombre';

-- Ejercicio 21
select * from udemi.usuario where nombre like '%an%';

-- Ejercicio 22
select * from udemi.cursos where tipo like 'On' or tipo like 'Semipresencial';

-- Ejercicio 23
select * from udemi.usuario order by apellidos;

-- Ejercicio 24
select * from udemi.usuario order by localidad,nombre;

-- Ejercicio 25
select * from udemi.cursos order by horas desc;

-- Ejercicio 26
select * from udemi.usuario order by edad asc;

-- Ejercicio 27
select * from udemi.usuario order by 3;

-- Ejercicio 28
select * from udemi.cursos order by tipo, nombre_curso;

-- Ejercicio 29
select distinct localidad from udemi.usuario;

-- Ejercicio 30
select * from udemi.usuario order by length(nombre);
