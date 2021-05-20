create database db_escola;

use db_escola;

CREATE TABLE tb_Alunes(
id BIGINT AUTO_INCREMENT NOT NULL,
nome VARCHAR(255) NOT NULL,
idade INT NOT NULL,
data_de_nascimento INT NOT NULL,
escolaridade VARCHAR(255) NOT NULL,
media DECIMAL (2,2) NULL,

PRIMARY KEY (id)
);

INSERT INTO tb_Alunes ( nome, idade, escolaridade, serie, media)
values
("Antonio", 18, 10/06/2003, "colegial" , 7.8),
("Erik", 18, 05/04/2003, "colegial", 8.5),
("Thaina", 18, 01/07/2003, "colegial", 8.6),
("Carlos", 18, 04/04/2003, "colegial", 6.0),
("lorena", 18, 27/10/2003, "colegial", 6.0),
("thais", 18, 20/02/2003, "colegial", 7.7),
("sophia", 18, 17/07/2003, "colegial", 8.0),
("Luciano", 18, 08/04/2003, "colegial",6.7);

SELECT * FROM tb_alunos WHERE media > 7;
SELECT * FROM tb_alunos WHERE media < 7;

UPDATE tb_alunes SET media = 9.0
Where id = 2;

SELECT * FROM tb_alunes;

