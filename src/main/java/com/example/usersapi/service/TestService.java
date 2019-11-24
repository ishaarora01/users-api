package com.example.usersapi.service;

import com.example.usersapi.model.Song;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="songs")
public interface TestService {
    @GetMapping("/view/{id}")
    public Song searchById(@PathVariable long id);
}
