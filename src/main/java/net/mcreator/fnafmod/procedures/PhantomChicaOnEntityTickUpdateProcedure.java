package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.FnafModMod;

public class PhantomChicaOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		FnafModMod.queueServerWork(1200, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
