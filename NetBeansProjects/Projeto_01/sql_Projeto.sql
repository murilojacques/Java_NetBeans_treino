CREATE DATABASE projeto01;

CREATE TABLE transporte(
	id int Not NULL AUTO_INCREMENT PRIMARY KEY,
    metodoTransporte Varchar(40),
    valor FLOAT NOT NULL
);

CREATE TABLE hospedagem(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    descricao VARCHAR(10000) NOT NULL,
    valorDiaria FLOAT NOT NULL
);

INSERT INTO transporte(metodoTransporte, valor) VALUES 
	('rodoviario', 300),
    ('aereo', 1800),
    ('maritimo', 1200);

INSERT INTO hospedagem (nome, descricao, valorDiaria) VALUES 
	('hospedagem 1', 'hospedagem meio pa, mas melhor q nada', 180),
    ('Hospedagem 2', 'Hospedagem ate que bangers, muito boa', 300),
    ('HOSPEDAGEM 3', 'HOSPEDAGEM muito BOA, Incrivel, Maravilhosa, BANGERS, Tudo de Bom e do Melhor, SPA, Sauna e Cinema', 3000);
    
    
    CREATE TABLE pacoteViagem(
		id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
        nomeHospede VArchar(80) NOT NULL,
        transporte_id INT NOT NULL,
        hospedagem_id INT NOT NULL,
        destino Varchar(200) NOT NULL,
        qDias INT NOT NULL,
        valorTotal FLOAT NOT NULL,
        margemLucro FLOAT NOT NULL,
        CONSTRAINT transporte_fk FOREIGN KEY(transporte_id) REFERENCES transporte(id),
        CONSTRAINT hospedagem_fk FOREIGN KEY(hospedagem_id) REFERENCES hospedagem(id)
    );
    
    SELECT * FROM pacoteViagem;