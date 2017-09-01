package me.creepinson.block;

import java.util.Random;

import me.creepinson.item.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MechaniconOre extends BlockOre {

	public MechaniconOre() {
		super("ore_mechanicon");
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Override
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(this.getRegistryName());
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.rawMechanicon;
	}
	
	
}
