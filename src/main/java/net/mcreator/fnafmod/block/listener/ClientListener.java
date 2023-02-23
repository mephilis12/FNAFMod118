package net.mcreator.fnafmod.block.listener;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.fnafmod.block.renderer.TrashCanTileRenderer;
import net.mcreator.fnafmod.block.renderer.MeshTrashCanTileRenderer;
import net.mcreator.fnafmod.block.registry.TileRegistry;
import net.mcreator.fnafmod.block.registry.DisplayRegistry;
import net.mcreator.fnafmod.FnafModMod;

@Mod.EventBusSubscriber(modid = FnafModMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(TileRegistry.MESH_TRASH_CAN.get(), MeshTrashCanTileRenderer::new);
		event.registerBlockEntityRenderer(TileRegistry.TRASH_CAN.get(), TrashCanTileRenderer::new);
	}

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			TileRegistry.TILES.register(FMLJavaModLoadingContext.get().getModEventBus());
			DisplayRegistry.DISPLAY.register(FMLJavaModLoadingContext.get().getModEventBus());
		});
	}
}
