package com.example.dcabackend.Doa;

import com.example.dcabackend.Entity.Prod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdDoa extends JpaRepository<Prod,Long> {
}
