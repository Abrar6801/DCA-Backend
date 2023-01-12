package com.example.dcabackend.Controller;

import com.example.dcabackend.Entity.Block;
import com.example.dcabackend.Service.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class BlockController {

    @Autowired
    private BlockService blockService;

    @GetMapping("/blockedUsers")
    public List<Block> getBlock(){return this.blockService.getBlock();}

    @GetMapping("/blockedUser/{blockId}")
    public Block getBlock(@PathVariable String blockId){
        return this.blockService.getBlock(Long.parseLong(blockId));
    }

    @PostMapping("/blockedUsers/addBlockedUser")
    public long addBlock(@RequestBody Block block){ return this.blockService.addBlock(block);}

    @PutMapping("/blokcedUser/updateBlockUser")
    public Block updateBlock(@RequestBody Block block){return this.blockService.updateBlock(block);}

    @DeleteMapping("/blockedUser/deleteBlockedUser/{blockId}")
    public void deleteBlock(@PathVariable String blockId){this.blockService.deleteBlock(Long.parseLong(blockId));}
}
