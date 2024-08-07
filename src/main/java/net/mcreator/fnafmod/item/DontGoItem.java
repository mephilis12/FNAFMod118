
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.fnafmod.init.FnafModModTabs;

import java.util.List;

public class DontGoItem extends RecordItem {
	public DontGoItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:dont_go")), new Item.Properties().tab(FnafModModTabs.TAB_MUSIC_DISCS).stacksTo(1).rarity(Rarity.RARE), 0);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
	}
}
