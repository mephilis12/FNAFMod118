
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.fnafmod.init.FnafModModTabs;

public class BatteryItem extends Item {
	public BatteryItem() {
		super(new Item.Properties().tab(FnafModModTabs.TAB_FNAF_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
