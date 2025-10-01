CREATE DATABASE IF NOT EXISTS projeto_final;

USE projeto_final;

SELECT * FROM desaparecido;

ALTER TABLE desaparecido MODIFY foto BLOB;

DROP TABLE desaparecido;