package com.codetaylor.mc.pyrotech.modules.pyrotech.init.recipe;

import com.codetaylor.mc.pyrotech.modules.pyrotech.ModulePyrotech;
import com.codetaylor.mc.pyrotech.modules.pyrotech.block.BlockCobblestone;
import com.codetaylor.mc.pyrotech.modules.pyrotech.block.BlockRock;
import com.codetaylor.mc.pyrotech.modules.pyrotech.init.ModuleBlocks;
import com.codetaylor.mc.pyrotech.modules.pyrotech.item.ItemMaterial;
import com.codetaylor.mc.pyrotech.modules.pyrotech.recipe.GraniteAnvilRecipe;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.IForgeRegistry;

public class GraniteAnvilRecipesAdd {

  public static void apply(IForgeRegistry<GraniteAnvilRecipe> registry) {

    // --- Pickaxe Recipes -----------------------------------------------------

    // Individual Stone Bricks
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.BRICK_STONE.asStack(2),
        Ingredient.fromStacks(
            new ItemStack(Blocks.STONE_SLAB, 1, 5)
        ),
        4,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "brick_stone"));

    // Slabs

    // Stone Brick Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB, 2, 5),
        Ingredient.fromStacks(
            new ItemStack(Blocks.STONEBRICK)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "stone_brick_slab"));

    // Cobblestone Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB, 2, 3),
        Ingredient.fromStacks(
            new ItemStack(Blocks.COBBLESTONE)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "cobblestone_slab"));

    // Stone Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB, 2, 0),
        Ingredient.fromStacks(
            new ItemStack(Blocks.STONE)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "stone_slab"));

    // Sandstone Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB, 2, 1),
        Ingredient.fromStacks(
            new ItemStack(Blocks.SANDSTONE, 1, 0),
            new ItemStack(Blocks.SANDSTONE, 1, 1),
            new ItemStack(Blocks.SANDSTONE, 1, 2)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "sandstone_slab"));

    // Red Sandstone Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB2, 2, 0),
        Ingredient.fromStacks(
            new ItemStack(Blocks.RED_SANDSTONE, 1, 0),
            new ItemStack(Blocks.RED_SANDSTONE, 1, 1),
            new ItemStack(Blocks.RED_SANDSTONE, 1, 2)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "red_sandstone_slab"));

    // Brick Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB, 2, 4),
        Ingredient.fromStacks(
            new ItemStack(Blocks.BRICK_BLOCK)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "brick_slab"));

    // Nether Brick Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB, 2, 6),
        Ingredient.fromStacks(
            new ItemStack(Blocks.NETHER_BRICK)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "nether_brick_slab"));

    // Quartz Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.STONE_SLAB, 2, 7),
        Ingredient.fromStacks(
            new ItemStack(Blocks.QUARTZ_BLOCK, 1, 0),
            new ItemStack(Blocks.QUARTZ_BLOCK, 1, 1),
            new ItemStack(Blocks.QUARTZ_BLOCK, 1, 2)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "quartz_slab"));

    // Purpur Slab
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.PURPUR_SLAB, 2, 0),
        Ingredient.fromStacks(
            new ItemStack(Blocks.PURPUR_BLOCK, 1, 0)
        ),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "purpur_slab"));

    // Flint Shard from Flint
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.FLINT_SHARD.asStack(3),
        Ingredient.fromStacks(new ItemStack(Items.FLINT, 1, 0)),
        4,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "flint_shard_from_flint"));

    // Bone Shard from Bone
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.BONE_SHARD.asStack(3),
        Ingredient.fromStacks(new ItemStack(Items.BONE, 1, 0)),
        4,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "bone_shard_from_bone"));

    // Bone Shard from Block
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.BONE_SHARD.asStack(8),
        Ingredient.fromStacks(new ItemStack(Blocks.BONE_BLOCK, 1, 0)),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "bone_shard_from_block"));

    // Charcoal Flakes from Charcoal
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.CHARCOAL_FLAKES.asStack(8),
        Ingredient.fromStacks(new ItemStack(Items.COAL, 1, 1)),
        4,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "charcoal_flakes"));

    // Coal Pieces from Coal
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.COAL_PIECES.asStack(8),
        Ingredient.fromStacks(new ItemStack(Items.COAL, 1, 0)),
        4,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "coal_pieces"));

    // Iron Shard from Iron Ingot
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.IRON_SHARD.asStack(9),
        Ingredient.fromStacks(new ItemStack(Items.IRON_INGOT, 1, 0)),
        8,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "iron_shard"));

    // Diamond Shard from Diamond
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.DIAMOND_SHARD.asStack(9),
        Ingredient.fromStacks(new ItemStack(Items.DIAMOND, 1, 0)),
        16,
        GraniteAnvilRecipe.EnumType.PICKAXE
    ).setRegistryName(ModulePyrotech.MOD_ID, "diamond_shard"));

    // --- Hammer Recipes ------------------------------------------------------

    // Bone Meal from Bone Shard
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Items.DYE, 1, 15),
        Ingredient.fromStacks(ItemMaterial.EnumType.BONE_SHARD.asStack()),
        4,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "bone_shard"));

    // Bone Meal from Bone
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Items.DYE, 3, 15),
        Ingredient.fromStacks(new ItemStack(Items.BONE, 1, 0)),
        4,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "bone_meal_from_bone"));

    // Bone Meal from Bone Block
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Items.DYE, 8, 15),
        Ingredient.fromStacks(new ItemStack(Blocks.BONE_BLOCK, 1, 0)),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "bone_meal_from_bone_block"));

    // Stone to cobblestone
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Blocks.COBBLESTONE),
        Ingredient.fromStacks(new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.STONE.getMetadata())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "stone_to_cobbled"));

    // Andesite to cobbled andesite
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.ANDESITE.getMeta()),
        Ingredient.fromStacks(new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.ANDESITE.getMetadata())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "andesite_to_cobbled"));

    // Diorite to cobbled diorite
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.DIORITE.getMeta()),
        Ingredient.fromStacks(new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.DIORITE.getMetadata())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "diorite_to_cobbled"));

    // Granite to cobbled granite
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.GRANITE.getMeta()),
        Ingredient.fromStacks(new ItemStack(Blocks.STONE, 1, BlockStone.EnumType.GRANITE.getMetadata())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "granite_to_cobbled"));

    // Limestone to cobbled limestone
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.LIMESTONE.getMeta()),
        Ingredient.fromStacks(new ItemStack(ModuleBlocks.LIMESTONE)),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "limestone_to_cobbled"));

    // Cobblestone to rocks
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.ROCK, 8, BlockRock.EnumType.STONE.getMeta()),
        Ingredient.fromStacks(new ItemStack(Blocks.COBBLESTONE)),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "cobblestone_to_rocks"));

    // Cobbled andesite to rocks
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.ROCK, 8, BlockRock.EnumType.ANDESITE.getMeta()),
        Ingredient.fromStacks(new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.ANDESITE.getMeta())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "cobbled_andesite_to_rocks"));

    // Cobbled diorite to rocks
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.ROCK, 8, BlockRock.EnumType.DIORITE.getMeta()),
        Ingredient.fromStacks(new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.DIORITE.getMeta())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "cobbled_diorite_to_rocks"));

    // Cobbled granite to rocks
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.ROCK, 8, BlockRock.EnumType.GRANITE.getMeta()),
        Ingredient.fromStacks(new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.GRANITE.getMeta())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "cobbled_granite_to_rocks"));

    // Cobbled limestone to rocks
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(ModuleBlocks.ROCK, 8, BlockRock.EnumType.LIMESTONE.getMeta()),
        Ingredient.fromStacks(new ItemStack(ModuleBlocks.COBBLESTONE, 1, BlockCobblestone.EnumType.LIMESTONE.getMeta())),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "cobbled_limestone_to_rocks"));

    // Coal block to coal
    registry.register(new GraniteAnvilRecipe(
        new ItemStack(Items.COAL, 9),
        Ingredient.fromStacks(new ItemStack(Blocks.COAL_BLOCK)),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "coal_block_to_coal"));

    // Coal coke block to coal coke
    registry.register(new GraniteAnvilRecipe(
        ItemMaterial.EnumType.COAL_COKE.asStack(9),
        Ingredient.fromStacks(new ItemStack(ModuleBlocks.COAL_COKE_BLOCK)),
        8,
        GraniteAnvilRecipe.EnumType.HAMMER
    ).setRegistryName(ModulePyrotech.MOD_ID, "coal_coke_block_to_coal_coke"));

  }
}