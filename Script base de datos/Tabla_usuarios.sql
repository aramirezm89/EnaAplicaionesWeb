
nombre de base de datos = requerimiento




create table REQ_usuarios(

usuario varchar (20),
contraseña varchar (20)

)

Insert into REQ_usuarios (usuario,contraseña) values ('aramirezm','ramirez01')

Insert into REQ_usuarios (usuario,contraseña) values ('felipem','felipe01')

-- usuarios que podran acceder a la aplicacion mediante el login
------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------
CREATE TABLE REQ_gerencia(

gerencia varchar (50),      --inserta datos de gerencias en la empresa, insertar registros antes de iniciar app con el fin que se carguen los combobox.
departamento varchar (50),
asignado varchar (50),
encargado varchar (50)

)

CREATE TABLE REQ_requerimiento(
id int primary key auto_increment not null,
gerencia varchar (50),
departamento varchar (50),
asignado varchar (50),                    --inserta datos desde aplicaion web
encargado varchar (50),
requerimiento varchar (200),
estado varchar (50)
)

insert into REQ_gerencia values ('Prevencion Perdidas','Inventario','TIC','Antonio Ramirez')
insert into REQ_gerencia values ('Contraloria','Auditoria Interna','TIC','Macarena Aguilera')
insert into REQ_gerencia values ('RR HH','Gestion Empleo','Abastecimiento','Alejandro Calderon')
insert into REQ_gerencia values ('Comercial','Ventas y Gestion','Abastecimiento','Miguel Claro')

selectm * from REQ_gerencia

select * from REQ_requerimiento