package com.example.dcabackend.Doa;

import com.example.dcabackend.Entity.Block;
import com.example.dcabackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockDoa extends JpaRepository<Block,Long> {
}
