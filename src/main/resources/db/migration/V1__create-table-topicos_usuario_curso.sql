
CREATE TABLE TBtopicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(200) NOT NULL UNIQUE,
    mensaje VARCHAR(650) NOT NULL UNIQUE,
    fecha_creacion DATETIME,
    status VARCHAR(50),

    PRIMARY KEY (id)

);

CREATE TABLE  TBusuarios (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    email varchar(100) NOT NULL UNIQUE,
    contrasena VARCHAR(300) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE TBcursos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
