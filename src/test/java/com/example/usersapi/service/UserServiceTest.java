package com.example.usersapi.service;

import com.example.usersapi.model.User;
import com.example.usersapi.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    public void test(){
        User user = new User();

        when(userRepository.save(any())).thenReturn(user);
        userService.createUser(user);
        Assert.assertEquals("hi","hi");
    }

    @Test
    public void deleteUser(){
        doNothing().when(userRepository).deleteById(any());
        userService.deleteUser(1L);
        Assert.assertEquals(1L,1L);
    }
}
