package com.example.dcabackend.Service;

import com.example.dcabackend.Entity.Prod;

import java.util.List;

public interface ProdService {
    public List<Prod> getProds();
    public Prod getProd(long prodId);
    public long addProd(Prod prod);
    public Prod updateProd(Prod prod);
    public void deleteProd(long prodId);
}
