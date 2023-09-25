package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class BooletProjectileHitsLivingEntityProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (!immediatesourceentity.level.isClientSide())
			immediatesourceentity.discard();
	}
}
