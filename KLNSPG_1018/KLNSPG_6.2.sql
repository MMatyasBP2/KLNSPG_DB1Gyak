CREATE TABLE KLNSPG.GYARTO(
    adoszam INT PRIMARY KEY, 
    nev VARCHAR(30) NOT NULL, 
    telephely VARCHAR(30), 
    irsz VARCHAR(4), 
    varos VARCHAR(40), 
    utca VARCHAR(100)
);

CREATE TABLE KLNSPG.TERMEK(
    tkod INT PRIMARY KEY, 
    nev VARCHAR(50), 
    ear NUMERIC CHECK(ear>0), 
    gyarto INT, 
    FOREIGN KEY(gyarto) REFERENCES KLNSPG.GYARTO(nev)
);

CREATE TABLE KLNSPG.Egysegek(
    aru NUMERIC, 
    FOREIGN KEY(aru) REFERENCES KLNSPG.TERMEK(tkod),
    db NUMERIC CHECK(db>0)
);

CREATE TABLE KLNSPG.Komponens(
    termek NUMERIC, 
    alkatresz NUMERIC, 
    FOREIGN KEY(termek) REFERENCES KLNSPG.TERMEK(tkod), 
    FOREIGN KEY(alkatresz) REFERENCES KLNSPG.Alkatresz(akod)
);

CREATE TABLE KLNSPG.Alkatresz(
    akod NUMERIC PRIMARY KEY, 
    nev VARCHAR(50)
);