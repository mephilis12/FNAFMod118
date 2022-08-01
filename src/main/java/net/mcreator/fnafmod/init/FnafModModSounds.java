
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FnafModModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("fnaf_mod", "door_close"), new SoundEvent(new ResourceLocation("fnaf_mod", "door_close")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "animatronic_step"), new SoundEvent(new ResourceLocation("fnaf_mod", "animatronic_step")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "golden_freddy_scram"),
				new SoundEvent(new ResourceLocation("fnaf_mod", "golden_freddy_scram")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "dont_go"), new SoundEvent(new ResourceLocation("fnaf_mod", "dont_go")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "happiest_day"), new SoundEvent(new ResourceLocation("fnaf_mod", "happiest_day")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "toreador_march"), new SoundEvent(new ResourceLocation("fnaf_mod", "toreador_march")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "nosehonk"), new SoundEvent(new ResourceLocation("fnaf_mod", "nosehonk")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "god"), new SoundEvent(new ResourceLocation("fnaf_mod", "god")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "ventwalk"), new SoundEvent(new ResourceLocation("fnaf_mod", "ventwalk")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "fnaf1_scream"), new SoundEvent(new ResourceLocation("fnaf_mod", "fnaf1_scream")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "fnaf2_scream"), new SoundEvent(new ResourceLocation("fnaf_mod", "fnaf2_scream")));
		REGISTRY.put(new ResourceLocation("fnaf_mod", "fnaf3scream"), new SoundEvent(new ResourceLocation("fnaf_mod", "fnaf3scream")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
