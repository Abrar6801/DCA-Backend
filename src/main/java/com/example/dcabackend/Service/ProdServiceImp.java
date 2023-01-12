package com.example.dcabackend.Service;

import com.example.dcabackend.Doa.ProdDoa;
import com.example.dcabackend.Doa.UserDoa;
import com.example.dcabackend.Entity.Prod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdServiceImp implements ProdService{
    @Autowired
    private ProdDoa prodDoa;

    public ProdServiceImp(){
    }
    @Override
    public List<Prod> getProds(){
        return prodDoa.findAll();
    }

    @Override
    public Prod getProd(long prodId) {
        return prodDoa.getOne(prodId);
    }

    @Override
    public long addProd(Prod prod) {
        prodDoa.save(prod);
        long p = prod.getProdId();
        return p;

    }

    @Override
    public Prod updateProd(Prod prod) {
        prodDoa.save(prod);
        return prod;
    }

    @Override
    public void deleteProd(long prodId) {
        Prod entity = prodDoa.getOne(prodId);
        prodDoa.delete(entity);
    }
}
