package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;

import net.mcreator.fnafmod.network.FnafModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FacingProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDirection()) == Direction.NORTH) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = 1;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		} else if ((entity.getDirection()) == Direction.WEST) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = 2;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		} else if ((entity.getDirection()) == Direction.SOUTH) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = 3;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		} else if ((entity.getDirection()) == Direction.EAST) {
			FnafModModVariables.WorldVariables.get(world).PlayerFacing = 4;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
