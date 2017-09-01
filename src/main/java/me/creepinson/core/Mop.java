package me.creepinson.core;

import me.creepinson.core.proxy.CommonProxy;
import me.creepinson.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Mop.modId, name = Mop.name, version = Mop.version, acceptedMinecraftVersions = "[1.12]")
public class Mop {

    public static final String modId = "mopper";
    public static final String name = "Mopper";
    public static final String version = "1.0.0";

    @SidedProxy(serverSide = "me.creepinson.core.proxy.CommonProxy", clientSide = "me.creepinson.core.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static Mop instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);



    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    	ModRecipes.init();
    	
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }




}