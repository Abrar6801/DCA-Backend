package com.example.dcabackend.Service;

import com.example.dcabackend.Doa.ProductDoa;
import com.example.dcabackend.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDoa productDoa;

    public ProductServiceImpl(){
    }
    @Override
    public List<Product> getProducts(){
        return productDoa.findAll();
    }

    @Override
    public Product getProduct(long productId) {
        return productDoa.findById(productId).get();
    }

    @Override
    public long addProduct(Product product) {
        productDoa.save(product);
        long p = product.getProductId();
        return p;

    }

    @Override
    public Product updateProduct(Product product) {
        productDoa.save(product);
        return product;
    }

    @Override
    public void deleteProduct(long productId) {
        Product entity = productDoa.findById(productId).get();
        productDoa.delete(entity);
    }
}
