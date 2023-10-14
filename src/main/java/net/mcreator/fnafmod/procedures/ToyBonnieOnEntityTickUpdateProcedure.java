package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModEntities;
import net.mcreator.fnafmod.init.FnafModModBlocks;
import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;
import net.mcreator.fnafmod.entity.CrawlingToyBonnieEntity;

import java.util.Comparator;

public class ToyBonnieOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("GotCoordinates")).equals("true")) {
			entity.getPersistentData().putDouble("spawnX", (entity.getX()));
			entity.getPersistentData().putDouble("spawnY", (entity.getY()));
			entity.getPersistentData().putDouble("spawnZ", (entity.getZ()));
			entity.getPersistentData().putDouble("spawnYaw", (entity.getYRot()));
			entity.getPersistentData().putString("GotCoordinates", "true");
		}
		if (world instanceof Level _lvl10 && _lvl10.isDay()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new DayTimeToyBonnieEntity(FnafModModEntities.DAY_TIME_TOY_BONNIE.get(), _level);
				entityToSpawn.moveTo((entity.getPersistentData().getDouble("spawnX")), (entity.getPersistentData().getDouble("spawnY")), (entity.getPersistentData().getDouble("spawnZ")), (float) entity.getPersistentData().getDouble("spawnYaw"), 0);
				entityToSpawn.setYBodyRot((float) entity.getPersistentData().getDouble("spawnYaw"));
				entityToSpawn.setYHeadRot((float) entity.getPersistentData().getDouble("spawnYaw"));
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			if (!entity.level.isClientSide())
				entity.discard();
		}
		if ((world.getBlockState(new BlockPos(x, entity.getY() - 1, z))).getBlock() == FnafModModBlocks.VENT.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new CrawlingToyBonnieEntity(FnafModModEntities.CRAWLING_TOY_BONNIE.get(), _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			((Entity) world.getEntitiesOfClass(CrawlingToyBonnieEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnX", (entity.getPersistentData().getDouble("spawnX")));
			((Entity) world.getEntitiesOfClass(CrawlingToyBonnieEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnY", (entity.getPersistentData().getDouble("spawnY")));
			((Entity) world.getEntitiesOfClass(CrawlingToyBonnieEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnZ", (entity.getPersistentData().getDouble("spawnZ")));
			((Entity) world.getEntitiesOfClass(CrawlingToyBonnieEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("spawnYaw", (entity.getPersistentData().getDouble("spawnYaw")));
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
