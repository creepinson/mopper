package me.creepinson.core.proxy;

import me.creepinson.core.Mop;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by theo on 8/29/17.
 */
public class ClientProxy extends CommonProxy {


    @Override
    public void preInit() {

    }



    @Override
    public void init() {

    }



    @Override
    public void postInit() {

    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Mop.modId, id), "inventory"));
    }

}
