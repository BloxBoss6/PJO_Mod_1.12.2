package com.bloxboss6.pjomod.init;

import java.util.ArrayList;
import java.util.List;

import com.bloxboss6.pjomod.blocks.MABlock;
import com.bloxboss6.pjomod.blocks.OreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block cbOre = new OreBlock("cbore", Material.ROCK);
	public static final Block maBlock = new MABlock("mablock", Material.IRON);
	public static final Block siOre = new OreBlock("siore", Material.ROCK);
	public static final Block siOreNether = new OreBlock("siorenether", Material.ROCK);

}
