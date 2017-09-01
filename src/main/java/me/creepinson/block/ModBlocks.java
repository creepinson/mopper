package me.creepinson.block;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static MechaniconOre ore_mechanicon = new MechaniconOre();
	public static UltimateTestThingy uttOn = new UltimateTestThingy(true);
	public static UltimateTestThingy uttOff = new UltimateTestThingy(false);
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				ore_mechanicon,uttOn,uttOff
		);
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				ore_mechanicon.createItemBlock(),uttOn.createItemBlock(),uttOff.createItemBlock()
		);
	}

	public static void registerModels() {
		ore_mechanicon.registerItemModel(Item.getItemFromBlock(ore_mechanicon));
		ore_mechanicon.registerItemModel(Item.getItemFromBlock(uttOff));
		ore_mechanicon.registerItemModel(Item.getItemFromBlock(uttOn));
	}

}