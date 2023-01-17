package com.example.dcabackend.Doa;

import com.example.dcabackend.Entity.Representative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepresentativeDoa extends JpaRepository<Representative,Long> {
}
