package com.example.dcabackend.Service;

import com.example.dcabackend.Entity.User;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> getUsers();
    public User getUser(long userId);
    public String addUser(User user);
    public User updateUser(User user);
    public void deleteUser(long userId);

    public List<User> findAllByBlocked(boolean blocked);
    public List<User> findAllByBlockedIsTrue(boolean blocked);
    public Optional<User> findByIdAndBlocked(long id,boolean blocked);
    public void blockOrUnblockUser(boolean blocked,long id);

}
