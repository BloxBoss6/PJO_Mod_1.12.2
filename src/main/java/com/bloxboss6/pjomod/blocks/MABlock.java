package com.bloxboss6.pjomod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MABlock extends BlockBase {

	public MABlock(String name, Material material) {
		super(name, material);

		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);

	}

}
