
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.init.FnafModModTabs;
import net.mcreator.fnafmod.init.FnafModModSounds;

public class HappiestDayItem extends RecordItem {
	public HappiestDayItem() {
		super(0, FnafModModSounds.REGISTRY.get(new ResourceLocation("fnaf_mod:happiest_day")),
				new Item.Properties().tab(FnafModModTabs.TAB_MUSIC_DISCS).stacksTo(1).rarity(Rarity.RARE));
	}
}
