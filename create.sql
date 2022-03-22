DROP TABLE IF EXISTS hotelBanco;
CREATE TABLE IF NOT EXISTS hotelBanco (
    id int auto_increment primary key,
    nomeFilial VARCHAR(64),
    rua VARCHAR(50),
    numero int,
    cidade VARCHAR(32),
    estado VARCHAR(32)
    );


