CREATE TABLE IF NOT EXISTS person(
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    age INT,
    is_married BOOLEAN
);

INSERT INTO person(firstname, lastname, age, is_married)
    VALUES ("farzad", "afi", 20, true)