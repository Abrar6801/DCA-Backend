package com.example.dcabackend.Doa;

import com.example.dcabackend.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDoa extends JpaRepository<Product,Long> {
}
