CREATE DATABASE db_construindo_a_nossa_vida

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
nome_categoria VARCHAR(255),
tipo VARCHAR(255),

PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
id_produto BIGINT AUTO_INCREMENT,
nome_produto VARCHAR (255),
preco DECIMAL (5,2),
marca VARCHAR (255),
peso DECIMAL (5,1),
estoque BIGINT,
id_categoria BIGINT,

FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria),
PRIMARY KEY (id_produto)
);


INSERT INTO tb_categoria (nome_categoria,tipo)
VALUES
("cimento","obra"),
("mascara","proteção"),
("papel de parede", "decoração"),
("furadeira","eletricos"),
("lampadas","iluminação");

INSERT INTO tb_produto ( nome_produto, preco, marca, peso, estoque, id_categoria)
VALUES

("produto 1", 120.00, "votoran", 15.3 , 60, 1),
("produto 2", 90.00, "parmeru", 10.2 , 70, 2),
("produto 3", 66.99, "santauru", 12.4 , 89, 2),
("produto 4", 20.00, "volox", 9.1 , 20, 3),
("produto 5", 50.00, "zimax", 2.0 , 24, 3),
("produto 6", 60.00, "sigma", 1.0 , 24, 4),
("produto 7", 75.00, "starX", 10.9 , 98, 5),
("produto 8", 35.00, "Cimentox", 12.0 , 65, 1);

SELECT * FROM tb_produto
WHERE preco > 50;

SELECT * FROM tb_produto
WHERE preco > 3
and preco < 60;

SELECT * FROM tb_produto
WHERE nome_produto LIKE "%C%";

SELECT * FROM tb_produto
INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_produto
INNER JOIN tb__categoria ON tb_produto.id_produto = tb_categoria.id_categoria
WHERE tb_categoria.nome_categoria = "cimento";