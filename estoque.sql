create database estoque;
use estoque;
create table produto(
id int auto_increment primary key,
nome varchar(255) not null,
preco double not null,
quantidade varchar(255)
);
