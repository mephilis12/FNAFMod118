package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class SitEntityOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle() == false) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
