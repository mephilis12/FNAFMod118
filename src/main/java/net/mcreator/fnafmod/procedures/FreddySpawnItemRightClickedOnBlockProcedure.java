package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.entity.FreddyFazbearEntity;

public class FreddySpawnItemRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FnafModModItems.FREDDY_SPAWN_ITEM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new FreddyFazbearEntity(FnafModModEntities.FREDDY_FAZBEAR.get(), _level);
			entityToSpawn.moveTo((x + 0.5), (y + 1), (z + 0.5), (float) (entity.getYRot() + 180), 0);
			entityToSpawn.setYBodyRot((float) (entity.getYRot() + 180));
			entityToSpawn.setYHeadRot((float) (entity.getYRot() + 180));
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
