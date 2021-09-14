package com.var;

import com.var.Blocks.BlockSet;
import com.var.Items.ItemSet;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Crafting {
	
	private static Item penis = ItemSet.penis;
	private static Block cube = BlockSet.cube;
	
	public static void start() {
		GameRegistry.addRecipe(new ItemStack(penis, 1), new Object[]{
				" X ",
				" X ",
				"X X",
		'X', Item.getItemFromBlock(cube)});
	}
}
