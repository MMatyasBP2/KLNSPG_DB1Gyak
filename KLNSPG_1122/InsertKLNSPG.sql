INSERT INTO Oktató VALUES('OD39XA', 'Horváth Miklós', 'AIFTsz');
INSERT INTO Oktató VALUES('M2P68C', 'Bakos Milán', 'AIFTsz');
INSERT INTO Oktató VALUES('SER32V', 'Özvegy Gabriella', 'MIRTsz');

INSERT INTO Tárgy VALUES(1, 5, 'Java programozás', 'M2P68C');
INSERT INTO Tárgy VALUES(2, 3, 'Programozás alapjai', 'M2P68C');
INSERT INTO Tárgy VALUES(3, 5, 'Szoftvertechnológia', 'SER32V');
INSERT INTO Tárgy VALUES(4, 2, 'Fizika mérés gyakorlat', 'OD39XA');
INSERT INTO Tárgy VALUES(5, 5, 'Adatbázis rendszerek II.', 'SER32V');

INSERT INTO Hallgató VALUES('WI2GDP', 'Tóth József', 'BProf', '07/12/2000', 3597, 'Hejőkeresztúr', 'Petőfi Sándor utca', 69);
INSERT INTO Hallgató VALUES('ME3X80', 'Kolompai Elemér', 'BI', '06/20/1998', 3571, 'Alsózsolca', 'Görgey Artúr út', 32);
INSERT INTO Hallgató VALUES('LBB4C9', 'Geréb Zoltán', 'BI', '12/03/2001', 3412, 'Bogács', 'Kossuth utca', 57);
INSERT INTO Hallgató VALUES('KVG53S', 'Horváth Mónika', 'BProf', '07/12/2000', 3521, 'Miskolc Szirma', 'Akácos utca', 20);
INSERT INTO Hallgató VALUES('IF4RL6', 'Faragó Attila', 'BI', '07/12/2000', 3561, 'Felsőzsolca', 'Radnóti Miklós utca', 7);
INSERT INTO Hallgató VALUES('PC82S1', 'Simonyák Gergely Tibor', 'BI', '07/12/2000', 3527, 'Miskolc', 'Kruspér utca', 23);

INSERT INTO hallgat VALUES(3, 5, 3, 'WI2GDP');
INSERT INTO hallgat VALUES(1, 4, 2, 'IF4RL6');
INSERT INTO hallgat VALUES(2, 5, 4, 'KVG53S');
INSERT INTO hallgat VALUES(3, 2, 1, 'LBB4C9');
INSERT INTO hallgat VALUES(4, 3, 5, 'ME3X80');