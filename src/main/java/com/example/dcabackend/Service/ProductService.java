package com.example.dcabackend.Service;

import com.example.dcabackend.Entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();
    public Product getProduct(long productId);
    public long addProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(long productId);
}
