package net.mcreator.fnafmod.procedures;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class TitleTest4DisplayConditionProcedure {
	public static boolean execute() {
		if (FnafModModVariables.TitleCheck == 4) {
			return true;
		}
		return false;
	}
}
