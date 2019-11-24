package com.example.usersapi.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveUserSong(long userId, long songId) {
        return jdbcTemplate.update(
                "insert into user_song (user_id, song_id) " +
                        "values(?,?)", userId, songId);
    }

    public List<Long> getSong(long userId){
        List<Long> songs = new ArrayList<>();
        jdbcTemplate.query("select song_id from user_song where " +
                "user_id = ?", new Object[]{userId},
                (rs, num) -> songs.add(rs.getLong("song_id")));
        return songs;

    }

}
