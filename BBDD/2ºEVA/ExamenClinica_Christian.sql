CREATE DATABASE examenClinica;
USE examenClinica;
-- =========================
-- TABLA: Pacientes
-- =========================
CREATE TABLE Pacientes (
id_paciente INT PRIMARY KEY,
dni VARCHAR(12) NOT NULL UNIQUE,
nombre VARCHAR(50) NOT NULL,
apellidos VARCHAR(80) NOT NULL,
provincia VARCHAR(50) NULL,
email VARCHAR(100) NULL,
fecha_alta DATE NOT NULL,
fecha_nacimiento DATE NOT NULL,
constraint chk_pac_dniformato check (dni like '________-_'),
CONSTRAINT chk_pac_email_formato CHECK (email IS NULL OR email LIKE '%@%')
);
-- =========================
-- TABLA: Medicos
-- =========================
CREATE TABLE examenclinica.Medicos (
id_medico INT PRIMARY KEY,
dni VARCHAR(12) NOT NULL UNIQUE,
nombre VARCHAR(50) NOT NULL,
apellidos VARCHAR(80) NOT NULL,
especialidad VARCHAR(50) NULL,
salario DECIMAL(9,2) NULL,
email VARCHAR(100) NULL,
fecha_contratacion DATE NOT NULL
);
-- =========================
-- TABLA: Citas
-- =========================
CREATE TABLE examenclinica.Citas (
id_cita INT PRIMARY KEY,
id_paciente INT NOT NULL,
id_medico INT NOT NULL,
fecha_cita DATE NOT NULL,
estado VARCHAR(20) NOT NULL,
coste DECIMAL(9,2) NOT NULL,
CONSTRAINT fk_citas_paciente FOREIGN KEY (id_paciente) REFERENCES
Pacientes(id_paciente),
CONSTRAINT fk_citas_medico FOREIGN KEY (id_medico) REFERENCES
Medicos(id_medico),
CONSTRAINT chk_citas_estado CHECK (estado IN
('PROGRAMADA','REALIZADA','CANCELADA'))
);
-- =========================
-- TABLA: Facturas
-- =========================
CREATE TABLE examenclinica.Facturas (
id_factura INT PRIMARY KEY,
id_paciente INT NOT NULL,
fecha_factura DATE NOT NULL,
total DECIMAL(9,2) NOT NULL,
pagada TINYINT(1) NOT NULL DEFAULT 0,
CONSTRAINT fk_fact_paciente FOREIGN KEY (id_paciente) REFERENCES
Pacientes(id_paciente),
CONSTRAINT chk_fact_total CHECK (total >= 0),
CONSTRAINT chk_fact_pagada CHECK (pagada IN (0,1))
);
USE examenClinica;
-- =========================
-- PACIENTES
-- =========================
INSERT INTO examenclinica.pacientes (id_paciente, dni, nombre, apellidos, provincia, email, fecha_alta,
fecha_nacimiento) VALUES
(1, '12345678-A', 'Ana', 'Gomez de la Fuente', 'Sevilla', 'ana@gmail.com', '2021-05-10',
'1990-03-21'),
(2, '22345678-B', 'Luis', 'Delgado Perez', 'Madrid', 'luis@outlook.com', '2023-02-14',
'1985-11-02'),
(3, '32345678-C', 'Marta', 'Ruiz del Rio', 'Valencia', 'marta@yahoo.es', '2022-09-01',
'1998-07-17'),
(4, '42345678-D', 'Jorge', 'Sanchez', NULL, NULL, '2024-01-20',
'2001-01-30'),
(5, '52345678-E', 'Elena', 'Lopez de Mar', 'Bilbao', 'elena@empresa.com', '2020-12-12',
'1979-05-05'),
(6, '62345678-F', 'Pablo', 'Martinez', 'Barcelona', 'pablo@gmail.com', '2019-08-07',
'1988-09-09'),
(7, '72345678-G', 'Sara', 'de Toro', 'Sevilla', 'sara@proton.me', '2022-12-01',
'1995-04-10'),
(8, '82345678-H', 'Nuria', 'Fernandez del Valle', 'Zaragoza', 'nuria@gmail.com', '2025-06-30',
'1992-10-22');
-- =========================
-- MEDICOS
-- =========================
INSERT INTO examenclinica.medicos (id_medico, dni, nombre, apellidos, especialidad, salario, email,
fecha_contratacion) VALUES
(9, '33333333-A', 'Laura', 'Montoro', 'CARDIOLOGIA', 4200.00, 'laura@clinica.com',
'2021-01-10'),
(10, '44444444-B', 'Mario', 'Gonzalez Ramos', 'PEDIATRIA', 2800.00, 'mario@gmail.com',
'2023-03-05'),
(11, '55555555-C', 'Celia', 'Rodriguez del Mar','TRAUMATOLOGIA', 5200.00,
'celia@clinica.com', '2019-06-01'),
(12, '36666679-D', 'Ivan', 'Pena', 'DERMATOLOGIA', 2600.00, 'ivan@clinica.com',
'2024-02-01'),
(13, '37777779-E', 'Rocio', 'Del Campo', NULL, 6100.00, NULL,
'2020-10-20'),
(20, '38888888-F', 'Hugo', 'Navarro', 'PEDIATRIA', 4500.00, 'hugo@correo.es',
'2022-05-15'),
(21, '39999999-G', 'Sonia', 'Alvarez', 'CARDIOLOGIA', 2400.00, 'sonia@clinica.com',
'2025-01-01'),
(31, '3000079-H', 'Tomas', 'Serrano del Valle','TRAUMATOLOGIA', 3300.00,
'tomas@clinica.com', '2023-07-01');
-- =========================
-- CITAS (incluye fechas 2025 entre abril y septiembre)
-- =========================
INSERT INTO examenclinica.citas (id_cita, id_paciente, id_medico, fecha_cita, estado, coste) VALUES
(100, 1, 9, '2025-04-10', 'REALIZADA', 60.00),
(101, 2, 10, '2025-06-15', 'REALIZADA', 45.00),
(102, 3, 11, '2025-09-01', 'PROGRAMADA', 80.00),
(103, 4, 12, '2025-03-20', 'CANCELADA', 30.00),
(104, 5, 20, '2024-12-05', 'REALIZADA', 50.00),
(105, 6, 21, '2025-08-22', 'PROGRAMADA', 70.00),
(106, 7, 31, '2026-01-18', 'REALIZADA', 55.00),
(107, 8, 9, '2026-02-05', 'PROGRAMADA', 65.00);
-- =========================
-- FACTURAS (incluye algunas en los últimos 60 días respecto a 2026-02-07)
-- =========================
INSERT INTO examenclinica.facturas (id_factura, id_paciente, fecha_factura, total, pagada) VALUES
(200, 1, '2024-02-10', 120.00, 1),
(201, 2, '2023-11-20', 90.00, 0),
(202, 3, '2019-05-05', 300.00, 1),
(203, 4, '2025-12-20', 150.00, 0),
(204, 5, '2026-01-10', 85.00, 1),
(205, 6, '2026-01-25', 650.00, 0),
(206, 7, '2025-08-29', 999.00, 1),
(207, 8, '2018-01-05', 100.00, 1);
-- Ejercicio 1
create user Laura33@localhost identified by 'clinicaLaura';
alter user Laura33@localhost identified by '123465';
-- Ejercicio 2
grant select on * to Laura33@localhost;
-- Ejercicio 3
grant select,insert,update on examenclinica to Laura33@localhost with grant option;
-- Ejercicio 4
show grants for Laura33@localhost;
-- Ejercicio 5
drop user Laura33@localhost;
-- Ejercicio 6
select id_medico,dni,especialidad,salario from examenclinica.medicos where (especialidad='CARDIOLOGIA' or 'PEDIATRIA'or 'TRAUMATOLOGIA') and (salario between 2500 and 4500)
and (dni like '3%' or '%7_9%') and email like '%@%' and (id_medico not like 10 or 20 or 30);

