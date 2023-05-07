
package net.mcreator.fnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.fnafmod.entity.NightmarionneEntity;
import net.mcreator.fnafmod.client.model.Modelnightmarionne;

public class NightmarionneRenderer extends MobRenderer<NightmarionneEntity, Modelnightmarionne<NightmarionneEntity>> {
	public NightmarionneRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelnightmarionne(context.bakeLayer(Modelnightmarionne.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<NightmarionneEntity, Modelnightmarionne<NightmarionneEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("fnaf_mod:textures/entities/nightmarionne_eyeglow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(NightmarionneEntity entity) {
		return new ResourceLocation("fnaf_mod:textures/entities/nightmarionne.png");
	}
}
