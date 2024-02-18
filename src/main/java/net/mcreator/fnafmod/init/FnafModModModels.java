
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.client.model.Modeltoybox;
import net.mcreator.fnafmod.client.model.Modeloffice_chair_dark;
import net.mcreator.fnafmod.client.model.Modelnightmarionne_statue;
import net.mcreator.fnafmod.client.model.Modelcamera_hanging_Converted;
import net.mcreator.fnafmod.client.model.Modelcamera;
import net.mcreator.fnafmod.client.model.Modelbullet;
import net.mcreator.fnafmod.client.model.ModelUnwitheredChica_Posed;
import net.mcreator.fnafmod.client.model.ModelThe_Croobler;
import net.mcreator.fnafmod.client.model.ModelStandFreddly;
import net.mcreator.fnafmod.client.model.ModelStandBonnie;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieMask;
import net.mcreator.fnafmod.client.model.ModelSpringBonnieBody;
import net.mcreator.fnafmod.client.model.ModelPlushtrapSit;
import net.mcreator.fnafmod.client.model.ModelPatPat;
import net.mcreator.fnafmod.client.model.ModelNightmare_Freddy_Statue;
import net.mcreator.fnafmod.client.model.ModelNightmare_Chica_Statue;
import net.mcreator.fnafmod.client.model.ModelNightmare_Bonnie_Statue;
import net.mcreator.fnafmod.client.model.ModelNightmareFredbear;
import net.mcreator.fnafmod.client.model.ModelNighmare_Foxy_Statue;
import net.mcreator.fnafmod.client.model.ModelGuard_hat;
import net.mcreator.fnafmod.client.model.ModelGlitchtrap_Mask;
import net.mcreator.fnafmod.client.model.ModelFreddy_Mask;
import net.mcreator.fnafmod.client.model.ModelFreddyStand;
import net.mcreator.fnafmod.client.model.ModelFreddyHead;
import net.mcreator.fnafmod.client.model.ModelFredbearMask;
import net.mcreator.fnafmod.client.model.ModelFredbearFNAF4;
import net.mcreator.fnafmod.client.model.ModelFoxyMask;
import net.mcreator.fnafmod.client.model.ModelCutoutSpringBonnie;
import net.mcreator.fnafmod.client.model.ModelCutoutFredbear;
import net.mcreator.fnafmod.client.model.ModelCustomModel;
import net.mcreator.fnafmod.client.model.ModelChicaMask;
import net.mcreator.fnafmod.client.model.ModelBonnieStand;
import net.mcreator.fnafmod.client.model.ModelBonnieMask;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class FnafModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFredbearMask.LAYER_LOCATION, ModelFredbearMask::createBodyLayer);
		event.registerLayerDefinition(ModelBonnieStand.LAYER_LOCATION, ModelBonnieStand::createBodyLayer);
		event.registerLayerDefinition(ModelGlitchtrap_Mask.LAYER_LOCATION, ModelGlitchtrap_Mask::createBodyLayer);
		event.registerLayerDefinition(ModelSpringBonnieBody.LAYER_LOCATION, ModelSpringBonnieBody::createBodyLayer);
		event.registerLayerDefinition(ModelFredbearFNAF4.LAYER_LOCATION, ModelFredbearFNAF4::createBodyLayer);
		event.registerLayerDefinition(Modeloffice_chair_dark.LAYER_LOCATION, Modeloffice_chair_dark::createBodyLayer);
		event.registerLayerDefinition(ModelStandBonnie.LAYER_LOCATION, ModelStandBonnie::createBodyLayer);
		event.registerLayerDefinition(ModelNightmareFredbear.LAYER_LOCATION, ModelNightmareFredbear::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(ModelCutoutFredbear.LAYER_LOCATION, ModelCutoutFredbear::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Bonnie_Statue.LAYER_LOCATION, ModelNightmare_Bonnie_Statue::createBodyLayer);
		event.registerLayerDefinition(Modelnightmarionne_statue.LAYER_LOCATION, Modelnightmarionne_statue::createBodyLayer);
		event.registerLayerDefinition(Modelcamera.LAYER_LOCATION, Modelcamera::createBodyLayer);
		event.registerLayerDefinition(ModelNighmare_Foxy_Statue.LAYER_LOCATION, ModelNighmare_Foxy_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelFreddyHead.LAYER_LOCATION, ModelFreddyHead::createBodyLayer);
		event.registerLayerDefinition(ModelGuard_hat.LAYER_LOCATION, ModelGuard_hat::createBodyLayer);
		event.registerLayerDefinition(ModelFreddyStand.LAYER_LOCATION, ModelFreddyStand::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Freddy_Statue.LAYER_LOCATION, ModelNightmare_Freddy_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelSpringBonnieMask.LAYER_LOCATION, ModelSpringBonnieMask::createBodyLayer);
		event.registerLayerDefinition(ModelUnwitheredChica_Posed.LAYER_LOCATION, ModelUnwitheredChica_Posed::createBodyLayer);
		event.registerLayerDefinition(Modeltoybox.LAYER_LOCATION, Modeltoybox::createBodyLayer);
		event.registerLayerDefinition(Modelcamera_hanging_Converted.LAYER_LOCATION, Modelcamera_hanging_Converted::createBodyLayer);
		event.registerLayerDefinition(ModelCutoutSpringBonnie.LAYER_LOCATION, ModelCutoutSpringBonnie::createBodyLayer);
		event.registerLayerDefinition(ModelFreddy_Mask.LAYER_LOCATION, ModelFreddy_Mask::createBodyLayer);
		event.registerLayerDefinition(Modelbullet.LAYER_LOCATION, Modelbullet::createBodyLayer);
		event.registerLayerDefinition(ModelStandFreddly.LAYER_LOCATION, ModelStandFreddly::createBodyLayer);
		event.registerLayerDefinition(ModelBonnieMask.LAYER_LOCATION, ModelBonnieMask::createBodyLayer);
		event.registerLayerDefinition(ModelChicaMask.LAYER_LOCATION, ModelChicaMask::createBodyLayer);
		event.registerLayerDefinition(ModelPatPat.LAYER_LOCATION, ModelPatPat::createBodyLayer);
		event.registerLayerDefinition(ModelNightmare_Chica_Statue.LAYER_LOCATION, ModelNightmare_Chica_Statue::createBodyLayer);
		event.registerLayerDefinition(ModelFoxyMask.LAYER_LOCATION, ModelFoxyMask::createBodyLayer);
		event.registerLayerDefinition(ModelPlushtrapSit.LAYER_LOCATION, ModelPlushtrapSit::createBodyLayer);
		event.registerLayerDefinition(ModelThe_Croobler.LAYER_LOCATION, ModelThe_Croobler::createBodyLayer);
	}
}
