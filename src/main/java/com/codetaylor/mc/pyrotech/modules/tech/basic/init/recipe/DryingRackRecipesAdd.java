package com.codetaylor.mc.pyrotech.modules.pyrotech.init.recipe;

import com.codetaylor.mc.pyrotech.modules.pyrotech.ModulePyrotech;
import com.codetaylor.mc.pyrotech.modules.pyrotech.item.ItemMaterial;
import com.codetaylor.mc.pyrotech.modules.pyrotech.recipe.DryingRackRecipe;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.oredict.OreIngredient;
import net.minecraftforge.registries.IForgeRegistry;

public class DryingRackRecipesAdd {

  public static void apply(IForgeRegistry<DryingRackRecipe> registry) {

    // Straw
    registry.register(new DryingRackRecipe(
        ItemMaterial.EnumType.STRAW.asStack(),
        Ingredient.fromStacks(new ItemStack(Items.WHEAT)),
        12 * 60 * 20
    ).setRegistryName(ModulePyrotech.MOD_ID, "straw"));

    // Dried Plant Fibers
    registry.register(new DryingRackRecipe(
        ItemMaterial.EnumType.PLANT_FIBERS_DRIED.asStack(),
        Ingredient.fromStacks(ItemMaterial.EnumType.PLANT_FIBERS.asStack()),
        6 * 60 * 20
    ).setRegistryName(ModulePyrotech.MOD_ID, "plant_fibers_dried"));

    // Dried Plant Fibers
    registry.register(new DryingRackRecipe(
        ItemMaterial.EnumType.PLANT_FIBERS_DRIED.asStack(),
        new OreIngredient("treeSapling"),
        6 * 60 * 20
    ).setRegistryName(ModulePyrotech.MOD_ID, "plant_fibers_dried_from_sapling"));

    // Sponge
    registry.register(new DryingRackRecipe(
        new ItemStack(Blocks.SPONGE, 1, 0),
        Ingredient.fromStacks(new ItemStack(Blocks.SPONGE, 1, 1)),
        8 * 60 * 20
    ).setRegistryName(ModulePyrotech.MOD_ID, "sponge"));

    // Paper
    registry.register(new DryingRackRecipe(
        new ItemStack(Items.PAPER, 1, 0),
        Ingredient.fromStacks(ItemMaterial.EnumType.PULP.asStack()),
        4 * 60 * 20
    ).setRegistryName(ModulePyrotech.MOD_ID, "paper"));
  }
}