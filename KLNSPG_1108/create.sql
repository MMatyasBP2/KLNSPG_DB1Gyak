DROP DATABASE IF EXISTS seminar;
CREATE DATABASE seminar;

DROP TABLE IF EXISTS seminar.tulajdonos;
CREATE TABLE seminar.tulajdonos(
    tkod INT(3) PRIMARY KEY,
    nev VARCHAR(25) NOT NULL,
    varos VARCHAR(20)
);

DROP TABLE IF EXISTS seminar.auto;
CREATE TABLE seminar.auto(
    rendszam CHAR(7) PRIMARY KEY,
    tipus VARCHAR(25) NOT NULL,
    szin VARCHAR(15),
    kor INT(2),
    ar INT(8),
    tulaj INT(3),
    FOREIGN KEY(tulaj) REFERENCES seminar.tulajdonos(tkod) ON DELETE CASCADE
);