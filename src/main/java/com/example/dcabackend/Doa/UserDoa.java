package com.example.dcabackend.Doa;

import com.example.dcabackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDoa extends JpaRepository<User,Long> {

}
