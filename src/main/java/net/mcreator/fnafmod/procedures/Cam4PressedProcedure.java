package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class Cam4PressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
				.getBoolean(("" + (4 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("plus")))) == true) {
			if (entity.getPersistentData().getBoolean("cammode") == false) {
				entity.getPersistentData().putDouble("x0", (entity.getX()));
				entity.getPersistentData().putDouble("y0", (entity.getY()));
				entity.getPersistentData().putDouble("z0", (entity.getZ()));
			}
			entity.getPersistentData().putDouble("xSet", ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble(("x" + (4 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("plus"))))));
			entity.getPersistentData().putDouble("ySet", ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble(("y" + (4 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("plus")))) - 1));
			entity.getPersistentData().putDouble("zSet", ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
					.getDouble(("z" + (4 + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("plus"))))));
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getPersistentData().getDouble("xSet")), (entity.getPersistentData().getDouble("ySet")), (entity.getPersistentData().getDouble("zSet")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("xSet")), (entity.getPersistentData().getDouble("ySet")), (entity.getPersistentData().getDouble("zSet")), _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			entity.getPersistentData().putBoolean("cammode", (true));
			GettingmodeProcedure.execute(entity);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound fnaf_mod:camerablip ambient @p");
		}
	}
}
