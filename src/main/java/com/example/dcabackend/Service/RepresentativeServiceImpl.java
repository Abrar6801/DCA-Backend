package com.example.dcabackend.Service;

import com.example.dcabackend.Doa.RepresentativeDoa;
import com.example.dcabackend.Entity.Representative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepresentativeServiceImpl implements RepresentativeService {

    @Autowired
    private RepresentativeDoa representativeDoa;
    public RepresentativeServiceImpl(){

    }
    @Override
    public List<Representative> getRepresentatives() {
        return representativeDoa.findAll();
    }
    public Representative getRepresentative(long representativeId){
        return representativeDoa.findById(representativeId).get();
    }

    @Override
    public long addRepresentative(Representative representative) {
        representativeDoa.save(representative);
        long r = representative.getRepresentativeId();
        return r;
    }

    @Override
    public Representative updateRepresentative(Representative representative) {
        representativeDoa.save(representative);
        return representative;
    }

    @Override
    public void deleteRepresentative(long representativeId) {
        Representative entity = representativeDoa.findById(representativeId).get();
        representativeDoa.delete(entity);
    }
}
