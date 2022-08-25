
package net.mcreator.fnafmod.client.renderer;

public class UnwitheredFreddyCutoutRenderer extends MobRenderer<UnwitheredFreddyCutoutEntity, ModelFredbear_Cutout<UnwitheredFreddyCutoutEntity>> {

	public UnwitheredFreddyCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear_Cutout(context.bakeLayer(ModelFredbear_Cutout.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredFreddyCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwitheredfreddy_cutout.png");
	}

}