-- Ejercicio 7
select dni from examenclinica.medicos where (especialidad is not null) or (especialidad like '_o' and salario > 5000);

-- Ejercicio 8
select id_factura, extract(year from fecha_factura) from examenclinica.facturas where (total between 80 and 700) and extract(year from fecha_factura) between 2018 and 2025;

-- Ejercicio 9
select nombre,apellidos from examenclinica.pacientes where (provincia is null) or (provincia not like ('Madrid') and extract(year from fecha_alta)>2022) or (email is not null and email not like '%gmail%');

-- Ejercicio 10
select id_paciente,nombre,provincia from examenclinica.pacientes where (apellidos like ('% de %') or apellidos like ('% del %')) and (provincia not like('Madrid','Barcelona','Valencia')) and provincia is not null;

-- Ejercicio 11
select id_medico,salario, abs(salario) 'Salario Absoluto', round(salario*1.12,2) 'salarioSubido' from examenclinica.medicos;

-- Ejercicio 12
select id_medico, mod(salario,9) 'resto de salario entre 9' from examenclinica.medicos;

-- Ejercicio 13
select dni,replace(dni,'-','') 'DNI SIN -' from examenclinica.medicos;

-- Ejercicio 14
select if(length(apellidos)<=9,apellidos,substr(apellidos,length(apellidos)-2,length(apellidos))) from examenclinica.pacientes;

-- Ejercicio 15
select id_paciente, instr(email,'@') 'Posicion @' from examenclinica.pacientes;

-- Ejercicio 16
select id_cita,fecha_cita, date_add(LAST_DAY(fecha_cita), interval 1 day) 'Primer dia del mes siguente' from examenclinica.citas;

-- Ejercicio 17
select id_medico,fecha_contratacion, timestampdiff(month, fecha_contratacion,now()) from examenclinica.medicos where timestampdiff(month,fecha_contratacion,now())>24;

-- Ejercicio 18
select  id_cita from examenclinica.citas where extract(year from fecha_cita)=2025 and extract(month from fecha_cita)between 4 and 9;

-- Ejercicio 19
select id_factura from examenclinica.facturas where fecha_factura between (fecha_factura- interval 60 day) and now();

-- Ejercicio 20
select id_paciente, extract(year from fecha_alta) 'Año de alta' from examenclinica.pacientes where provincia='Sevilla';

-- Ejercicio 21
select count(id_medico), case
	when salario > 4000 then salario = salario
    when salario <= 4000 then salario = salario*2
    end 'Salario modificados' from examenclinica.medicos;

-- Ejercicio 22
select sum(case
	when salario is null or salario=0 then 0
    when salario between 1 and 3000 then 1
    when salario between 3001 and 6000 then 2
    when salario > 6000 then 3
	end) 'Banda Salarial' from examenclinica.medicos;

-- Ejercicio 23
select id_medico, salario, case
	when salario is null or salario=0 then 'Sin salario'
    when salario between 1 and 3000 then 'Bajo'
    when salario between 3001 and 6000 then 'Medio'
    when salario > 6000 then 'Alto'
    end 'Rango' from examenclinica.medicos;