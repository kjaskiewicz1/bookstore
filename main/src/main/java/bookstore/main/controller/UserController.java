package bookstore.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bookstore.main.entity.User;
import bookstore.main.service.UserService;


@RestController

public class UserController {

    @Autowired

    private UserService userService;

    @PostMapping("/addUsers")
    public User postDetails(@RequestBody User user){

        return userService.saveDetails(user);
    }

    @GetMapping("/getUserDetails")
    public User getUserDetailsByUsername(@RequestParam String username){

        return userService.getUserDetails(username);
    }

    @PatchMapping("/updateUser")
    public User updateUser(@RequestParam String username, @RequestBody User user){

        return userService.updateUser(username, user);
    }



}
