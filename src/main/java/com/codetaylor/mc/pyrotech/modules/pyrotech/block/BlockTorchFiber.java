package com.codetaylor.mc.pyrotech.modules.pyrotech.block;

import com.codetaylor.mc.pyrotech.modules.pyrotech.tile.TileTorchFiber;
import net.minecraft.tileentity.TileEntity;

public class BlockTorchFiber
    extends BlockTorchBase {

  public static final String NAME = "torch_fiber";

  @Override
  public TileEntity createTileEntity() {

    return new TileTorchFiber();
  }
}
