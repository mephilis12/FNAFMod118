
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FnafModModTabs {
	public static CreativeModeTab TAB_FNAF_BLOCKS;
	public static CreativeModeTab TAB_FNAF_ITEMS;
	public static CreativeModeTab TAB_FNAF_MOBS;
	public static CreativeModeTab TAB_STRUCTURE_SPAWNERS;
	public static CreativeModeTab TAB_MUSIC_DISCS;
	public static CreativeModeTab TAB_DRAWINGS_POSTERS;
	public static CreativeModeTab TAB_SUITS;

	public static void load() {
		TAB_FNAF_BLOCKS = new CreativeModeTab("tabfnaf_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.PURPLE_CURTAIN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAF_ITEMS = new CreativeModeTab("tabfnaf_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModItems.CUPCAKE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_FNAF_MOBS = new CreativeModeTab("tabfnaf_mobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModItems.FREDDY.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_STRUCTURE_SPAWNERS = new CreativeModeTab("tabstructure_spawners") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MUSIC_DISCS = new CreativeModeTab("tabmusic_discs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModItems.TOREADOR_MARCH.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DRAWINGS_POSTERS = new CreativeModeTab("tabdrawings_posters") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModBlocks.CHILDREN_DRAWINGS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUITS = new CreativeModeTab("tabsuits") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FnafModModItems.FREDDY_SUIT_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
