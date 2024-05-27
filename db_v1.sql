CREATE TABLE produtos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    descricao TEXT
);
CREATE INDEX idx_produto_nome ON produtos(nome);

INSERT INTO produtos (nome, preco, quantidade, descricao) VALUES
('Produto A', 19.99, 100, 'Descrição do Produto A'),
('Produto B', 29.99, 50, 'Descrição do Produto B'),
('Produto C', 9.99, 200, 'Descrição do Produto C');