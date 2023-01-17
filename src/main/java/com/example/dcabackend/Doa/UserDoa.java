package com.example.dcabackend.Doa;

import com.example.dcabackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDoa extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.blocked= :blocked")
    List<User> findAllByBlocked(@Param("blocked") boolean blocked);

    @Query("SELECT u FROM User u WHERE u.id= :id AND u.blocked= :blocked")
    Optional<User> findByIdAndBlocked(@Param("id") long id, @Param("blocked") boolean blocked);


    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.blocked=:blocked WHERE u.id=:id")
    public void blockOrUnblockUser(@Param("blocked") boolean blocked, @Param("id") long id);
}