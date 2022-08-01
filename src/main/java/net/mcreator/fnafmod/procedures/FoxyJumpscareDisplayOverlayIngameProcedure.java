package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class FoxyJumpscareDisplayOverlayIngameProcedure {
	public static boolean execute(LevelAccessor world) {
		if (FnafModModVariables.WorldVariables.get(world).foxykill) {
			return true;
		}
		return false;
	}
}
