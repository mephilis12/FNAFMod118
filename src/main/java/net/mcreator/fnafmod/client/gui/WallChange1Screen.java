
package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.world.inventory.WallChange1Menu;
import net.mcreator.fnafmod.network.WallChange1ButtonMessage;
import net.mcreator.fnafmod.FnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WallChange1Screen extends AbstractContainerScreen<WallChange1Menu> {
	private final static HashMap<String, Object> guistate = WallChange1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public WallChange1Screen(WallChange1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 169;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/screens/wall_change_1.png");

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
		this.font.draw(poseStack, "Type A:", 6, 35, -12829636);
		this.font.draw(poseStack, "One Room Face Rest Hall Faces", 15, 44, -12829636);
		this.font.draw(poseStack, "Type B:", 6, 62, -12829636);
		this.font.draw(poseStack, "One Hall Face Rest Room Faces", 15, 71, -12829636);
		this.font.draw(poseStack, "Type C:", 6, 89, -12829636);
		this.font.draw(poseStack, "Two Room and Hall Faces ", 15, 98, -12829636);
		this.font.draw(poseStack, " Opposing Each Other", 24, 107, -12829636);
		this.font.draw(poseStack, "Type D:", 6, 125, -12829636);
		this.font.draw(poseStack, "Two Room and Hall Faces ", 15, 134, -12829636);
		this.font.draw(poseStack, "Forming a Corner", 24, 143, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 8, 30, 20, new TextComponent("A"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange1ButtonMessage(0, x, y, z));
				WallChange1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 51, this.topPos + 8, 30, 20, new TextComponent("B"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange1ButtonMessage(1, x, y, z));
				WallChange1ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 96, this.topPos + 8, 30, 20, new TextComponent("C"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange1ButtonMessage(2, x, y, z));
				WallChange1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 132, this.topPos + 8, 30, 20, new TextComponent("D"), e -> {
			if (true) {
				FnafModMod.PACKET_HANDLER.sendToServer(new WallChange1ButtonMessage(3, x, y, z));
				WallChange1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
