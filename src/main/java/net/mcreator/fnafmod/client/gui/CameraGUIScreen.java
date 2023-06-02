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
import net.mcreator.fnafmod.procedures.CameraGUIValueProcedure;
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
	Button button_camera_1;
	Button button_camera_2;
	Button button_camera_3;
	Button button_camera_4;
	Button button_camera_5;
	Button button_previous_page;
	Button button_next_page;

	public CameraGUIScreen(CameraGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 260;
		this.imageHeight = 160;
	}

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/screens/cameratabletgui.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 260, 160, 260, 160);

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
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_cameras"), 12, 6, -1);
		this.font.draw(poseStack,

				CameraGUIValueProcedure.execute(entity), 30, 121, -1);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_to_set_a_camera"), 138, 67, -1);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_right_click_it"), 138, 76, -1);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_with_the_monitor"), 138, 85, -1);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_to_remove_a_camera"), 138, 97, -1);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_shift_click"), 138, 106, -1);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.camera_gui.label_press_z_to_exit_the_camera"), 138, 121, -1);
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
		button_camera_1 = new Button(this.leftPos + 21, this.topPos + 22, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_1"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(0, x, y, z));
				CameraGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_camera_1", button_camera_1);
		this.addRenderableWidget(button_camera_1);
		button_camera_2 = new Button(this.leftPos + 21, this.topPos + 40, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_2"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(1, x, y, z));
				CameraGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_camera_2", button_camera_2);
		this.addRenderableWidget(button_camera_2);
		button_camera_3 = new Button(this.leftPos + 21, this.topPos + 58, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_3"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(2, x, y, z));
				CameraGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_camera_3", button_camera_3);
		this.addRenderableWidget(button_camera_3);
		button_camera_4 = new Button(this.leftPos + 21, this.topPos + 76, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_4"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(3, x, y, z));
				CameraGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_camera_4", button_camera_4);
		this.addRenderableWidget(button_camera_4);
		button_camera_5 = new Button(this.leftPos + 21, this.topPos + 94, 66, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_camera_5"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(4, x, y, z));
				CameraGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_camera_5", button_camera_5);
		this.addRenderableWidget(button_camera_5);
		button_previous_page = new Button(this.leftPos + 138, this.topPos + 22, 90, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_previous_page"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(5, x, y, z));
				CameraGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_previous_page", button_previous_page);
		this.addRenderableWidget(button_previous_page);
		button_next_page = new Button(this.leftPos + 138, this.topPos + 45, 90, 20, Component.translatable("gui.fnaf_mod.camera_gui.button_next_page"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new CameraGUIButtonMessage(6, x, y, z));
				CameraGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_next_page", button_next_page);
		this.addRenderableWidget(button_next_page);
	}
}
