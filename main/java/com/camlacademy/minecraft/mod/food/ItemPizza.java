package com.camlacademy.minecraft.mod.food;

import com.camlacademy.minecraft.mod.ModRegister;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemPizza extends ItemFood{
	public ItemPizza(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		GameRegistry.registerItem(this, "pizza");
		setUnlocalizedName(ModRegister.MODID + "_" + "pizza");
		setCreativeTab(CreativeTabs.tabFood);
	}
}
