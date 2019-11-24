drop table if exists songs;

CREATE TABLE songs (
    id SERIAL PRIMARY KEY,
    title VARCHAR(200),
    duration INT,
    content VARCHAR(2000)
);