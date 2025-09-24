-- CRIAÇÃO DO BANCO
-- ==============================
DROP DATABASE IF EXISTS projecta;
CREATE DATABASE projecta;
USE projecta;

-- ==============================
-- TABELA DE USUÁRIOS
-- ==============================
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    papel ENUM('COLABORADOR', 'GERENTE', 'COORDENADOR', 'DIRETOR') NOT NULL
);

-- ==============================
-- TABELA DE PROJETOS
-- ==============================
CREATE TABLE projetos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descricao TEXT,
    status ENUM('PENDENTE', 'EM_ANDAMENTO', 'CONCLUIDO') DEFAULT 'PENDENTE'
);

-- ==============================
-- RELACIONAMENTO PROJETOS ↔ USUÁRIOS
-- (N:N)
-- ==============================
CREATE TABLE projeto_usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    projeto_id INT NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (projeto_id) REFERENCES projetos(id) ON DELETE CASCADE,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE
);

-- ==============================
-- TABELA DE TAREFAS
-- ==============================
CREATE TABLE tarefas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    descricao TEXT,
    status ENUM('PENDENTE', 'EM_ANDAMENTO', 'CONCLUIDO') DEFAULT 'PENDENTE',
    projeto_id INT NOT NULL,
    responsavel_id INT,
    FOREIGN KEY (projeto_id) REFERENCES projetos(id) ON DELETE CASCADE,
    FOREIGN KEY (responsavel_id) REFERENCES usuarios(id) ON DELETE SET NULL
);

-- ==============================
-- INSERINDO USUÁRIOS
-- ==============================
INSERT INTO usuarios (nome, email, papel) VALUES
('Ana', 'ana@empresa.com', 'COLABORADOR'),
('Carlos', 'carlos@empresa.com', 'GERENTE'),
('Mariana', 'mariana@empresa.com', 'COORDENADOR'),
('João', 'joao@empresa.com', 'DIRETOR');

-- ==============================
-- INSERINDO PROJETOS
-- ==============================
INSERT INTO projetos (titulo, descricao, status) VALUES
('Sistema Interno', 'Desenvolver sistema de gestão interna', 'PENDENTE'),
('App Mobile', 'Aplicativo para clientes', 'EM_ANDAMENTO');

-- ==============================
-- RELACIONANDO USUÁRIOS AOS PROJETOS
-- ==============================
INSERT INTO projeto_usuarios (projeto_id, usuario_id) VALUES
(1, 1), -- Ana no Sistema Interno
(1, 2), -- Carlos no Sistema Interno
(2, 3), -- Mariana no App Mobile
(2, 4); -- João no App Mobile

-- ==============================
-- INSERINDO TAREFAS
-- ==============================
INSERT INTO tarefas (titulo, descricao, status, projeto_id, responsavel_id) VALUES
('Criar Tela Login', 'Implementar tela de login do sistema', 'EM_ANDAMENTO', 1, 1),
('Modelar Banco', 'Definir estrutura do banco de dados', 'PENDENTE', 1, 2),
('Prototipar Interface', 'Fazer protótipo do app mobile', 'PENDENTE', 2, 3),
('Definir Estratégia', 'Planejar estratégia de lançamento do app', 'PENDENTE', 2, 4);
