
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.fnafmod.block.entity.VendingBottomBlockEntity;
import net.mcreator.fnafmod.block.entity.VassDollTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredFreddyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredFoxyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredChicaHeadTileEntity;
import net.mcreator.fnafmod.block.entity.UnWitheredBonnieHeadTileEntity;
import net.mcreator.fnafmod.block.entity.TrashCanTileEntity;
import net.mcreator.fnafmod.block.entity.ToyFreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.ToyFreddySignOffTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightRedOnTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightRedOffTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightPinkOnTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightPinkOffTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightOrangeOnTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightOrangeOffTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightOnTileEntity;
import net.mcreator.fnafmod.block.entity.StageLightOffTileEntity;
import net.mcreator.fnafmod.block.entity.SpringBonnieHeadTileEntity;
import net.mcreator.fnafmod.block.entity.SpringBonnieDecorTileEntity;
import net.mcreator.fnafmod.block.entity.SilverLockerTopBlockEntity;
import net.mcreator.fnafmod.block.entity.SilverLockerBottomBlockEntity;
import net.mcreator.fnafmod.block.entity.ShelfTileEntity;
import net.mcreator.fnafmod.block.entity.RetroFreddySignTileEntity;
import net.mcreator.fnafmod.block.entity.RetroFreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.RemantInfuserBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushFreddyBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushFredbearBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushFoxyBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushChicaBlockEntity;
import net.mcreator.fnafmod.block.entity.PlushBonnieBlockEntity;
import net.mcreator.fnafmod.block.entity.MeshTrashCanTileEntity;
import net.mcreator.fnafmod.block.entity.LocketBottomBlockEntity;
import net.mcreator.fnafmod.block.entity.LockerTopBlockEntity;
import net.mcreator.fnafmod.block.entity.FreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.FreddySignOffTileEntity;
import net.mcreator.fnafmod.block.entity.FreddyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.FredbearSignTileEntity;
import net.mcreator.fnafmod.block.entity.FredbearHeadTileEntity;
import net.mcreator.fnafmod.block.entity.FoxyHeadTileEntity;
import net.mcreator.fnafmod.block.entity.FoxyHeadDecorationTileEntity;
import net.mcreator.fnafmod.block.entity.FlashLightLightBlockEntity;
import net.mcreator.fnafmod.block.entity.EndoBlockTileEntity;
import net.mcreator.fnafmod.block.entity.DeskBlockEntity;
import net.mcreator.fnafmod.block.entity.Desk3BlockEntity;
import net.mcreator.fnafmod.block.entity.Desk2BlockEntity;
import net.mcreator.fnafmod.block.entity.ChicaHeadTileEntity;
import net.mcreator.fnafmod.block.entity.ChicaHeadDecorationTileEntity;
import net.mcreator.fnafmod.block.entity.CenteredFreddySignTileEntity;
import net.mcreator.fnafmod.block.entity.CenteredFreddySignOnTileEntity;
import net.mcreator.fnafmod.block.entity.BonnieHeadTileEntity;
import net.mcreator.fnafmod.block.entity.BephDollTileEntity;
import net.mcreator.fnafmod.FnafModMod;

