package com.sedoc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {
    UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getAll")
    public String getUser() {
        List<User> userList = repository.findAll();
        List<String> userNameList = userList.stream().map(User::getName).collect(Collectors.toList());
        return userNameList.toString();
    }

}
