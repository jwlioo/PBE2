DROP DATABASE IF EXISTS db_livrariasenai;

CREATE DATABASE IF NOT EXISTS db_livrariasenai;

USE db_livrariasenai;

CREATE TABLE IF NOT EXISTS tb_cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome_cliente VARCHAR(100) NOT NULL,
    email_cliente VARCHAR(100) UNIQUE NOT NULL,
    telefone_cliente VARCHAR(20),
    cpf VARCHAR(11),
    data_nascimento DATE,
    rua VARCHAR(20),
	numero_casa INT,
	bairro VARCHAR(20),
	cidade VARCHAR(20),
    estado CHAR(2) 
);

INSERT INTO tb_cliente (nome_cliente, email_cliente, telefone_cliente, cpf, data_nascimento, rua, numero_casa, bairro, cidade, estado) VALUES
('Roberto Souza', 'roberto.souza@gmail.com', '91987654329', '90123456789', '1970-10-02', 'Rua das Laranjeiras', 55, 'Centro', 'Salvador', 'BA'),
('Patrícia Duarte', 'patricia.duarte@gmail.com', '11987654330', '01234567890', '1983-07-21', 'Av. das Américas', 202, 'Centro', 'Florianópolis', 'SC'),
('Marcos Almeida', 'marcos.almeida@yahoo.com', '21987654331', '09876543210', '1991-02-28', 'Rua das Mangueiras', 35, 'Setor Oeste', 'Goiânia', 'GO'),
('Juliana Carvalho', 'juliana.carvalho@hotmail.com', '31987654332', '11223344556', '1989-09-12', 'Rua dos Jacarandás', 67, 'Centro', 'São Luís', 'MA'),
('Felipe Rocha', 'felipe.rocha@gmail.com', '41987654333', '22334455667', '1997-11-05', 'Av. dos Coqueiros', 90, 'Centro', 'Manaus', 'AM'),
('Camila Ribeiro', 'camila.ribeiro@yahoo.com', '51987654334', '33445566778', '1986-03-19', 'Rua das Palmeiras', 10, 'Centro', 'Recife', 'PE'),
('Eduardo Nunes', 'eduardo.nunes@outlook.com', '61987654335', '44556677889', '1993-01-08', 'Rua dos Pinheiros', 105, 'Centro', 'Fortaleza', 'CE');


CREATE TABLE IF NOT EXISTS tb_produto (
    id_produto INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(100) NOT NULL, 
    descricao TEXT, 
    preco_compra DECIMAL(10, 2) NOT NULL,
    preco_venda DECIMAL(10, 2) NOT NULL,
    estoque INT NOT NULL,
    categoria VARCHAR(50)
);

INSERT INTO tb_produto (nome_produto, descricao, preco_compra, preco_venda, estoque, categoria) VALUES
('Magico de OZ', 'Ficçao ', 23.50, 120, ''),
);

CREATE TABLE IF NOT EXISTS tb_venda (
    id_venda INT AUTO_INCREMENT PRIMARY KEY,
    CLIENTE_id_cliente INT NOT NULL,
    data_venda DATETIME,
    desconto_venda INT UNSIGNED,
    FOREIGN KEY (CLIENTE_id_cliente) REFERENCES tb_cliente(id_cliente)
);

select * from tb_cliente;



CREATE TABLE IF NOT EXISTS tb_venda_produto (
    VENDA_id_venda INT NOT NULL,
    PRODUTO_produto_id INT NOT NULL,
    quantidade INT NOT NULL,
    preco_unitario DECIMAL(10, 2) NOT NULL,
    desconto_item INT UNSIGNED,
    PRIMARY KEY (VENDA_id_venda, PRODUTO_produto_id),
    FOREIGN KEY (VENDA_id_venda) REFERENCES tb_venda(id_venda),
    FOREIGN KEY (PRODUTO_produto_id) REFERENCES tb_produto(id_produto)
);