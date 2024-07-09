package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SecretNightmareFredbearOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBlockState(new BlockPos(x, y + 3, z)).canOcclude()) {
			entity.setShiftKeyDown(true);
		} else {
			entity.setShiftKeyDown(false);
		}
	}
}
