create database biblioteca;
use biblioteca;
CREATE TABLE Libro (
IdLibro INT NOT NULL PRIMARY KEY,
Titulo NVARCHAR(100) NOT NULL,
Editorial NVARCHAR(100) NOT NULL,
Area NVARCHAR(100) NOT NULL
);
CREATE TABLE Autor (
IdAutor INT NOT NULL PRIMARY KEY,
Nombre NVARCHAR(100) NOT NULL,
Nacionalidad NVARCHAR(30) NOT NULL
);
CREATE TABLE Estudiante (
IdLector INT NOT NULL PRIMARY KEY,
CI NVARCHAR(20) NOT NULL,
Nombre NVARCHAR(100) NOT NULL,
Direccion NVARCHAR(100) NOT NULL,
Carrera NVARCHAR(60) NOT NULL,
Edad INT NOT NULL
);
CREATE TABLE LibAut (
IdAutor INT NOT NULL,
IdLibro INT NOT NULL,
CONSTRAINT autor_libro_pk PRIMARY KEY (IdAutor, IdLibro),
CONSTRAINT FK_LibAut_Autor FOREIGN KEY (IdAutor) REFERENCES Autor(IdAutor),
CONSTRAINT FK_LibAut_Libro FOREIGN KEY (IdLibro) REFERENCES Libro(IdLibro)
);
CREATE TABLE Prestamo (
IdLector INT NOT NULL,
IdLibro INT NOT NULL,
FechaPrestamo CHAR(10),
FechaDevolucion CHAR(10),
Devuelto CHAR(10),
CONSTRAINT lector_libro_pk PRIMARY KEY (IdLector, IdLibro),
CONSTRAINT FK_Prestamo_Estudiante FOREIGN KEY (IdLector) REFERENCES
Estudiante(IdLector),
CONSTRAINT FK_Prestamo_Libro FOREIGN KEY (IdLibro) REFERENCES
Libro(IdLibro)
);