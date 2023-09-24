
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.fnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.fnafmod.entity.WitheredFreddyEntity;
import net.mcreator.fnafmod.entity.WitheredFoxyEntity;
import net.mcreator.fnafmod.entity.WitheredChicaEntity;
import net.mcreator.fnafmod.entity.WitheredBonnieEntity;
import net.mcreator.fnafmod.entity.UnwitheredFreddyEntity;
import net.mcreator.fnafmod.entity.UnwitheredFoxyEntity;
import net.mcreator.fnafmod.entity.UnwitheredChicaEntity;
import net.mcreator.fnafmod.entity.UnwitheredBonnieEntity;
import net.mcreator.fnafmod.entity.ToyFreddyEntity;
import net.mcreator.fnafmod.entity.ToyFoxyEntity;
import net.mcreator.fnafmod.entity.ToyChicaEntity;
import net.mcreator.fnafmod.entity.ToyBoxEntity;
import net.mcreator.fnafmod.entity.ToyBonnieEntity;
import net.mcreator.fnafmod.entity.TheCrooblerEntity;
import net.mcreator.fnafmod.entity.StatueFreddyEntity;
import net.mcreator.fnafmod.entity.StatueFoxyEntity;
import net.mcreator.fnafmod.entity.StatueChicaEntity;
import net.mcreator.fnafmod.entity.StatueBonnieEntity;
import net.mcreator.fnafmod.entity.StandingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.entity.SpringtrapEntity;
import net.mcreator.fnafmod.entity.SpringlockedZombieFredbearEntity;
import net.mcreator.fnafmod.entity.SpringLockedZombieSpringBonnieEntity;
import net.mcreator.fnafmod.entity.SpringBonnieCutOutEntity;
import net.mcreator.fnafmod.entity.SpringBonnieAnimatronicEntity;
import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;
import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.entity.SittingSpringBonnieEntity;
import net.mcreator.fnafmod.entity.SittingPlushtrapEntity;
import net.mcreator.fnafmod.entity.SittingNightmareBBEntity;
import net.mcreator.fnafmod.entity.SittingFredbearEntity;
import net.mcreator.fnafmod.entity.SittingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.entity.ShadowFreddyStandingEntity;
import net.mcreator.fnafmod.entity.ShadowFreddyEntity;
import net.mcreator.fnafmod.entity.ShadowBonnieEntity;
import net.mcreator.fnafmod.entity.PuppetEntity;
import net.mcreator.fnafmod.entity.PlushtrapToyEntity;
import net.mcreator.fnafmod.entity.PlushtrapEntity;
import net.mcreator.fnafmod.entity.PhantomPuppetEntity;
import net.mcreator.fnafmod.entity.PhantomMangleEntity;
import net.mcreator.fnafmod.entity.PhantomFreddyEntity;
import net.mcreator.fnafmod.entity.PhantomFoxyEntity;
import net.mcreator.fnafmod.entity.PhantomChicaEntity;
import net.mcreator.fnafmod.entity.PhantomBBEntity;
import net.mcreator.fnafmod.entity.PatPatEntity;
import net.mcreator.fnafmod.entity.PassiveSpringBonnieEntity;
import net.mcreator.fnafmod.entity.PassiveGoldieEntity;
import net.mcreator.fnafmod.entity.PassiveFreddyEntity;
import net.mcreator.fnafmod.entity.PassiveFredbearEntity;
import net.mcreator.fnafmod.entity.PassiveFoxyEntity;
import net.mcreator.fnafmod.entity.PassiveChicaEntity;
import net.mcreator.fnafmod.entity.PassiveBonnieEntity;
import net.mcreator.fnafmod.entity.OfficeChairEntity;
import net.mcreator.fnafmod.entity.NightmarionneEntity;
import net.mcreator.fnafmod.entity.NightmarioneStatueEntity;
import net.mcreator.fnafmod.entity.NightmareMangleEntity;
import net.mcreator.fnafmod.entity.NightmareFreddyStatueEntity;
import net.mcreator.fnafmod.entity.NightmareFreddyEntity;
import net.mcreator.fnafmod.entity.NightmareFredbearStatueEntity;
import net.mcreator.fnafmod.entity.NightmareFredbearEntity;
import net.mcreator.fnafmod.entity.NightmareFoxyStatueEntity;
import net.mcreator.fnafmod.entity.NightmareFoxyEntity;
import net.mcreator.fnafmod.entity.NightmareEntity;
import net.mcreator.fnafmod.entity.NightmareChicaStatueEntity;
import net.mcreator.fnafmod.entity.NightmareChicaEntity;
import net.mcreator.fnafmod.entity.NightmareBonnieStatueEntity;
import net.mcreator.fnafmod.entity.NightmareBonnieEntity;
import net.mcreator.fnafmod.entity.NightmareBBEntity;
import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.entity.MangleSittingEntity;
import net.mcreator.fnafmod.entity.MangleEntity;
import net.mcreator.fnafmod.entity.JackOChicaEntity;
import net.mcreator.fnafmod.entity.JackOBonnieEntity;
import net.mcreator.fnafmod.entity.JJEntity;
import net.mcreator.fnafmod.entity.HangingCameraEntity;
import net.mcreator.fnafmod.entity.GoldenFreddyEntity;
import net.mcreator.fnafmod.entity.GlitchBonnieCutOutEntity;
import net.mcreator.fnafmod.entity.GlitchBonnieAnimatronicEntity;
import net.mcreator.fnafmod.entity.FullHostileFreddyEntity;
import net.mcreator.fnafmod.entity.FullHostileFoxyEntity;
import net.mcreator.fnafmod.entity.FullHostileChicaEntity;
import net.mcreator.fnafmod.entity.FullHostileBonnieEntity;
import net.mcreator.fnafmod.entity.FreddyStandEntity;
import net.mcreator.fnafmod.entity.FreddyFazbearEntity;
import net.mcreator.fnafmod.entity.FreddlesEntity;
import net.mcreator.fnafmod.entity.FredbearsFreddyEntity;
import net.mcreator.fnafmod.entity.FredbearsFoxyEntity;
import net.mcreator.fnafmod.entity.FredbearsChicaEntity;
import net.mcreator.fnafmod.entity.FredbearsBonnieEntity;
import net.mcreator.fnafmod.entity.FredbearCutOutEntity;
import net.mcreator.fnafmod.entity.FredbearAnimatronicEntity;
import net.mcreator.fnafmod.entity.FoxyPirateEntity;
import net.mcreator.fnafmod.entity.EndoSkeletonEntity;
import net.mcreator.fnafmod.entity.Endo02Entity;
import net.mcreator.fnafmod.entity.DedWitheredFreddyEntity;
import net.mcreator.fnafmod.entity.DaytimeChicaEntity;
import net.mcreator.fnafmod.entity.DayTimeWitheredFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimePuppetEntity;
import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimeBBEntity;
import net.mcreator.fnafmod.entity.CryingChildEntity;
import net.mcreator.fnafmod.entity.CrawlingToyFoxyEntity;
import net.mcreator.fnafmod.entity.CrawlingToyChicaEntity;
import net.mcreator.fnafmod.entity.CrawlingToyBonnieEntity;
import net.mcreator.fnafmod.entity.CrawlingSpringtrapEntity;
import net.mcreator.fnafmod.entity.CrawlingMangleEntity;
import net.mcreator.fnafmod.entity.ChicaChickenEntity;
import net.mcreator.fnafmod.entity.CameraEntity;
import net.mcreator.fnafmod.entity.BooletEntity;
import net.mcreator.fnafmod.entity.BonnieStandEntity;
import net.mcreator.fnafmod.entity.BonnieBunnyEntity;
import net.mcreator.fnafmod.entity.BBEntity;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FnafModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FnafModMod.MODID);
	public static final RegistryObject<EntityType<FreddyStandEntity>> FREDDY_STAND = register("freddy_stand",
			EntityType.Builder.<FreddyStandEntity>of(FreddyStandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyStandEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BonnieStandEntity>> BONNIE_STAND = register("bonnie_stand",
			EntityType.Builder.<BonnieStandEntity>of(BonnieStandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BonnieStandEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyBoxEntity>> TOY_BOX = register("toy_box",
			EntityType.Builder.<ToyBoxEntity>of(ToyBoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToyBoxEntity::new)

					.sized(1f, 1.5f));
	public static final RegistryObject<EntityType<CameraEntity>> CAMERA = register("camera",
			EntityType.Builder.<CameraEntity>of(CameraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CameraEntity::new).fireImmune().sized(0.6f, 0.4f));
	public static final RegistryObject<EntityType<HangingCameraEntity>> HANGING_CAMERA = register("hanging_camera", EntityType.Builder.<HangingCameraEntity>of(HangingCameraEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HangingCameraEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<SpringlockedZombieFredbearEntity>> SPRINGLOCKED_ZOMBIE_FREDBEAR = register("springlocked_zombie_fredbear",
			EntityType.Builder.<SpringlockedZombieFredbearEntity>of(SpringlockedZombieFredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SpringlockedZombieFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpringLockedZombieSpringBonnieEntity>> SPRING_LOCKED_ZOMBIE_SPRING_BONNIE = register("spring_locked_zombie_spring_bonnie",
			EntityType.Builder.<SpringLockedZombieSpringBonnieEntity>of(SpringLockedZombieSpringBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SpringLockedZombieSpringBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomFreddyEntity>> PHANTOM_FREDDY = register("phantom_freddy", EntityType.Builder.<PhantomFreddyEntity>of(PhantomFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomFreddyEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmarioneStatueEntity>> NIGHTMARIONE_STATUE = register("nightmarione_statue",
			EntityType.Builder.<NightmarioneStatueEntity>of(NightmarioneStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmarioneStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FredbearCutOutEntity>> FREDBEAR_CUT_OUT = register("fredbear_cut_out",
			EntityType.Builder.<FredbearCutOutEntity>of(FredbearCutOutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearCutOutEntity::new)

					.sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<SpringBonnieCutOutEntity>> SPRING_BONNIE_CUT_OUT = register("spring_bonnie_cut_out",
			EntityType.Builder.<SpringBonnieCutOutEntity>of(SpringBonnieCutOutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringBonnieCutOutEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<CryingChildEntity>> CRYING_CHILD = register("crying_child", EntityType.Builder.<CryingChildEntity>of(CryingChildEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CryingChildEntity::new).fireImmune().sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<WitheredFreddyEntity>> WITHERED_FREDDY = register("withered_freddy",
			EntityType.Builder.<WitheredFreddyEntity>of(WitheredFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredFreddyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<UnwitheredFreddyEntity>> UNWITHERED_FREDDY = register("unwithered_freddy",
			EntityType.Builder.<UnwitheredFreddyEntity>of(UnwitheredFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UnwitheredFreddyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WitheredGoldenFreddyEntity>> WITHERED_GOLDEN_FREDDY = register("withered_golden_freddy",
			EntityType.Builder.<WitheredGoldenFreddyEntity>of(WitheredGoldenFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3)
					.setCustomClientFactory(WitheredGoldenFreddyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<PhantomFoxyEntity>> PHANTOM_FOXY = register("phantom_foxy", EntityType.Builder.<PhantomFoxyEntity>of(PhantomFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomFoxyEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredFoxyEntity>> WITHERED_FOXY = register("withered_foxy",
			EntityType.Builder.<WitheredFoxyEntity>of(WitheredFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredFoxyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WitheredBonnieEntity>> WITHERED_BONNIE = register("withered_bonnie",
			EntityType.Builder.<WitheredBonnieEntity>of(WitheredBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredBonnieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WitheredChicaEntity>> WITHERED_CHICA = register("withered_chica",
			EntityType.Builder.<WitheredChicaEntity>of(WitheredChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredChicaEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<UnwitheredFoxyEntity>> UNWITHERED_FOXY = register("unwithered_foxy",
			EntityType.Builder.<UnwitheredFoxyEntity>of(UnwitheredFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UnwitheredFoxyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<UnwitheredBonnieEntity>> UNWITHERED_BONNIE = register("unwithered_bonnie",
			EntityType.Builder.<UnwitheredBonnieEntity>of(UnwitheredBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UnwitheredBonnieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<UnwitheredChicaEntity>> UNWITHERED_CHICA = register("unwithered_chica",
			EntityType.Builder.<UnwitheredChicaEntity>of(UnwitheredChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UnwitheredChicaEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<FredbearAnimatronicEntity>> FREDBEAR_ANIMATRONIC = register("fredbear_animatronic",
			EntityType.Builder.<FredbearAnimatronicEntity>of(FredbearAnimatronicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearAnimatronicEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SpringBonnieAnimatronicEntity>> SPRING_BONNIE_ANIMATRONIC = register("spring_bonnie_animatronic",
			EntityType.Builder.<SpringBonnieAnimatronicEntity>of(SpringBonnieAnimatronicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SpringBonnieAnimatronicEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<GoldenFreddyEntity>> GOLDEN_FREDDY = register("golden_freddy",
			EntityType.Builder.<GoldenFreddyEntity>of(GoldenFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3).setCustomClientFactory(GoldenFreddyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<SittingSpringBonnieEntity>> SITTING_SPRING_BONNIE = register("sitting_spring_bonnie",
			EntityType.Builder.<SittingSpringBonnieEntity>of(SittingSpringBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3).setCustomClientFactory(SittingSpringBonnieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<FreddlesEntity>> FREDDLES = register("freddles",
			EntityType.Builder.<FreddlesEntity>of(FreddlesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddlesEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<SittingFredbearEntity>> SITTING_FREDBEAR = register("sitting_fredbear",
			EntityType.Builder.<SittingFredbearEntity>of(SittingFredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SittingFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FredbearsFreddyEntity>> FREDBEARS_FREDDY = register("fredbears_freddy",
			EntityType.Builder.<FredbearsFreddyEntity>of(FredbearsFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearsFreddyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<FredbearsBonnieEntity>> FREDBEARS_BONNIE = register("fredbears_bonnie",
			EntityType.Builder.<FredbearsBonnieEntity>of(FredbearsBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearsBonnieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<FredbearsChicaEntity>> FREDBEARS_CHICA = register("fredbears_chica",
			EntityType.Builder.<FredbearsChicaEntity>of(FredbearsChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearsChicaEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<FredbearsFoxyEntity>> FREDBEARS_FOXY = register("fredbears_foxy",
			EntityType.Builder.<FredbearsFoxyEntity>of(FredbearsFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearsFoxyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<PlushtrapToyEntity>> PLUSHTRAP_TOY = register("plushtrap_toy",
			EntityType.Builder.<PlushtrapToyEntity>of(PlushtrapToyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlushtrapToyEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<ShadowFreddyStandingEntity>> SHADOW_FREDDY_STANDING = register("shadow_freddy_standing",
			EntityType.Builder.<ShadowFreddyStandingEntity>of(ShadowFreddyStandingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ShadowFreddyStandingEntity::new)

					.sized(0.4f, 1.8f));
	public static final RegistryObject<EntityType<ShadowFreddyEntity>> SHADOW_FREDDY = register("shadow_freddy",
			EntityType.Builder.<ShadowFreddyEntity>of(ShadowFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyFreddyEntity>> TOY_FREDDY = register("toy_freddy",
			EntityType.Builder.<ToyFreddyEntity>of(ToyFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToyFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyBonnieEntity>> TOY_BONNIE = register("toy_bonnie",
			EntityType.Builder.<ToyBonnieEntity>of(ToyBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToyBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyChicaEntity>> TOY_CHICA = register("toy_chica",
			EntityType.Builder.<ToyChicaEntity>of(ToyChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToyChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightimeToyChicaEntity>> NIGHTIME_TOY_CHICA = register("nightime_toy_chica",
			EntityType.Builder.<NightimeToyChicaEntity>of(NightimeToyChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightimeToyChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MangleEntity>> MANGLE = register("mangle",
			EntityType.Builder.<MangleEntity>of(MangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MangleEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<BBEntity>> BB = register("bb",
			EntityType.Builder.<BBEntity>of(BBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BBEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PuppetEntity>> PUPPET = register("puppet",
			EntityType.Builder.<PuppetEntity>of(PuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PuppetEntity::new)

					.sized(0.6f, 2.3f));
	public static final RegistryObject<EntityType<ToyFoxyEntity>> TOY_FOXY = register("toy_foxy",
			EntityType.Builder.<ToyFoxyEntity>of(ToyFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToyFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JJEntity>> JJ = register("jj",
			EntityType.Builder.<JJEntity>of(JJEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JJEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<ShadowBonnieEntity>> SHADOW_BONNIE = register("shadow_bonnie",
			EntityType.Builder.<ShadowBonnieEntity>of(ShadowBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowBonnieEntity::new)

					.sized(0.9f, 1.8f));
	public static final RegistryObject<EntityType<EndoSkeletonEntity>> ENDO_SKELETON = register("endo_skeleton",
			EntityType.Builder.<EndoSkeletonEntity>of(EndoSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndoSkeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Endo02Entity>> ENDO_02 = register("endo_02",
			EntityType.Builder.<Endo02Entity>of(Endo02Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Endo02Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MangleSittingEntity>> MANGLE_SITTING = register("mangle_sitting",
			EntityType.Builder.<MangleSittingEntity>of(MangleSittingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MangleSittingEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeToyFreddyEntity>> DAY_TIME_TOY_FREDDY = register("day_time_toy_freddy",
			EntityType.Builder.<DayTimeToyFreddyEntity>of(DayTimeToyFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeToyFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeToyBonnieEntity>> DAY_TIME_TOY_BONNIE = register("day_time_toy_bonnie",
			EntityType.Builder.<DayTimeToyBonnieEntity>of(DayTimeToyBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeToyBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeToyFoxyEntity>> DAY_TIME_TOY_FOXY = register("day_time_toy_foxy",
			EntityType.Builder.<DayTimeToyFoxyEntity>of(DayTimeToyFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeToyFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomChicaEntity>> PHANTOM_CHICA = register("phantom_chica", EntityType.Builder.<PhantomChicaEntity>of(PhantomChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomChicaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomBBEntity>> PHANTOM_BB = register("phantom_bb", EntityType.Builder.<PhantomBBEntity>of(PhantomBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(PhantomBBEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomPuppetEntity>> PHANTOM_PUPPET = register("phantom_puppet", EntityType.Builder.<PhantomPuppetEntity>of(PhantomPuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomPuppetEntity::new).fireImmune().sized(0.6f, 2.3f));
	public static final RegistryObject<EntityType<PhantomMangleEntity>> PHANTOM_MANGLE = register("phantom_mangle", EntityType.Builder.<PhantomMangleEntity>of(PhantomMangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomMangleEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<SittingPlushtrapEntity>> SITTING_PLUSHTRAP = register("sitting_plushtrap",
			EntityType.Builder.<SittingPlushtrapEntity>of(SittingPlushtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SittingPlushtrapEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<SittingNightmareBBEntity>> SITTING_NIGHTMARE_BB = register("sitting_nightmare_bb",
			EntityType.Builder.<SittingNightmareBBEntity>of(SittingNightmareBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SittingNightmareBBEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<NightmareFreddyEntity>> NIGHTMARE_FREDDY = register("nightmare_freddy",
			EntityType.Builder.<NightmareFreddyEntity>of(NightmareFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareChicaEntity>> NIGHTMARE_CHICA = register("nightmare_chica",
			EntityType.Builder.<NightmareChicaEntity>of(NightmareChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareBonnieEntity>> NIGHTMARE_BONNIE = register("nightmare_bonnie",
			EntityType.Builder.<NightmareBonnieEntity>of(NightmareBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareFoxyEntity>> NIGHTMARE_FOXY = register("nightmare_foxy",
			EntityType.Builder.<NightmareFoxyEntity>of(NightmareFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareFredbearEntity>> NIGHTMARE_FREDBEAR = register("nightmare_fredbear",
			EntityType.Builder.<NightmareFredbearEntity>of(NightmareFredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmarionneEntity>> NIGHTMARIONNE = register("nightmarionne",
			EntityType.Builder.<NightmarionneEntity>of(NightmarionneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmarionneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareEntity>> NIGHTMARE = register("nightmare",
			EntityType.Builder.<NightmareEntity>of(NightmareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JackOBonnieEntity>> JACK_O_BONNIE = register("jack_o_bonnie",
			EntityType.Builder.<JackOBonnieEntity>of(JackOBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JackOBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JackOChicaEntity>> JACK_O_CHICA = register("jack_o_chica",
			EntityType.Builder.<JackOChicaEntity>of(JackOChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JackOChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareMangleEntity>> NIGHTMARE_MANGLE = register("nightmare_mangle",
			EntityType.Builder.<NightmareMangleEntity>of(NightmareMangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareMangleEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpringtrapEntity>> SPRINGTRAP = register("springtrap",
			EntityType.Builder.<SpringtrapEntity>of(SpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringtrapEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<NightmareBonnieStatueEntity>> NIGHTMARE_BONNIE_STATUE = register("nightmare_bonnie_statue",
			EntityType.Builder.<NightmareBonnieStatueEntity>of(NightmareBonnieStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(NightmareBonnieStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareChicaStatueEntity>> NIGHTMARE_CHICA_STATUE = register("nightmare_chica_statue",
			EntityType.Builder.<NightmareChicaStatueEntity>of(NightmareChicaStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(NightmareChicaStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareFreddyStatueEntity>> NIGHTMARE_FREDDY_STATUE = register("nightmare_freddy_statue",
			EntityType.Builder.<NightmareFreddyStatueEntity>of(NightmareFreddyStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(NightmareFreddyStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareFoxyStatueEntity>> NIGHTMARE_FOXY_STATUE = register("nightmare_foxy_statue",
			EntityType.Builder.<NightmareFoxyStatueEntity>of(NightmareFoxyStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareFoxyStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightmareFredbearStatueEntity>> NIGHTMARE_FREDBEAR_STATUE = register("nightmare_fredbear_statue",
			EntityType.Builder.<NightmareFredbearStatueEntity>of(NightmareFredbearStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(NightmareFredbearStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TheCrooblerEntity>> THE_GROOBLER = register("the_groobler", EntityType.Builder.<TheCrooblerEntity>of(TheCrooblerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheCrooblerEntity::new).fireImmune().sized(0.5f, 1.8f));
	public static final RegistryObject<EntityType<PatPatEntity>> PAT_PAT = register("pat_pat",
			EntityType.Builder.<PatPatEntity>of(PatPatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PatPatEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OfficeChairEntity>> OFFICE_CHAIR = register("office_chair",
			EntityType.Builder.<OfficeChairEntity>of(OfficeChairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OfficeChairEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<GlitchBonnieCutOutEntity>> GLITCH_BONNIE_CUT_OUT = register("glitch_bonnie_cut_out",
			EntityType.Builder.<GlitchBonnieCutOutEntity>of(GlitchBonnieCutOutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlitchBonnieCutOutEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DedWitheredFreddyEntity>> DED_WITHERED_FREDDY = register("ded_withered_freddy",
			EntityType.Builder.<DedWitheredFreddyEntity>of(DedWitheredFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DedWitheredFreddyEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<DayTimeWitheredFoxyEntity>> DAY_TIME_WITHERED_FOXY = register("day_time_withered_foxy",
			EntityType.Builder.<DayTimeWitheredFoxyEntity>of(DayTimeWitheredFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeWitheredFoxyEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<SittingWitheredBonnieEntity>> SITTING_WITHERED_BONNIE = register("sitting_withered_bonnie",
			EntityType.Builder.<SittingWitheredBonnieEntity>of(SittingWitheredBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SittingWitheredBonnieEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<SittingWitheredChicaEntity>> SITTING_WITHERED_CHICA = register("sitting_withered_chica",
			EntityType.Builder.<SittingWitheredChicaEntity>of(SittingWitheredChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SittingWitheredChicaEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<FreddyFazbearEntity>> FREDDY_FAZBEAR = register("freddy_fazbear",
			EntityType.Builder.<FreddyFazbearEntity>of(FreddyFazbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyFazbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BonnieBunnyEntity>> BONNIE_BUNNY = register("bonnie_bunny",
			EntityType.Builder.<BonnieBunnyEntity>of(BonnieBunnyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BonnieBunnyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChicaChickenEntity>> CHICA_CHICKEN = register("chica_chicken",
			EntityType.Builder.<ChicaChickenEntity>of(ChicaChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChicaChickenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FoxyPirateEntity>> FOXY_PIRATE = register("foxy_pirate",
			EntityType.Builder.<FoxyPirateEntity>of(FoxyPirateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FoxyPirateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeFreddyEntity>> DAY_TIME_FREDDY = register("day_time_freddy",
			EntityType.Builder.<DayTimeFreddyEntity>of(DayTimeFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DaytimeChicaEntity>> DAYTIME_CHICA = register("daytime_chica",
			EntityType.Builder.<DaytimeChicaEntity>of(DaytimeChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DaytimeChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeBonnieEntity>> DAY_TIME_BONNIE = register("day_time_bonnie",
			EntityType.Builder.<DayTimeBonnieEntity>of(DayTimeBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeFoxyEntity>> DAY_TIME_FOXY = register("day_time_foxy",
			EntityType.Builder.<DayTimeFoxyEntity>of(DayTimeFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GlitchBonnieAnimatronicEntity>> GLITCH_BONNIE_ANIMATRONIC = register("glitch_bonnie_animatronic",
			EntityType.Builder.<GlitchBonnieAnimatronicEntity>of(GlitchBonnieAnimatronicEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GlitchBonnieAnimatronicEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<StatueFreddyEntity>> STATUE_FREDDY = register("statue_freddy",
			EntityType.Builder.<StatueFreddyEntity>of(StatueFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3).setCustomClientFactory(StatueFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StatueChicaEntity>> STATUE_CHICA = register("statue_chica",
			EntityType.Builder.<StatueChicaEntity>of(StatueChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3).setCustomClientFactory(StatueChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StatueFoxyEntity>> STATUE_FOXY = register("statue_foxy",
			EntityType.Builder.<StatueFoxyEntity>of(StatueFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3).setCustomClientFactory(StatueFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StatueBonnieEntity>> STATUE_BONNIE = register("statue_bonnie",
			EntityType.Builder.<StatueBonnieEntity>of(StatueBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3).setCustomClientFactory(StatueBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileFreddyEntity>> FULL_HOSTILE_FREDDY = register("full_hostile_freddy",
			EntityType.Builder.<FullHostileFreddyEntity>of(FullHostileFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileChicaEntity>> FULL_HOSTILE_CHICA = register("full_hostile_chica",
			EntityType.Builder.<FullHostileChicaEntity>of(FullHostileChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileChicaEntity::new)

					.sized(0.4f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileFoxyEntity>> FULL_HOSTILE_FOXY = register("full_hostile_foxy",
			EntityType.Builder.<FullHostileFoxyEntity>of(FullHostileFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileBonnieEntity>> FULL_HOSTILE_BONNIE = register("full_hostile_bonnie",
			EntityType.Builder.<FullHostileBonnieEntity>of(FullHostileBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveFreddyEntity>> PASSIVE_FREDDY = register("passive_freddy",
			EntityType.Builder.<PassiveFreddyEntity>of(PassiveFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveGoldieEntity>> PASSIVE_GOLDIE = register("passive_goldie",
			EntityType.Builder.<PassiveGoldieEntity>of(PassiveGoldieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveGoldieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveFredbearEntity>> PASSIVE_FREDBEAR = register("passive_fredbear",
			EntityType.Builder.<PassiveFredbearEntity>of(PassiveFredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveBonnieEntity>> PASSIVE_BONNIE = register("passive_bonnie",
			EntityType.Builder.<PassiveBonnieEntity>of(PassiveBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveSpringBonnieEntity>> PASSIVE_SPRING_BONNIE = register("passive_spring_bonnie",
			EntityType.Builder.<PassiveSpringBonnieEntity>of(PassiveSpringBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveSpringBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveChicaEntity>> PASSIVE_CHICA = register("passive_chica",
			EntityType.Builder.<PassiveChicaEntity>of(PassiveChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveFoxyEntity>> PASSIVE_FOXY = register("passive_foxy",
			EntityType.Builder.<PassiveFoxyEntity>of(PassiveFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CrawlingToyBonnieEntity>> CRAWLING_TOY_BONNIE = register("crawling_toy_bonnie",
			EntityType.Builder.<CrawlingToyBonnieEntity>of(CrawlingToyBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingToyBonnieEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<CrawlingMangleEntity>> CRAWLING_MANGLE = register("crawling_mangle",
			EntityType.Builder.<CrawlingMangleEntity>of(CrawlingMangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingMangleEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<CrawlingToyFoxyEntity>> CRAWLING_TOY_FOXY = register("crawling_toy_foxy",
			EntityType.Builder.<CrawlingToyFoxyEntity>of(CrawlingToyFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingToyFoxyEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<CrawlingToyChicaEntity>> CRAWLING_TOY_CHICA = register("crawling_toy_chica",
			EntityType.Builder.<CrawlingToyChicaEntity>of(CrawlingToyChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingToyChicaEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<DayTimePuppetEntity>> DAY_TIME_PUPPET = register("day_time_puppet",
			EntityType.Builder.<DayTimePuppetEntity>of(DayTimePuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimePuppetEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeBBEntity>> DAY_TIME_BB = register("day_time_bb",
			EntityType.Builder.<DayTimeBBEntity>of(DayTimeBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeBBEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PlushtrapEntity>> PLUSHTRAP = register("plushtrap",
			EntityType.Builder.<PlushtrapEntity>of(PlushtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlushtrapEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<NightmareBBEntity>> NIGHTMARE_BB = register("nightmare_bb",
			EntityType.Builder.<NightmareBBEntity>of(NightmareBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightmareBBEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SittingDaytimeSpringtrapEntity>> SITTING_DAYTIME_SPRINGTRAP = register("sitting_daytime_springtrap",
			EntityType.Builder.<SittingDaytimeSpringtrapEntity>of(SittingDaytimeSpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SittingDaytimeSpringtrapEntity::new)

					.sized(0.7f, 1f));
	public static final RegistryObject<EntityType<StandingDaytimeSpringtrapEntity>> STANDING_DAYTIME_SPRINGTRAP = register("standing_daytime_springtrap",
			EntityType.Builder.<StandingDaytimeSpringtrapEntity>of(StandingDaytimeSpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(StandingDaytimeSpringtrapEntity::new)

					.sized(0.6f, 2.2f));
	public static final RegistryObject<EntityType<CrawlingSpringtrapEntity>> CRAWLING_SPRINGTRAP = register("crawling_springtrap",
			EntityType.Builder.<CrawlingSpringtrapEntity>of(CrawlingSpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingSpringtrapEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<BooletEntity>> BOOLET = register("projectile_boolet",
			EntityType.Builder.<BooletEntity>of(BooletEntity::new, MobCategory.MISC).setCustomClientFactory(BooletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FreddyStandEntity.init();
			BonnieStandEntity.init();
			ToyBoxEntity.init();
			CameraEntity.init();
			HangingCameraEntity.init();
			SpringlockedZombieFredbearEntity.init();
			SpringLockedZombieSpringBonnieEntity.init();
			PhantomFreddyEntity.init();
			NightmarioneStatueEntity.init();
			FredbearCutOutEntity.init();
			SpringBonnieCutOutEntity.init();
			CryingChildEntity.init();
			WitheredFreddyEntity.init();
			UnwitheredFreddyEntity.init();
			WitheredGoldenFreddyEntity.init();
			PhantomFoxyEntity.init();
			WitheredFoxyEntity.init();
			WitheredBonnieEntity.init();
			WitheredChicaEntity.init();
			UnwitheredFoxyEntity.init();
			UnwitheredBonnieEntity.init();
			UnwitheredChicaEntity.init();
			FredbearAnimatronicEntity.init();
			SpringBonnieAnimatronicEntity.init();
			GoldenFreddyEntity.init();
			SittingSpringBonnieEntity.init();
			FreddlesEntity.init();
			SittingFredbearEntity.init();
			FredbearsFreddyEntity.init();
			FredbearsBonnieEntity.init();
			FredbearsChicaEntity.init();
			FredbearsFoxyEntity.init();
			PlushtrapToyEntity.init();
			ShadowFreddyStandingEntity.init();
			ShadowFreddyEntity.init();
			ToyFreddyEntity.init();
			ToyBonnieEntity.init();
			ToyChicaEntity.init();
			NightimeToyChicaEntity.init();
			MangleEntity.init();
			BBEntity.init();
			PuppetEntity.init();
			ToyFoxyEntity.init();
			JJEntity.init();
			ShadowBonnieEntity.init();
			EndoSkeletonEntity.init();
			Endo02Entity.init();
			MangleSittingEntity.init();
			DayTimeToyFreddyEntity.init();
			DayTimeToyBonnieEntity.init();
			DayTimeToyFoxyEntity.init();
			PhantomChicaEntity.init();
			PhantomBBEntity.init();
			PhantomPuppetEntity.init();
			PhantomMangleEntity.init();
			SittingPlushtrapEntity.init();
			SittingNightmareBBEntity.init();
			NightmareFreddyEntity.init();
			NightmareChicaEntity.init();
			NightmareBonnieEntity.init();
			NightmareFoxyEntity.init();
			NightmareFredbearEntity.init();
			NightmarionneEntity.init();
			NightmareEntity.init();
			JackOBonnieEntity.init();
			JackOChicaEntity.init();
			NightmareMangleEntity.init();
			SpringtrapEntity.init();
			NightmareBonnieStatueEntity.init();
			NightmareChicaStatueEntity.init();
			NightmareFreddyStatueEntity.init();
			NightmareFoxyStatueEntity.init();
			NightmareFredbearStatueEntity.init();
			TheCrooblerEntity.init();
			PatPatEntity.init();
			OfficeChairEntity.init();
			GlitchBonnieCutOutEntity.init();
			DedWitheredFreddyEntity.init();
			DayTimeWitheredFoxyEntity.init();
			SittingWitheredBonnieEntity.init();
			SittingWitheredChicaEntity.init();
			FreddyFazbearEntity.init();
			BonnieBunnyEntity.init();
			ChicaChickenEntity.init();
			FoxyPirateEntity.init();
			DayTimeFreddyEntity.init();
			DaytimeChicaEntity.init();
			DayTimeBonnieEntity.init();
			DayTimeFoxyEntity.init();
			GlitchBonnieAnimatronicEntity.init();
			StatueFreddyEntity.init();
			StatueChicaEntity.init();
			StatueFoxyEntity.init();
			StatueBonnieEntity.init();
			FullHostileFreddyEntity.init();
			FullHostileChicaEntity.init();
			FullHostileFoxyEntity.init();
			FullHostileBonnieEntity.init();
			PassiveFreddyEntity.init();
			PassiveGoldieEntity.init();
			PassiveFredbearEntity.init();
			PassiveBonnieEntity.init();
			PassiveSpringBonnieEntity.init();
			PassiveChicaEntity.init();
			PassiveFoxyEntity.init();
			CrawlingToyBonnieEntity.init();
			CrawlingMangleEntity.init();
			CrawlingToyFoxyEntity.init();
			CrawlingToyChicaEntity.init();
			DayTimePuppetEntity.init();
			DayTimeBBEntity.init();
			PlushtrapEntity.init();
			NightmareBBEntity.init();
			SittingDaytimeSpringtrapEntity.init();
			StandingDaytimeSpringtrapEntity.init();
			CrawlingSpringtrapEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FREDDY_STAND.get(), FreddyStandEntity.createAttributes().build());
		event.put(BONNIE_STAND.get(), BonnieStandEntity.createAttributes().build());
		event.put(TOY_BOX.get(), ToyBoxEntity.createAttributes().build());
		event.put(CAMERA.get(), CameraEntity.createAttributes().build());
		event.put(HANGING_CAMERA.get(), HangingCameraEntity.createAttributes().build());
		event.put(SPRINGLOCKED_ZOMBIE_FREDBEAR.get(), SpringlockedZombieFredbearEntity.createAttributes().build());
		event.put(SPRING_LOCKED_ZOMBIE_SPRING_BONNIE.get(), SpringLockedZombieSpringBonnieEntity.createAttributes().build());
		event.put(PHANTOM_FREDDY.get(), PhantomFreddyEntity.createAttributes().build());
		event.put(NIGHTMARIONE_STATUE.get(), NightmarioneStatueEntity.createAttributes().build());
		event.put(FREDBEAR_CUT_OUT.get(), FredbearCutOutEntity.createAttributes().build());
		event.put(SPRING_BONNIE_CUT_OUT.get(), SpringBonnieCutOutEntity.createAttributes().build());
		event.put(CRYING_CHILD.get(), CryingChildEntity.createAttributes().build());
		event.put(WITHERED_FREDDY.get(), WitheredFreddyEntity.createAttributes().build());
		event.put(UNWITHERED_FREDDY.get(), UnwitheredFreddyEntity.createAttributes().build());
		event.put(WITHERED_GOLDEN_FREDDY.get(), WitheredGoldenFreddyEntity.createAttributes().build());
		event.put(PHANTOM_FOXY.get(), PhantomFoxyEntity.createAttributes().build());
		event.put(WITHERED_FOXY.get(), WitheredFoxyEntity.createAttributes().build());
		event.put(WITHERED_BONNIE.get(), WitheredBonnieEntity.createAttributes().build());
		event.put(WITHERED_CHICA.get(), WitheredChicaEntity.createAttributes().build());
		event.put(UNWITHERED_FOXY.get(), UnwitheredFoxyEntity.createAttributes().build());
		event.put(UNWITHERED_BONNIE.get(), UnwitheredBonnieEntity.createAttributes().build());
		event.put(UNWITHERED_CHICA.get(), UnwitheredChicaEntity.createAttributes().build());
		event.put(FREDBEAR_ANIMATRONIC.get(), FredbearAnimatronicEntity.createAttributes().build());
		event.put(SPRING_BONNIE_ANIMATRONIC.get(), SpringBonnieAnimatronicEntity.createAttributes().build());
		event.put(GOLDEN_FREDDY.get(), GoldenFreddyEntity.createAttributes().build());
		event.put(SITTING_SPRING_BONNIE.get(), SittingSpringBonnieEntity.createAttributes().build());
		event.put(FREDDLES.get(), FreddlesEntity.createAttributes().build());
		event.put(SITTING_FREDBEAR.get(), SittingFredbearEntity.createAttributes().build());
		event.put(FREDBEARS_FREDDY.get(), FredbearsFreddyEntity.createAttributes().build());
		event.put(FREDBEARS_BONNIE.get(), FredbearsBonnieEntity.createAttributes().build());
		event.put(FREDBEARS_CHICA.get(), FredbearsChicaEntity.createAttributes().build());
		event.put(FREDBEARS_FOXY.get(), FredbearsFoxyEntity.createAttributes().build());
		event.put(PLUSHTRAP_TOY.get(), PlushtrapToyEntity.createAttributes().build());
		event.put(SHADOW_FREDDY_STANDING.get(), ShadowFreddyStandingEntity.createAttributes().build());
		event.put(SHADOW_FREDDY.get(), ShadowFreddyEntity.createAttributes().build());
		event.put(TOY_FREDDY.get(), ToyFreddyEntity.createAttributes().build());
		event.put(TOY_BONNIE.get(), ToyBonnieEntity.createAttributes().build());
		event.put(TOY_CHICA.get(), ToyChicaEntity.createAttributes().build());
		event.put(NIGHTIME_TOY_CHICA.get(), NightimeToyChicaEntity.createAttributes().build());
		event.put(MANGLE.get(), MangleEntity.createAttributes().build());
		event.put(BB.get(), BBEntity.createAttributes().build());
		event.put(PUPPET.get(), PuppetEntity.createAttributes().build());
		event.put(TOY_FOXY.get(), ToyFoxyEntity.createAttributes().build());
		event.put(JJ.get(), JJEntity.createAttributes().build());
		event.put(SHADOW_BONNIE.get(), ShadowBonnieEntity.createAttributes().build());
		event.put(ENDO_SKELETON.get(), EndoSkeletonEntity.createAttributes().build());
		event.put(ENDO_02.get(), Endo02Entity.createAttributes().build());
		event.put(MANGLE_SITTING.get(), MangleSittingEntity.createAttributes().build());
		event.put(DAY_TIME_TOY_FREDDY.get(), DayTimeToyFreddyEntity.createAttributes().build());
		event.put(DAY_TIME_TOY_BONNIE.get(), DayTimeToyBonnieEntity.createAttributes().build());
		event.put(DAY_TIME_TOY_FOXY.get(), DayTimeToyFoxyEntity.createAttributes().build());
		event.put(PHANTOM_CHICA.get(), PhantomChicaEntity.createAttributes().build());
		event.put(PHANTOM_BB.get(), PhantomBBEntity.createAttributes().build());
		event.put(PHANTOM_PUPPET.get(), PhantomPuppetEntity.createAttributes().build());
		event.put(PHANTOM_MANGLE.get(), PhantomMangleEntity.createAttributes().build());
		event.put(SITTING_PLUSHTRAP.get(), SittingPlushtrapEntity.createAttributes().build());
		event.put(SITTING_NIGHTMARE_BB.get(), SittingNightmareBBEntity.createAttributes().build());
		event.put(NIGHTMARE_FREDDY.get(), NightmareFreddyEntity.createAttributes().build());
		event.put(NIGHTMARE_CHICA.get(), NightmareChicaEntity.createAttributes().build());
		event.put(NIGHTMARE_BONNIE.get(), NightmareBonnieEntity.createAttributes().build());
		event.put(NIGHTMARE_FOXY.get(), NightmareFoxyEntity.createAttributes().build());
		event.put(NIGHTMARE_FREDBEAR.get(), NightmareFredbearEntity.createAttributes().build());
		event.put(NIGHTMARIONNE.get(), NightmarionneEntity.createAttributes().build());
		event.put(NIGHTMARE.get(), NightmareEntity.createAttributes().build());
		event.put(JACK_O_BONNIE.get(), JackOBonnieEntity.createAttributes().build());
		event.put(JACK_O_CHICA.get(), JackOChicaEntity.createAttributes().build());
		event.put(NIGHTMARE_MANGLE.get(), NightmareMangleEntity.createAttributes().build());
		event.put(SPRINGTRAP.get(), SpringtrapEntity.createAttributes().build());
		event.put(NIGHTMARE_BONNIE_STATUE.get(), NightmareBonnieStatueEntity.createAttributes().build());
		event.put(NIGHTMARE_CHICA_STATUE.get(), NightmareChicaStatueEntity.createAttributes().build());
		event.put(NIGHTMARE_FREDDY_STATUE.get(), NightmareFreddyStatueEntity.createAttributes().build());
		event.put(NIGHTMARE_FOXY_STATUE.get(), NightmareFoxyStatueEntity.createAttributes().build());
		event.put(NIGHTMARE_FREDBEAR_STATUE.get(), NightmareFredbearStatueEntity.createAttributes().build());
		event.put(THE_GROOBLER.get(), TheCrooblerEntity.createAttributes().build());
		event.put(PAT_PAT.get(), PatPatEntity.createAttributes().build());
		event.put(OFFICE_CHAIR.get(), OfficeChairEntity.createAttributes().build());
		event.put(GLITCH_BONNIE_CUT_OUT.get(), GlitchBonnieCutOutEntity.createAttributes().build());
		event.put(DED_WITHERED_FREDDY.get(), DedWitheredFreddyEntity.createAttributes().build());
		event.put(DAY_TIME_WITHERED_FOXY.get(), DayTimeWitheredFoxyEntity.createAttributes().build());
		event.put(SITTING_WITHERED_BONNIE.get(), SittingWitheredBonnieEntity.createAttributes().build());
		event.put(SITTING_WITHERED_CHICA.get(), SittingWitheredChicaEntity.createAttributes().build());
		event.put(FREDDY_FAZBEAR.get(), FreddyFazbearEntity.createAttributes().build());
		event.put(BONNIE_BUNNY.get(), BonnieBunnyEntity.createAttributes().build());
		event.put(CHICA_CHICKEN.get(), ChicaChickenEntity.createAttributes().build());
		event.put(FOXY_PIRATE.get(), FoxyPirateEntity.createAttributes().build());
		event.put(DAY_TIME_FREDDY.get(), DayTimeFreddyEntity.createAttributes().build());
		event.put(DAYTIME_CHICA.get(), DaytimeChicaEntity.createAttributes().build());
		event.put(DAY_TIME_BONNIE.get(), DayTimeBonnieEntity.createAttributes().build());
		event.put(DAY_TIME_FOXY.get(), DayTimeFoxyEntity.createAttributes().build());
		event.put(GLITCH_BONNIE_ANIMATRONIC.get(), GlitchBonnieAnimatronicEntity.createAttributes().build());
		event.put(STATUE_FREDDY.get(), StatueFreddyEntity.createAttributes().build());
		event.put(STATUE_CHICA.get(), StatueChicaEntity.createAttributes().build());
		event.put(STATUE_FOXY.get(), StatueFoxyEntity.createAttributes().build());
		event.put(STATUE_BONNIE.get(), StatueBonnieEntity.createAttributes().build());
		event.put(FULL_HOSTILE_FREDDY.get(), FullHostileFreddyEntity.createAttributes().build());
		event.put(FULL_HOSTILE_CHICA.get(), FullHostileChicaEntity.createAttributes().build());
		event.put(FULL_HOSTILE_FOXY.get(), FullHostileFoxyEntity.createAttributes().build());
		event.put(FULL_HOSTILE_BONNIE.get(), FullHostileBonnieEntity.createAttributes().build());
		event.put(PASSIVE_FREDDY.get(), PassiveFreddyEntity.createAttributes().build());
		event.put(PASSIVE_GOLDIE.get(), PassiveGoldieEntity.createAttributes().build());
		event.put(PASSIVE_FREDBEAR.get(), PassiveFredbearEntity.createAttributes().build());
		event.put(PASSIVE_BONNIE.get(), PassiveBonnieEntity.createAttributes().build());
		event.put(PASSIVE_SPRING_BONNIE.get(), PassiveSpringBonnieEntity.createAttributes().build());
		event.put(PASSIVE_CHICA.get(), PassiveChicaEntity.createAttributes().build());
		event.put(PASSIVE_FOXY.get(), PassiveFoxyEntity.createAttributes().build());
		event.put(CRAWLING_TOY_BONNIE.get(), CrawlingToyBonnieEntity.createAttributes().build());
		event.put(CRAWLING_MANGLE.get(), CrawlingMangleEntity.createAttributes().build());
		event.put(CRAWLING_TOY_FOXY.get(), CrawlingToyFoxyEntity.createAttributes().build());
		event.put(CRAWLING_TOY_CHICA.get(), CrawlingToyChicaEntity.createAttributes().build());
		event.put(DAY_TIME_PUPPET.get(), DayTimePuppetEntity.createAttributes().build());
		event.put(DAY_TIME_BB.get(), DayTimeBBEntity.createAttributes().build());
		event.put(PLUSHTRAP.get(), PlushtrapEntity.createAttributes().build());
		event.put(NIGHTMARE_BB.get(), NightmareBBEntity.createAttributes().build());
		event.put(SITTING_DAYTIME_SPRINGTRAP.get(), SittingDaytimeSpringtrapEntity.createAttributes().build());
		event.put(STANDING_DAYTIME_SPRINGTRAP.get(), StandingDaytimeSpringtrapEntity.createAttributes().build());
		event.put(CRAWLING_SPRINGTRAP.get(), CrawlingSpringtrapEntity.createAttributes().build());
	}
}
