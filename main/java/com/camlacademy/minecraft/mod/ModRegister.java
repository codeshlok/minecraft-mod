package com.camlacademy.minecraft.mod;

import com.camlacademy.minecraft.mod.crafting.Recipes;
import com.camlacademy.minecraft.mod.food.ItemPizza;
import com.camlacademy.minecraft.mod.items.ItemFrost;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;


@Mod(modid = ModRegister.MODID, version = ModRegister.VERSION, name = ModRegister.NAME)
public class ModRegister {
	public static final String MODID = "modByCaml";
	public static final String VERSION = "1.0";
	public static final String NAME = "Minecraft mod created at CAML Academy";	
	public static final boolean CLIENT_ONLY = true;

   //---------------------------- DECLARATION SECTION ------------------------------//
	public static ItemFrost myFrost;
	public static ArmorMaterial camlArmorC;
	public static ItemPizza myPizza;
	
    //----------------------- END OF DECLARATION SECION ---------------------------//
	
	@EventHandler	
	public  void preInit(FMLPreInitializationEvent event ) 	{
		myFrost = new ItemFrost();
	camlArmorC = EnumHelper.addArmorMaterial("camlarmorc", "camlarmorc", 20, new int [] {1, 0, 3, 2}, 10);
	myPizza = new ItemPizza(20, 0.20F, true);
	}
	
	@EventHandler 
	public void init(FMLInitializationEvent event) {
		if (event.getSide() == Side.CLIENT) {
			RenderItem render = Minecraft.getMinecraft().getRenderItem();
			render.getItemModelMesher().register(myFrost, 0, 
					new ModelResourceLocation(MODID + ":" + "frostmourne", "inventory"));
			render.getItemModelMesher().register(myPizza, 0,
					new ModelResourceLocation(MODID + ":" + "pizza", "inventory"));
		}
	//------------------------- REGISTER EVENT HANDLER -----------------------------//
		
		
	//--------------------- END OF REGISTER EVENT HANDLER SECION -------------------//
	
	
	
		
	// ----------------------------- REGISTER ITEMS --------------------------------//
		
		
		
	//--------------------------- END OF REGISTER ITEMS ----------------------------//
	
	
	
	
	// ------------------------- REGISTER BLOCKS -----------------------------------//
		
	    
	    
	//------------------------- END OF REGISTER BLOCKS -----------------------------//
	
	
	
	    
	    
	//----------------------------- RECIPES SECTION --------------------------------//
	  MinecraftForge.EVENT_BUS.register(new Recipes());
		
		
	//--------------------------- END OF RECIPES SECION ---------------------------//	
	  
	
	
	
	}
	
	
	
	
	//------------------------------ REGISTER COMMANDS ----------------------------//
	
	
	//-------------------------- END OF REGISTER COMMANDS -------------------------//
}