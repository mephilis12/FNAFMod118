package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class CameraGUIValueProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Page: " + new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("plus2") / 5 + 1);
	}
}
