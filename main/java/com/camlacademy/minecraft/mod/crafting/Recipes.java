/**
 * 
 */
package com.camlacademy.minecraft.mod.crafting;

import com.camlacademy.minecraft.mod.ModRegister;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author CAML Student
 *
 */
public class Recipes {
	public Recipes() {
		GameRegistry.addRecipe(new ItemStack(Items.apple),
				"XXX",
				"XXX",
				"XXX",
				'X', Items.wheat_seeds);
		GameRegistry.addRecipe(new ItemStack(Items.glass_bottle),
				"X X",
				"XYX",
				"XXX",
				'X', Blocks.sand,
				'Y', Items.lava_bucket);
		GameRegistry.addRecipe(new ItemStack(Blocks.dragon_egg),
				"XX",
				"XX",
				'X',Blocks.obsidian);
		GameRegistry.addRecipe(new ItemStack(Blocks.wooden_slab),
				"XX",
				"XX",
				'X',Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.bone),
				" X",
				"Y ",
				'X',Blocks.snow,'Y',Items.brick);
		GameRegistry.addRecipe(new ItemStack(Items.saddle),
				"YXY",
				"YXY",
				"YXY",
				'Y',Items.stick,	
				'X',Items.leather);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_sword),
				Items.iron_sword, Blocks.beacon);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond_sword),
				Items.iron_sword, new ItemStack(Items.dye, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone),
				Blocks.dirt, Blocks.gravel);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat, 2),
				Items.wheat_seeds, Items.water_bucket);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lit_pumpkin, 3),
				Items.pumpkin_seeds, Items.water_bucket, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.slime_ball, 2),
				Items.milk_bucket, new ItemStack(Items.dye, 1, 2));
		GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(Items.diamond), 1F);
		
		GameRegistry.addSmelting(Items.diamond_chestplate, new ItemStack(Items.diamond, 8), 80000F);
		
		GameRegistry.addSmelting(Items.diamond_leggings, new ItemStack(Items.diamond, 7), 70000F);
		
		GameRegistry.addSmelting(Items.diamond_boots, new ItemStack(Items.diamond, 4), 40000F);
		
		GameRegistry.addSmelting(Items.diamond_helmet, new ItemStack(Items.diamond, 5), 50000F);
		
		GameRegistry.addSmelting(Items.iron_chestplate, new ItemStack(Items.iron_ingot, 8), 8000F);
		
		GameRegistry.addSmelting(Items.iron_leggings, new ItemStack(Items.iron_ingot, 7), 70000F);
		
		GameRegistry.addSmelting(Items.iron_boots, new ItemStack(Items.iron_ingot, 4), 40000F);
		
		GameRegistry.addSmelting(Items.iron_helmet, new ItemStack(Items.iron_ingot, 5), 50000F);
		
		GameRegistry.addSmelting(Blocks.dirt, new ItemStack(Blocks.lapis_block, 32), 10F);
		
		GameRegistry.addSmelting(Items.wooden_pickaxe, new ItemStack(Items.coal, 10), 0.1F);
		
		GameRegistry.addSmelting(Items.golden_helmet, new ItemStack(Items.gold_ingot, 12), 2F);
		
		GameRegistry.addSmelting(Items.golden_chestplate, new ItemStack(Items.gold_ingot, 16), 2F);
		
		GameRegistry.addSmelting(Items.golden_leggings, new ItemStack(Items.gold_ingot, 10), 2F);
		
		GameRegistry.addSmelting(Items.golden_boots, new ItemStack(Items.gold_ingot, 8), 2F);
		
		GameRegistry.addSmelting(Items.chainmail_boots, new ItemStack(Items.fire_charge, 4), 4F);
		
		GameRegistry.addSmelting(Items.chainmail_leggings, new ItemStack(Items.fire_charge, 7), 4F);
		
		GameRegistry.addSmelting(Items.chainmail_chestplate, new ItemStack(Items.fire_charge, 8), 4F);
		
		GameRegistry.addSmelting(Items.chainmail_helmet, new ItemStack(Items.fire_charge, 5), 4F);
		
		GameRegistry.addSmelting(Items.diamond_sword, new ItemStack(Items.diamond, 2), 4F);
		
		GameRegistry.addSmelting(Items.iron_sword, new ItemStack(Items.iron_ingot, 2), 4F);
		
		GameRegistry.addSmelting(Items.golden_sword, new ItemStack(Items.gold_ingot, 2), 4F);

		ItemStack enchantedSword = new ItemStack(ModRegister.myFrost);
		
		int count;
		for (count = 0; count < 10000; count++) {
			enchantedSword.addEnchantment(Enchantment.sharpness, 30);	
		}
	
		for (count = 0; count < 10000; count++) {
			enchantedSword.addEnchantment(Enchantment.unbreaking, 30);	
		}

	    GameRegistry.addShapelessRecipe(enchantedSword,
				Items.stone_sword, Items.nether_star);
 		ItemStack pizza = new ItemStack(ModRegister.myPizza);
 		GameRegistry.addShapelessRecipe(pizza,
				Items.bread, Items.cooked_porkchop);
 		
 		ItemStack diamondSword = new ItemStack(Items.diamond_sword);
 		diamondSword.addEnchantment(Enchantment.sharpness, 30);
 		GameRegistry.addShapedRecipe(diamondSword, "AAA", "ABA", "AAA", 'A', Blocks.dirt, 'B', Items.wooden_hoe);
 	}      
}
