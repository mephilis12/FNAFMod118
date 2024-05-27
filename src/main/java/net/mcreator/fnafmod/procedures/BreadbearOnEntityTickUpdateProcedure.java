package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fnafmod.entity.BreadbearEntity;
import net.mcreator.fnafmod.FnafModMod;

public class BreadbearOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double DoAttack = 0;
		if (world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING) == true) {
			DoAttack = Mth.nextInt(RandomSource.create(), 1, 500);
			if (DoAttack == 10) {
				if (entity instanceof BreadbearEntity) {
					((BreadbearEntity) entity).setAnimation("animation.breadbear.groundpound");
				}
				FnafModMod.queueServerWork(20, () -> {
					if (!world.isClientSide()) {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.DESTROY);
						if (entity instanceof BreadbearEntity) {
							((BreadbearEntity) entity).setAnimation("empty");
						}
					}
				});
			}
		}
	}
}
