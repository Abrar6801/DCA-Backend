package com.example.dcabackend.Controller;

import com.example.dcabackend.Entity.Reps;
import com.example.dcabackend.Service.RepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RepController {

    @Autowired
    private RepService repService;
    @GetMapping("/Random")
    public String random(){
        return "This is from random";
    }

    @GetMapping("/Reps")
    public List<Reps> getReps(){
        return this.repService.getReps();
    }

    @GetMapping("/reps/{RepId}")
    public Reps getRep(@PathVariable String RepId){
        return this.repService.getRep(Long.parseLong(RepId));
    }

    @PostMapping("/reps/addRep")
    public long addRep(@RequestBody Reps rep){
        return this.repService.addRep(rep);
    }

    @PutMapping("/reps/updateRep")
    public Reps updateRep(@RequestBody Reps rep){
        return this.repService.updateRep(rep);
    }
    @DeleteMapping("/reps/deleteRep/{RepId}")
    public void deleteRep(@PathVariable String RepId){
        this.repService.deleteRep(Long.parseLong(RepId));
    }

}
