CREATE DATABASE projeto02;

create table horista(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    telefone varchar(16) NOT NULL,
    endereco VARCHAR(150) NOT NULL,
    salarioHora FLOAT NOT NULL,
    horasTrabalhadas INT NOT NULL,
    salario FLOAT NOT NULL
);

CREATE TABLE assalariado(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(80) NOT NULL,
    telefone varchar(16),
    endereco VARCHAR(150) NOT NULL, 
    salario FLOAT NOT NULL
);

CREATE TABLE funcionario(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tipoPagamento Varchar(30) NOT NULL,
    horista_id INT,
    assalariado_id INT,
    setor VARCHAR(80) NOT NULL,
    CONSTRAINT horista_fk FOREIGN KEY(horista_id) REFERENCES horista(id),
    CONSTRAINT assalariado_fk FOREIGN KEY(assalariado_id) REFERENCES assalariado(id)
);

INSERT INTO assalariado(nome, telefone, endereco, salario) values
('-', '-', '-', 0);

INSERT INTO horista (nome, telefone, endereco, salario, salarioHora, horasTrabalhadas) VALUES
('-', '-', '-', 0, 0, 0);

SELECT * FROM horista;
SELECT * FROM assalariado;
SELECT * FROM funcionario;