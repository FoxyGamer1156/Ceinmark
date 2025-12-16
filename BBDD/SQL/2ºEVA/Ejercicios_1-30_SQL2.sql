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
    tipo varchar(2)
);
use udemi;
create table materias(
    id_usuario numeric(7),
    id_curso numeric(7),
    fecha_matriculo date,
    constraint id_materias PRIMARY KEY(id_usuario,id_curso),
    CONSTRAINT id_usuarioFK FOREIGN KEY(id_usuario) 
    references usuario(id_usuario),
    CONSTRAINT id_cursoFK FOREIGN KEY(id_curso)
    references cursos(id_curso)
);

insert into usuario(id_usuario,nombre, apellidos, sexo, localidad, edad)
values ('7895638','Christian', 'Garay Salinas', 'Hombre', 'Bizkaia, Berango', '23');

insert into cursos(id_curso, nombre_curso)


