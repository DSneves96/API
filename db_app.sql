drop database if exists app;

create database app;

use app;

create table tb_curso
(
	id_curso int primary key not null auto_increment,
    nome varchar (50) not null,
    descricao varchar(50) not null
);

create table tb_aluno
(
	id_aluno int primary key not null auto_increment,
    nome varchar (50) not null,
    rg varchar(50) null,
	cpf varchar(50) null,
    email varchar(50) null,
    data_nasc  date not null,
    id_curso int not null
);

