package net.mcreator.fnafmod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.init.FnafModModBlockEntities;
import net.mcreator.fnafmod.block.renderer.TrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.MeshTrashCanTileRenderer;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(modid = FnafModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FnafModModBlockEntities.MESH_TRASH_CAN.get(), MeshTrashCanTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.TRASH_CAN.get(), TrashCanTileRenderer::new);
	}
}
