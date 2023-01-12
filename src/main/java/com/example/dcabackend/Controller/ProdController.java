package com.example.dcabackend.Controller;

import com.example.dcabackend.Entity.Prod;
import com.example.dcabackend.Service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProdController {
    @Autowired
    private ProdService prodService;

    @GetMapping("/products")
    public List<Prod> getProds(){
        return this.prodService.getProds();
    }

    @GetMapping("/products/{prodId}")
    public Prod getProd(@PathVariable String prodId){
        return this.prodService.getProd(Long.parseLong(prodId));
    }

    @PostMapping("/products/addProd")
    public void addProd(@RequestBody Prod prod){
         this.prodService.addProd(prod);
    }

    @PutMapping("/products/updateProd")
    public Prod updateProd(@RequestBody Prod prod){
        return this.prodService.updateProd(prod);
    }

    @DeleteMapping("/products/deleteProd/{prodId}")
    public void deleteProd(@PathVariable String prodId){
        this.prodService.deleteProd(Long.parseLong(prodId));
    }
}
