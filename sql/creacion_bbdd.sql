-- crear base de datos

create database if not exists portaleventos;
use portaleventos;

-- tabla de categorías

create table categorias (
    id int primary key auto_increment,
    nombre varchar(100) not null
);

-- tabla de ubicaciones

create table ubicaciones (
    id int primary key auto_increment,
    online boolean not null,
    direccion varchar(255)
);

-- tabla de organizadores

create table organizadores (
    id int primary key auto_increment,
    nombre varchar(100) not null,
    email varchar(100) not null unique,
    password varchar(100) not null
);

-- tabla de usuarios

create table usuarios (
    id int primary key auto_increment,
    nombre varchar(100) not null,
    email varchar(100) not null unique,
    password varchar(100) not null
);

-- tabla de eventos

create table eventos (
    id int primary key auto_increment,
    nombre varchar(100) not null,
    fecha date not null,
    duracion int not null, -- duración en minutos
    id_ubicacion int not null,
    id_organizador int not null,
    id_categoria int not null,
    foreign key (id_ubicacion) references ubicaciones(id),
    foreign key (id_organizador) references organizadores(id),
    foreign key (id_categoria) references categorias(id)
);

-- tabla de inscripciones

create table inscripciones (
    id int primary key auto_increment,
    id_usuario int not null,
    id_evento int not null,
    cancelado boolean default false,
    foreign key (id_usuario) references usuarios(id),
    foreign key (id_evento) references eventos(id)
);
