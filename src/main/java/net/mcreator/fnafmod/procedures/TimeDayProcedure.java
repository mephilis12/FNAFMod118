package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.fnafmod.network.FnafModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimeDayProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world instanceof Level _lvl && _lvl.isDay()) {
			FnafModModVariables.WorldVariables.get(world).TimeDay = true;
			FnafModModVariables.WorldVariables.get(world).syncData(world);
		}
		FnafModModVariables.WorldVariables.get(world).TimeDay = false;
		FnafModModVariables.WorldVariables.get(world).syncData(world);
	}
}
