package com.lyokotech.testmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class OrangeBlock extends Block {

  private String name = "orangeBlock";


  public OrangeBlock() {
    super(Material.rock);

    this.setBlockName("TestMod_" + name);
    this.setBlockTextureName("TestMod:" + name);

    this.setCreativeTab(CreativeTabs.tabBlock);
    GameRegistry.registerBlock(this, name);
  }
}
