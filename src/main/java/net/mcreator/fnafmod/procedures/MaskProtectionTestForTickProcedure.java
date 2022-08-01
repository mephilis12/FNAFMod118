package net.mcreator.fnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.init.FnafModModItems;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MaskProtectionTestForTickProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean Exit = false;
		Exit = true;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.FREDDY_MASK_HELMET.get()) {
					Exit = false;
				}
				if (entityiterator instanceof Player
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.SPRING_LOCK_SUIT_HELMET.get()
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.SPRING_LOCK_SUIT_CHESTPLATE.get()
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.SPRING_LOCK_SUIT_LEGGINGS.get()
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.SPRING_LOCK_SUIT_BOOTS.get()) {
					Exit = false;
				}
				if (entityiterator instanceof Player
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_HELMET.get()
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_CHESTPLATE.get()
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_LEGGINGS.get()
						&& (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
								.getItem() == FnafModModItems.FREDBEAR_SPRING_LOCK_SUIT_BOOTS.get()) {
					Exit = false;
				}
			}
		}
		return Exit;
	}
}
