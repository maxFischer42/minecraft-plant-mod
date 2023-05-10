
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plants.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.plants.PlantsMod;

public class PlantsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PlantsMod.MODID);
	public static final RegistryObject<Item> PASSION_FLOWER = block(PlantsModBlocks.PASSION_FLOWER, PlantsModTabs.TAB_PLANTS);
	public static final RegistryObject<Item> SPOTTED_BEGONIA = block(PlantsModBlocks.SPOTTED_BEGONIA, PlantsModTabs.TAB_PLANTS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
