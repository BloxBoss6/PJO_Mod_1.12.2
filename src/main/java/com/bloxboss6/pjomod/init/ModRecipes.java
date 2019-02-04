package com.bloxboss6.pjomod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.cbOre, new ItemStack(ModItems.cbIngot, 1), 1.0F);
	}

}
