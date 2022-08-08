package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.entity.ToyFreddyEntity;

public class ToyFreddyOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _lvl && _lvl.isDay()) {
			if (entity instanceof ToyFreddyEntity) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}
