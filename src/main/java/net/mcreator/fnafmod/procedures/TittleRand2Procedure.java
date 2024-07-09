package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.fnafmod.network.FnafModModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TittleRand2Procedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		FnafModModVariables.TitleCheck = Mth.nextInt(RandomSource.create(), 1, 4);
	}
}
