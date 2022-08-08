
package net.mcreator.fnafmod.client.renderer;

public class NightmareChicaStatueRenderer extends MobRenderer<NightmareChicaStatueEntity, ModelNightmare_Chica_Statue<NightmareChicaStatueEntity>> {

	public NightmareChicaStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Chica_Statue(context.bakeLayer(ModelNightmare_Chica_Statue.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(NightmareChicaStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/nightmare_chica.png");
	}

}
