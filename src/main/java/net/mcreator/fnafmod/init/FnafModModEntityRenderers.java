
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.client.renderer.WitheredGoldenFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.WitheredFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.WitheredFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.WitheredChicaRenderer;
import net.mcreator.fnafmod.client.renderer.WitheredBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.UnwitheredFreddyStatueRenderer;
import net.mcreator.fnafmod.client.renderer.UnwitheredFoxyStatueRenderer;
import net.mcreator.fnafmod.client.renderer.UnwitheredChicaStatueRenderer;
import net.mcreator.fnafmod.client.renderer.UnwitheredBonnieStatueRenderer;
import net.mcreator.fnafmod.client.renderer.ToyFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.ToyFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.ToyChicaRenderer;
import net.mcreator.fnafmod.client.renderer.ToyBoxRenderer;
import net.mcreator.fnafmod.client.renderer.ToyBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.TheCrooblerRenderer;
import net.mcreator.fnafmod.client.renderer.StatueFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.StatueFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.StatueChicaRenderer;
import net.mcreator.fnafmod.client.renderer.StatueBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.StandingDaytimeSpringtrapRenderer;
import net.mcreator.fnafmod.client.renderer.SpringtrapRenderer;
import net.mcreator.fnafmod.client.renderer.SpringlockedZombieFredbearRenderer;
import net.mcreator.fnafmod.client.renderer.SpringLockedZombieSpringBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.SpringBonnieStatueRenderer;
import net.mcreator.fnafmod.client.renderer.SpringBonnieCutOutRenderer;
import net.mcreator.fnafmod.client.renderer.SpringBonnieCreatureRenderer;
import net.mcreator.fnafmod.client.renderer.SpringBonnieCreature2TheSequelRenderer;
import net.mcreator.fnafmod.client.renderer.SittingWitheredChicaRenderer;
import net.mcreator.fnafmod.client.renderer.SittingWitheredBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.SittingSpringBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.SittingFredbearRenderer;
import net.mcreator.fnafmod.client.renderer.SittingDaytimeSpringtrapRenderer;
import net.mcreator.fnafmod.client.renderer.ShadowFreddyStandingRenderer;
import net.mcreator.fnafmod.client.renderer.ShadowFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.ShadowBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.PuppetRenderer;
import net.mcreator.fnafmod.client.renderer.PhantomPuppetRenderer;
import net.mcreator.fnafmod.client.renderer.PhantomMangleRenderer;
import net.mcreator.fnafmod.client.renderer.PhantomFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.PhantomFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.PhantomChicaRenderer;
import net.mcreator.fnafmod.client.renderer.PhantomBBRenderer;
import net.mcreator.fnafmod.client.renderer.PatPatRenderer;
import net.mcreator.fnafmod.client.renderer.PassiveSpringBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.PassiveGoldieRenderer;
import net.mcreator.fnafmod.client.renderer.PassiveFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.PassiveFredbearRenderer;
import net.mcreator.fnafmod.client.renderer.PassiveFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.PassiveChicaRenderer;
import net.mcreator.fnafmod.client.renderer.PassiveBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.OfficeChairRenderer;
import net.mcreator.fnafmod.client.renderer.NightmareFreddyStatueRenderer;
import net.mcreator.fnafmod.client.renderer.NightmareChicaStatueRenderer;
import net.mcreator.fnafmod.client.renderer.NightmareBonnieStatueRenderer;
import net.mcreator.fnafmod.client.renderer.NightimeToyChicaRenderer;
import net.mcreator.fnafmod.client.renderer.MangleSittingRenderer;
import net.mcreator.fnafmod.client.renderer.MangleRenderer;
import net.mcreator.fnafmod.client.renderer.JJRenderer;
import net.mcreator.fnafmod.client.renderer.GoldenFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.GlitchBonnieStatueRenderer;
import net.mcreator.fnafmod.client.renderer.GlitchBonnieCutOutRenderer;
import net.mcreator.fnafmod.client.renderer.FullHostileFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.FullHostileFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.FullHostileChicaRenderer;
import net.mcreator.fnafmod.client.renderer.FullHostileBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.FreddyStandRenderer;
import net.mcreator.fnafmod.client.renderer.FreddyFazbearRenderer;
import net.mcreator.fnafmod.client.renderer.FredbearStatueRenderer;
import net.mcreator.fnafmod.client.renderer.FredbearCutOutRenderer;
import net.mcreator.fnafmod.client.renderer.FredbearCreatureRenderer;
import net.mcreator.fnafmod.client.renderer.FredBearCratureRenderer;
import net.mcreator.fnafmod.client.renderer.FoxyPirateRenderer;
import net.mcreator.fnafmod.client.renderer.EndoSkeletonRenderer;
import net.mcreator.fnafmod.client.renderer.Endo02Renderer;
import net.mcreator.fnafmod.client.renderer.DedwitheredfreddyRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeWitheredFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeToyFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeToyFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeToyBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimePuppetRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeFreddyRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeChicaRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.DayTimeBBRenderer;
import net.mcreator.fnafmod.client.renderer.CrawlingToyFoxyRenderer;
import net.mcreator.fnafmod.client.renderer.CrawlingToyChicaRenderer;
import net.mcreator.fnafmod.client.renderer.CrawlingToyBonnieRenderer;
import net.mcreator.fnafmod.client.renderer.CrawlingSpringtrapRenderer;
import net.mcreator.fnafmod.client.renderer.CrawlingMangleRenderer;
import net.mcreator.fnafmod.client.renderer.ChicaChickenRenderer;
import net.mcreator.fnafmod.client.renderer.BonnieStandRenderer;
import net.mcreator.fnafmod.client.renderer.BonnieBunnyRenderer;
import net.mcreator.fnafmod.client.renderer.BBRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FnafModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FnafModModEntities.GOLDEN_FREDDY.get(), GoldenFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SITTING_SPRING_BONNIE.get(), SittingSpringBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SITTING_FREDBEAR.get(), SittingFredbearRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.ENDO_SKELETON.get(), EndoSkeletonRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.WITHERED_CHICA.get(), WitheredChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.WITHERED_BONNIE.get(), WitheredBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.WITHERED_FREDDY.get(), WitheredFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.WITHERED_FOXY.get(), WitheredFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.WITHERED_GOLDEN_FREDDY.get(), WitheredGoldenFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SHADOW_FREDDY.get(), ShadowFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.MANGLE.get(), MangleRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.MANGLE_SITTING.get(), MangleSittingRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.TOY_FREDDY.get(), ToyFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_TOY_FREDDY.get(), DayTimeToyFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.TOY_BONNIE.get(), ToyBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_TOY_BONNIE.get(), DayTimeToyBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.BB.get(), BBRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PUPPET.get(), PuppetRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SHADOW_BONNIE.get(), ShadowBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.ENDO_02.get(), Endo02Renderer::new);
		event.registerEntityRenderer(FnafModModEntities.TOY_FOXY.get(), ToyFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_TOY_FOXY.get(), DayTimeToyFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.NIGHTIME_TOY_CHICA.get(), NightimeToyChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.TOY_CHICA.get(), ToyChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.JJ.get(), JJRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SPRINGLOCKED_ZOMBIE_FREDBEAR.get(), SpringlockedZombieFredbearRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SPRING_LOCKED_ZOMBIE_SPRING_BONNIE.get(), SpringLockedZombieSpringBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SHADOW_FREDDY_STANDING.get(), ShadowFreddyStandingRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SPRINGTRAP.get(), SpringtrapRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PHANTOM_CHICA.get(), PhantomChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PHANTOM_FREDDY.get(), PhantomFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PHANTOM_BB.get(), PhantomBBRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PHANTOM_PUPPET.get(), PhantomPuppetRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PHANTOM_MANGLE.get(), PhantomMangleRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PHANTOM_FOXY.get(), PhantomFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.THE_GROOBLER.get(), TheCrooblerRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FREDDY_FAZBEAR.get(), FreddyFazbearRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.NIGHTMARE_FREDDY_STATUE.get(), NightmareFreddyStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.NIGHTMARE_BONNIE_STATUE.get(), NightmareBonnieStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.NIGHTMARE_CHICA_STATUE.get(), NightmareChicaStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.BONNIE_BUNNY.get(), BonnieBunnyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.CHICA_CHICKEN.get(), ChicaChickenRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FOXY_PIRATE.get(), FoxyPirateRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SPRING_BONNIE_CREATURE.get(), SpringBonnieCreatureRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FREDBEAR_CREATURE.get(), FredbearCreatureRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PASSIVE_FREDDY.get(), PassiveFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PASSIVE_GOLDIE.get(), PassiveGoldieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PASSIVE_FREDBEAR.get(), PassiveFredbearRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PASSIVE_BONNIE.get(), PassiveBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PASSIVE_SPRING_BONNIE.get(), PassiveSpringBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PASSIVE_CHICA.get(), PassiveChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PASSIVE_FOXY.get(), PassiveFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DEDWITHEREDFREDDY.get(), DedwitheredfreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SITTING_WITHERED_BONNIE.get(), SittingWitheredBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SITTING_WITHERED_CHICA.get(), SittingWitheredChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_FREDDY.get(), DayTimeFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_CHICA.get(), DayTimeChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_BONNIE.get(), DayTimeBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_FOXY.get(), DayTimeFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_PUPPET.get(), DayTimePuppetRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_WITHERED_FOXY.get(), DayTimeWitheredFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.DAY_TIME_BB.get(), DayTimeBBRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.PAT_PAT.get(), PatPatRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FRED_BEAR_CRATURE.get(), FredBearCratureRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.OFFICE_CHAIR.get(), OfficeChairRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.STATUE_FREDDY.get(), StatueFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FULL_HOSTILE_FREDDY.get(), FullHostileFreddyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.STATUE_CHICA.get(), StatueChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FULL_HOSTILE_CHICA.get(), FullHostileChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FULL_HOSTILE_FOXY.get(), FullHostileFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.STATUE_FOXY.get(), StatueFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.STATUE_BONNIE.get(), StatueBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FULL_HOSTILE_BONNIE.get(), FullHostileBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SPRING_BONNIE_CREATURE_2_THE_SEQUEL.get(), SpringBonnieCreature2TheSequelRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FREDDY_STAND.get(), FreddyStandRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.BONNIE_STAND.get(), BonnieStandRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.TOY_BOX.get(), ToyBoxRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SITTING_DAYTIME_SPRINGTRAP.get(), SittingDaytimeSpringtrapRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.STANDING_DAYTIME_SPRINGTRAP.get(), StandingDaytimeSpringtrapRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.CRAWLING_TOY_BONNIE.get(), CrawlingToyBonnieRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.CRAWLING_MANGLE.get(), CrawlingMangleRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.CRAWLING_TOY_FOXY.get(), CrawlingToyFoxyRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.CRAWLING_TOY_CHICA.get(), CrawlingToyChicaRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.CRAWLING_SPRINGTRAP.get(), CrawlingSpringtrapRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SPRING_BONNIE_STATUE.get(), SpringBonnieStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FREDBEAR_STATUE.get(), FredbearStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.GLITCH_BONNIE_STATUE.get(), GlitchBonnieStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.FREDBEAR_CUT_OUT.get(), FredbearCutOutRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.SPRING_BONNIE_CUT_OUT.get(), SpringBonnieCutOutRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.GLITCH_BONNIE_CUT_OUT.get(), GlitchBonnieCutOutRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.UNWITHERED_FREDDY_STATUE.get(), UnwitheredFreddyStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.UNWITHERED_BONNIE_STATUE.get(), UnwitheredBonnieStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.UNWITHERED_CHICA_STATUE.get(), UnwitheredChicaStatueRenderer::new);
		event.registerEntityRenderer(FnafModModEntities.UNWITHERED_FOXY_STATUE.get(), UnwitheredFoxyStatueRenderer::new);
	}
}
