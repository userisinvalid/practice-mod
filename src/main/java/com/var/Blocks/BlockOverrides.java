package com.var.Blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockOverrides extends ItemBlock{
	public BlockOverrides(Block block) {
		super(block);
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
	{
		if(this == BlockSet.cube.getItem(null, maxStackSize, maxStackSize, maxStackSize)) {
			list.add("I'M IN A FUCKIN' CUBE");
			list.add("- The nerd, probably");
		}
		if(this == BlockSet.jerma.getItem(null, maxStackSize, maxStackSize, maxStackSize)) {
			list.add("sus");
		}
	}
}