--
-- Estrutura da tabela "cliente"
--

DROP TABLE IF EXISTS "cliente" CASCADE;
DROP TABLE IF EXISTS "senha" CASCADE;

CREATE TABLE cliente (
  id       bigserial NOT NULL,
  nome     varchar(60),
  cpf      varchar(11),
  rg       varchar(20),
  endereco varchar(60),
  cidade   varchar(30),
  bairro   varchar(30),
  uf       varchar(2),
  cep      varchar(8),
  renda    float,
  email    varchar(60),
  senha    varchar(60),

  /* Keys */
  CONSTRAINT cliente_pkey
    PRIMARY KEY (id)
);
--
-- Inserindo dados na tabela "estado"
--

INSERT INTO "cliente" VALUES
(4, 'Isabel',    '12345678910','1648468','Avenida Um Numero Dois','Recife','Centro','PE','5000000',2000,'princesa@reino.com','belsenha'),
(5, 'Cristina',  '22222222222','2222222','Avenida Um Numero Tres','Paulista','Centro','PE','12345678',3000,'cris@reino.com','crissenha'),
(6 'Leopoldina','33333333333','3333333','Avenida Um Numero Quatr','Olinda','Centro','PE','12345678',4000,'leo@reino.com','leosenha'),
(7, 'Augusta',   '44444444444','4444444','Avenida Um Numero Cino' ,'Caruar','Centro','PE','12345678',5000,'au@reino.com','ausenha');
