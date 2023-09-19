package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.fnafmod.init.FnafModModMobEffects;

public class SpringlockedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterRainOrBubble()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(FnafModModMobEffects.BLEEDING.get(), 15, 0));
		}
	}
}
