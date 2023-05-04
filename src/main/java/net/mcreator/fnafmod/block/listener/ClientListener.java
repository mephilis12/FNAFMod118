package net.mcreator.fnafmod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.init.FnafModModBlockEntities;
import net.mcreator.fnafmod.block.renderer.TrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.SpringBonnieHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.MeshTrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.FreddyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FredbearHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FoxyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.EndoBlockTileRenderer;
import net.mcreator.fnafmod.block.renderer.ChicaHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.BonnieHeadTileRenderer;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(modid = FnafModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FnafModModBlockEntities.MESH_TRASH_CAN.get(), MeshTrashCanTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.TRASH_CAN.get(), TrashCanTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDDY_HEAD.get(), FreddyHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.BONNIE_HEAD.get(), BonnieHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CHICA_HEAD.get(), ChicaHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FOXY_HEAD.get(), FoxyHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDBEAR_HEAD.get(), FredbearHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.SPRING_BONNIE_HEAD.get(), SpringBonnieHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.ENDO_BLOCK.get(), EndoBlockTileRenderer::new);
	}
}
