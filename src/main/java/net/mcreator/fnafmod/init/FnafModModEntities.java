
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
import net.mcreator.fnafmod.entity.UnwitheredFreddyStatueEntity;
import net.mcreator.fnafmod.entity.UnwitheredFoxyStatueEntity;
import net.mcreator.fnafmod.entity.UnwitheredChicaStatueEntity;
import net.mcreator.fnafmod.entity.UnwitheredBonnieStatueEntity;
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
import net.mcreator.fnafmod.entity.SpringBonnieStatueEntity;
import net.mcreator.fnafmod.entity.SpringBonnieCutOutEntity;
import net.mcreator.fnafmod.entity.SpringBonnieCreatureEntity;
import net.mcreator.fnafmod.entity.SpringBonnieCreature2TheSequelEntity;
import net.mcreator.fnafmod.entity.SittingWitheredChicaEntity;
import net.mcreator.fnafmod.entity.SittingWitheredBonnieEntity;
import net.mcreator.fnafmod.entity.SittingSpringBonnieEntity;
import net.mcreator.fnafmod.entity.SittingFredbearEntity;
import net.mcreator.fnafmod.entity.SittingDaytimeSpringtrapEntity;
import net.mcreator.fnafmod.entity.ShadowFreddyStandingEntity;
import net.mcreator.fnafmod.entity.ShadowFreddyEntity;
import net.mcreator.fnafmod.entity.ShadowBonnieEntity;
import net.mcreator.fnafmod.entity.PuppetEntity;
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
import net.mcreator.fnafmod.entity.NightimeToyChicaEntity;
import net.mcreator.fnafmod.entity.MangleSittingEntity;
import net.mcreator.fnafmod.entity.MangleEntity;
import net.mcreator.fnafmod.entity.JJEntity;
import net.mcreator.fnafmod.entity.GoldenFreddyEntity;
import net.mcreator.fnafmod.entity.GlitchBonnieStatueEntity;
import net.mcreator.fnafmod.entity.GlitchBonnieCutOutEntity;
import net.mcreator.fnafmod.entity.FullHostileFreddyEntity;
import net.mcreator.fnafmod.entity.FullHostileFoxyEntity;
import net.mcreator.fnafmod.entity.FullHostileChicaEntity;
import net.mcreator.fnafmod.entity.FullHostileBonnieEntity;
import net.mcreator.fnafmod.entity.FreddyStandEntity;
import net.mcreator.fnafmod.entity.FreddyFazbearEntity;
import net.mcreator.fnafmod.entity.FredbearStatueEntity;
import net.mcreator.fnafmod.entity.FredbearCutOutEntity;
import net.mcreator.fnafmod.entity.FredbearCreatureEntity;
import net.mcreator.fnafmod.entity.FredBearCratureEntity;
import net.mcreator.fnafmod.entity.FoxyPirateEntity;
import net.mcreator.fnafmod.entity.EndoSkeletonEntity;
import net.mcreator.fnafmod.entity.Endo02Entity;
import net.mcreator.fnafmod.entity.DedwitheredfreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeWitheredFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeToyBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimePuppetEntity;
import net.mcreator.fnafmod.entity.DayTimeFreddyEntity;
import net.mcreator.fnafmod.entity.DayTimeFoxyEntity;
import net.mcreator.fnafmod.entity.DayTimeChicaEntity;
import net.mcreator.fnafmod.entity.DayTimeBonnieEntity;
import net.mcreator.fnafmod.entity.DayTimeBBEntity;
import net.mcreator.fnafmod.entity.CrawlingToyFoxyEntity;
import net.mcreator.fnafmod.entity.CrawlingToyChicaEntity;
import net.mcreator.fnafmod.entity.CrawlingToyBonnieEntity;
import net.mcreator.fnafmod.entity.CrawlingSpringtrapEntity;
import net.mcreator.fnafmod.entity.CrawlingMangleEntity;
import net.mcreator.fnafmod.entity.ChicaChickenEntity;
import net.mcreator.fnafmod.entity.BonnieStandEntity;
import net.mcreator.fnafmod.entity.BonnieBunnyEntity;
import net.mcreator.fnafmod.entity.BBEntity;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FnafModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, FnafModMod.MODID);
	public static final RegistryObject<EntityType<GoldenFreddyEntity>> GOLDEN_FREDDY = register("golden_freddy",
			EntityType.Builder.<GoldenFreddyEntity>of(GoldenFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GoldenFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SittingSpringBonnieEntity>> SITTING_SPRING_BONNIE = register("sitting_spring_bonnie",
			EntityType.Builder.<SittingSpringBonnieEntity>of(SittingSpringBonnieEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SittingSpringBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SittingFredbearEntity>> SITTING_FREDBEAR = register("sitting_fredbear",
			EntityType.Builder.<SittingFredbearEntity>of(SittingFredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SittingFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EndoSkeletonEntity>> ENDO_SKELETON = register("endo_skeleton",
			EntityType.Builder.<EndoSkeletonEntity>of(EndoSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndoSkeletonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WitheredChicaEntity>> WITHERED_CHICA = register("withered_chica",
			EntityType.Builder.<WitheredChicaEntity>of(WitheredChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredChicaEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WitheredBonnieEntity>> WITHERED_BONNIE = register("withered_bonnie",
			EntityType.Builder.<WitheredBonnieEntity>of(WitheredBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredBonnieEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WitheredFreddyEntity>> WITHERED_FREDDY = register("withered_freddy",
			EntityType.Builder.<WitheredFreddyEntity>of(WitheredFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredFreddyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WitheredFoxyEntity>> WITHERED_FOXY = register("withered_foxy",
			EntityType.Builder.<WitheredFoxyEntity>of(WitheredFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WitheredFoxyEntity::new)

					.sized(0.6f, 1.9f));
	public static final RegistryObject<EntityType<WitheredGoldenFreddyEntity>> WITHERED_GOLDEN_FREDDY = register("withered_golden_freddy",
			EntityType.Builder.<WitheredGoldenFreddyEntity>of(WitheredGoldenFreddyEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(65).setUpdateInterval(3)
					.setCustomClientFactory(WitheredGoldenFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowFreddyEntity>> SHADOW_FREDDY = register("shadow_freddy",
			EntityType.Builder.<ShadowFreddyEntity>of(ShadowFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MangleEntity>> MANGLE = register("mangle",
			EntityType.Builder.<MangleEntity>of(MangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(MangleEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<MangleSittingEntity>> MANGLE_SITTING = register("mangle_sitting",
			EntityType.Builder.<MangleSittingEntity>of(MangleSittingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MangleSittingEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyFreddyEntity>> TOY_FREDDY = register("toy_freddy",
			EntityType.Builder.<ToyFreddyEntity>of(ToyFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToyFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeToyFreddyEntity>> DAY_TIME_TOY_FREDDY = register("day_time_toy_freddy",
			EntityType.Builder.<DayTimeToyFreddyEntity>of(DayTimeToyFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeToyFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyBonnieEntity>> TOY_BONNIE = register("toy_bonnie",
			EntityType.Builder.<ToyBonnieEntity>of(ToyBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToyBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeToyBonnieEntity>> DAY_TIME_TOY_BONNIE = register("day_time_toy_bonnie",
			EntityType.Builder.<DayTimeToyBonnieEntity>of(DayTimeToyBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeToyBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BBEntity>> BB = register("bb",
			EntityType.Builder.<BBEntity>of(BBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BBEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PuppetEntity>> PUPPET = register("puppet",
			EntityType.Builder.<PuppetEntity>of(PuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PuppetEntity::new)

					.sized(0.6f, 2.3000000000000003f));
	public static final RegistryObject<EntityType<ShadowBonnieEntity>> SHADOW_BONNIE = register("shadow_bonnie",
			EntityType.Builder.<ShadowBonnieEntity>of(ShadowBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShadowBonnieEntity::new)

					.sized(0.9f, 1.8f));
	public static final RegistryObject<EntityType<Endo02Entity>> ENDO_02 = register("endo_02",
			EntityType.Builder.<Endo02Entity>of(Endo02Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(Endo02Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyFoxyEntity>> TOY_FOXY = register("toy_foxy",
			EntityType.Builder.<ToyFoxyEntity>of(ToyFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ToyFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeToyFoxyEntity>> DAY_TIME_TOY_FOXY = register("day_time_toy_foxy",
			EntityType.Builder.<DayTimeToyFoxyEntity>of(DayTimeToyFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeToyFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NightimeToyChicaEntity>> NIGHTIME_TOY_CHICA = register("nightime_toy_chica",
			EntityType.Builder.<NightimeToyChicaEntity>of(NightimeToyChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NightimeToyChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyChicaEntity>> TOY_CHICA = register("toy_chica",
			EntityType.Builder.<ToyChicaEntity>of(ToyChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ToyChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JJEntity>> JJ = register("jj",
			EntityType.Builder.<JJEntity>of(JJEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(JJEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<SpringlockedZombieFredbearEntity>> SPRINGLOCKED_ZOMBIE_FREDBEAR = register(
			"springlocked_zombie_fredbear",
			EntityType.Builder.<SpringlockedZombieFredbearEntity>of(SpringlockedZombieFredbearEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SpringlockedZombieFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpringLockedZombieSpringBonnieEntity>> SPRING_LOCKED_ZOMBIE_SPRING_BONNIE = register(
			"spring_locked_zombie_spring_bonnie",
			EntityType.Builder.<SpringLockedZombieSpringBonnieEntity>of(SpringLockedZombieSpringBonnieEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SpringLockedZombieSpringBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShadowFreddyStandingEntity>> SHADOW_FREDDY_STANDING = register("shadow_freddy_standing",
			EntityType.Builder.<ShadowFreddyStandingEntity>of(ShadowFreddyStandingEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ShadowFreddyStandingEntity::new)

					.sized(0.4f, 1.8f));
	public static final RegistryObject<EntityType<SpringtrapEntity>> SPRINGTRAP = register("springtrap",
			EntityType.Builder.<SpringtrapEntity>of(SpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringtrapEntity::new)

					.sized(0.6f, 1.9000000000000001f));
	public static final RegistryObject<EntityType<PhantomChicaEntity>> PHANTOM_CHICA = register("phantom_chica",
			EntityType.Builder.<PhantomChicaEntity>of(PhantomChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomChicaEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomFreddyEntity>> PHANTOM_FREDDY = register("phantom_freddy",
			EntityType.Builder.<PhantomFreddyEntity>of(PhantomFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomFreddyEntity::new).fireImmune()
					.sized(0.6f, 2.1999999999999997f));
	public static final RegistryObject<EntityType<PhantomBBEntity>> PHANTOM_BB = register("phantom_bb",
			EntityType.Builder.<PhantomBBEntity>of(PhantomBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomBBEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PhantomPuppetEntity>> PHANTOM_PUPPET = register("phantom_puppet",
			EntityType.Builder.<PhantomPuppetEntity>of(PhantomPuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomPuppetEntity::new).fireImmune()
					.sized(0.6f, 2.3000000000000003f));
	public static final RegistryObject<EntityType<PhantomMangleEntity>> PHANTOM_MANGLE = register("phantom_mangle",
			EntityType.Builder.<PhantomMangleEntity>of(PhantomMangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomMangleEntity::new).fireImmune().sized(0.6f, 2f));
	public static final RegistryObject<EntityType<PhantomFoxyEntity>> PHANTOM_FOXY = register("phantom_foxy",
			EntityType.Builder.<PhantomFoxyEntity>of(PhantomFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PhantomFoxyEntity::new).fireImmune()
					.sized(0.6f, 2.1999999999999997f));
	public static final RegistryObject<EntityType<TheCrooblerEntity>> THE_GROOBLER = register("the_groobler",
			EntityType.Builder.<TheCrooblerEntity>of(TheCrooblerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheCrooblerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FreddyFazbearEntity>> FREDDY_FAZBEAR = register("freddy_fazbear",
			EntityType.Builder.<FreddyFazbearEntity>of(FreddyFazbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyFazbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BonnieBunnyEntity>> BONNIE_BUNNY = register("bonnie_bunny",
			EntityType.Builder.<BonnieBunnyEntity>of(BonnieBunnyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BonnieBunnyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ChicaChickenEntity>> CHICA_CHICKEN = register("chica_chicken",
			EntityType.Builder.<ChicaChickenEntity>of(ChicaChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ChicaChickenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FoxyPirateEntity>> FOXY_PIRATE = register("foxy_pirate",
			EntityType.Builder.<FoxyPirateEntity>of(FoxyPirateEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FoxyPirateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpringBonnieCreatureEntity>> SPRING_BONNIE_CREATURE = register("spring_bonnie_creature",
			EntityType.Builder.<SpringBonnieCreatureEntity>of(SpringBonnieCreatureEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SpringBonnieCreatureEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FredbearCreatureEntity>> FREDBEAR_CREATURE = register("fredbear_creature",
			EntityType.Builder.<FredbearCreatureEntity>of(FredbearCreatureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearCreatureEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveFreddyEntity>> PASSIVE_FREDDY = register("passive_freddy",
			EntityType.Builder.<PassiveFreddyEntity>of(PassiveFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveGoldieEntity>> PASSIVE_GOLDIE = register("passive_goldie",
			EntityType.Builder.<PassiveGoldieEntity>of(PassiveGoldieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveGoldieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveFredbearEntity>> PASSIVE_FREDBEAR = register("passive_fredbear",
			EntityType.Builder.<PassiveFredbearEntity>of(PassiveFredbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveFredbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveBonnieEntity>> PASSIVE_BONNIE = register("passive_bonnie",
			EntityType.Builder.<PassiveBonnieEntity>of(PassiveBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveSpringBonnieEntity>> PASSIVE_SPRING_BONNIE = register("passive_spring_bonnie",
			EntityType.Builder.<PassiveSpringBonnieEntity>of(PassiveSpringBonnieEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(PassiveSpringBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveChicaEntity>> PASSIVE_CHICA = register("passive_chica",
			EntityType.Builder.<PassiveChicaEntity>of(PassiveChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PassiveFoxyEntity>> PASSIVE_FOXY = register("passive_foxy",
			EntityType.Builder.<PassiveFoxyEntity>of(PassiveFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PassiveFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DedwitheredfreddyEntity>> DEDWITHEREDFREDDY = register("dedwitheredfreddy",
			EntityType.Builder.<DedwitheredfreddyEntity>of(DedwitheredfreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DedwitheredfreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SittingWitheredBonnieEntity>> SITTING_WITHERED_BONNIE = register("sitting_withered_bonnie",
			EntityType.Builder.<SittingWitheredBonnieEntity>of(SittingWitheredBonnieEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SittingWitheredBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SittingWitheredChicaEntity>> SITTING_WITHERED_CHICA = register("sitting_withered_chica",
			EntityType.Builder.<SittingWitheredChicaEntity>of(SittingWitheredChicaEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SittingWitheredChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeFreddyEntity>> DAY_TIME_FREDDY = register("day_time_freddy",
			EntityType.Builder.<DayTimeFreddyEntity>of(DayTimeFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeChicaEntity>> DAY_TIME_CHICA = register("day_time_chica",
			EntityType.Builder.<DayTimeChicaEntity>of(DayTimeChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeBonnieEntity>> DAY_TIME_BONNIE = register("day_time_bonnie",
			EntityType.Builder.<DayTimeBonnieEntity>of(DayTimeBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeFoxyEntity>> DAY_TIME_FOXY = register("day_time_foxy",
			EntityType.Builder.<DayTimeFoxyEntity>of(DayTimeFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimePuppetEntity>> DAY_TIME_PUPPET = register("day_time_puppet",
			EntityType.Builder.<DayTimePuppetEntity>of(DayTimePuppetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimePuppetEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeWitheredFoxyEntity>> DAY_TIME_WITHERED_FOXY = register("day_time_withered_foxy",
			EntityType.Builder.<DayTimeWitheredFoxyEntity>of(DayTimeWitheredFoxyEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(DayTimeWitheredFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DayTimeBBEntity>> DAY_TIME_BB = register("day_time_bb",
			EntityType.Builder.<DayTimeBBEntity>of(DayTimeBBEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DayTimeBBEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PatPatEntity>> PAT_PAT = register("pat_pat",
			EntityType.Builder.<PatPatEntity>of(PatPatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PatPatEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FredBearCratureEntity>> FRED_BEAR_CRATURE = register("fred_bear_crature",
			EntityType.Builder.<FredBearCratureEntity>of(FredBearCratureEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredBearCratureEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OfficeChairEntity>> OFFICE_CHAIR = register("office_chair",
			EntityType.Builder.<OfficeChairEntity>of(OfficeChairEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OfficeChairEntity::new)

					.sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<StatueFreddyEntity>> STATUE_FREDDY = register("statue_freddy",
			EntityType.Builder.<StatueFreddyEntity>of(StatueFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StatueFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileFreddyEntity>> FULL_HOSTILE_FREDDY = register("full_hostile_freddy",
			EntityType.Builder.<FullHostileFreddyEntity>of(FullHostileFreddyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileFreddyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StatueChicaEntity>> STATUE_CHICA = register("statue_chica",
			EntityType.Builder.<StatueChicaEntity>of(StatueChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StatueChicaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileChicaEntity>> FULL_HOSTILE_CHICA = register("full_hostile_chica",
			EntityType.Builder.<FullHostileChicaEntity>of(FullHostileChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileChicaEntity::new)

					.sized(0.4f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileFoxyEntity>> FULL_HOSTILE_FOXY = register("full_hostile_foxy",
			EntityType.Builder.<FullHostileFoxyEntity>of(FullHostileFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StatueFoxyEntity>> STATUE_FOXY = register("statue_foxy",
			EntityType.Builder.<StatueFoxyEntity>of(StatueFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StatueFoxyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StatueBonnieEntity>> STATUE_BONNIE = register("statue_bonnie",
			EntityType.Builder.<StatueBonnieEntity>of(StatueBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StatueBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FullHostileBonnieEntity>> FULL_HOSTILE_BONNIE = register("full_hostile_bonnie",
			EntityType.Builder.<FullHostileBonnieEntity>of(FullHostileBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FullHostileBonnieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpringBonnieCreature2TheSequelEntity>> SPRING_BONNIE_CREATURE_2_THE_SEQUEL = register(
			"spring_bonnie_creature_2_the_sequel",
			EntityType.Builder.<SpringBonnieCreature2TheSequelEntity>of(SpringBonnieCreature2TheSequelEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SpringBonnieCreature2TheSequelEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FreddyStandEntity>> FREDDY_STAND = register("freddy_stand",
			EntityType.Builder.<FreddyStandEntity>of(FreddyStandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyStandEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BonnieStandEntity>> BONNIE_STAND = register("bonnie_stand",
			EntityType.Builder.<BonnieStandEntity>of(BonnieStandEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BonnieStandEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ToyBoxEntity>> TOY_BOX = register("toy_box",
			EntityType.Builder.<ToyBoxEntity>of(ToyBoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ToyBoxEntity::new)

					.sized(1f, 1.5f));
	public static final RegistryObject<EntityType<SittingDaytimeSpringtrapEntity>> SITTING_DAYTIME_SPRINGTRAP = register("sitting_daytime_springtrap",
			EntityType.Builder.<SittingDaytimeSpringtrapEntity>of(SittingDaytimeSpringtrapEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SittingDaytimeSpringtrapEntity::new)

					.sized(0.7f, 1f));
	public static final RegistryObject<EntityType<StandingDaytimeSpringtrapEntity>> STANDING_DAYTIME_SPRINGTRAP = register(
			"standing_daytime_springtrap",
			EntityType.Builder.<StandingDaytimeSpringtrapEntity>of(StandingDaytimeSpringtrapEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(StandingDaytimeSpringtrapEntity::new)

					.sized(0.6f, 2.1999999999999997f));
	public static final RegistryObject<EntityType<CrawlingToyBonnieEntity>> CRAWLING_TOY_BONNIE = register("crawling_toy_bonnie",
			EntityType.Builder.<CrawlingToyBonnieEntity>of(CrawlingToyBonnieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingToyBonnieEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<CrawlingMangleEntity>> CRAWLING_MANGLE = register("crawling_mangle",
			EntityType.Builder.<CrawlingMangleEntity>of(CrawlingMangleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingMangleEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<CrawlingToyFoxyEntity>> CRAWLING_TOY_FOXY = register("crawling_toy_foxy",
			EntityType.Builder.<CrawlingToyFoxyEntity>of(CrawlingToyFoxyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingToyFoxyEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<CrawlingToyChicaEntity>> CRAWLING_TOY_CHICA = register("crawling_toy_chica",
			EntityType.Builder.<CrawlingToyChicaEntity>of(CrawlingToyChicaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingToyChicaEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<CrawlingSpringtrapEntity>> CRAWLING_SPRINGTRAP = register("crawling_springtrap",
			EntityType.Builder.<CrawlingSpringtrapEntity>of(CrawlingSpringtrapEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrawlingSpringtrapEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<SpringBonnieStatueEntity>> SPRING_BONNIE_STATUE = register("spring_bonnie_statue",
			EntityType.Builder.<SpringBonnieStatueEntity>of(SpringBonnieStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringBonnieStatueEntity::new)

					.sized(0.7f, 1.8f));
	public static final RegistryObject<EntityType<FredbearStatueEntity>> FREDBEAR_STATUE = register("fredbear_statue",
			EntityType.Builder.<FredbearStatueEntity>of(FredbearStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GlitchBonnieStatueEntity>> GLITCH_BONNIE_STATUE = register("glitch_bonnie_statue",
			EntityType.Builder.<GlitchBonnieStatueEntity>of(GlitchBonnieStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlitchBonnieStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FredbearCutOutEntity>> FREDBEAR_CUT_OUT = register("fredbear_cut_out",
			EntityType.Builder.<FredbearCutOutEntity>of(FredbearCutOutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FredbearCutOutEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpringBonnieCutOutEntity>> SPRING_BONNIE_CUT_OUT = register("spring_bonnie_cut_out",
			EntityType.Builder.<SpringBonnieCutOutEntity>of(SpringBonnieCutOutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpringBonnieCutOutEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<GlitchBonnieCutOutEntity>> GLITCH_BONNIE_CUT_OUT = register("glitch_bonnie_cut_out",
			EntityType.Builder.<GlitchBonnieCutOutEntity>of(GlitchBonnieCutOutEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlitchBonnieCutOutEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<UnwitheredFreddyStatueEntity>> UNWITHERED_FREDDY_STATUE = register("unwithered_freddy_statue",
			EntityType.Builder.<UnwitheredFreddyStatueEntity>of(UnwitheredFreddyStatueEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(UnwitheredFreddyStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UnwitheredBonnieStatueEntity>> UNWITHERED_BONNIE_STATUE = register("unwithered_bonnie_statue",
			EntityType.Builder.<UnwitheredBonnieStatueEntity>of(UnwitheredBonnieStatueEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(UnwitheredBonnieStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UnwitheredChicaStatueEntity>> UNWITHERED_CHICA_STATUE = register("unwithered_chica_statue",
			EntityType.Builder.<UnwitheredChicaStatueEntity>of(UnwitheredChicaStatueEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(UnwitheredChicaStatueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UnwitheredFoxyStatueEntity>> UNWITHERED_FOXY_STATUE = register("unwithered_foxy_statue",
			EntityType.Builder.<UnwitheredFoxyStatueEntity>of(UnwitheredFoxyStatueEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(UnwitheredFoxyStatueEntity::new)

					.sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GoldenFreddyEntity.init();
			SittingSpringBonnieEntity.init();
			SittingFredbearEntity.init();
			EndoSkeletonEntity.init();
			WitheredChicaEntity.init();
			WitheredBonnieEntity.init();
			WitheredFreddyEntity.init();
			WitheredFoxyEntity.init();
			WitheredGoldenFreddyEntity.init();
			ShadowFreddyEntity.init();
			MangleEntity.init();
			MangleSittingEntity.init();
			ToyFreddyEntity.init();
			DayTimeToyFreddyEntity.init();
			ToyBonnieEntity.init();
			DayTimeToyBonnieEntity.init();
			BBEntity.init();
			PuppetEntity.init();
			ShadowBonnieEntity.init();
			Endo02Entity.init();
			ToyFoxyEntity.init();
			DayTimeToyFoxyEntity.init();
			NightimeToyChicaEntity.init();
			ToyChicaEntity.init();
			JJEntity.init();
			SpringlockedZombieFredbearEntity.init();
			SpringLockedZombieSpringBonnieEntity.init();
			ShadowFreddyStandingEntity.init();
			SpringtrapEntity.init();
			PhantomChicaEntity.init();
			PhantomFreddyEntity.init();
			PhantomBBEntity.init();
			PhantomPuppetEntity.init();
			PhantomMangleEntity.init();
			PhantomFoxyEntity.init();
			TheCrooblerEntity.init();
			FreddyFazbearEntity.init();
			BonnieBunnyEntity.init();
			ChicaChickenEntity.init();
			FoxyPirateEntity.init();
			SpringBonnieCreatureEntity.init();
			FredbearCreatureEntity.init();
			PassiveFreddyEntity.init();
			PassiveGoldieEntity.init();
			PassiveFredbearEntity.init();
			PassiveBonnieEntity.init();
			PassiveSpringBonnieEntity.init();
			PassiveChicaEntity.init();
			PassiveFoxyEntity.init();
			DedwitheredfreddyEntity.init();
			SittingWitheredBonnieEntity.init();
			SittingWitheredChicaEntity.init();
			DayTimeFreddyEntity.init();
			DayTimeChicaEntity.init();
			DayTimeBonnieEntity.init();
			DayTimeFoxyEntity.init();
			DayTimePuppetEntity.init();
			DayTimeWitheredFoxyEntity.init();
			DayTimeBBEntity.init();
			PatPatEntity.init();
			FredBearCratureEntity.init();
			OfficeChairEntity.init();
			StatueFreddyEntity.init();
			FullHostileFreddyEntity.init();
			StatueChicaEntity.init();
			FullHostileChicaEntity.init();
			FullHostileFoxyEntity.init();
			StatueFoxyEntity.init();
			StatueBonnieEntity.init();
			FullHostileBonnieEntity.init();
			SpringBonnieCreature2TheSequelEntity.init();
			FreddyStandEntity.init();
			BonnieStandEntity.init();
			ToyBoxEntity.init();
			SittingDaytimeSpringtrapEntity.init();
			StandingDaytimeSpringtrapEntity.init();
			CrawlingToyBonnieEntity.init();
			CrawlingMangleEntity.init();
			CrawlingToyFoxyEntity.init();
			CrawlingToyChicaEntity.init();
			CrawlingSpringtrapEntity.init();
			SpringBonnieStatueEntity.init();
			FredbearStatueEntity.init();
			GlitchBonnieStatueEntity.init();
			FredbearCutOutEntity.init();
			SpringBonnieCutOutEntity.init();
			GlitchBonnieCutOutEntity.init();
			UnwitheredFreddyStatueEntity.init();
			UnwitheredBonnieStatueEntity.init();
			UnwitheredChicaStatueEntity.init();
			UnwitheredFoxyStatueEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GOLDEN_FREDDY.get(), GoldenFreddyEntity.createAttributes().build());
		event.put(SITTING_SPRING_BONNIE.get(), SittingSpringBonnieEntity.createAttributes().build());
		event.put(SITTING_FREDBEAR.get(), SittingFredbearEntity.createAttributes().build());
		event.put(ENDO_SKELETON.get(), EndoSkeletonEntity.createAttributes().build());
		event.put(WITHERED_CHICA.get(), WitheredChicaEntity.createAttributes().build());
		event.put(WITHERED_BONNIE.get(), WitheredBonnieEntity.createAttributes().build());
		event.put(WITHERED_FREDDY.get(), WitheredFreddyEntity.createAttributes().build());
		event.put(WITHERED_FOXY.get(), WitheredFoxyEntity.createAttributes().build());
		event.put(WITHERED_GOLDEN_FREDDY.get(), WitheredGoldenFreddyEntity.createAttributes().build());
		event.put(SHADOW_FREDDY.get(), ShadowFreddyEntity.createAttributes().build());
		event.put(MANGLE.get(), MangleEntity.createAttributes().build());
		event.put(MANGLE_SITTING.get(), MangleSittingEntity.createAttributes().build());
		event.put(TOY_FREDDY.get(), ToyFreddyEntity.createAttributes().build());
		event.put(DAY_TIME_TOY_FREDDY.get(), DayTimeToyFreddyEntity.createAttributes().build());
		event.put(TOY_BONNIE.get(), ToyBonnieEntity.createAttributes().build());
		event.put(DAY_TIME_TOY_BONNIE.get(), DayTimeToyBonnieEntity.createAttributes().build());
		event.put(BB.get(), BBEntity.createAttributes().build());
		event.put(PUPPET.get(), PuppetEntity.createAttributes().build());
		event.put(SHADOW_BONNIE.get(), ShadowBonnieEntity.createAttributes().build());
		event.put(ENDO_02.get(), Endo02Entity.createAttributes().build());
		event.put(TOY_FOXY.get(), ToyFoxyEntity.createAttributes().build());
		event.put(DAY_TIME_TOY_FOXY.get(), DayTimeToyFoxyEntity.createAttributes().build());
		event.put(NIGHTIME_TOY_CHICA.get(), NightimeToyChicaEntity.createAttributes().build());
		event.put(TOY_CHICA.get(), ToyChicaEntity.createAttributes().build());
		event.put(JJ.get(), JJEntity.createAttributes().build());
		event.put(SPRINGLOCKED_ZOMBIE_FREDBEAR.get(), SpringlockedZombieFredbearEntity.createAttributes().build());
		event.put(SPRING_LOCKED_ZOMBIE_SPRING_BONNIE.get(), SpringLockedZombieSpringBonnieEntity.createAttributes().build());
		event.put(SHADOW_FREDDY_STANDING.get(), ShadowFreddyStandingEntity.createAttributes().build());
		event.put(SPRINGTRAP.get(), SpringtrapEntity.createAttributes().build());
		event.put(PHANTOM_CHICA.get(), PhantomChicaEntity.createAttributes().build());
		event.put(PHANTOM_FREDDY.get(), PhantomFreddyEntity.createAttributes().build());
		event.put(PHANTOM_BB.get(), PhantomBBEntity.createAttributes().build());
		event.put(PHANTOM_PUPPET.get(), PhantomPuppetEntity.createAttributes().build());
		event.put(PHANTOM_MANGLE.get(), PhantomMangleEntity.createAttributes().build());
		event.put(PHANTOM_FOXY.get(), PhantomFoxyEntity.createAttributes().build());
		event.put(THE_GROOBLER.get(), TheCrooblerEntity.createAttributes().build());
		event.put(FREDDY_FAZBEAR.get(), FreddyFazbearEntity.createAttributes().build());
		event.put(BONNIE_BUNNY.get(), BonnieBunnyEntity.createAttributes().build());
		event.put(CHICA_CHICKEN.get(), ChicaChickenEntity.createAttributes().build());
		event.put(FOXY_PIRATE.get(), FoxyPirateEntity.createAttributes().build());
		event.put(SPRING_BONNIE_CREATURE.get(), SpringBonnieCreatureEntity.createAttributes().build());
		event.put(FREDBEAR_CREATURE.get(), FredbearCreatureEntity.createAttributes().build());
		event.put(PASSIVE_FREDDY.get(), PassiveFreddyEntity.createAttributes().build());
		event.put(PASSIVE_GOLDIE.get(), PassiveGoldieEntity.createAttributes().build());
		event.put(PASSIVE_FREDBEAR.get(), PassiveFredbearEntity.createAttributes().build());
		event.put(PASSIVE_BONNIE.get(), PassiveBonnieEntity.createAttributes().build());
		event.put(PASSIVE_SPRING_BONNIE.get(), PassiveSpringBonnieEntity.createAttributes().build());
		event.put(PASSIVE_CHICA.get(), PassiveChicaEntity.createAttributes().build());
		event.put(PASSIVE_FOXY.get(), PassiveFoxyEntity.createAttributes().build());
		event.put(DEDWITHEREDFREDDY.get(), DedwitheredfreddyEntity.createAttributes().build());
		event.put(SITTING_WITHERED_BONNIE.get(), SittingWitheredBonnieEntity.createAttributes().build());
		event.put(SITTING_WITHERED_CHICA.get(), SittingWitheredChicaEntity.createAttributes().build());
		event.put(DAY_TIME_FREDDY.get(), DayTimeFreddyEntity.createAttributes().build());
		event.put(DAY_TIME_CHICA.get(), DayTimeChicaEntity.createAttributes().build());
		event.put(DAY_TIME_BONNIE.get(), DayTimeBonnieEntity.createAttributes().build());
		event.put(DAY_TIME_FOXY.get(), DayTimeFoxyEntity.createAttributes().build());
		event.put(DAY_TIME_PUPPET.get(), DayTimePuppetEntity.createAttributes().build());
		event.put(DAY_TIME_WITHERED_FOXY.get(), DayTimeWitheredFoxyEntity.createAttributes().build());
		event.put(DAY_TIME_BB.get(), DayTimeBBEntity.createAttributes().build());
		event.put(PAT_PAT.get(), PatPatEntity.createAttributes().build());
		event.put(FRED_BEAR_CRATURE.get(), FredBearCratureEntity.createAttributes().build());
		event.put(OFFICE_CHAIR.get(), OfficeChairEntity.createAttributes().build());
		event.put(STATUE_FREDDY.get(), StatueFreddyEntity.createAttributes().build());
		event.put(FULL_HOSTILE_FREDDY.get(), FullHostileFreddyEntity.createAttributes().build());
		event.put(STATUE_CHICA.get(), StatueChicaEntity.createAttributes().build());
		event.put(FULL_HOSTILE_CHICA.get(), FullHostileChicaEntity.createAttributes().build());
		event.put(FULL_HOSTILE_FOXY.get(), FullHostileFoxyEntity.createAttributes().build());
		event.put(STATUE_FOXY.get(), StatueFoxyEntity.createAttributes().build());
		event.put(STATUE_BONNIE.get(), StatueBonnieEntity.createAttributes().build());
		event.put(FULL_HOSTILE_BONNIE.get(), FullHostileBonnieEntity.createAttributes().build());
		event.put(SPRING_BONNIE_CREATURE_2_THE_SEQUEL.get(), SpringBonnieCreature2TheSequelEntity.createAttributes().build());
		event.put(FREDDY_STAND.get(), FreddyStandEntity.createAttributes().build());
		event.put(BONNIE_STAND.get(), BonnieStandEntity.createAttributes().build());
		event.put(TOY_BOX.get(), ToyBoxEntity.createAttributes().build());
		event.put(SITTING_DAYTIME_SPRINGTRAP.get(), SittingDaytimeSpringtrapEntity.createAttributes().build());
		event.put(STANDING_DAYTIME_SPRINGTRAP.get(), StandingDaytimeSpringtrapEntity.createAttributes().build());
		event.put(CRAWLING_TOY_BONNIE.get(), CrawlingToyBonnieEntity.createAttributes().build());
		event.put(CRAWLING_MANGLE.get(), CrawlingMangleEntity.createAttributes().build());
		event.put(CRAWLING_TOY_FOXY.get(), CrawlingToyFoxyEntity.createAttributes().build());
		event.put(CRAWLING_TOY_CHICA.get(), CrawlingToyChicaEntity.createAttributes().build());
		event.put(CRAWLING_SPRINGTRAP.get(), CrawlingSpringtrapEntity.createAttributes().build());
		event.put(SPRING_BONNIE_STATUE.get(), SpringBonnieStatueEntity.createAttributes().build());
		event.put(FREDBEAR_STATUE.get(), FredbearStatueEntity.createAttributes().build());
		event.put(GLITCH_BONNIE_STATUE.get(), GlitchBonnieStatueEntity.createAttributes().build());
		event.put(FREDBEAR_CUT_OUT.get(), FredbearCutOutEntity.createAttributes().build());
		event.put(SPRING_BONNIE_CUT_OUT.get(), SpringBonnieCutOutEntity.createAttributes().build());
		event.put(GLITCH_BONNIE_CUT_OUT.get(), GlitchBonnieCutOutEntity.createAttributes().build());
		event.put(UNWITHERED_FREDDY_STATUE.get(), UnwitheredFreddyStatueEntity.createAttributes().build());
		event.put(UNWITHERED_BONNIE_STATUE.get(), UnwitheredBonnieStatueEntity.createAttributes().build());
		event.put(UNWITHERED_CHICA_STATUE.get(), UnwitheredChicaStatueEntity.createAttributes().build());
		event.put(UNWITHERED_FOXY_STATUE.get(), UnwitheredFoxyStatueEntity.createAttributes().build());
	}
}
