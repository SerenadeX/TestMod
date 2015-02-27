package com.lyokotech.testmod;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = TestMod.MODID, version = TestMod.VERSION)
public class TestMod
{
    public static final String MODID = "TestMod";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
      
    }
}
