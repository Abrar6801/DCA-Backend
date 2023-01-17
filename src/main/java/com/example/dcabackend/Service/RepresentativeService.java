package com.example.dcabackend.Service;

import com.example.dcabackend.Entity.Representative;

import java.util.List;

public interface RepresentativeService {
    public List<Representative> getRepresentatives();
    public Representative getRepresentative(long representativeId);
    public long addRepresentative(Representative representative);
    public Representative updateRepresentative(Representative representative);
    public void deleteRepresentative(long representativeId);
}
