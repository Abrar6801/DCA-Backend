package com.example.dcabackend.Service;

import com.example.dcabackend.Entity.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();
    public User getUser(long userId);
    public long addUser(User user);
    public User updateUser(User user);
    public void deleteUser(long userId);
}
