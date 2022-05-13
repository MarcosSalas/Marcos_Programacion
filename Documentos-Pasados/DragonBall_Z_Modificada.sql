														/*CREACION DE BASE DE DATOS*/

DROP DATABASE IF EXISTS DragonBall_Z;
CREATE DATABASE DragonBall_Z CHARACTER SET utf8mb4;
USE DragonBall_Z;

 CREATE TABLE Familia (
    id_Familia INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Nombre_Padre VARCHAR(100) NOT NULL,
    Nombre_Madre VARCHAR(100) NOT NULL,
    Cant_Hijos int not null,
    Cant_Hermanos int not null
);
 CREATE TABLE Raza (
    id_Raza INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Ser VARCHAR(100) NOT NULL,
    Tipo VARCHAR(100) NOT NULL
);
 CREATE TABLE Personaje (
    id_Personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    id_Familia int UNSIGNED NOT NULL,
    id_Raza int UNSIGNED NOT NULL,
    Nombre VARCHAR(100) NOT NULL,
    Lugar_Nacimiento VARCHAR(250) NOT NULL,
    FOREIGN KEY(id_Familia) REFERENCES familia(id_Familia),
    FOREIGN KEY(id_Raza) REFERENCES Raza(id_Raza)
);
 CREATE TABLE Transformacion (
    id_Transformacion INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL
);
 CREATE TABLE Transformacion_Personaje (
    id_Personaje INT UNSIGNED,
    id_Transformacion INT UNSIGNED,
	PRIMARY KEY (id_Personaje, id_Transformacion),
	FOREIGN KEY(id_Personaje) REFERENCES Personaje(id_Personaje),
    FOREIGN KEY(id_Transformacion) REFERENCES Transformacion(id_Transformacion)
);
 CREATE TABLE Poder (
    id_Poder INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(100) NOT NULL
);
 CREATE TABLE Poder_Personaje (
	id_Personaje INT UNSIGNED,
    id_Poder INT UNSIGNED,
	PRIMARY KEY (id_Personaje, id_Poder),
	FOREIGN KEY(id_Personaje) REFERENCES Personaje(id_Personaje),
    FOREIGN KEY(id_Poder) REFERENCES Poder(id_Poder)
);

															/*CARGA DE DATOS*/

 /* Poder */
  /* Goku */

INSERT INTO Poder VALUES (1, 'Kame Hame Ha');
INSERT INTO Poder VALUES (2, 'Kaio-Ken');
INSERT INTO Poder VALUES (3, 'Genkidama');
INSERT INTO Poder VALUES (4, 'Ultra Instinto');
INSERT INTO Poder VALUES (5, 'Teletransportación');
  /* Vegeta */
INSERT INTO Poder VALUES (6, 'Ataque Big Bang');
INSERT INTO Poder VALUES (7, 'Ataque de Brillo Final');
INSERT INTO Poder VALUES (8, 'Ataque de Energía Saiyan');
INSERT INTO Poder VALUES (9, 'Bombardero Fotónico');
  /* Gohan */
INSERT INTO Poder VALUES (10, 'Super Combo de Asalto');
INSERT INTO Poder VALUES (11, 'Kiai');
INSERT INTO Poder VALUES (12, 'Onda de Ki');
  /* Freezer */
  INSERT INTO Poder VALUES (13, 'Disco Destructor');
  INSERT INTO Poder VALUES (14, 'Supernova');
  INSERT INTO Poder VALUES (15, 'Bola Mortal');
  INSERT INTO Poder VALUES (16, 'La personalidad de Freezer');    
  /* Cell */
  INSERT INTO Poder VALUES (17, 'Super Fuerza');
  INSERT INTO Poder VALUES (18, 'telequinesis');
  INSERT INTO Poder VALUES (19, 'regeneración');
  INSERT INTO Poder VALUES (20, 'absorción');
 
 /* Raza */
INSERT INTO Raza VALUES (1,'Humano','Saiyajin');
INSERT INTO Raza VALUES (2,'alienígena','Changlong');
INSERT INTO Raza VALUES (3, 'Celula','bioandroide');
 /* Transformacion */
INSERT INTO transformacion VALUES (1, 'SUPER SAIYAJIN');
INSERT INTO transformacion VALUES (2, 'SUPER SAIYAJIN F2');
INSERT INTO transformacion VALUES (3, 'SUPER SAIYAJIN F3');
INSERT INTO transformacion VALUES (4, 'SUPER F DIOS');
INSERT INTO transformacion VALUES (5, 'SUPER F DIOS 1');
INSERT INTO transformacion VALUES (6, 'FASE 1');
INSERT INTO transformacion VALUES (7, 'FASE 2');
INSERT INTO transformacion VALUES (8, 'FASE 3');
INSERT INTO transformacion VALUES (9, 'FASE 4');
INSERT INTO transformacion VALUES (10, 'GOLDEN');
INSERT INTO transformacion VALUES (11, 'CÁSCARA');
INSERT INTO transformacion VALUES (12, 'RECIÉN NACIDO');
INSERT INTO transformacion VALUES (13, 'PERFECTO');

 /* familia */
