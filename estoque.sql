create database estoque;
use estoque;
create table produto(
id int auto_increment primary key,
nome varchar(255) not null,
preco double not null,
quantidade varchar(255)
);
select * from produto;

DROP TABLE produto;

create table produto(
id int auto_increment primary key,
nome varchar(255) not null,
preco double not null,
quantidade double not null,
unidadeDeMedida varchar(255) not null
);

DROP TABLE produto;

create table produto(
id int auto_increment primary key,
nome varchar(255) ,
preco double ,
quantidade double ,
unidadeDeMedida varchar(255) 
);
