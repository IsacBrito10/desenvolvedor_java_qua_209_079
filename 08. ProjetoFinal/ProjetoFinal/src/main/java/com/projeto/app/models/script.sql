CREATE DATABASE IF NOT EXISTS projeto_final;

USE projeto_final;

SELECT * FROM desaparecido;

SET GLOBAL max_allowed_packet = 1048576000;   

ALTER TABLE desaparecido MODIFY foto LONGBLOB;

DROP TABLE desaparecido;