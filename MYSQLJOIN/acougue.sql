CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
tipo VARCHAR (255) NOT NULL,
pecas BIGINT,
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
id_produto BIGINT AUTO_INCREMENT,
nome VARCHAR (255) NOT NULL,
peso DECIMAL (4,2),
preco DECIMAL (5,2),
id_categoria BIGINT,

FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria),
PRIMARY KEY (id_produto)
);

INSERT INTO tb_categoria (tipo,pecas)
VALUES
("BOVINO",4),
("SUINOS",4),
("AVES",6),
("PEIXES",10),
("CAPRINOS",6);

INSERT INTO tb_produto(nome,peso,preco,id_categoria)
VALUES
("CARNE 1",19.5, 62.00,1),
("CARNE 2",11.9, 12.35,2),
("CARNE 3",8.5, 66.60,3),
("CARNE 4",16.5, 88.90,4),
("CARNE 5",22.2, 77.99,4),
("CARNE 6",1.5, 33.00,5),
("CARNE 7",4.0, 50.00,2),
("CARNE 8",10.0, 14.00,2);

SELECT * FROM tb_produto
WHERE preco>50;

SELECT * FROM tb_produto
WHERE preco > 3
and preco < 60;

SELECT * FROM tb_produto
WHERE nome LIKE "C%";


SELECT * FROM tb_produto
INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_produto
INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.tipo = "suinos";


