package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.fnafmod.init.FnafModModItems;
import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.entity.EndoSkeletonEntity;
import net.mcreator.fnafmod.entity.Endo02Entity;

public class EndoRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Rand = 0;
		Rand = Mth.nextInt(RandomSource.create(), 1, 2);
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(FnafModModItems.ENDO.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (Rand == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new EndoSkeletonEntity(FnafModModEntities.ENDO_SKELETON.get(), _level);
				entityToSpawn.moveTo((x + 0.5), (y + 1), (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (Rand == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Endo02Entity(FnafModModEntities.ENDO_02.get(), _level);
				entityToSpawn.moveTo((x + 0.5), (y + 1), (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
