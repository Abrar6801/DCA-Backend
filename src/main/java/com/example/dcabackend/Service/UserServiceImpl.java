package com.example.dcabackend.Service;

import com.example.dcabackend.Doa.UserDoa;
import com.example.dcabackend.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDoa userDoa;
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
    @Override
    public String addUser(User user) {
        userDoa.save(user);
        long u = user.getId();
        return "User added successfully";
    }
    @Override
    public User updateUser(User user) {
        userDoa.save(user);
        return user;
    }
    @Override
    public void deleteUser(long userId) {
        User entity = userDoa.findById(userId).get();
        userDoa.delete(entity);
    }
    @Override
    public List<User> findAllByBlocked(boolean blocked) {
        return userDoa.findAllByBlocked(blocked);
    }
    @Override
    public List<User> findAllByBlockedIsTrue(boolean blocked){
        return userDoa.findAllByBlocked(!blocked);
    }
    @Override
    public Optional<User> findByIdAndBlocked(long id, boolean blocked) {
        return userDoa.findByIdAndBlocked(id,blocked);
    }
    @Override
    public void blockOrUnblockUser(boolean blocked, long id) {
        userDoa.blockOrUnblockUser(!blocked,id);
    }
}
