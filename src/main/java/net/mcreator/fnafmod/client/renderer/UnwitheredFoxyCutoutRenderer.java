
package net.mcreator.fnafmod.client.renderer;

public class UnwitheredFoxyCutoutRenderer extends MobRenderer<UnwitheredFoxyCutoutEntity, ModelFredbear_Cutout<UnwitheredFoxyCutoutEntity>> {

	public UnwitheredFoxyCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear_Cutout(context.bakeLayer(ModelFredbear_Cutout.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredFoxyCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwitheredfoxy_cutout.png");
	}

}
