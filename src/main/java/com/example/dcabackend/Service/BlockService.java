package com.example.dcabackend.Service;

import com.example.dcabackend.Entity.Block;

import java.util.List;

public interface BlockService {
    public List<Block> getBlock();
    public Block getBlock(long blockId);
    public long addBlock(Block block);
    public Block updateBlock(Block block);
    public void deleteBlock(long blockId);
}
