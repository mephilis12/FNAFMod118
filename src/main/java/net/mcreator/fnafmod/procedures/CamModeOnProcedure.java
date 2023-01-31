package net.mcreator.fnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CamModeOnProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(double x, double y, double z, Entity entity) {
		execute(null, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("cammode") == true) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60, 1, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			if (!(x == entity.getPersistentData().getDouble("xSet")) || !(y == entity.getPersistentData().getDouble("ySet"))
					|| !(z == entity.getPersistentData().getDouble("zSet"))) {
				{
					Entity _ent = entity;
					_ent.teleportTo((entity.getPersistentData().getDouble("xSet")), (entity.getPersistentData().getDouble("ySet")),
							(entity.getPersistentData().getDouble("zSet")));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("xSet")),
								(entity.getPersistentData().getDouble("ySet")), (entity.getPersistentData().getDouble("zSet")), _ent.getYRot(),
								_ent.getXRot());
				}
			}
		}
	}
}
