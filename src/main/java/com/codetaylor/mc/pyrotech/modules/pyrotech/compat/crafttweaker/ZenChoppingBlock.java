package com.codetaylor.mc.pyrotech.modules.pyrotech.compat.crafttweaker;

import com.codetaylor.mc.pyrotech.modules.pyrotech.ModulePyrotechRegistries;
import com.codetaylor.mc.pyrotech.modules.pyrotech.recipe.ChoppingBlockRecipe;
import com.codetaylor.mc.pyrotech.modules.pyrotech.recipe.KilnBrickRecipe;
import crafttweaker.IAction;
import crafttweaker.api.item.IIngredient;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.minecraft.CraftTweakerMC;
import crafttweaker.mc1120.CraftTweaker;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.pyrotech.Chopping")
public class ZenChoppingBlock {

  @ZenMethod
  public static void removeRecipes(IIngredient output) {

    CraftTweaker.LATE_ACTIONS.add(new RemoveRecipe(CraftTweakerMC.getIngredient(output)));
  }

  @ZenMethod
  public static void addRecipe(String name, IItemStack output, IIngredient input) {

    CraftTweaker.LATE_ACTIONS.add(new AddRecipe(
        name,
        CraftTweakerMC.getItemStack(output),
        CraftTweakerMC.getIngredient(input)
    ));
  }

  public static class RemoveRecipe
      implements IAction {

    private final Ingredient output;

    public RemoveRecipe(Ingredient output) {

      this.output = output;
    }

    @Override
    public void apply() {

      KilnBrickRecipe.removeRecipes(this.output);
    }

    @Override
    public String describe() {

      return "Removing chopping recipes for " + this.output;
    }
  }

  public static class AddRecipe
      implements IAction {

    private final ItemStack output;
    private final String name;
    private final Ingredient input;

    public AddRecipe(
        String name,
        ItemStack output,
        Ingredient input
    ) {

      this.name = name;
      this.input = input;
      this.output = output;
    }

    @Override
    public void apply() {

      ChoppingBlockRecipe recipe = new ChoppingBlockRecipe(
          this.output,
          this.input
      );
      ModulePyrotechRegistries.CHOPPING_BLOCK_RECIPE.register(recipe.setRegistryName(new ResourceLocation("crafttweaker", this.name)));
    }

    @Override
    public String describe() {

      return "Adding chopping recipe for " + this.output;
    }
  }

}