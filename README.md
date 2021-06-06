

//CREATE A DEMO TABLE
DROP TABLE IF EXISTS USER;

CREATE TABLE USER (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);

INSERT INTO USER (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Accountant'),
  ('Bill', 'Gates', 'Banker'),
  ('Folrunsho', 'Alakija', 'Teacher');
