
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.client.model.Modeltoybox;
import net.mcreator.fnafmod.client.model.Modelsitting_fredbear;
import net.mcreator.fnafmod.client.model.Modelpuppet;
import net.mcreator.fnafmod.client.model.Modeloffice_chair_dark;
import net.mcreator.fnafmod.client.model.Modelnightmarionne_statue;
import net.mcreator.fnafmod.client.model.Modelnightmarionne;
import net.mcreator.fnafmod.client.model.Modelgolden_freddy;
import net.mcreator.fnafmod.client.model.Modelcamera;
import net.mcreator.fnafmod.client.model.ModelWithered_Freddy_Daytime;
import net.mcreator.fnafmod.client.model.ModelWithered_Bonnie;
import net.mcreator.fnafmod.client.model.ModelWitheredGoldenFreddy;
import net.mcreator.fnafmod.client.model.ModelWitheredFreddy;
import net.mcreator.fnafmod.client.model.ModelWitheredFoxy;
import net.mcreator.fnafmod.client.model.ModelWitheredChica;
import net.mcreator.fnafmod.client.model.ModelVent_Toy_Bonnie;
import net.mcreator.fnafmod.client.model.ModelUnwithered_Bonnie_Posed;
import net.mcreator.fnafmod.client.model.ModelUnwithered_Bonnie_Cutout;
import net.mcreator.fnafmod.client.model.ModelUnwithered_Bonnie;
import net.mcreator.fnafmod.client.model.ModelUnwitheredFreddyPosed;
import net.mcreator.fnafmod.client.model.ModelUnwitheredFreddy;
import net.mcreator.fnafmod.client.model.ModelUnwitheredFoxy_Pose;
import net.mcreator.fnafmod.client.model.ModelUnwitheredFoxy;
import net.mcreator.fnafmod.client.model.ModelUnwitheredChica_Posed;
import net.mcreator.fnafmod.client.model.ModelUnwitheredChica;
import net.mcreator.fnafmod.client.model.ModelUCN_Spring_Bonnie;
import net.mcreator.fnafmod.client.model.ModelToy_Freddy_Daytime;
import net.mcreator.fnafmod.client.model.ModelToy_Freddy;
import net.mcreator.fnafmod.client.model.ModelToy_Foxy_Daytime;
import net.mcreator.fnafmod.client.model.ModelToy_Foxy;
import net.mcreator.fnafmod.client.model.ModelToy_Chica_Daytime;
import net.mcreator.fnafmod.client.model.ModelToy_Chica;
import net.mcreator.fnafmod.client.model.ModelToy_Bonnie_Day;
import net.mcreator.fnafmod.client.model.ModelToy_Bonnie;
import net.mcreator.fnafmod.client.model.ModelThe_Croobler;
import net.mcreator.fnafmod.client.model.ModelStandingSpringBonnie;
import net.mcreator.fnafmod.client.model.ModelSpringtrap;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieSitting;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieMask;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieCutOut;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieBody;
import net.mcreator.fnafmod.client.model.ModelSpringBonnie;
import net.mcreator.fnafmod.client.model.ModelSittingWitheredChica;
import net.mcreator.fnafmod.client.model.ModelSittingWitheredBonnie;
import net.mcreator.fnafmod.client.model.ModelPlushtrap;
import net.mcreator.fnafmod.client.model.ModelPhantom_Freddy;
import net.mcreator.fnafmod.client.model.ModelPhantom_Foxy;
import net.mcreator.fnafmod.client.model.ModelPhantom_BB;
import net.mcreator.fnafmod.client.model.ModelPatPat;
import net.mcreator.fnafmod.client.model.ModelNightmare_Freddy_Statue;
import net.mcreator.fnafmod.client.model.ModelNightmare_Freddy;
import net.mcreator.fnafmod.client.model.ModelNightmare_Fredbear;
import net.mcreator.fnafmod.client.model.ModelNightmare_Foxy;
import net.mcreator.fnafmod.client.model.ModelNightmare_Chica_Statue;
import net.mcreator.fnafmod.client.model.ModelNightmare_Chica;
import net.mcreator.fnafmod.client.model.ModelNightmare_Bonnie_Statue;
import net.mcreator.fnafmod.client.model.ModelNightmareFredbear;
import net.mcreator.fnafmod.client.model.ModelNighmare_Foxy_Statue;
import net.mcreator.fnafmod.client.model.ModelNighmare_Bonnie;
import net.mcreator.fnafmod.client.model.ModelMangle_Day;
import net.mcreator.fnafmod.client.model.ModelMangle;
import net.mcreator.fnafmod.client.model.ModelJJ;
import net.mcreator.fnafmod.client.model.ModelGuard_hat;
import net.mcreator.fnafmod.client.model.ModelGlitchtrap_Mask;
import net.mcreator.fnafmod.client.model.ModelFreddy_Mask;
import net.mcreator.fnafmod.client.model.ModelFreddyStand;
import net.mcreator.fnafmod.client.model.ModelFreddyFazbear;
import net.mcreator.fnafmod.client.model.ModelFreddyDayTime;
import net.mcreator.fnafmod.client.model.ModelFredbear_Cutout;
import net.mcreator.fnafmod.client.model.ModelFredbearMask;
import net.mcreator.fnafmod.client.model.ModelFredbearFNAF4;
import net.mcreator.fnafmod.client.model.ModelFredbear;
import net.mcreator.fnafmod.client.model.ModelFoxyMask;
import net.mcreator.fnafmod.client.model.ModelFoxyDayTime;
import net.mcreator.fnafmod.client.model.ModelFoxy;
import net.mcreator.fnafmod.client.model.ModelEndo02;
import net.mcreator.fnafmod.client.model.ModelEndo;
import net.mcreator.fnafmod.client.model.ModelDaytime_Chica;
import net.mcreator.fnafmod.client.model.ModelDaytime_Bonnie;
import net.mcreator.fnafmod.client.model.ModelDaytimeSpringtrap;
import net.mcreator.fnafmod.client.model.ModelDaytimePuppet;
import net.mcreator.fnafmod.client.model.ModelDaytimeBB;
import net.mcreator.fnafmod.client.model.ModelDayTimeWitheredFoxy;
import net.mcreator.fnafmod.client.model.ModelDayTimeBalloonBoy;
import net.mcreator.fnafmod.client.model.ModelCrawling_Toy_Foxy;
import net.mcreator.fnafmod.client.model.ModelCrawling_Toy_Chica;
import net.mcreator.fnafmod.client.model.ModelCrawling_Springtrap;
import net.mcreator.fnafmod.client.model.ModelCrawling_Mangle;
import net.mcreator.fnafmod.client.model.ModelChica;
import net.mcreator.fnafmod.client.model.ModelBonnie_The_Bunny;
import net.mcreator.fnafmod.client.model.ModelBonnieStand;
import net.mcreator.fnafmod.client.model.ModelBalloonBoy;
import net.mcreator.fnafmod.client.model.ModelBB;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FnafModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBonnieStand.LAYER_LOCATION, ModelBonnieStand::createBodyLayer);
		event.registerLayerDefinition(ModelWithered_Bonnie.LAYER_LOCATION, ModelWithered_Bonnie::createBodyLayer);
		event.registerLayerDefinition(ModelBB.LAYER_LOCATION, ModelBB::createBodyLayer);
		event.registerLayerDefinition(ModelGlitchtrap_Mask.LAYER_LOCATION, ModelGlitchtrap_Mask::createBodyLayer);
		event.registerLayerDefinition(ModelWitheredFoxy.LAYER_LOCATION, ModelWitheredFoxy::createBodyLayer);
		event.registerLayerDefinition(ModelSpringBonnie.LAYER_LOCATION, ModelSpringBonnie::createBodyLayer);
		event.registerLayerDefinition(ModelUCN_Spring_Bonnie.LAYER_LOCATION, ModelUCN_Spring_Bonnie::createBodyLayer);
		event.registerLayerDefinition(ModelDayTimeWitheredFoxy.LAYER_LOCATION, ModelDayTimeWitheredFoxy::createBodyLayer);
		event.registerLayerDefinition(ModelFredbearFNAF4.LAYER_LOCATION, ModelFredbearFNAF4::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Freddy_Daytime.LAYER_LOCATION, ModelToy_Freddy_Daytime::createBodyLayer);
		event.registerLayerDefinition(ModelWitheredGoldenFreddy.LAYER_LOCATION, ModelWitheredGoldenFreddy::createBodyLayer);
		event.registerLayerDefinition(ModelCrawling_Mangle.LAYER_LOCATION, ModelCrawling_Mangle::createBodyLayer);
		event.registerLayerDefinition(Modeloffice_chair_dark.LAYER_LOCATION, Modeloffice_chair_dark::createBodyLayer);
		event.registerLayerDefinition(Modelgolden_freddy.LAYER_LOCATION, Modelgolden_freddy::createBodyLayer);
		event.registerLayerDefinition(ModelNightmareFredbear.LAYER_LOCATION, ModelNightmareFredbear::createBodyLayer);
		event.registerLayerDefinition(ModelDaytime_Bonnie.LAYER_LOCATION, ModelDaytime_Bonnie::createBodyLayer);
		event.registerLayerDefinition(ModelUnwitheredFreddyPosed.LAYER_LOCATION, ModelUnwitheredFreddyPosed::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Chica.LAYER_LOCATION, ModelNightmare_Chica::createBodyLayer);
		event.registerLayerDefinition(ModelWitheredFreddy.LAYER_LOCATION, ModelWitheredFreddy::createBodyLayer);
		event.registerLayerDefinition(Modelcamera.LAYER_LOCATION, Modelcamera::createBodyLayer);
		event.registerLayerDefinition(ModelUnwitheredChica.LAYER_LOCATION, ModelUnwitheredChica::createBodyLayer);
		event.registerLayerDefinition(ModelDaytimeSpringtrap.LAYER_LOCATION, ModelDaytimeSpringtrap::createBodyLayer);
		event.registerLayerDefinition(Modelpuppet.LAYER_LOCATION, Modelpuppet::createBodyLayer);
		event.registerLayerDefinition(ModelPhantom_BB.LAYER_LOCATION, ModelPhantom_BB::createBodyLayer);
		event.registerLayerDefinition(ModelFreddyStand.LAYER_LOCATION, ModelFreddyStand::createBodyLayer);
		event.registerLayerDefinition(ModelDaytimePuppet.LAYER_LOCATION, ModelDaytimePuppet::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Freddy_Statue.LAYER_LOCATION, ModelNightmare_Freddy_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelSpringBonnieMask.LAYER_LOCATION, ModelSpringBonnieMask::createBodyLayer);
		event.registerLayerDefinition(ModelUnwitheredChica_Posed.LAYER_LOCATION, ModelUnwitheredChica_Posed::createBodyLayer);
		event.registerLayerDefinition(Modeltoybox.LAYER_LOCATION, Modeltoybox::createBodyLayer);
		event.registerLayerDefinition(ModelDaytime_Chica.LAYER_LOCATION, ModelDaytime_Chica::createBodyLayer);
		event.registerLayerDefinition(Modelsitting_fredbear.LAYER_LOCATION, Modelsitting_fredbear::createBodyLayer);
		event.registerLayerDefinition(ModelSittingWitheredBonnie.LAYER_LOCATION, ModelSittingWitheredBonnie::createBodyLayer);
		event.registerLayerDefinition(ModelNighmare_Bonnie.LAYER_LOCATION, ModelNighmare_Bonnie::createBodyLayer);
		event.registerLayerDefinition(ModelPhantom_Foxy.LAYER_LOCATION, ModelPhantom_Foxy::createBodyLayer);
		event.registerLayerDefinition(ModelSittingWitheredChica.LAYER_LOCATION, ModelSittingWitheredChica::createBodyLayer);
		event.registerLayerDefinition(ModelDayTimeBalloonBoy.LAYER_LOCATION, ModelDayTimeBalloonBoy::createBodyLayer);
		event.registerLayerDefinition(ModelFreddyFazbear.LAYER_LOCATION, ModelFreddyFazbear::createBodyLayer);
		event.registerLayerDefinition(ModelVent_Toy_Bonnie.LAYER_LOCATION, ModelVent_Toy_Bonnie::createBodyLayer);
		event.registerLayerDefinition(ModelPhantom_Freddy.LAYER_LOCATION, ModelPhantom_Freddy::createBodyLayer);
		event.registerLayerDefinition(ModelSpringtrap.LAYER_LOCATION, ModelSpringtrap::createBodyLayer);
		event.registerLayerDefinition(ModelCrawling_Springtrap.LAYER_LOCATION, ModelCrawling_Springtrap::createBodyLayer);
		event.registerLayerDefinition(ModelBonnie_The_Bunny.LAYER_LOCATION, ModelBonnie_The_Bunny::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Bonnie.LAYER_LOCATION, ModelToy_Bonnie::createBodyLayer);
		event.registerLayerDefinition(ModelPatPat.LAYER_LOCATION, ModelPatPat::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Chica.LAYER_LOCATION, ModelToy_Chica::createBodyLayer);
		event.registerLayerDefinition(ModelWitheredChica.LAYER_LOCATION, ModelWitheredChica::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Chica_Statue.LAYER_LOCATION, ModelNightmare_Chica_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelFredbear_Cutout.LAYER_LOCATION, ModelFredbear_Cutout::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Chica_Daytime.LAYER_LOCATION, ModelToy_Chica_Daytime::createBodyLayer);
		event.registerLayerDefinition(ModelThe_Croobler.LAYER_LOCATION, ModelThe_Croobler::createBodyLayer);
		event.registerLayerDefinition(ModelMangle_Day.LAYER_LOCATION, ModelMangle_Day::createBodyLayer);
		event.registerLayerDefinition(ModelFredbear.LAYER_LOCATION, ModelFredbear::createBodyLayer);
		event.registerLayerDefinition(ModelFredbearMask.LAYER_LOCATION, ModelFredbearMask::createBodyLayer);
		event.registerLayerDefinition(ModelCrawling_Toy_Foxy.LAYER_LOCATION, ModelCrawling_Toy_Foxy::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Foxy.LAYER_LOCATION, ModelNightmare_Foxy::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Bonnie_Day.LAYER_LOCATION, ModelToy_Bonnie_Day::createBodyLayer);
		event.registerLayerDefinition(ModelEndo.LAYER_LOCATION, ModelEndo::createBodyLayer);
		event.registerLayerDefinition(ModelSpringBonnieBody.LAYER_LOCATION, ModelSpringBonnieBody::createBodyLayer);
		event.registerLayerDefinition(ModelBalloonBoy.LAYER_LOCATION, ModelBalloonBoy::createBodyLayer);
		event.registerLayerDefinition(ModelChica.LAYER_LOCATION, ModelChica::createBodyLayer);
		event.registerLayerDefinition(ModelFoxy.LAYER_LOCATION, ModelFoxy::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Freddy.LAYER_LOCATION, ModelToy_Freddy::createBodyLayer);
		event.registerLayerDefinition(ModelUnwitheredFreddy.LAYER_LOCATION, ModelUnwitheredFreddy::createBodyLayer);
		event.registerLayerDefinition(ModelWithered_Freddy_Daytime.LAYER_LOCATION, ModelWithered_Freddy_Daytime::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Bonnie_Statue.LAYER_LOCATION, ModelNightmare_Bonnie_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Fredbear.LAYER_LOCATION, ModelNightmare_Fredbear::createBodyLayer);
		event.registerLayerDefinition(Modelnightmarionne_statue.LAYER_LOCATION, Modelnightmarionne_statue::createBodyLayer);
		event.registerLayerDefinition(ModelFoxyDayTime.LAYER_LOCATION, ModelFoxyDayTime::createBodyLayer);
		event.registerLayerDefinition(ModelNighmare_Foxy_Statue.LAYER_LOCATION, ModelNighmare_Foxy_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Foxy.LAYER_LOCATION, ModelToy_Foxy::createBodyLayer);
		event.registerLayerDefinition(ModelPlushtrap.LAYER_LOCATION, ModelPlushtrap::createBodyLayer);
		event.registerLayerDefinition(ModelCrawling_Toy_Chica.LAYER_LOCATION, ModelCrawling_Toy_Chica::createBodyLayer);
		event.registerLayerDefinition(ModelJJ.LAYER_LOCATION, ModelJJ::createBodyLayer);
		event.registerLayerDefinition(ModelGuard_hat.LAYER_LOCATION, ModelGuard_hat::createBodyLayer);
		event.registerLayerDefinition(ModelToy_Foxy_Daytime.LAYER_LOCATION, ModelToy_Foxy_Daytime::createBodyLayer);
		event.registerLayerDefinition(ModelStandingSpringBonnie.LAYER_LOCATION, ModelStandingSpringBonnie::createBodyLayer);
		event.registerLayerDefinition(ModelUnwitheredFoxy_Pose.LAYER_LOCATION, ModelUnwitheredFoxy_Pose::createBodyLayer);
		event.registerLayerDefinition(ModelFreddy_Mask.LAYER_LOCATION, ModelFreddy_Mask::createBodyLayer);
		event.registerLayerDefinition(ModelSpringBonnieCutOut.LAYER_LOCATION, ModelSpringBonnieCutOut::createBodyLayer);
		event.registerLayerDefinition(ModelUnwithered_Bonnie_Posed.LAYER_LOCATION, ModelUnwithered_Bonnie_Posed::createBodyLayer);
		event.registerLayerDefinition(ModelEndo02.LAYER_LOCATION, ModelEndo02::createBodyLayer);
		event.registerLayerDefinition(ModelUnwithered_Bonnie.LAYER_LOCATION, ModelUnwithered_Bonnie::createBodyLayer);
		event.registerLayerDefinition(ModelDaytimeBB.LAYER_LOCATION, ModelDaytimeBB::createBodyLayer);
		event.registerLayerDefinition(ModelUnwitheredFoxy.LAYER_LOCATION, ModelUnwitheredFoxy::createBodyLayer);
		event.registerLayerDefinition(Modelnightmarionne.LAYER_LOCATION, Modelnightmarionne::createBodyLayer);
		event.registerLayerDefinition(ModelUnwithered_Bonnie_Cutout.LAYER_LOCATION, ModelUnwithered_Bonnie_Cutout::createBodyLayer);
		event.registerLayerDefinition(ModelMangle.LAYER_LOCATION, ModelMangle::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Freddy.LAYER_LOCATION, ModelNightmare_Freddy::createBodyLayer);
		event.registerLayerDefinition(ModelFoxyMask.LAYER_LOCATION, ModelFoxyMask::createBodyLayer);
		event.registerLayerDefinition(ModelFreddyDayTime.LAYER_LOCATION, ModelFreddyDayTime::createBodyLayer);
		event.registerLayerDefinition(ModelSpringBonnieSitting.LAYER_LOCATION, ModelSpringBonnieSitting::createBodyLayer);
	}
}
