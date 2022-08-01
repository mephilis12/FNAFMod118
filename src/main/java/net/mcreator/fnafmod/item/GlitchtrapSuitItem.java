
package net.mcreator.fnafmod.item;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.client.IItemRenderProperties;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.init.FnafModModTabs;
import net.mcreator.fnafmod.client.model.ModelGlitchtrap_Mask;

import java.util.Map;
import java.util.Collections;

public abstract class GlitchtrapSuitItem extends ArmorItem {
	public GlitchtrapSuitItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{0, 0, 0, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "glitchtrap_suit";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends GlitchtrapSuitItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_ITEMS));
		}

		public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
			consumer.accept(new IItemRenderProperties() {
				@Override
				public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("head",
							new ModelGlitchtrap_Mask(Minecraft.getInstance().getEntityModels().bakeLayer(ModelGlitchtrap_Mask.LAYER_LOCATION)).Head,
							"hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fnaf_mod:textures/glitchtrap_mask.png";
		}
	}

	public static class Chestplate extends GlitchtrapSuitItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fnaf_mod:textures/glitchtrap_1.png";
		}
	}

	public static class Leggings extends GlitchtrapSuitItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fnaf_mod:textures/glitchtrap_2.png";
		}
	}

	public static class Boots extends GlitchtrapSuitItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_ITEMS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "fnaf_mod:textures/glitchtrap_1.png";
		}
	}
}
