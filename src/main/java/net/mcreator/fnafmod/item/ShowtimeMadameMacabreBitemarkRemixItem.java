
package net.mcreator.fnafmod.item;

import net.minecraft.network.chat.Component;

public class ShowtimeMadameMacabreBitemarkRemixItem extends RecordItem {

	public ShowtimeMadameMacabreBitemarkRemixItem() {
		super(0, FnafModModSounds.REGISTRY.get(new ResourceLocation("fnaf_mod:showtimebitemarkremixbysynoxsis")),
				new Item.Properties().tab(FnafModModTabs.TAB_MUSIC_DISCS).stacksTo(1).rarity(Rarity.RARE));
	}

}
