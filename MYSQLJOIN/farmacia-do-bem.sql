CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
id_categoria BIGINT AUTO_INCREMENT,
nome_categoria VARCHAR (255),
estoque INT,
PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
id_produto BIGINT AUTO_INCREMENT,
nome_produto VARCHAR(255)NOT NULL,
preco DECIMAL (5,2),
estado VARCHAR (255) NOT NULL,
funcao VARCHAR (255) NOT NULL,
id_categoria BIGINT, 

FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria),
PRIMARY KEY (id_produto)
);

INSERT INTO tb_categoria (nome_categoria,estoque)
VALUES
("remedio",1000),
("higiene",300),
("esquipamento",40),
("curativo",100),
("embelezamento", 50);

INSERT INTO tb_produto (nome_produto,preco,estado,funcao,id_categoria)
VALUES
("PRODUTO 1" , 20.00, "solido", "tratamento",1),
("PRODUTO 2" , 67.90, "solido", "limpeza",2),
("PRODUTO 3" , 25.99, "liquido", "limpeza",2),
("PRODUTO 4" , 99.99, "solido", "tratamento",3),
("PRODUTO 5" , 9.00, "solido", "tratamento",4),
("PRODUTO 6" , 7.00, "solido", "cosmetico",5),
("PRODUTO 7" , 20.00, "solido", "tratamento",1),
("PRODUTO 8" , 20.00, "solido", "tratamento",1);

SELECT * FROM tb_produto
WHERE preco > 50;

SELECT * FROM tb_produto
WHERE preco > 3
and preco < 60;

SELECT * FROM tb_produto
WHERE nome_produto LIKE "%B";

SELECT * FROM tb_produto
INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria;

SELECT * FROM tb_produto
INNER JOIN tb_categoria ON tb_produto.id_categoria = tb_categoria.id_categoria
WHERE tb_categoria.nome_categoria = "curativo";
