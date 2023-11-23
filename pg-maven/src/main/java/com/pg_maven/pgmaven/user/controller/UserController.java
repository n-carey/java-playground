package com.pg_maven.pgmaven.user.controller;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pg_maven.pgmaven.user.model.User;

@RestController
@RequestMapping(path = "${v1API}/users", produces = { MediaType.APPLICATION_JSON_VALUE })
public class UserController {

    UserController() {}

    @GetMapping("/{userID}")
    public User GetUser(@PathVariable UUID userID) {

        return new User();
    }
}
