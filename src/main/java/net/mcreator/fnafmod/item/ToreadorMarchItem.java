
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.fnafmod.init.FnafModModTabs;
import net.mcreator.fnafmod.init.FnafModModSounds;

public class ToreadorMarchItem extends RecordItem {
	public ToreadorMarchItem() {
		super(0, FnafModModSounds.REGISTRY.get(new ResourceLocation("fnaf_mod:toreador_march")),
				new Item.Properties().tab(FnafModModTabs.TAB_MUSIC_DISCS).stacksTo(1).rarity(Rarity.RARE));
	}
}
