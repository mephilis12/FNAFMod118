package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class CameraOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getBoolean("cammode") == true) {
			return true;
		}
		return false;
	}
}
