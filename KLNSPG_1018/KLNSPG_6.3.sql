CREATE TABLE KLNSPG.Tanfolyam(
    tkod NUMBER PRIMARY KEY, 
    ar INT, 
    tipus VARCHAR(30), 
    megnevezes VARCHAR(30)
);

CREATE TABLE KLNSPG.Résztvevő(
    tajszám NUMBER PRIMARY KEY, 
    név VARCHAR(20),
    lakcim VARCHAR(40)
);

CREATE TABLE KLNSPG.Részvétel(
    tanKod NUMBER, 
    reszKod NUMBER, 
    befizetés NUMBER(10), 
    FOREIGN KEY(tanKod) REFERENCES KLNSPG.Tanfolyam(tkod), 
    FOREIGN KEY(reszKod) REFERENCES KLNSPG.Résztvevő(tajszám)
);