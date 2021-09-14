package com.var.Blocks;

import java.util.List;

import com.var.main;
import com.var.Blocks.BlockSet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BlockGen extends Block {
	public BlockGen(Material block) {	
		super(block);
		this.setCreativeTab(main.memes);
	}
}