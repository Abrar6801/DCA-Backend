package com.example.dcabackend.Service;

import com.example.dcabackend.Entity.Reps;

import java.util.List;

public interface RepService {
    public List<Reps> getReps();
    public Reps getRep(long RepId);
    public long addRep(Reps rep);
    public Reps updateRep(Reps rep);
    public void deleteRep(long RepId);
}
