
package net.mcreator.fnafmod.client.renderer;

public class NightmareBonnieStatueRenderer
		extends
			MobRenderer<NightmareBonnieStatueEntity, ModelNightmare_Bonnie_Statue<NightmareBonnieStatueEntity>> {

	public NightmareBonnieStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Bonnie_Statue(context.bakeLayer(ModelNightmare_Bonnie_Statue.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(NightmareBonnieStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/nightmare_bonnie.png");
	}

}
