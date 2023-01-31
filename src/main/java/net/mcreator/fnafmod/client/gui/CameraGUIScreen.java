
package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.world.inventory.CameraGUIMenu;
import net.mcreator.fnafmod.network.CameraGUIButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CameraGUIScreen extends AbstractContainerScreen<CameraGUIMenu> {
	private final static HashMap<String, Object> guistate = CameraGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CameraGUIScreen(CameraGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/screens/camera_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_cameras"), 17, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_page_enbtintegerplus2"), 8, 151, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_to_set_a_camera"), 80, 79, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_right_click_it"), 80, 88, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_with_the_monitor"), 80, 97, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_to_remove_a_camera"), 80, 106, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_shift_click"), 80, 115, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_you_can_have_unlimited_cameras"), 8, 124, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_swap_pages_for_each_set_of_5"), 8, 133, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_press_z_to_exit_the_camera"), 8, 142, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(
				new Button(this.leftPos + 8, this.topPos + 25, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_1"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(0, x, y, z));
						CameraGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 8, this.topPos + 43, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_2"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(1, x, y, z));
						CameraGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 8, this.topPos + 61, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_3"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(2, x, y, z));
						CameraGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 8, this.topPos + 79, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_4"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(3, x, y, z));
						CameraGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 8, this.topPos + 97, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_5"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(4, x, y, z));
						CameraGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 80, this.topPos + 25, 90, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_previous_page"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(5, x, y, z));
						CameraGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 80, this.topPos + 52, 90, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_next_page"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(6, x, y, z));
						CameraGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
					}
				}));
	}
}
