-- Ejercicio 1
create database examenEmpresa;
use examenEmpresa;
create table Departamento(
	Id_departamento varchar(6) primary key,
    Nombre_departamento varchar(20),
    Fondos_publicos numeric
);
create table Empleados(
	Id_empleado varchar(6),
    Dni varchar(9),
    Sueldo numeric(4),
    Codigo_departamento varchar(6),
    Puesto varchar(10)not null,
    Apellidos varchar(50) not null,
    Provincia varchar(20),
    Email varchar(50),
    Fecha_alta date,
    constraint PK_id_dni primary key (Id_empleado,dni),
    constraint fk_id_departamento foreign key (Codigo_departamento) 
    references Departamento(Id_departamento)
);
create table Usuario(
	Id_usuario varchar(6) primary key
);
create table Pedidos(
	Id_pedido varchar(6) primary key,
    Id_usuario varchar(6),
    Fecha_pedido date,
    Importe_total float,
    constraint foreign key fk_id_usur(Id_usuario)
    references Usuario(Id_usuario)
);
alter table examenempresa.empleados
add constraint sueldo_ck check (sueldo>=1200 and sueldo<=3500);
use examenEmpresa;
alter table examenempresa.pedidos
add constraint fecha_pedido_ck check (fecha_pedido > now());
-- Ejercicio 2
alter table examenempresa.empleados 
add column Codigo_pedido varchar(6) references Pedidos(id_pedido) on delete cascade;

-- Ejercicio 3
alter table examenempresa.empleados
drop column apellidos;
alter table examenempresa.empleados
add column email varchar(10);
-- Ejercicio 4
alter table examenempresa.Departamento
add constraint ch_fondos check (MOD(fondos_publicos,5)=0);
-- Ejercicio 5
create index Id_DNI_Puesto on Empleados(Id_empleados,DNI,Puesto); 

-- Ejercicio 6
create user Manolo72@localhost identified by "examenManolo";
/*MODIFICAR CONTRASEÑA DE USUARIO*/
alter user Manosolo72@localhost identified by "123456";
-- Ejercicio 7
/*Dar todos los privilegios al usuario*/
grant all privileges on *.* to Manolo72@localhost;

grant select, insert, update on examenempresa.empleados
to Manolo72@localhost;
-- Ejercicio 8
grant select on examenempresa.empleados to Manolo72@localhost with grant option;
-- Ejercicio 9
show grants for Manolo72@localhost;
-- Ejercicio 10
revoke insert, select on examenempresa.empleados from Manolo72@localhost;
drop user Manolo72@localhost;

-- Ejercicio 11
select * from examenempresa.empleados 
where (puesto='IT','VENTAS','FINANZAS') 
and (sueldo between 2000 and 3000) and (DNI like '4%' or '%4_5')
and Codigo_departamento is not null and not(10 or 30 or 20);

-- Ejercicio 12
select * from examenempresa.empleados where (Provincia is null) or (Provincia like '%a%' and sueldo > 3200);
-- Ejercicio 13
select Id_pedido from examenempresa.pedidos where Importe_total between 100 and 999;

-- Ejercicio 14
select nombre, apellidos from examenempresa.empleados where departamento is null or (Codigo_departamento != 50 and sueld < 2000) or puesto!='RRHH';

-- Ejercicio 15
select  Id_empleado,Provincia, Sueldo from examenempresa.empleados where (Apellidos like 'de' or 'del') and sueldo between(1700,2000) and Provincia is not null and not('Madrid','Valencia','Barcelona');
/*Corregido*/
select Id_empleado,Provincia, Sueldo from examenempresa.empleados where (Apellidos like '% de %' or '% del %') and sueldo between 1700 and 2000 and Provincia is not null and Provincia not in ('Madrid', 'Barcelona', 'Valencia');

-- Ejercicio 16
select Id_empleado,Sueldo, abs(Sueldo-1000) as "SueldoReal", round(Sueldo*1.52,2) as "Sueldo subido y redondeado" from examenempresa.empleados where Sueldo is not null;

-- Ejercicio 17
select Id_empleado,mod(floor(Sueldo),7) as "Resto del sueldo entre 7" from examenempresa.empleados;

-- Ejercicio 18
select replace(DNI,'-','') as "DNI cambiado" from examenempresa.empleados;

-- Ejercicio 19
select substr(Apellidos,length(apellidos)-2,3) as "Ultimas letras del Apellido" from examenempresa.empleados where length(Apellidos)>8;

-- Ejercicio 20
select Id_empleado, instr(Email,'@') as "Posicion del @" from examenempresa.empleados;

-- Ejecicio 21
select Id_pedido,Fecha_pedido, date_add(Fecha_pedido, interval(1) month) from examenempresa.empleados;

-- Ejercicio 22
select Id_empleado,Fecha_alta, timestampdiff(MONTH,Fecha_alta,now()) from examenempresa.empleados where timestampdiff(MONTH,Fecha_alta,now())>18;

-- Ejercicio 23
select * from examenempresa.pedidos where (extract(year from Fecha_pedido)=2025) and (extract(month from Fecha_pedido) between 3 and 6);

-- Ejercicio 24
select * from examenempresa.pedidos where Fecha_pedido between now() and now()-interval 45 day;

-- Ejercicio 25
select Id_empleado, extract(year from Fecha_alata) as "Año de alta" from examenempresa.empleados where Provincia='Bilbao';

-- Ejercicio 26
select Id_empleado, sum(case
	when Sueldo > 2000 then Sueldo
    when Sueldo < 2000 then Sueldo*2
    end) as "Sumatorio de sueldos modificados" from examenempresa.empleados;

-- Ejercicio 27
select sum(case
	when Sueldo < 2000 then 0
    when Sueldo between 2000 and 3000 then 1
    when Sueldo > 3000 then 2
    end) as "Banda Salarial" from examenempresa.empleados;

-- Ejercicio 28
select Id_empleado,Sueldo, case
	when Sueldo=0 then "Sin sueldo"
    when Sueldo between 1 and 3000 then "Bajo"
    when Sueldo between 3001 and 8000 then "Medio"
    when Suledo > 8001 then "Alto"
    end as "Rango Salarial"
from examenempresa.empleados;
