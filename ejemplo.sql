CREATE DATABASE ejemplo;

use ejemplo;

CREATE TABLE Empleado
(
Id int primary key not null,
Nombre varchar(25) not null,
Actividad Varchar(25) not null,
Fecha_asignacion DATE not null,
Fecha_ejecucion DATE not null,
Estado boolean not null
);