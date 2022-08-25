
package net.mcreator.fnafmod.client.renderer;

public class UnwitheredChicaCutoutRenderer extends MobRenderer<UnwitheredChicaCutoutEntity, ModelFredbear_Cutout<UnwitheredChicaCutoutEntity>> {

	public UnwitheredChicaCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFredbear_Cutout(context.bakeLayer(ModelFredbear_Cutout.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredChicaCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwitheredchica_cutout.png");
	}

}
