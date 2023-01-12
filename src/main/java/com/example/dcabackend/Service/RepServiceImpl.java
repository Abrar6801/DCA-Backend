package com.example.dcabackend.Service;

import com.example.dcabackend.Doa.RepDoa;
import com.example.dcabackend.Entity.Reps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RepServiceImpl implements RepService{

    @Autowired
    private RepDoa repDoa;
    public RepServiceImpl(){

    }
    @Override
    public List<Reps> getReps() {
        return repDoa.findAll();
    }
    public Reps getRep(long RepId){
        return repDoa.getOne(RepId);
    }

    @Override
    public long addRep(Reps rep) {
        repDoa.save(rep);
        long r = rep.getRepId();
        return r;
    }

    @Override
    public Reps updateRep(Reps rep) {
        repDoa.save(rep);
        return rep;
    }

    @Override
    public void deleteRep(long RepId) {
        Reps entity = repDoa.getOne(RepId);
        repDoa.delete(entity);
    }
}
