-- Ejer_109
Select departamento,avg(sueldo) as 'Sueldo Medio'
from empresarandom.empleados
group by departamento;
-- Ejer_110
Select actividad,max(sueldo) as 'Sueldo Maximo',min(sueldo) as 'Sueldo Minimo'
from empresarandom.empleados
group by actividad;
-- Ejer_111
Select departamento,count(id_empleado) as 'Numero empleados'
from empresarandom.empleados
group by departamento;
-- Ejer_112
Select departamento, count(id_empleado) as 'Numero empleados'
from empresarandom.empleados
group by departamento
having count(id_empleado) > 5;
-- Ejer_113
select provincia,sum(credito) as 'Total de creditos'
from empresarandom.usuarios
group by provincia;
-- Ejer_114
select provincia,sum(credito) as 'Total de creditos'
from empresarandom.usuarios
group by provincia
having sum(credito) > 10000;
-- Ejer_115
Select id_usuario as 'Usuario',sum(total) as 'Importe Total'
from empresarandom.pedidos
group by id_usuario;
-- Ejer_116
Select id_usuario as 'Usuario',sum(total) as 'Importe Total'
from empresarandom.pedidos
group by id_usuario
having sum(total) > 1000;
-- Ejer_117
select extract(year from fecha_pedido) as 'Año', count(id_pedido) as 'Numero de pedidos'
from pedidos
group by extract(year from fecha_pedido);
-- Ejer_118
select departamento, count(id_empleado) as 'Numero de empleados', avg(sueldo) as 'Sueldo medio'
from empresarandom.empleados
group by departamento
order by avg(sueldo) desc;
-- Ejer_119
select departamento, avg(sueldo) as 'Sueldo medio'
from empresarandom.empleados
where extract(year from fecha_alta) = 2024
group by departamento;
-- Ejer_120
select actividad, count(id_empleado) as 'NºEmpleados en cada actividad'
from empresarandom.empleados
group by actividad
having count(id_empleado) >= 3;
-- Ejer_121
select departamento, sum(sueldo) as 'Sueldo Total', max(sueldo) as 'Sueldo maximo', min(sueldo) as 'Sueldo minimo'
from empresarandom.empleados
group by departamento;
-- Ejer_122
select actividad, avg(sueldo) as 'Sueldo medio mas alto'
from empresarandom.empleados
group by actividad
order by avg(sueldo) desc
limit 1;
-- Ejer_124

-- Ejer_125
select sum(total) as 'Total del año', extract(year from fecha_pedido) as 'Año'
from empresarandom.pedidos
group by extract(year from fecha_pedido);
-- Ejer_126
select count(fecha_inicio) as 'Cantidad de cambio', id_empleado as 'Empleado'
from empresarandom.historial_laboral
group by id_empleado;

-- Ejer_127
select avg(price) as 'Precio medio', extract(month from fecha) as 'Mes'
from empresarandom.visit
group by extract(month from fecha)
having extract(month from fecha)=1;

-- Ejer_128
select avg(duration) as 'Timepo medio',extract(month from fecha) as 'Mes', extract(year from fecha) as 'Año'
from empresarandom.visit
group by extract(year from fecha),extract(month from fecha)
order by extract(year from fecha),extract(month from fecha) asc;

-- Ejer_129
select avg(price) as 'Precio medio',fecha,count(fecha) as 'Visitas por dia'
from empresarandom.visit
group by fecha
having count(fecha)>=3;

-- Ejer_130
select avg(price) as 'Precio medio',fecha,count(fecha) as 'Visitas por dia'
from empresarandom.visit
where duration >= 5
group by fecha
having count(fecha)>=3;

-- Ejer_131
select id,avg(huella_carbono_pfc) as 'Huella de carbono media', grupo_industrial,count(nombre_producto) as 'Numero de productos'
from empresarandom.emisiones_producto
where grupo_industrial='Hardware y Equipamiento Tecnológico'
group by id
having avg(huella_carbono_pfc) > 100;

-- Ejer_132
select anio_produccion as 'Año de produccion', count(titulo) as 'Numero de juegos', avg(coste_produccion) as 'Coste de Produccion medio', avg(ingresos) as 'Ingresos medio'
from videojuegos.juegos
group by anio_produccion
order by anio_produccion asc;

-- Ejer_133
select tipo as 'Tipo de juego', count(titulo) as 'Numero de juegos'
from videojuegos.juegos
where coste_produccion<ingresos
group by tipo;

-- Ejer_134
select tipo as 'Tipo de juego', sum(ingresos) as 'Ingresos totales del año'
from videojuegos.juegos
where anio_produccion>2010 and (sistema='PS2' or sistema='PS3')
group by tipo
order by sum(ingresos) asc;

-- Ejer_135
select empresa as 'Nombre Empresa', sum(ingresos - coste_produccion) as 'beneficio_bruto_total'
from videojuegos.juegos
group by empresa
order by sum(ingresos - coste_produccion) desc;

-- Ejer_136
select empresa as 'Nombre Empresa', anio_produccion as 'Año', sum(ingresos-coste_produccion) as 'Bruto'
from videojuegos.juegos
group by empresa,anio_produccion
order by empresa,anio_produccion;
-- Ejer_137
select empresa as 'Nombre', count(titulo) as 'Juegos producidos', avg(coste_produccion) as 'Coste de produccion medio'
from videojuegos.juegos
group by empresa;

-- Ejer_138
select empresa as 'Nombre Empresa', sum(ingresos) as 'Ingresos totales', count(titulo) as 'Nº de juegos buenos'
from videojuegos.juegos
where (anio_produccion between 2000 and 2009) and ingresos > coste_produccion and puntuacion > 6
group by empresa
having sum(ingresos) > 4000000;