package com.example.dcabackend.Controller;


import com.example.dcabackend.Entity.User;
import com.example.dcabackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable String userId){
        return this.userService.getUser(Long.parseLong(userId));
    }
//    public User getUser(@PathVariable String userId){
//        return this.userService.getUser(Long.parseLong(userId));
//    }

    @PostMapping("/users/addUser")
    public long addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @PutMapping("/users/updateUser")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/users/deleteUsers/{userId}")
    public void deleteUser(@PathVariable String userId){
        this.userService.deleteUser(Long.parseLong(userId));
    }
}
