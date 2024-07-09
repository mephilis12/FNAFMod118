package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class SummonPartyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Spawned == false) {
			if (!((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party1).equals("Null")) {
				Slot1Procedure.execute(world, x, y, z, entity);
			}
			if (!((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party2).equals("Null")) {
				Slot2Procedure.execute(world, x, y, z, entity);
			}
			if (!((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party3).equals("Null")) {
				Slot3Procedure.execute(world, x, y, z, entity);
			}
			if (!((entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FnafModModVariables.PlayerVariables())).Party4).equals("Null")) {
				Slot4Procedure.execute(world, x, y, z, entity);
			}
			{
				boolean _setval = true;
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Spawned = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
