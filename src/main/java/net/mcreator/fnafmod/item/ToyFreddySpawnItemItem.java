
package net.mcreator.fnafmod.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.fnafmod.procedures.ToyFreddySpawnItemRightclickedOnBlockProcedure;
import net.mcreator.fnafmod.init.FnafModModTabs;

public class ToyFreddySpawnItemItem extends Item {
	public ToyFreddySpawnItemItem() {
		super(new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ToyFreddySpawnItemRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}