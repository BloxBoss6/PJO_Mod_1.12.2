package com.bloxboss6.pjomod.init;

import java.util.ArrayList;
import java.util.List;

import com.bloxboss6.pjomod.items.ItemBase;
import com.bloxboss6.pjomod.items.armor.ArmorBase;
import com.bloxboss6.pjomod.items.armor.TestArmor;
import com.bloxboss6.pjomod.items.tools.ToolAxe;
import com.bloxboss6.pjomod.items.tools.ToolHoe;
import com.bloxboss6.pjomod.items.tools.ToolPickaxe;
import com.bloxboss6.pjomod.items.tools.ToolSpade;
import com.bloxboss6.pjomod.items.tools.ToolSword;
import com.bloxboss6.pjomod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();

	// Materials
	public static final ToolMaterial cbMaterial = EnumHelper.addToolMaterial("cbmaterial", 4, 1800, 10.0F, 3.5F, 10);
	public static final ToolMaterial igMaterial = EnumHelper.addToolMaterial("igmaterial", 4, 1800, 10.0F, 3.5F, 10);
	public static final ToolMaterial maMaterial = EnumHelper.addToolMaterial("mamaterial", 4, 1800, 10.0F, 3.5F, 10);
	public static final ToolMaterial siMaterial = EnumHelper.addToolMaterial("simaterial", 4, 1800, 10.0F, 3.5F, 10);

	public static final ArmorMaterial cbArmorMaterial = EnumHelper.addArmorMaterial("cbarmormaterial",
			Reference.MOD_ID + ":cbarmor", 42, new int[] { 4, 7, 9, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
			2.0F);
	public static final ArmorMaterial testArmorMaterial = EnumHelper.addArmorMaterial("testarmormaterial",
			Reference.MOD_ID + ":testarmor", 42, new int[] { 4, 7, 9, 4 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
			2.0F);

	// Items
	public static final Item cbIngot = new ItemBase("cbingot");
	public static final Item cbRod = new ItemBase("cbrod");
	public static final Item igIngot = new ItemBase("igingot");
	public static final Item igRod = new ItemBase("igrod");
	public static final Item maIngot = new ItemBase("maingot");
	public static final Item siIngot = new ItemBase("siingot");

	// Tools
	public static final ItemSword cbSword = new ToolSword("cbsword", cbMaterial);
	public static final ItemSword cbKnife = new ToolSword("cbknife", cbMaterial);
	public static final ItemPickaxe cbPickaxe = new ToolPickaxe("cbpickaxe", cbMaterial);
	public static final ItemAxe cbAxe = new ToolAxe("cbaxe", cbMaterial);
	public static final ItemSpade cbShovel = new ToolSpade("cbshovel", cbMaterial);
	public static final ItemHoe cbHoe = new ToolHoe("cbhoe", cbMaterial);

	public static final ItemSword igSword = new ToolSword("igsword", igMaterial);
	public static final ItemSword igKnife = new ToolSword("igknife", igMaterial);
	public static final ItemPickaxe igPickaxe = new ToolPickaxe("igpickaxe", igMaterial);
	public static final ItemAxe igAxe = new ToolAxe("igaxe", igMaterial);
	public static final ItemSpade igShovel = new ToolSpade("igshovel", igMaterial);
	public static final ItemHoe igHoe = new ToolHoe("ighoe", igMaterial);

	public static final ItemSword maSword = new ToolSword("masword", maMaterial);
	public static final ItemSword maKnife = new ToolSword("maknife", maMaterial);

	public static final ItemSword siSword = new ToolSword("sisword", siMaterial);
	public static final ItemSword siKnife = new ToolSword("siknife", siMaterial);
	public static final ItemPickaxe siPickaxe = new ToolPickaxe("sipickaxe", siMaterial);
	public static final ItemAxe siAxe = new ToolAxe("siaxe", siMaterial);
	public static final ItemSpade siShovel = new ToolSpade("sishovel", siMaterial);
	public static final ItemHoe siHoe = new ToolHoe("sihoe", siMaterial);

	// Armor
	public static final Item cbHelmet = new ArmorBase("cbhelmet", cbArmorMaterial, 1, EntityEquipmentSlot.HEAD);
	public static final Item cbChestplate = new ArmorBase("cbchestplate", cbArmorMaterial, 1,
			EntityEquipmentSlot.CHEST);
	public static final Item cbLeggings = new ArmorBase("cbleggings", cbArmorMaterial, 2, EntityEquipmentSlot.LEGS);
	public static final Item cbBoots = new ArmorBase("cbboots", cbArmorMaterial, 1, EntityEquipmentSlot.FEET);

	public static final Item testHelmet = new TestArmor("testelmet", testArmorMaterial, 1, EntityEquipmentSlot.HEAD);
	public static final Item testChestplate = new TestArmor("testchestplate", testArmorMaterial, 1,
			EntityEquipmentSlot.CHEST);
	public static final Item testLeggings = new TestArmor("testleggings", testArmorMaterial, 2,
			EntityEquipmentSlot.LEGS);
	public static final Item testBoots = new TestArmor("testboots", testArmorMaterial, 1, EntityEquipmentSlot.FEET);

}
