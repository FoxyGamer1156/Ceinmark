-- INSERTS para la tabla Departamentos
INSERT INTO empresarandom.departamentos (dpto_cod, nombreDpto, ciudad) VALUES
(1, 'Ventas', 'Madrid'),
(2, 'Marketing', 'Barcelona'),
(3, 'TI', 'Valencia'),
(4, 'Recursos Humanos', 'Sevilla'),
(5, 'Finanzas', 'Madrid');
-- INSERTS para la tabla Empleados
INSERT INTO empresarandom.empleados (id_empleado, dni, nombre, apellido1, apellido2, sueldo, actividad, departamento, fecha_alta) VALUES
(1, '12345678A', 'Ana', 'Pérez', 'Sánchez', 1200.00, 'Vendedor', 1, '2022-06-15'),
(2, '23456789B', 'Luis', 'Gómez', 'Martínez', 1500.00, 'Vendedor', 1, '2021-09-23'),
(3, '34567890C', 'Carlos', 'Martínez', 'Rodríguez', 3000.00, 'Director', 2, '2023-01-05'),
(4, '45678901D', 'Marta', 'Ruiz', 'Fernández', 1600.00, 'Analista', 2, '2024-03-10'),
(5, '56789012E', 'Pedro', 'González', 'López', 1800.00, 'Desarrollador', 3, '2020-12-01'),
(6, '67890123F', 'Julia', 'Sánchez', 'López', 1900.00, 'Analista', 3, '2023-07-12'),
(7, '78901234G', 'Javier', 'López', 'Jiménez', 1500.00, 'Vendedor', 1, '2024-02-01'),
(8, '89012345H', 'Laura', 'Díaz', 'Fernández', 2500.00, 'Director', 2, '2021-05-22'),
(9, '90123456I', 'Sergio', 'Pérez', 'Molina', 1400.00, 'Vendedor', 1, '2020-11-30'),
(10, '01234567J', 'Raquel', 'Torres', 'González', 2000.00, 'Desarrollador', 3, '2024-01-15');
-- Historial Laboral
INSERT INTO empresarandom.Historial_laboral (id_empleado, dpto_cod, fecha_inicio, fecha_fin) VALUES
(1, 1, '2022-06-15', '2024-06-15'),
(2, 1, '2021-09-23', '2024-09-23'),
(3, 2, '2023-01-05', '2025-01-05'),
(4, 2, '2024-03-10', NULL),
(5, 3, '2020-12-01', NULL),
(6, 3, '2023-07-12', NULL),
(7, 1, '2024-02-01', NULL),
(8, 2, '2021-05-22', '2023-05-22'),
(9, 1, '2020-11-30', NULL),
(10, 3, '2024-01-15', NULL);
-- Pedidos
INSERT INTO empresarandom.Usuarios (id_usuario, nombre, provincia, credito) VALUES
(101, 'Antonio García', 'Madrid', 2000.00),
(102, 'Elena Sánchez', 'Barcelona', 5000.00),
(103, 'Pedro Rodríguez', 'Madrid', 4000.00),
(104, 'Lucía Fernández', 'Sevilla', 1500.00),
(105, 'David González', 'Madrid', 3500.00);
-- Usuarios
INSERT INTO empresarandom.Pedidos (id_pedido, id_usuario, fecha_pedido, total) VALUES
(1, 101, '2023-03-15', 120.00),
(2, 102, '2024-01-20', 300.00),
(3, 103, '2023-07-12', 450.00),
(4, 101, '2024-02-11', 200.00),
(5, 104, '2023-12-01', 1000.00),
(6, 102, '2024-01-01', 550.00),
(7, 105, '2024-03-15', 350.00),
(8, 103, '2024-02-03', 700.00),
(9, 101, '2023-10-05', 400.00),
(10, 105, '2024-01-10', 500.00);