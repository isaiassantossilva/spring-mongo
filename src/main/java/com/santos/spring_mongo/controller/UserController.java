package com.santos.spring_mongo.controller;

import com.santos.spring_mongo.dto.UserDTO;
import com.santos.spring_mongo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public void create(@RequestBody UserDTO userDTO) {
        this.userService.create(userDTO);
    }
}
