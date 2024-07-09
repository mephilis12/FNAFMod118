package net.mcreator.fnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class ResetButtonActionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "Null";
			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Party1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Null";
			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Party2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Null";
			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Party3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "Null";
			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Party4 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 0;
			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.PartyAmount = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
