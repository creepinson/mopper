package me.creepinson.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class UltimateTestThingy extends BlockBase {
    private final boolean powered;
	public UltimateTestThingy(boolean powered) {
		super(Material.CIRCUITS, "ultimate_test_thingy");
		this.setCreativeTab(CreativeTabs.REDSTONE);
		this.powered = powered;
		 if (powered) 
		    {
			    this.setLightLevel(1.0F);
		    }
	}
	
	 /**
     * Called after the block is set in the Chunk data, but before the Tile Entity is set
     */
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!worldIn.isRemote)
        {
            if (this.powered && !worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.uttOff.getDefaultState(), 2);
            }
            else if (!this.powered && worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.uttOn.getDefaultState(), 2);
            }
        }
    }

    /**
     * Called when a neighboring block was changed and marks that this state should perform any checks during a neighbor
     * change. Cases may include when redstone power is updated, cactus blocks popping off due to a neighboring solid
     * block, etc.
     */
    public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
    {
        if (!worldIn.isRemote)
        {
            if (this.powered && !worldIn.isBlockPowered(pos))
            {
                worldIn.scheduleUpdate(pos, this, 4);
            }
            else if (!this.powered && worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.uttOn.getDefaultState(), 2);
            }
        }
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if (this.powered && !worldIn.isBlockPowered(pos))
            {
                worldIn.setBlockState(pos, ModBlocks.uttOff.getDefaultState(), 2);
            }
        }
    }



    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(ModBlocks.uttOff);
    }

    protected ItemStack getSilkTouchDrop(IBlockState state)
    {
        return new ItemStack(ModBlocks.uttOff);
    }
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		
		return Item.getItemFromBlock(ModBlocks.uttOff);
	}

}
