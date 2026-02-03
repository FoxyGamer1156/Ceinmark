-- 1-Listar los datos de los autores
Select * from autor;

-- 2-Listar nombres y edad de los estudiantes
Select nombre, edad from estudiante;

-- 3-¿Que estudiantes pertenecen a la carrera de informática?
Select carrera from estudiante where carrera='Informática';

-- 4-Listar los bombres de los estudiantes cuyo apellido comienza por G
Select apellido from estudainte where apellido like 'G%';

-- 5-¿Que autores son de nacionalidad USA o Francia?
Select * from autor where Nacionalidad='USA' or Nacionalidad='Francia';

-- 6-¿Que libros no son del Área Internet?
Select Area from libro where Area not in ('Internet');

-- 7-Listar los libros de la editorial AlfaOmega
Select Editorial from libro where Editorial in ('Alfay Omega');