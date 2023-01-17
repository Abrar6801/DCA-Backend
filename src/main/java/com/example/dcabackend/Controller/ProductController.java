package com.example.dcabackend.Controller;

import com.example.dcabackend.Entity.Product;
import com.example.dcabackend.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable String productId){
        return this.productService.getProduct(Long.parseLong(productId));
    }

    @PostMapping("/products/addProduct")
    public void addProduct(@RequestBody Product product){
         this.productService.addProduct(product);
    }

    @PutMapping("/products/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }

    @DeleteMapping("/products/deleteProduct/{productId}")
    public void deleteProduct(@PathVariable String productId){
        this.productService.deleteProduct(Long.parseLong(productId));
    }
}
