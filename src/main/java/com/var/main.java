package com.var;

import com.var.Blocks.BlockSet;
import com.var.Items.ItemSet;
import com.var.Crafting;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid="varmod", name="var's test mod", version="0.1")
public class main {
	public static final String id = "varmod:";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//initialize stuff
		BlockSet.start();
		ItemSet.start();
		Crafting.start();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		// iunno
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public static CreativeTabs memes = new CreativeTabs("memes") {
		@Override
		public Item getTabIconItem(){
			return new ItemStack(BlockSet.cube).getItem();
		}
	};
}
