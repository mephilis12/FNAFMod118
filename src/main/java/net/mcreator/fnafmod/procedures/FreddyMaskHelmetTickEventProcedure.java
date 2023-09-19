package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class FreddyMaskHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean Poison = false;
		Poison = false;
		if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
			entity.getPersistentData().putDouble("FNAFTimer", 160);
		} else {
			entity.getPersistentData().putDouble("FNAFTimer", (entity.getPersistentData().getDouble("FNAFTimer") - 1));
		}
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 0, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 1, false, false));
		if (entity.getPersistentData().getDouble("FNAFTimer") == 0) {
			Poison = true;
		}
		if (Poison == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 160, 0, true, false));
		}
	}
}
