package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fnafmod.init.FnafModModMobEffects;

import java.util.Random;

public class FoxyPiratePlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		double Random = 0;
		Random = Mth.nextInt(RandomSource.create(), 1, 1000);
		if (Random == 3) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(FnafModModMobEffects.BLEEDING.get(), 100, 0, (false), (false)));
		}
	}
}
