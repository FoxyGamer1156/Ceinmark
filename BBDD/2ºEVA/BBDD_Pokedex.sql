-- ============================================
-- 1. TABLAS BASE (CATÁLOGOS)
-- ============================================
create database Pokedex;
use Pokedex;
CREATE TABLE region (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE tipo_pokedex (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE tipo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE categoria_movimiento (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE stat (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE naturaleza (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE NOT NULL,
    statAumenta INT,
    statReduce INT,
    FOREIGN KEY (statAumenta) REFERENCES stat(id),
    FOREIGN KEY (statReduce) REFERENCES stat(id)
);

CREATE TABLE grupo_huevo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE habilidad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE NOT NULL,
    descripcion TEXT
);

CREATE TABLE objeto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) UNIQUE NOT NULL,
    descripcion TEXT,
    categoria VARCHAR(100)
);

-- ============================================
-- 2. TABLAS PRINCIPALES
-- ============================================

CREATE TABLE pokemon (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    generacion INT,
    altura INT,
    peso INT,
    descripcion TEXT,
    sprite_modelo TEXT,

    baseHp INT,
    baseAtq INT,
    baseDef INT,
    baseAtqEsp INT,
    baseDefEsp INT,
    baseVel INT,

    ratioGenero VARCHAR(20),
    ratioCaptura INT,
    baseExp INT,

    region_origen_id INT,
    FOREIGN KEY (region_origen_id) REFERENCES region(id)
);

CREATE TABLE movimiento (
    id INT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    tipo_id INT,
    categoria_id INT,
    potencia INT,
    precision_mov INT,
    pp INT,
    descripcion TEXT,
    FOREIGN KEY (tipo_id) REFERENCES tipo(id),
    FOREIGN KEY (categoria_id) REFERENCES categoria_movimiento(id)
);

-- ============================================
-- 3. TABLAS RELACIONALES N:M
-- ============================================

CREATE TABLE pokemon_tipo (
    pokemon_id INT,
    tipo_id INT,
    orden INT,
    PRIMARY KEY (pokemon_id, tipo_id),
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(id),
    FOREIGN KEY (tipo_id) REFERENCES tipo(id)
);

CREATE TABLE pokemon_grupo_huevo (
    pokemon_id INT,
    grupo_id INT,
    PRIMARY KEY (pokemon_id, grupo_id),
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(id),
    FOREIGN KEY (grupo_id) REFERENCES grupo_huevo(id)
);

CREATE TABLE pokemon_habilidad (
    pokemon_id INT,
    habilidad_id INT,
    tipo INT, -- 1 = normal, 2 = segunda, 3 = oculta
    PRIMARY KEY (pokemon_id, habilidad_id),
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(id),
    FOREIGN KEY (habilidad_id) REFERENCES habilidad(id)
);

CREATE TABLE pokemon_movimientos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pokemon_id INT,
    movimiento_id INT,
    metodoAprendizaje VARCHAR(20),
    nivel INT NULL,
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(id),
    FOREIGN KEY (movimiento_id) REFERENCES movimiento(id)
);

-- ============================================
-- 4. TABLAS DE USUARIO Y EQUIPOS
-- ============================================

CREATE TABLE usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(50),
    nombreUsuario VARCHAR(100),
    apellido VARCHAR(100),
    contrasena VARCHAR(255),
    rol VARCHAR(50),
    region_id INT,
    tipo_pokedex_id INT,
    FOREIGN KEY (region_id) REFERENCES region(id),
    FOREIGN KEY (tipo_pokedex_id) REFERENCES tipo_pokedex(id)
);

CREATE TABLE equipo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre_equipo VARCHAR(100),
    usuario_id INT,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

CREATE TABLE equipo_pokemon (
    id INT AUTO_INCREMENT PRIMARY KEY,
    equipo_id INT,
    pokemon_id INT,
    slot INT,
    nivel INT,
    naturaleza_id INT,
    habilidad_id INT,
    objeto_id INT,

    ivHp INT,
    ivAtq INT,
    ivDef INT,
    ivAtqEsp INT,
    ivDefEsp INT,
    ivVel INT,

    evHp INT,
    evAtq INT,
    evDef INT,
    evAtqEsp INT,
    evDefEsp INT,
    evVel INT,

    FOREIGN KEY (equipo_id) REFERENCES equipo(id),
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(id),
    FOREIGN KEY (naturaleza_id) REFERENCES naturaleza(id),
    FOREIGN KEY (habilidad_id) REFERENCES habilidad(id),
    FOREIGN KEY (objeto_id) REFERENCES objeto(id)
);
