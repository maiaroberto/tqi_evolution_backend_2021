--
-- Estrutura da tabela "emprestimo"
--
DROP TABLE IF EXISTS "emprestimo" CASCADE;

CREATE TABLE emprestimo (
  id         bigserial NOT NULL,
  id_cliente bigserial NOT NULL,
  valor      float,
  data_ini   date,
  parcelas   int,
  /* Keys */
  CONSTRAINT emprestimo_pkey
    PRIMARY KEY (id)
);
--
-- Inserindo dados na tabela "emprestimo"
--

INSERT INTO "emprestimo" (id, id_cliente, valor, data_ini, parcelas) VALUES
(1, 1, 5000, '05/01/2022', 5);

