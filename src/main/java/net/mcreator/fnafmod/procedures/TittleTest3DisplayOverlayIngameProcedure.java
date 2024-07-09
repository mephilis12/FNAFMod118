package net.mcreator.fnafmod.procedures;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class TittleTest3DisplayOverlayIngameProcedure {
	public static boolean execute() {
		if (FnafModModVariables.TitleCheck == 3) {
			return true;
		}
		return false;
	}
}
