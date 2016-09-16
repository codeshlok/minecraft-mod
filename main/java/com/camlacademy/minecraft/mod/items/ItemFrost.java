package com.camlacademy.minecraft.mod.items;

import com.camlacademy.minecraft.mod.ModRegister;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFrost extends ItemSword {
	public ItemFrost() {
		super(ToolMaterial.EMERALD);
		GameRegistry.registerItem(this, "frostmourne");
		setUnlocalizedName(ModRegister.MODID + "_" + "frostmourne");
		setCreativeTab(CreativeTabs.tabCombat);
	}
}