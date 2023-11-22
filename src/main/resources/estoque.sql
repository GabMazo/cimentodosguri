create database estoque;
use estoque;
create table produto(
id bigint auto_increment PRIMARY KEY,
nome varchar(250),
preco double,
quantidade int
);

DROP TABLE produto;

create table produto(
id bigint auto_increment PRIMARY KEY,
nome varchar(250),
preco double,
quantidade varchar(250)
);
select * from produto;