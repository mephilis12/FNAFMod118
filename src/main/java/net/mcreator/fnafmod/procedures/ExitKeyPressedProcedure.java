package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class ExitKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("cammode") == true) {
			entity.getPersistentData().putBoolean("cammode", (false));
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getPersistentData().getDouble("x0")), (entity.getPersistentData().getDouble("y0")), (entity.getPersistentData().getDouble("z0")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("x0")), (entity.getPersistentData().getDouble("y0")), (entity.getPersistentData().getDouble("z0")), _ent.getYRot(), _ent.getXRot());
			}
			if (entity.getPersistentData().getDouble("gamem") == 0) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SURVIVAL);
			} else if (entity.getPersistentData().getDouble("gamem") == 1) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.CREATIVE);
			} else if (entity.getPersistentData().getDouble("gamem") == 2) {
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.ADVENTURE);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"playsound fnaf_mod:cameradown ambient @p");
		}
	}
}
