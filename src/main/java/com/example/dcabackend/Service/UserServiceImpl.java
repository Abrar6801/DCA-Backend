package com.example.dcabackend.Service;

import com.example.dcabackend.Doa.UserDoa;
import com.example.dcabackend.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDoa userDoa;
//    List<User> list;
    public UserServiceImpl(){

    }
    @Override
    public List<User> getUsers() {
        return userDoa.findAll();
    }

    @Override
    public User getUser(long userId){
        return userDoa.findById(userId).get();
    }
//    public User getUser(long userId) {
//
//        return userDoa.getOne(userId);
//    }

    @Override
    public long addUser(User user) {
        userDoa.save(user);
        long u = user.getId();
        return u;
    }

    @Override
    public User updateUser(User user) {
        userDoa.save(user);
        return user;
    }

    @Override
    public void deleteUser(long userId) {
        User entity = userDoa.getOne(userId);
        userDoa.delete(entity);
    }
}
