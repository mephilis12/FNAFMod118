package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class WitheredChicaFrame3DisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).WitheredChicaJumpscare == 3) {
			return true;
		}
		return false;
	}
}
