# Portal de Eventos Sostenibles

Este proyecto es un portal web para la gestión y promoción de eventos sostenibles, desarrollado como parte de una iniciativa para fomentar la participación en actividades que contribuyen a un futuro más verde.

## Tabla de Contenidos

- [Descripción](#descripción)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Autores](#autores)

## Descripción

El **Portal de Eventos Sostenibles** permite a los usuarios descubrir, explorar y participar en eventos relacionados con la sostenibilidad, como conferencias, talleres, ferias y actividades ecológicas. El portal está diseñado para ser intuitivo, accesible y visualmente atractivo.

## Tecnologías Utilizadas

- **HTML5** y **CSS3** para la página web
- **JavaScript** para el carrusel
- Estructura de carpetas organizada para imágenes, estilos y scripts
- **Java** como lenguaje de programación
- **MySQL** como gestor de Base de Datos
- **VmWare** para la creación de la máquina virtual
- La máquina es AlpineLinux con contenedores docker

## Estructura del Proyecto

```
proyecto_minsait/
│
├── doc/
│   ├── detalle_tablas.docx
│   ├── diagrama_relacional.drawio
│   ├── instalacion_servidor.docx
│   └── diagrama_ER.dia
│
├── html/
│   ├── index.html
│   ├── eventos.html
│   ├── detalle_evento.html
│   ├── registro.html
│   ├── login.html
│   ├── css/
│   │   ├── styles.css
│   │   ├── carrusel.css
│   │   └── auth.css
│   ├── js/
│   │   ├── main.js
│   │   ├── carrusel.js
│   │   └── auth.js
│   └── images/
│
├── sql/
│   └── creacion_bbdd.sql
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Categoria.java
│   │   │   ├── Evento.java
│   │   │   ├── Inscripcion.java
│   │   │   ├── Main.java
│   │   │   ├── Organizador.java
│   │   │   ├── Ubicacion.java
│   │   │   └── Usuario.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   ├── CategoriaTest.java
│       │   ├── EventoTest.java
│       │   ├── InscripcionTest.java
│       │   ├── MainTest.java
│       │   ├── OrganizadorTest.java
│       │   ├── UbicacionTest.java
│       │   └── UsuarioTest.java
│       └── resources/
│
├── readme.md
```

## Autores

- Equipo de desarrollo de Indra/Minsait
- Roberto Hermoso Rejano
