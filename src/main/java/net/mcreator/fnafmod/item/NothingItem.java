
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NothingItem extends Item {
	public NothingItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
