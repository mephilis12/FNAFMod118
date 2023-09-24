
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FnafModModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DO_PHANTOMS_SPAWN = GameRules.register("doPhantomsSpawn", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
}