INSERT INTO familia VALUES (1,'Bardock','Gine',2,1);
INSERT INTO familia VALUES (2, 'Rey Vegeta','Desconocida',2,1);
INSERT INTO familia VALUES (3,'Son Goku','Milk',1,1);
INSERT INTO familia VALUES (4,'King Cold','Desconocida',1,1);
INSERT INTO familia VALUES (5,'Dr.Gero','Desconocida',0,0);

 /* Personaje */
INSERT INTO personaje VALUES (1,1,1,'GOKU','Planeta Vegeta');
INSERT INTO personaje VALUES (2,2,1,'VEGETA','Planeta Vegeta');
INSERT INTO personaje VALUES (3,3,1,'GOHAN','Planeta Tierra');
INSERT INTO personaje VALUES (4,4,2,'FREEZER','Universo 7');
INSERT INTO personaje VALUES (5,5,3,'CELL','Planeta Tierra');

-- delete from personaje where id_personaje=5;

 /* transformacion_personaje */
INSERT INTO transformacion_personaje VALUES (1,1);
INSERT INTO transformacion_personaje VALUES (1,2);
INSERT INTO transformacion_personaje VALUES (1,3);
INSERT INTO transformacion_personaje VALUES (1,4);
INSERT INTO transformacion_personaje VALUES (1,5);
INSERT INTO transformacion_personaje VALUES (2,1);
INSERT INTO transformacion_personaje VALUES (2,2);
INSERT INTO transformacion_personaje VALUES (2,4);
INSERT INTO transformacion_personaje VALUES (2,5);
INSERT INTO transformacion_personaje VALUES (3,1);
INSERT INTO transformacion_personaje VALUES (3,2);
INSERT INTO transformacion_personaje VALUES (4,6);
INSERT INTO transformacion_personaje VALUES (4,7);
INSERT INTO transformacion_personaje VALUES (4,8);
INSERT INTO transformacion_personaje VALUES (4,9);
INSERT INTO transformacion_personaje VALUES (4,10);
INSERT INTO transformacion_personaje VALUES (5,11);
INSERT INTO transformacion_personaje VALUES (5,12);
INSERT INTO transformacion_personaje VALUES (5,6);
INSERT INTO transformacion_personaje VALUES (5,7);
INSERT INTO transformacion_personaje VALUES (5,13);

 /* poder_personaje */
INSERT INTO poder_personaje VALUES (1,1);
INSERT INTO poder_personaje VALUES (1,2);
INSERT INTO poder_personaje VALUES (1,3);
INSERT INTO poder_personaje VALUES (1,4);
INSERT INTO poder_personaje VALUES (1,5);
INSERT INTO poder_personaje VALUES (2,6);
INSERT INTO poder_personaje VALUES (2,7);
INSERT INTO poder_personaje VALUES (2,8);
INSERT INTO poder_personaje VALUES (2,9);
INSERT INTO poder_personaje VALUES (3,1);
INSERT INTO poder_personaje VALUES (3,10);
INSERT INTO poder_personaje VALUES (3,11);
INSERT INTO poder_personaje VALUES (3,12);
INSERT INTO poder_personaje VALUES (4,13);
INSERT INTO poder_personaje VALUES (4,14);
INSERT INTO poder_personaje VALUES (4,15);
INSERT INTO poder_personaje VALUES (4,16);
INSERT INTO poder_personaje VALUES (5,5);
INSERT INTO poder_personaje VALUES (5,17);
INSERT INTO poder_personaje VALUES (5,18);
INSERT INTO poder_personaje VALUES (5,19);
INSERT INTO poder_personaje VALUES (5,20);


																		/*CONSULTAS*/

/*
 select personaje.nombre,poder.nombre from poder inner join poder_personaje on poder.id_Poder=poder_personaje.id_Poder inner join personaje on personaje.id_Personaje=poder_personaje.id_Personaje where poder_personaje.id_Personaje=1;
 select distinct personaje.nombre,poder.nombre,transformacion.nombre from poder inner join poder_personaje on poder.id_Poder=poder_personaje.id_Poder inner join personaje on personaje.id_Personaje=poder_personaje.id_Personaje inner join transformacion_personaje on transformacion_personaje.id_Personaje=personaje.id_Personaje inner join transformacion on transformacion.id_Transformacion=transformacion_personaje.id_Transformacion where poder_personaje.id_Personaje=2 and transformacion.nombre  like 'SUPER F DIOS 1';
 select personaje.nombre from personaje inner join familia on personaje.id_Familia=familia.id_Familia where familia.Nombre_Madre like 'Desconocida';
 select personaje.nombre,personaje.Lugar_Nacimiento,raza.ser,raza.tipo from personaje inner join raza on personaje.id_Raza=raza.id_Raza;
  select raza.id_Raza,raza.Ser,count(raza.ser)as Especie from personaje inner join raza on personaje.id_Raza=raza.id_Raza where raza.ser='humano';
  */
  
 

create role if not exists 'Dios_de_Todo','Dios_Destruccion';

grant all on dragonball_z.* to 'Dios_de_Todo';

grant select, delete on dragonball_z.* to 'Dios_Destruccion'; -- ver lo que borra

create user 'ZenoSama'@'localhost' identified by 'admin';
create user 'Bills'@'localhost' identified by 'admin';

grant 'Dios_de_Todo' to 'ZenoSama'@'localhost';
grant 'Dios_Destruccion' to 'Bills'@'localhost';

 


