CREATE TABLE IF NOT EXISTS users
    (id SERIAL PRIMARY KEY,
     name VARCHAR,
      username VARCHAR UNIQUE,
      password VARCHAR,
      age INT);