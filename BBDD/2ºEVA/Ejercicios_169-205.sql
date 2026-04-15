-- Ejercicio 169
select u.provincia as "Provincia", avg(p.total) as "Precio medio"
from empresa.pedidos p
join empresa.usuarios u
on p.id_usuario = u.id_usuario
group by u.provincia;

-- Ejercicio 170
select emp.nombre as "Nombre", emp.apellido1 as "Apellido1", emp.apellido2 as "Aepllido2", dpt.nombreDpto as "Nombre Apartamento"
from empresa.empleados emp
join empresa.departamentos dpt
on emp.departamento = dpt.dpto_cod;

-- Ejercicio 171
select emp.nombre "Nombre Empleado",emp.apellido1 as "Apellido1", emp.apellido2 as "Aepllido2", hl.fecha_inicio "Fecha de Inicio", hl.fecha_fin "Fecha de Finalización"
from empresa.empleados emp
join empresa.historial_laboral hl
on emp.id_empleado = hl.id_empleado;

-- Ejercicio 172
select dpt.nombreDpto as "Nombre Apartamento",emp.nombre as "Nombre", emp.apellido1 as "Apellido1", emp.apellido2 as "Aepllido2"
from empresa.empleados emp
join empresa.historial_laboral hl
on emp.id_empleado = hl.id_empleado
join empresa.departamentos dpt
on hl.dpto_cod = dpt.dpto_cod;

-- Ejercicio 173
select emp.nombre as "Nombre",dpt.nombreDpto as "Nombre Apartamento"
from empresa.empleados emp
join empresa.departamentos dpt
on emp.departamento = dpt.dpto_cod;

-- Ejercicio 174
select emp.nombre as "Nombre Empleado", dpt.nombreDpto as "Nombre departamento", hl.fecha_inicio "Fecha de inciación",hl.fecha_fin "Fecha de finalización"
from empresa.empleados emp
join empresa.historial_laboral hl
on emp.id_empleado = hl.id_empleado
join empresa.departamentos dpt
on hl.dpto_cod = dpt.dpto_cod;

-- Ejercicio 175
select usur.nombre as "Nombre del usuario", ped.id_pedido as "Pedido"
from empresa.usuarios usur
join empresa.pedidos ped
on usur.id_usuario = ped.id_usuario;

-- Ejercicio 176
select usur.nombre as "Nombre del usuario", ped.fecha_pedido as "Fecha del pedido", usur.provincia as "Provincia"
from empresa.usuarios usur
join empresa.pedidos ped
on usur.id_usuario = ped.id_usuario;

-- Ejercicio 177
select distinct emp.id_empleado "Id Empleado", hl.id_empleado "Id del empelado"
from empresa.empleados emp
join empresa.historial_laboral hl
on emp.id_empleado = hl.id_empleado;

-- Ejercicio 178
select dpt.nombreDpto "Nombre Departamento", emp.id_empleado "Numero de empleados"
from empresa.departamentos dpt
left join empresa.empleados emp
on dpt.dpto_cod = emp.departamento
where emp.id_empleado is null;

-- Ejercicio 179
select dpt.ciudad "Ciudad", count(dpt.dpto_cod) "Numero de departamentos", count(emp.id_empleado) "Numero de empelados"
from empresa.departamentos dpt
join empresa.empleados emp
on dpt.dpto_cod = emp.departamento
group by dpt.ciudad;

-- Ejercicio 180
select usur.id_usuario as "Usuario", count(ped.id_pedido) as "Numero de pedidos"
from empresa.usuarios usur
join empresa.pedidos ped
on usur.id_usuario = ped.id_usuario
group by usur.id_usuario
order by count(ped.id_pedido) desc
limit 3;

-- Ejercicio 181
select usur.nombre as "Nombre de usuario", ped.id_pedido as "Numero de pedidos"
from empresa.usuarios usur
left join empresa.pedidos ped
on usur.id_usuario = ped.id_usuario
where ped.id_pedido is null;

-- Ejercicios 182
select dpt.nombreDpto "Nombre departamento", emp.nombre "Nombre empleado", emp.apellido1 "Apellido1", emp.apellido2 "Apellido2"
from empresa.departamentos dpt
left join empresa.empleados emp
on dpt.dpto_cod = emp.departamento
order by dpt.nombreDpto;

-- Ejercicio 183
select emp.nombre "Nombre Empleado", dpt.nombreDpto "Nombre Departamento"
from empresa.departamentos dpt
join empresa.empleados emp
on	dpt.dpto_cod = emp.departamento;

-- Ejercicio 184
select dpto.nombreDpto "Nombre departamento", hl.fecha_inicio, hl.fecha_fin
from empresa.departamentos dpto
left join empresa.historial_laboral hl
on dpto.dpto_cod = hl.dpto_cod;

-- Ejercicio 185
select pro.Nombre_producto "Nombre del producto", vent.Precio_total "Ingreso total"
from empresa.productos pro
join empresa.ventas vent
where pro.Categoria="electrónica";

-- Ejercicio 186
select sum(v.Cantidad_vendida), p.Nombre_producto
from empresa.ventas v
join empresa.productos p on v.Id_producto = p.Id_producto
where p.Categoria = "electronica"
group by v.Id_producto;

-- Ejercicio 187
select v.id_producto, v.precio_total, (v.precio_total*p.precio_unidad) as Calculo
from empresa.ventas v
join empresa.productos p on v.Id_producto = p.Id_producto;

-- Ejercicio 188
select sum(v.precio_total) as SumaPrecioTotal, p.categoria
from empresa.ventas v
join empresa.productos p on v.Id_producto = p.id_producto
group by p.categoria;

-- Ejercicio 189
select count(v.id_venta) as NumeroVentas, p.nombre_producto
from empresa.ventas v
join empresa.productos p on v.id_producto = p.Id_producto
where v.precio_total > 30
group by p.Id_producto;

-- Ejercicio 190
select v.id_venta, p.nombre_producto, v.precio_total
from empresa.ventas v
join empresa.productos p on v.id_producto=p.id_producto
where p.nombre_producto like "%smart%";

-- Ejercicio 191
select sum(v.cantidad_vendida), p.precio_unidad
from empresa.ventas v
join empresa.productos p on p.Id_producto = v.Id_producto
where p.Precio_unidad > 100
group by p.Id_producto;

-- Ejercicio 192
select p.nombre_producto,sum(v.precio_total) as IngresosTotales
from empresa.ventas v
join empresa.productos p on p.Id_producto = v.Id_producto
group by p.Nombre_producto;