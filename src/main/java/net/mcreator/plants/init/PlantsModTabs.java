
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.plants.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PlantsModTabs {
	public static CreativeModeTab TAB_PLANTS;

	public static void load() {
		TAB_PLANTS = new CreativeModeTab("tabplants") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PlantsModBlocks.SPOTTED_BEGONIA.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
