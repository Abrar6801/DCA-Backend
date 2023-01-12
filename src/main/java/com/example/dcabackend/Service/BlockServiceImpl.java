package com.example.dcabackend.Service;

import com.example.dcabackend.Doa.BlockDoa;
import com.example.dcabackend.Entity.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlockServiceImpl implements BlockService{

    @Autowired
    private BlockDoa blockDoa;

    public BlockServiceImpl(){

    }
    @Override
    public List<Block> getBlock() {
        return blockDoa.findAll();
    }

    @Override
    public Block getBlock(long blockId) {
        return blockDoa.findById(blockId).get();
    }

    @Override
    public long addBlock(Block block) {
        blockDoa.save(block);
        long b = block.getId();
        return b;
    }

    @Override
    public Block updateBlock(Block block) {
        blockDoa.save(block);
        return block;
    }

    @Override
    public void deleteBlock(long blockId) {
        Block entity = blockDoa.getOne(blockId);
        blockDoa.delete(entity);
    }
}
