
package net.mcreator.fnafmod.client.renderer;

public class UnwitheredBonnieCutoutRenderer
		extends
			MobRenderer<UnwitheredBonnieCutoutEntity, ModelUnwithered_Bonnie_Cutout<UnwitheredBonnieCutoutEntity>> {

	public UnwitheredBonnieCutoutRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelUnwithered_Bonnie_Cutout(context.bakeLayer(ModelUnwithered_Bonnie_Cutout.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(UnwitheredBonnieCutoutEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/unwithered_bonnie_cutout.png");
	}

}
