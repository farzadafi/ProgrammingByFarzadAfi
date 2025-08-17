CREATE TABLE IF NOT EXISTS book(
    id SERIAL PRIMARY KEY,
    title VARCHAR UNIQUE,
    author_name VARCHAR,
    publish_year INT,
    quantity INT
);

CREATE TABLE IF NOT EXISTS users(
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    national_code VARCHAR(10)
);