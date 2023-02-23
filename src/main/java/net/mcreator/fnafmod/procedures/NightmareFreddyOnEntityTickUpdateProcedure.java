package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class NightmareFreddyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rand = 0;
		rand = Mth.nextInt(RandomSource.create(), 1, 300);
		if (world instanceof Level _lvl && _lvl.isDay()) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (69 == rand) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1, (false), (false)));
			}
		}
	}
}
