package me.creepinson.core;

import me.creepinson.block.ModBlocks;
import me.creepinson.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryEventHandler {

	
    @SubscribeEvent
    public static void itemRegistry(RegistryEvent.Register<Item> e){
		ModBlocks.registerItemBlocks(e.getRegistry());
        ModItems.register(e.getRegistry());

    }
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent e) {
        ModItems.registerModels();
		ModBlocks.registerModels();
    }

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> e) {
		ModBlocks.register(e.getRegistry());
	}
	
    
}
