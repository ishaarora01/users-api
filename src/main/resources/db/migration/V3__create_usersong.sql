CREATE TABLE user_song (
    user_id INT REFERENCES users(id),
    song_id INT REFERENCES songs(id),
    PRIMARY KEY (user_id, song_id)
);