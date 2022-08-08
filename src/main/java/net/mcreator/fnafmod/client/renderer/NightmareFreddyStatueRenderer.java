
package net.mcreator.fnafmod.client.renderer;

public class NightmareFreddyStatueRenderer
		extends
			MobRenderer<NightmareFreddyStatueEntity, ModelNightmare_Freddy_Statue<NightmareFreddyStatueEntity>> {

	public NightmareFreddyStatueRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNightmare_Freddy_Statue(context.bakeLayer(ModelNightmare_Freddy_Statue.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(NightmareFreddyStatueEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/nightmarefreddy.png");
	}

}
