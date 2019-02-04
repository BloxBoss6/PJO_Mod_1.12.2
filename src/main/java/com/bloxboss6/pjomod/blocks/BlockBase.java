package com.bloxboss6.pjomod.blocks;

import com.bloxboss6.pjomod.Main;
import com.bloxboss6.pjomod.init.ModBlocks;
import com.bloxboss6.pjomod.init.ModItems;
import com.bloxboss6.pjomod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		//setSoundType(SoundType.);
		//setHardness(0.0f);
		//setResistance(0.0F);
		//setHarvestLevel("pickaxe", 0);
		//setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
		//http://minecraftmodcustomstuff.wikia.com/wiki/Hardness
		//https://minecraft.gamepedia.com/Explosion
		//http://minecraftmodcustomstuff.wikia.com/wiki/HarvestLevel
		//https://minecraft.gamepedia.com/Light

		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");

	}

}
