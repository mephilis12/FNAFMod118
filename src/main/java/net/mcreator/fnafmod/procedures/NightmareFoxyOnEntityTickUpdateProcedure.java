package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.FnafModMod;

public class NightmareFoxyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean Bright = false;
		boolean found = false;
		double rand = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		rand = Mth.nextInt(RandomSource.create(), 1, 300);
		if (world instanceof Level _lvl && _lvl.isDay()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (69 == rand) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 140, 1, (false), (false)));
			}
		}
		sx = 0;
		found = false;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			sy = 0;
			for (int index1 = 0; index1 < (int) (3); index1++) {
				sz = 0;
				for (int index2 = 0; index2 < (int) (3); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == FnafModModBlocks.FLASH_LIGHT_LIGHT.get()) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 8, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 8, (false), (false)));
			entity.setShiftKeyDown((true));
			FnafModMod.queueServerWork(60, () -> {
				entity.setShiftKeyDown((false));
			});
		}
	}
}
