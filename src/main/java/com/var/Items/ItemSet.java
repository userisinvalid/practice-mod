package com.var.Items;

import com.var.main;
import com.var.Items.penis;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemSet {
	private static void load(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static Item penis;
	
	public static void start() {
		penis = new penis(20, 1.0f, true)
				.setUnlocalizedName("penis")
				.setTextureName(main.id + "penis")
				.setCreativeTab(main.memes);
		load(penis);
	}
}