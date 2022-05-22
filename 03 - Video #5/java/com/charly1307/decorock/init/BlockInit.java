package com.charly1307.decorock.init;

import java.util.ArrayList;
import java.util.List;

import com.charly1307.decorock.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block PARED = new BlockBase("pared", Material.ROCK);
}
