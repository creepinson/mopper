package me.creepinson.core;

import me.creepinson.block.ModBlocks;
import me.creepinson.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.rawMechanicon, new ItemStack(ModItems.mechanicon), 0.7f);
	}

}