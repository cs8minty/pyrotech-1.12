package com.codetaylor.mc.pyrotech.modules.ignition.block;

import com.codetaylor.mc.pyrotech.modules.ignition.ModuleIgnition;
import com.codetaylor.mc.pyrotech.modules.ignition.block.spi.BlockTorchBase;
import com.codetaylor.mc.pyrotech.modules.ignition.tile.TileTorchStone;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;

public class BlockTorchStone
    extends BlockTorchBase {

  public static final String NAME = "torch_stone";

  @Override
  public TileEntity createTileEntity() {

    return new TileTorchStone();
  }

  @Override
  protected void getLitDrops(NonNullList<ItemStack> drops) {

    drops.add(new ItemStack(ModuleIgnition.Blocks.TORCH_STONE));
  }
}