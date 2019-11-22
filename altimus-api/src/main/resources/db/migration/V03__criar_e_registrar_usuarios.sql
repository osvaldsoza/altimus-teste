
  CREATE TABLE usuarios
  (
    codigo serial primary key,
    login varchar(200) not null,
    senha varchar(200) not null
 );

  INSERT INTO usuarios (login,senha) VALUES ('altimus','altimus');


