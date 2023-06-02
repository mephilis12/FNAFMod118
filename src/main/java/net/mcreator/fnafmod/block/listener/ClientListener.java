package net.mcreator.fnafmod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.init.FnafModModBlockEntities;
import net.mcreator.fnafmod.block.renderer.UnWitheredFreddyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.UnWitheredFoxyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.UnWitheredChicaHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.UnWitheredBonnieHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.TrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightRedOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightRedOffTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightPinkOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightPinkOffTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightOrangeOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightOrangeOffTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightOnTileRenderer;
import net.mcreator.fnafmod.block.renderer.StageLightOffTileRenderer;
import net.mcreator.fnafmod.block.renderer.SpringBonnieHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.ShelfTileRenderer;
import net.mcreator.fnafmod.block.renderer.MeshTrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.FreddyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FredbearHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FoxyHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.FoxyHeadDecorationTileRenderer;
import net.mcreator.fnafmod.block.renderer.EndoBlockTileRenderer;
import net.mcreator.fnafmod.block.renderer.ChicaHeadTileRenderer;
import net.mcreator.fnafmod.block.renderer.ChicaHeadDecorationTileRenderer;
import net.mcreator.fnafmod.block.renderer.BonnieHeadTileRenderer;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(modid = FnafModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FnafModModBlockEntities.MESH_TRASH_CAN.get(), MeshTrashCanTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.TRASH_CAN.get(), TrashCanTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_OFF.get(), StageLightOffTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_PINK_OFF.get(), StageLightPinkOffTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_ORANGE_OFF.get(), StageLightOrangeOffTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_RED_OFF.get(), StageLightRedOffTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CHICA_HEAD_DECORATION.get(), ChicaHeadDecorationTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FOXY_HEAD_DECORATION.get(), FoxyHeadDecorationTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.SHELF.get(), ShelfTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDDY_HEAD.get(), FreddyHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.BONNIE_HEAD.get(), BonnieHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.CHICA_HEAD.get(), ChicaHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FOXY_HEAD.get(), FoxyHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.FREDBEAR_HEAD.get(), FredbearHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.SPRING_BONNIE_HEAD.get(), SpringBonnieHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.ENDO_BLOCK.get(), EndoBlockTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_FREDDY_HEAD.get(), UnWitheredFreddyHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_BONNIE_HEAD.get(), UnWitheredBonnieHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_FOXY_HEAD.get(), UnWitheredFoxyHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.UN_WITHERED_CHICA_HEAD.get(), UnWitheredChicaHeadTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_ON.get(), StageLightOnTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_PINK_ON.get(), StageLightPinkOnTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_ORANGE_ON.get(), StageLightOrangeOnTileRenderer::new);
		event.registerBlockEntityRenderer(FnafModModBlockEntities.STAGE_LIGHT_RED_ON.get(), StageLightRedOnTileRenderer::new);
	}
}
