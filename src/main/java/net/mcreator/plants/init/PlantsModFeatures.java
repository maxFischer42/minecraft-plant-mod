
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plants.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.plants.world.features.plants.SpottedBegoniaFeature;
import net.mcreator.plants.PlantsMod;

@Mod.EventBusSubscriber
public class PlantsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PlantsMod.MODID);
	public static final RegistryObject<Feature<?>> SPOTTED_BEGONIA = REGISTRY.register("spotted_begonia", SpottedBegoniaFeature::feature);
}
