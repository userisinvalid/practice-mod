package com.var.Blocks;

import com.var.main;
import com.var.Blocks.BlockOverrides;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockSet {	
	
	private static void load(Block block, Boolean override) {
		if(override) {
			GameRegistry.registerBlock(block, BlockOverrides.class, block.getUnlocalizedName().substring(5));
		} else {
			GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
		}
	}
	
	public static Block cube;
	public static Block jerma;
	
	public static void start() {
		cube = new BlockGen(Material.wood)
				.setBlockName("nerdcubed")
				.setBlockTextureName(main.define.id + "nerdcubed");
		load(cube, true);
		
		jerma = new BlockGen(Material.wood)
				.setBlockName("jerma")
				.setBlockTextureName(main.define.id + "jerma");
		load(jerma, true);
	}
}