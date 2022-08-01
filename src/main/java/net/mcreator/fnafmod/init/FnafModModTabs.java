
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FnafModModTabs {
	public static CreativeModeTab TAB_FNAF_BLOCKS;
	public static CreativeModeTab TAB_FNAF_ITEMS;
	public static CreativeModeTab TAB_FNAF_MOBS;
	public static CreativeModeTab TAB_STRUCTURE_SPAWNERS;
	public static CreativeModeTab TAB_MUSIC_DISCS;
	public static CreativeModeTab TAB_DRAWINGS_POSTERS;

	public static void load() {
		TAB_FNAF_BLOCKS = new CreativeModeTab("tabfnaf_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.BLACK_WHITE_TILE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAF_ITEMS = new CreativeModeTab("tabfnaf_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.RED_BLUE_TILE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAF_MOBS = new CreativeModeTab("tabfnaf_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.RED_BLACK_TILE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_STRUCTURE_SPAWNERS = new CreativeModeTab("tabstructure_spawners") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MUSIC_DISCS = new CreativeModeTab("tabmusic_discs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModItems.HAPPIEST_DAY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DRAWINGS_POSTERS = new CreativeModeTab("tabdrawings_posters") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.CHILDREN_DRAWINGS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
