
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.fnafmod.init.FnafModModTabs;

public class BanjoItem extends Item {
	public BanjoItem() {
		super(new Item.Properties().tab(FnafModModTabs.TAB_FNAF_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
