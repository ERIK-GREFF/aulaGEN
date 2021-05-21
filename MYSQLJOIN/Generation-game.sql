CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;


CREATE TABLE tb_classe(
id_classe BIGINT AUTO_INCREMENT,
nome_classe VARCHAR(255) NOT NULL,
arma VARCHAR(255) NOT NULL,
funcao VARCHAR(255) NOT NULL,
PRIMARY KEY (id_classe)
);



CREATE TABLE tb_personagem(
id_personagem BIGINT AUTO_INCREMENT,
nome_personagem VARCHAR (255) NOT NULL,
dano INT NOT NULL,
defesa INT NOT NULL,
velocidade_ataque DECIMAL(2,2) NULL,
habilidade VARCHAR (255) NOT NULL,
id_classe BIGINT,
 
FOREIGN KEY (id_classe) REFERENCES tb_classe (id_classe),
PRIMARY KEY (id_personagem)
);

INSERT INTO tb_classe (nome_classe, arma, funcao)
VALUES
("assassino", "adaga", "atacar"),
("mago", "orb", "atacar"),
("curador", "orb", "suporte"),
("tanque", "martelo","defender"),
("samurai", "espada", "atacar");

INSERT INTO tb_personagem ( nome_personagem, dano, defesa, velocidade_ataque, habilidade,id_classe)
VALUES
("KASSANDRA", 800, 1000,1, "adaga em chamas",1),
("KUXIR", 1900, 2200, 2, "Escudo extra",4),
("SQUISHY",900 , 1300 ,1, "ilusão",2),
("CARD", 700, 900, 1, "revive um personagem",3),
("EVAMPLE", 1900, 2400,4, "domo de proteção",4),
("JUSTIN", 1000, 1100, 2, "velocidade de ataque extra",5),
("CHROMAX", 1200, 900, 2, "espada do dragão",5),
("LACHINIO", 600, 2200, 1, "rastreio",1);

SELECT * FROM tb_personagem
WHERE dano > 2000;

SELECT * FROM tb_personagem
WHERE defesa < 2000
and defesa > 1000;

SELECT * FROM tb_personagem
WHERE nome_personagem like "%C%";

SELECT * FROM tb_personagem
INNER JOIN tb_classe on tb_personagem.id_classe =  tb_classe.id_classe;

SELECT * FROM tb_personagem
INNER JOIN tb_classe on tb_personagem.id_classe = tb_classe.id_classe
AND tb_classe.nome_classe = "samurai";

