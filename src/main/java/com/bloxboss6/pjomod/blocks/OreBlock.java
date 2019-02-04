package com.bloxboss6.pjomod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreBlock extends BlockBase {

	public OreBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(3.0f);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);

	}

}
