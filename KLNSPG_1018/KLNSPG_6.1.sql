DROP DATABASE IF EXISTS KLNSPG;
CREATE DATABASE KLNSPG;

DROP TABLE IF EXISTS KLNSPG.Gyarto;
CREATE TABLE KLNSPG.Gyarto(
    adoszam INT PRIMARY KEY,
    nev CHAR(30) NOT NULL,
    telephely VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS KLNSPG.Termek;
CREATE TABLE KLNSPG.Termek(
    tkod INT PRIMARY KEY,
    nev CHAR(50) NOT NULL,
    ear NUMERIC CHECK(ear > 0) NOT NULL,
    gyarto CHAR(30) NOT NULL,
    FOREIGN KEY(gyarto) REFERENCES KLNSPG.Gyarto(nev)
);