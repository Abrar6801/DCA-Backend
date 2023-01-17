package com.example.dcabackend.Controller;

import com.example.dcabackend.Entity.Representative;
import com.example.dcabackend.Service.RepresentativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RepresentativeController {

    @Autowired
    private RepresentativeService representativeService;

    @GetMapping("/representatives")
    public List<Representative> getRepresentatives(){
        return this.representativeService.getRepresentatives();
    }

    @GetMapping("/representatives/{representativeId}")
    public Representative getRepresentative(@PathVariable String representativeId){
        return this.representativeService.getRepresentative(Long.parseLong(representativeId));
    }

    @PostMapping("/representatives/addRepresentative")
    public long addRepresentative(@RequestBody Representative representative){
        return this.representativeService.addRepresentative(representative);
    }

    @PutMapping("/representatives/updateRepresentative")
    public Representative updateRepresentative(@RequestBody Representative representative){
        return this.representativeService.updateRepresentative(representative);
    }
    @DeleteMapping("/representatives/deleteRepresentative/{representativeId}")
    public void deleteRepresentative(@PathVariable String representativeId){
        this.representativeService.deleteRepresentative(Long.parseLong(representativeId));
    }

}
