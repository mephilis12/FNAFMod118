
package net.mcreator.fnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.fnafmod.world.inventory.RemnantInfuserMenu;
import net.mcreator.fnafmod.procedures.Remnant1Procedure;
import net.mcreator.fnafmod.procedures.Remant3Procedure;
import net.mcreator.fnafmod.procedures.Remant2Procedure;
import net.mcreator.fnafmod.procedures.Progress6Procedure;
import net.mcreator.fnafmod.procedures.Progress5Procedure;
import net.mcreator.fnafmod.procedures.Progress4Procedure;
import net.mcreator.fnafmod.procedures.Progress3Procedure;
import net.mcreator.fnafmod.procedures.Progress2Procedure;
import net.mcreator.fnafmod.procedures.Progress1Procedure;
import net.mcreator.fnafmod.procedures.DarkRemnant3Procedure;
import net.mcreator.fnafmod.procedures.DarkRemnant2Procedure;
import net.mcreator.fnafmod.procedures.DarkRemnant1Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RemnantInfuserScreen extends AbstractContainerScreen<RemnantInfuserMenu> {
	private final static HashMap<String, Object> guistate = RemnantInfuserMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RemnantInfuserScreen(RemnantInfuserMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fnaf_mod:textures/remnant_infuser.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/remnant_infuser_bbackground.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		if (Remnant1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/energy_low.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Remant2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/energy_2.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Remant3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/energy_full.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/progress_1.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/progress_2nd.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/progress_3rd.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/progress_2nd_to_last.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/progress_last.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (Progress6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/progress_full.png"));
			this.blit(ms, this.leftPos + 152, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (DarkRemnant3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/darkremnant.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (DarkRemnant2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/darkremnant2.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
		if (DarkRemnant1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("fnaf_mod:textures/darkremnantlow.png"));
			this.blit(ms, this.leftPos + 8, this.topPos + 9, 0, 0, 16, 64, 16, 64);
		}
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
	}
}
