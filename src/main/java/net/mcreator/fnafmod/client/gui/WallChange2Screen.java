
package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.world.inventory.WallChange2Menu;
import net.mcreator.fnafmod.network.WallChange2ButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WallChange2Screen extends AbstractContainerScreen<WallChange2Menu> {
	private final static HashMap<String, Object> guistate = WallChange2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WallChange2Screen(WallChange2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 169;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/screens/wall_change_2.png");

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
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_type_a"), 6, 35, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_one_room_face_rest_hall_faces"), 15, 44, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_type_b"), 6, 62, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_one_hall_face_rest_room_faces"), 15, 71, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_type_c"), 6, 89, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_two_room_and_hall_faces"), 15, 98, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_opposing_each_other"), 24, 107, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_type_d"), 6, 125, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_two_room_and_hall_faces1"), 15, 134, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.fnaf_mod.wall_change_2.label_forming_a_corner"), 24, 143, -12829636);
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
				new Button(this.leftPos + 15, this.topPos + 8, 30, 20, Component.translatable("gui.fnaf_mod.wall_change_2.button_a"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2ButtonMessage(0, x, y, z));
						WallChange2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 51, this.topPos + 8, 30, 20, Component.translatable("gui.fnaf_mod.wall_change_2.button_b"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2ButtonMessage(1, x, y, z));
						WallChange2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 96, this.topPos + 8, 30, 20, Component.translatable("gui.fnaf_mod.wall_change_2.button_c"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2ButtonMessage(2, x, y, z));
						WallChange2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
					}
				}));
		this.addRenderableWidget(
				new Button(this.leftPos + 132, this.topPos + 8, 30, 20, Component.translatable("gui.fnaf_mod.wall_change_2.button_d"), e -> {
					if (true) {
						FnafModMod.PACKET_HANDLER.sendToServer(new WallChange2ButtonMessage(3, x, y, z));
						WallChange2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
					}
				}));
	}
}
