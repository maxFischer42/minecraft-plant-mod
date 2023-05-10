
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plants.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.plants.block.SpottedBegoniaBlock;
import net.mcreator.plants.block.PassionFlowerBlock;
import net.mcreator.plants.PlantsMod;

public class PlantsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PlantsMod.MODID);
	public static final RegistryObject<Block> PASSION_FLOWER = REGISTRY.register("passion_flower", () -> new PassionFlowerBlock());
	public static final RegistryObject<Block> SPOTTED_BEGONIA = REGISTRY.register("spotted_begonia", () -> new SpottedBegoniaBlock());
}
