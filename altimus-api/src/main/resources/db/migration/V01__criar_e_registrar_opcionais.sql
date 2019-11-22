
  CREATE TABLE opcionais
  (
    codigo serial primary key,
    descricao varchar(200) not null

 );

  INSERT INTO opcionais (descricao) VALUES ('Airbag');
  INSERT INTO opcionais (descricao) VALUES ('4x4');
  INSERT INTO opcionais (descricao) VALUES ('Ar Condicionado');
  INSERT INTO opcionais (descricao) VALUES ('Direção Elétrica');
  INSERT INTO opcionais (descricao) VALUES ('Freio ABS');


