package com.lyokotech.testmod.blocks;

import net.minecraft.block.Block;

public final class ModBlocks {
  public static Block orangeBlock;

  public static void init() {
    orangeBlock = new OrangeBlock();
    
  }
}
