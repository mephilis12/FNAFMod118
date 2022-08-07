package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.network.FnafModModVariables;
import net.mcreator.fnafmod.entity.SittingFredbearEntity;

public class SittingFredbearOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof SittingFredbearEntity) {
			if (entity.getPersistentData().getBoolean("alreadyset") == false) {
				entity.getPersistentData().putBoolean("alreadyset", (false));
				if (FnafModModVariables.WorldVariables.get(world).PlayerFacing == 1) {
					{
						Entity _ent = entity;
						_ent.setYRot(0);
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				} else if (FnafModModVariables.WorldVariables.get(world).PlayerFacing == 2) {
					{
						Entity _ent = entity;
						_ent.setYRot(-90);
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				} else if (FnafModModVariables.WorldVariables.get(world).PlayerFacing == 3) {
					{
						Entity _ent = entity;
						_ent.setYRot(180);
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				} else if (FnafModModVariables.WorldVariables.get(world).PlayerFacing == 4) {
					{
						Entity _ent = entity;
						_ent.setYRot(90);
						_ent.setXRot(0);
						_ent.setYBodyRot(_ent.getYRot());
						_ent.setYHeadRot(_ent.getYRot());
						_ent.yRotO = _ent.getYRot();
						_ent.xRotO = _ent.getXRot();
						if (_ent instanceof LivingEntity _entity) {
							_entity.yBodyRotO = _entity.getYRot();
							_entity.yHeadRotO = _entity.getYRot();
						}
					}
				}
			}
		}
	}
}
