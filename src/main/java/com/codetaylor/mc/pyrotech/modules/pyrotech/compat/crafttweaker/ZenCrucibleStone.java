package com.codetaylor.mc.pyrotech.modules.pyrotech.compat.crafttweaker;

import com.codetaylor.mc.pyrotech.modules.pyrotech.ModulePyrotechRegistries;
import com.codetaylor.mc.pyrotech.modules.pyrotech.recipe.CrucibleStoneRecipe;
import crafttweaker.IAction;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.liquid.ILiquidStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.mc1120.CraftTweaker;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.pyrotech.StoneCrucible")
public class ZenCrucibleStone {

  @ZenMethod
  public static void removeRecipes(ILiquidStack output) {

    CraftTweaker.LATE_ACTIONS.add(new RemoveRecipe(CraftTweakerMC.getLiquidStack(output)));
  }

  @ZenMethod
  public static void addRecipe(
      String name,
      ILiquidStack output,
      IIngredient input,
      int burnTimeTicks
  ) {

    CraftTweaker.LATE_ACTIONS.add(new AddRecipe(
        name,
        CraftTweakerMC.getLiquidStack(output),
        CraftTweakerMC.getIngredient(input),
        burnTimeTicks
    ));
  }

  public static class RemoveRecipe
      implements IAction {

    private final FluidStack output;

    public RemoveRecipe(FluidStack output) {

      this.output = output;
    }

    @Override
    public void apply() {

      CrucibleStoneRecipe.removeRecipes(this.output);
    }

    @Override
    public String describe() {

      return "Removing stone mill recipes for " + this.output;
    }
  }

  public static class AddRecipe
      implements IAction {

    private final String name;
    private final FluidStack output;
    private final Ingredient input;
    private final int burnTimeTicks;

    public AddRecipe(
        String name,
        FluidStack output,
        Ingredient input,
        int burnTimeTicks
    ) {

      this.name = name;
      this.input = input;
      this.output = output;
      this.burnTimeTicks = burnTimeTicks;
    }

    @Override
    public void apply() {

      CrucibleStoneRecipe recipe = new CrucibleStoneRecipe(
          this.output,
          this.input,
          this.burnTimeTicks
      );
      ModulePyrotechRegistries.CRUCIBLE_STONE_RECIPE.register(recipe.setRegistryName(new ResourceLocation("crafttweaker", this.name)));
    }

    @Override
    public String describe() {

      return "Adding stone crucible recipe for " + this.output;
    }
  }

}