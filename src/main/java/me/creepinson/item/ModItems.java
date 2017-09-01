package me.creepinson.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by theo on 8/29/17.
 */
public class ModItems {

	public static RawMechanicon rawMechanicon = new RawMechanicon();
	public static Mechanicon mechanicon = new Mechanicon();

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(rawMechanicon, mechanicon);
	}

	public static void registerModels() {
		rawMechanicon.registerItemModel();
		mechanicon.registerItemModel();
	}
}