public class FnafModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FnafModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DESK = register("desk", FnafModModBlocks.DESK, DeskBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESK_2 = register("desk_2", FnafModModBlocks.DESK_2, Desk2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESK_3 = register("desk_3", FnafModModBlocks.DESK_3, Desk3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_FREDDY = register("plush_freddy", FnafModModBlocks.PLUSH_FREDDY, PlushFreddyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_BONNIE = register("plush_bonnie", FnafModModBlocks.PLUSH_BONNIE, PlushBonnieBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_CHICA = register("plush_chica", FnafModModBlocks.PLUSH_CHICA, PlushChicaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_FOXY = register("plush_foxy", FnafModModBlocks.PLUSH_FOXY, PlushFoxyBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PLUSH_FREDBEAR = register("plush_fredbear", FnafModModBlocks.PLUSH_FREDBEAR, PlushFredbearBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LOCKET_BOTTOM = register("locket_bottom", FnafModModBlocks.LOCKET_BOTTOM, LocketBottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VENDING_BOTTOM = register("vending_bottom", FnafModModBlocks.VENDING_BOTTOM, VendingBottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<MeshTrashCanTileEntity>> MESH_TRASH_CAN = REGISTRY.register("mesh_trash_can", () -> BlockEntityType.Builder.of(MeshTrashCanTileEntity::new, FnafModModBlocks.MESH_TRASH_CAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<TrashCanTileEntity>> TRASH_CAN = REGISTRY.register("trash_can", () -> BlockEntityType.Builder.of(TrashCanTileEntity::new, FnafModModBlocks.TRASH_CAN.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> REMNANT_INFUSER = register("remnant_infuser", FnafModModBlocks.REMNANT_INFUSER, RemantInfuserBlockEntity::new);
	public static final RegistryObject<BlockEntityType<StageLightOffTileEntity>> STAGE_LIGHT_OFF = REGISTRY.register("stage_light_off",
			() -> BlockEntityType.Builder.of(StageLightOffTileEntity::new, FnafModModBlocks.STAGE_LIGHT_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightPinkOffTileEntity>> STAGE_LIGHT_PINK_OFF = REGISTRY.register("stage_light_pink_off",
			() -> BlockEntityType.Builder.of(StageLightPinkOffTileEntity::new, FnafModModBlocks.STAGE_LIGHT_PINK_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightOrangeOffTileEntity>> STAGE_LIGHT_ORANGE_OFF = REGISTRY.register("stage_light_orange_off",
			() -> BlockEntityType.Builder.of(StageLightOrangeOffTileEntity::new, FnafModModBlocks.STAGE_LIGHT_ORANGE_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightRedOffTileEntity>> STAGE_LIGHT_RED_OFF = REGISTRY.register("stage_light_red_off",
			() -> BlockEntityType.Builder.of(StageLightRedOffTileEntity::new, FnafModModBlocks.STAGE_LIGHT_RED_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaHeadDecorationTileEntity>> CHICA_HEAD_DECORATION = REGISTRY.register("chica_head_decoration",
			() -> BlockEntityType.Builder.of(ChicaHeadDecorationTileEntity::new, FnafModModBlocks.CHICA_HEAD_DECORATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyHeadDecorationTileEntity>> FOXY_HEAD_DECORATION = REGISTRY.register("foxy_head_decoration",
			() -> BlockEntityType.Builder.of(FoxyHeadDecorationTileEntity::new, FnafModModBlocks.FOXY_HEAD_DECORATION.get()).build(null));
	public static final RegistryObject<BlockEntityType<ShelfTileEntity>> SHELF = REGISTRY.register("shelf", () -> BlockEntityType.Builder.of(ShelfTileEntity::new, FnafModModBlocks.SHELF.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddyHeadTileEntity>> FREDDY_HEAD = REGISTRY.register("freddy_head", () -> BlockEntityType.Builder.of(FreddyHeadTileEntity::new, FnafModModBlocks.FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<BonnieHeadTileEntity>> BONNIE_HEAD = REGISTRY.register("bonnie_head", () -> BlockEntityType.Builder.of(BonnieHeadTileEntity::new, FnafModModBlocks.BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<ChicaHeadTileEntity>> CHICA_HEAD = REGISTRY.register("chica_head", () -> BlockEntityType.Builder.of(ChicaHeadTileEntity::new, FnafModModBlocks.CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FoxyHeadTileEntity>> FOXY_HEAD = REGISTRY.register("foxy_head", () -> BlockEntityType.Builder.of(FoxyHeadTileEntity::new, FnafModModBlocks.FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearHeadTileEntity>> FREDBEAR_HEAD = REGISTRY.register("fredbear_head", () -> BlockEntityType.Builder.of(FredbearHeadTileEntity::new, FnafModModBlocks.FREDBEAR_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieHeadTileEntity>> SPRING_BONNIE_HEAD = REGISTRY.register("spring_bonnie_head",
			() -> BlockEntityType.Builder.of(SpringBonnieHeadTileEntity::new, FnafModModBlocks.SPRING_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<EndoBlockTileEntity>> ENDO_BLOCK = REGISTRY.register("endo_block", () -> BlockEntityType.Builder.of(EndoBlockTileEntity::new, FnafModModBlocks.ENDO_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredFreddyHeadTileEntity>> UN_WITHERED_FREDDY_HEAD = REGISTRY.register("un_withered_freddy_head",
			() -> BlockEntityType.Builder.of(UnWitheredFreddyHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_FREDDY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredBonnieHeadTileEntity>> UN_WITHERED_BONNIE_HEAD = REGISTRY.register("un_withered_bonnie_head",
			() -> BlockEntityType.Builder.of(UnWitheredBonnieHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_BONNIE_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredFoxyHeadTileEntity>> UN_WITHERED_FOXY_HEAD = REGISTRY.register("un_withered_foxy_head",
			() -> BlockEntityType.Builder.of(UnWitheredFoxyHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_FOXY_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<UnWitheredChicaHeadTileEntity>> UN_WITHERED_CHICA_HEAD = REGISTRY.register("un_withered_chica_head",
			() -> BlockEntityType.Builder.of(UnWitheredChicaHeadTileEntity::new, FnafModModBlocks.UN_WITHERED_CHICA_HEAD.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> LOCKER_TOP = register("locker_top", FnafModModBlocks.LOCKER_TOP, LockerTopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FLASH_LIGHT_LIGHT = register("flash_light_light", FnafModModBlocks.FLASH_LIGHT_LIGHT, FlashLightLightBlockEntity::new);
	public static final RegistryObject<BlockEntityType<StageLightOnTileEntity>> STAGE_LIGHT_ON = REGISTRY.register("stage_light_on", () -> BlockEntityType.Builder.of(StageLightOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightPinkOnTileEntity>> STAGE_LIGHT_PINK_ON = REGISTRY.register("stage_light_pink_on",
			() -> BlockEntityType.Builder.of(StageLightPinkOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_PINK_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightOrangeOnTileEntity>> STAGE_LIGHT_ORANGE_ON = REGISTRY.register("stage_light_orange_on",
			() -> BlockEntityType.Builder.of(StageLightOrangeOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_ORANGE_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<StageLightRedOnTileEntity>> STAGE_LIGHT_RED_ON = REGISTRY.register("stage_light_red_on",
			() -> BlockEntityType.Builder.of(StageLightRedOnTileEntity::new, FnafModModBlocks.STAGE_LIGHT_RED_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddySignOffTileEntity>> FREDDY_SIGN_OFF = REGISTRY.register("freddy_sign_off",
			() -> BlockEntityType.Builder.of(FreddySignOffTileEntity::new, FnafModModBlocks.FREDDY_SIGN_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<FreddySignOnTileEntity>> FREDDY_SIGN_ON = REGISTRY.register("freddy_sign_on", () -> BlockEntityType.Builder.of(FreddySignOnTileEntity::new, FnafModModBlocks.FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<VassDollTileEntity>> VASS_DOLL = REGISTRY.register("vass_doll", () -> BlockEntityType.Builder.of(VassDollTileEntity::new, FnafModModBlocks.VASS_DOLL.get()).build(null));
	public static final RegistryObject<BlockEntityType<?>> SILVER_LOCKER_BOTTOM = register("silver_locker_bottom", FnafModModBlocks.SILVER_LOCKER_BOTTOM, SilverLockerBottomBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SILVER_LOCKER_TOP = register("silver_locker_top", FnafModModBlocks.SILVER_LOCKER_TOP, SilverLockerTopBlockEntity::new);
	public static final RegistryObject<BlockEntityType<CenteredFreddySignTileEntity>> CENTERED_FREDDY_SIGN = REGISTRY.register("centered_freddy_sign",
			() -> BlockEntityType.Builder.of(CenteredFreddySignTileEntity::new, FnafModModBlocks.CENTERED_FREDDY_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<CenteredFreddySignOnTileEntity>> CENTERED_FREDDY_SIGN_ON = REGISTRY.register("centered_freddy_sign_on",
			() -> BlockEntityType.Builder.of(CenteredFreddySignOnTileEntity::new, FnafModModBlocks.CENTERED_FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<BephDollTileEntity>> BEPH_DOLL = REGISTRY.register("beph_doll", () -> BlockEntityType.Builder.of(BephDollTileEntity::new, FnafModModBlocks.BEPH_DOLL.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddySignOffTileEntity>> TOY_FREDDY_SIGN_OFF = REGISTRY.register("toy_freddy_sign_off",
			() -> BlockEntityType.Builder.of(ToyFreddySignOffTileEntity::new, FnafModModBlocks.TOY_FREDDY_SIGN_OFF.get()).build(null));
	public static final RegistryObject<BlockEntityType<ToyFreddySignOnTileEntity>> TOY_FREDDY_SIGN_ON = REGISTRY.register("toy_freddy_sign_on",
			() -> BlockEntityType.Builder.of(ToyFreddySignOnTileEntity::new, FnafModModBlocks.TOY_FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFreddySignTileEntity>> RETRO_FREDDY_SIGN = REGISTRY.register("retro_freddy_sign",
			() -> BlockEntityType.Builder.of(RetroFreddySignTileEntity::new, FnafModModBlocks.RETRO_FREDDY_SIGN.get()).build(null));
	public static final RegistryObject<BlockEntityType<RetroFreddySignOnTileEntity>> RETRO_FREDDY_SIGN_ON = REGISTRY.register("retro_freddy_sign_on",
			() -> BlockEntityType.Builder.of(RetroFreddySignOnTileEntity::new, FnafModModBlocks.RETRO_FREDDY_SIGN_ON.get()).build(null));
	public static final RegistryObject<BlockEntityType<SpringBonnieDecorTileEntity>> SPRING_BONNIE_DECOR = REGISTRY.register("spring_bonnie_decor",
			() -> BlockEntityType.Builder.of(SpringBonnieDecorTileEntity::new, FnafModModBlocks.SPRING_BONNIE_DECOR.get()).build(null));
	public static final RegistryObject<BlockEntityType<FredbearSignTileEntity>> FREDBEAR_SIGN = REGISTRY.register("fredbear_sign", () -> BlockEntityType.Builder.of(FredbearSignTileEntity::new, FnafModModBlocks.FREDBEAR_SIGN.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
