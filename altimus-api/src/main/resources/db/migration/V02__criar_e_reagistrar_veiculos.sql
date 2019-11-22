
  CREATE TABLE veiculos
  (
    codigo serial primary key,
    placa varchar(200) not null,
    marca varchar(200) not null,
    modelo varchar(200) not null,
    ano_modelo varchar(200) not null,
    quilometragem decimal not null
   -- codigo_opcionais BIGINT NOT NULL,
   -- FOREIGN KEY (codigo_opcionais) REFERENCES opcionais(codigo)
 );

  INSERT INTO veiculos (placa,marca,modelo,ano_modelo,quilometragem) VALUES ('NYJ-8081','GM','Onix','2018',30.000);
  INSERT INTO veiculos (placa,marca,modelo,ano_modelo,quilometragem) VALUES ('EGF-2345','Jeep','Compass','2019',130.000);


