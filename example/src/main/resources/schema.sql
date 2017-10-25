DROP TABLE IF EXISTS Document;
DROP TABLE IF EXISTS Document_Item;
CREATE TABLE Document (id int identity primary key, code varchar(15), date Date, name varchar(30));
CREATE TABLE Document_Item (id int primary key, docId int, name varchar(30), price decimal(8,2));
ALTER TABLE Document_Item ADD FOREIGN KEY (docId) REFERENCES Document(id);