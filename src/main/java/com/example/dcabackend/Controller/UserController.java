package com.example.dcabackend.Controller;


import com.example.dcabackend.Entity.User;
import com.example.dcabackend.Service.UserService;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAllByBlocked(boolean blocked){
        return this.userService.findAllByBlocked(blocked);
    }
    @GetMapping("/blockedUser")
    public List<User> findAllByBlockedIsTrue(boolean blocked){
        return this.userService.findAllByBlockedIsTrue(blocked);
    }

    @GetMapping("/users/{userId}")
    public Optional<User> findByIdAndBlocked(@PathVariable String userId,boolean blocked){
        return this.userService.findByIdAndBlocked(Long.parseLong(userId),blocked);
    }

    @PutMapping ("/users/blockkOrUnblock/{blocked}/{userId}")
    public void blockOrUnblockUser(@PathVariable boolean blocked,@PathVariable long userId){

        this.userService.blockOrUnblockUser(blocked,userId);
    }

    @PostMapping("/users/addUser")
    public String addUser(@RequestBody User user, BindingResult bindingResult, Model model){
        try {
            return this.userService.addUser(user);
        } catch(ConstraintViolationException e){
            return model.addAttribute("errorMessage",e.getMessage()).toString();

        }
    }

    @PutMapping("/users/updateUser")
    public User updateUser(@RequestBody User user){
        return this.userService.updateUser(user);
    }

    @DeleteMapping("/users/deleteUser/{userId}")
    public void deleteUser(@PathVariable String userId){
        this.userService.deleteUser(Long.parseLong(userId));
    }
}
