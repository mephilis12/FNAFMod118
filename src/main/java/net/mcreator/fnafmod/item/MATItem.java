
package net.mcreator.fnafmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.fnafmod.init.FnafModModTabs;

import java.util.List;

public class MATItem extends Item {
	public MATItem() {
		super(new Item.Properties().tab(FnafModModTabs.TAB_FNAF_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Maintainance Assisting Tablet"));
	}
}
