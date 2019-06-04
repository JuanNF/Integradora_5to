create database integradora;
use integradora;

create table registro (id_registro int auto_increment primary key,
nombre varchar(26),
ApP varchar(26),
ApM varchar(26),
correo varchar(50),
edad int(9),
sexo varchar(7),
foto varchar(100))engine=innodb;

insert into registro values(null,"moy","ramirez","molina","selecto@gmail.com",19,"M","lolis");

create table Paciente(id_Paciente int auto_increment primary key,
id_registro int,
foreign key(id_registro)references registro(id_registro)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

create table UsuarioWeb(id_Usuario int auto_increment primary key,
id_registro int,
foreign key(id_registro)references registro(id_registro)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

create table Nutriologo(id_Nutriologo int auto_increment primary key,
id_registro int,
Referencias varchar(50),
No_Cedula varchar(30),
Horario varchar(70),
Direccion varchar(150),
foreign key(id_registro)references registro(id_registro)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

insert into nutriologo values(null,1,"chidas","2896892356","tarde","miguel");


create table Comida(id_Comida int auto_increment primary key,
id_usuario int,
categoria varchar(26),
nombre varchar(26),
calorias int(9),
cantidad int(9),
total int(9),
foreign key (id_usuario)references usuarioWeb(id_usuario)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

create table ArchivoC(id_archivo int auto_increment primary key, 
fecha date,
numeroDeRegistros int(9))engine=innodb;

create table detalleComida(id_comida int auto_increment primary key,
id_usuario int,
nombre_comida varchar(26),
foreign key (id_usuario)references comida(id_usuario)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

create table MasComida(id_mas_comida int auto_increment primary key,
id_usuario int,
nombre varchar(26),
calorias int(9),
cantidad int(9),
total int(9),
foreign key (id_usuario)references comida(id_usuario)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

create table Cita(id_cita int auto_increment primary key,
id_usuario int,
id_nutriologo int,
dia date,
hora time,
foreign key (id_usuario)references usuarioweb(id_usuario)ON DELETE CASCADE ON UPDATE CASCADE,
foreign key (id_nutriologo)references nutriologo(id_nutriologo)ON DELETE CASCADE ON UPDATE CASCADE);

create table CompraSuscripcion(id_compra int auto_increment primary key,
id_nutriologo int,
total int(9),
foreign key(id_nutriologo)references nutriologo(id_nutriologo)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

create table PlanesSuscripcion(id_plan int auto_increment primary key,
id_nutriologo int,
nombre varchar(26),
tiempo date,
costo int(9),
foreign key (id_nutriologo)references nutriologo(id_nutriologo)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

create table PlanDietas(id_dieta int auto_increment primary key,
id_nutriologo int,
nombre varchar(26),
descripcion varchar(100),
costo int(9),
tiempo varchar(26),
resultados varchar(100),
foreign key (id_nutriologo)references nutriologo(id_nutriologo)ON DELETE CASCADE ON UPDATE CASCADE)engine=innodb;

insert into plandietas values (null, 1, "Bajar de Peso", "Esta dieta ayudara a bajar de peso a a la persona", 500, "1 mes", "De 2 a 10 Kilos por mes");

create table Consejos()engine=innodb;
