package com.brujp.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository repository;

    @PostMapping("/")
    public UserModel create(@RequestBody UserModel userModel) {
        var userCreated = this.repository.save(userModel);

        return userCreated;
    }

    public 
}
