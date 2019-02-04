package com.bloxboss6.pjomod;

import com.bloxboss6.pjomod.init.ModRecipes;
import com.bloxboss6.pjomod.proxy.CommonProxy;
import com.bloxboss6.pjomod.util.Reference;
import com.bloxboss6.pjomod.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);

	}

	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();

	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {

	}

}
