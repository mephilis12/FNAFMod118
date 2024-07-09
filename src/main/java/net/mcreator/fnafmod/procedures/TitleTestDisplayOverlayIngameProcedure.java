package net.mcreator.fnafmod.procedures;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class TitleTestDisplayOverlayIngameProcedure {
	public static boolean execute() {
		if (FnafModModVariables.TitleCheck == 1) {
			return true;
		}
		return false;
	}
}
