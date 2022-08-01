
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.fnafmod.block.WiresBlock;
import net.mcreator.fnafmod.block.WhiteWallBlock;
import net.mcreator.fnafmod.block.WhiteRedWallTileBlock;
import net.mcreator.fnafmod.block.WhiteBlackWallTileBlock;
import net.mcreator.fnafmod.block.WarningSignBlock;
import net.mcreator.fnafmod.block.WallWiresBlock;
import net.mcreator.fnafmod.block.WallTileBlock;
import net.mcreator.fnafmod.block.WallPizzaBlock;
import net.mcreator.fnafmod.block.VentHatchBlock;
import net.mcreator.fnafmod.block.VentBlock;
import net.mcreator.fnafmod.block.ToyFreddySpawnBlockIdleBlock;
import net.mcreator.fnafmod.block.ToyFreddySpawnBlockBlock;
import net.mcreator.fnafmod.block.ToyFoxySpawnBlockIdleBlock;
import net.mcreator.fnafmod.block.ToyFoxySpawnBlockBlock;
import net.mcreator.fnafmod.block.ToyChicaSpawnBlockIdleBlock;
import net.mcreator.fnafmod.block.ToyChicaSpawnBlockBlock;
import net.mcreator.fnafmod.block.ToyBonnieSpawnBlockIdleBlock;
import net.mcreator.fnafmod.block.ToyBonnieSpawnBlockBlock;
import net.mcreator.fnafmod.block.TopNormalBlock;
import net.mcreator.fnafmod.block.ThinPurpleCurtainBlock;
import net.mcreator.fnafmod.block.ThinCornCurtainBlock;
import net.mcreator.fnafmod.block.ThinCobaltCurtainBlock;
import net.mcreator.fnafmod.block.ThinCandyCurtainBlock;
import net.mcreator.fnafmod.block.ThinCactusCurtainBlock;
import net.mcreator.fnafmod.block.TableClothBlock;
import net.mcreator.fnafmod.block.StructureSpawningBlockBlock;
import net.mcreator.fnafmod.block.StructureSpawningBlock9Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock8Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock7Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock6Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock5Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock4Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock3Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock2Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock11Block;
import net.mcreator.fnafmod.block.StructureSpawningBlock10Block;
import net.mcreator.fnafmod.block.StarsBlock;
import net.mcreator.fnafmod.block.StageBricksBlock;
import net.mcreator.fnafmod.block.StageBrickTilesBlock;
import net.mcreator.fnafmod.block.SpringBonniePlushieBlock;
import net.mcreator.fnafmod.block.SpringBonniePlushBlock;
import net.mcreator.fnafmod.block.SpeakerRightBlock;
import net.mcreator.fnafmod.block.SpeakerLeftBlock;
import net.mcreator.fnafmod.block.SpeakerBlock;
import net.mcreator.fnafmod.block.SmallPipesBlock;
import net.mcreator.fnafmod.block.ShelfBlock;
import net.mcreator.fnafmod.block.ShackRandomizerBlock;
import net.mcreator.fnafmod.block.SecurityDoorOpenBlock;
import net.mcreator.fnafmod.block.RemantInfuserBlock;
import net.mcreator.fnafmod.block.RedBlueTileStairsCrackedBlock;
import net.mcreator.fnafmod.block.RedBlueTileStairBlock;
import net.mcreator.fnafmod.block.RedBlueTileSlabCrackedBlock;
import net.mcreator.fnafmod.block.RedBlueTileSlabBlock;
import net.mcreator.fnafmod.block.RedBlueTileCrackedBlock;
import net.mcreator.fnafmod.block.RedBlueTileBlock;
import net.mcreator.fnafmod.block.RedBlackTileStairsCrackedBlock;
import net.mcreator.fnafmod.block.RedBlackTileStairBlock;
import net.mcreator.fnafmod.block.RedBlackTileSlabCrackedBlock;
import net.mcreator.fnafmod.block.RedBlackTileSlabBlock;
import net.mcreator.fnafmod.block.RedBlackTileCrackedBlock;
import net.mcreator.fnafmod.block.RedBlackTileBlock;
import net.mcreator.fnafmod.block.PurpleFanBlock;
import net.mcreator.fnafmod.block.PurpleCurtainBlock;
import net.mcreator.fnafmod.block.PuppetMaskBlock;
import net.mcreator.fnafmod.block.PrizeCornerPosterBlock;
import net.mcreator.fnafmod.block.PresentsBlock;
import net.mcreator.fnafmod.block.Poster7Block;
import net.mcreator.fnafmod.block.Poster6Block;
import net.mcreator.fnafmod.block.Poster5Block;
import net.mcreator.fnafmod.block.Poster4Block;
import net.mcreator.fnafmod.block.Poster3Block;
import net.mcreator.fnafmod.block.Poster2Block;
import net.mcreator.fnafmod.block.Poster1Block;
import net.mcreator.fnafmod.block.PizzaBoxOpenBlock;
import net.mcreator.fnafmod.block.PizzaBoxClosedBlock;
import net.mcreator.fnafmod.block.PaperPalFreddyBlock;
import net.mcreator.fnafmod.block.PaperPalBonnieBlock;
import net.mcreator.fnafmod.block.PaperPalBlock;
import net.mcreator.fnafmod.block.OrangeSpeakerLeftBlock;
import net.mcreator.fnafmod.block.OrangeSpeakerBlock;
import net.mcreator.fnafmod.block.OrangeSpeakeRightBlock;
import net.mcreator.fnafmod.block.OfficeDoorBlock;
import net.mcreator.fnafmod.block.MusicBoxBlock;
import net.mcreator.fnafmod.block.MonitorsBlock;
import net.mcreator.fnafmod.block.MangleSpawnBlockIdleBlock;
import net.mcreator.fnafmod.block.MangleSpawnBlockBlock;
import net.mcreator.fnafmod.block.LocketBottomBlock;
import net.mcreator.fnafmod.block.LockerTopBlock;
import net.mcreator.fnafmod.block.LightButtonOnBlock;
import net.mcreator.fnafmod.block.LightButtonOffBlock;
import net.mcreator.fnafmod.block.GoldenFreddyPlushieBlock;
import net.mcreator.fnafmod.block.FreddyPlushieBlock;
import net.mcreator.fnafmod.block.FreddyHeadBlock;
import net.mcreator.fnafmod.block.FredbearPlushieBlock;
import net.mcreator.fnafmod.block.FredbearPlushBlock;
import net.mcreator.fnafmod.block.FredbearFloorBlock;
import net.mcreator.fnafmod.block.FoxyPlushieBlock;
import net.mcreator.fnafmod.block.FoxyHeadDecorationBlock;
import net.mcreator.fnafmod.block.FoxyHeadBlock;
import net.mcreator.fnafmod.block.Fnaf4DoorBlock;
import net.mcreator.fnafmod.block.FanBlock;
import net.mcreator.fnafmod.block.FNAFWallTopRotableBlock;
import net.mcreator.fnafmod.block.FNAFWallTopRotable4Block;
import net.mcreator.fnafmod.block.FNAFWallTopRotable3Block;
import net.mcreator.fnafmod.block.FNAFWallTopRotable2Block;
import net.mcreator.fnafmod.block.FNAF4WallTopRoomBlock;
import net.mcreator.fnafmod.block.FNAF4WallTopHallBlock;
import net.mcreator.fnafmod.block.FNAF4WallRoomBottomBlock;
import net.mcreator.fnafmod.block.FNAF4WallBottomRotableBlock;
import net.mcreator.fnafmod.block.FNAF4WallBottomRotable4Block;
import net.mcreator.fnafmod.block.FNAF4WallBottomRotable3Block;
import net.mcreator.fnafmod.block.FNAF4WallBottomRotable2Block;
import net.mcreator.fnafmod.block.FNAF4WallBottomHallBlock;
import net.mcreator.fnafmod.block.FNAF3WallTileBlock;
import net.mcreator.fnafmod.block.FNAF3WallSlanBlock;
import net.mcreator.fnafmod.block.FNAF3WallBlock;
import net.mcreator.fnafmod.block.FNAF3PostersBlock;
import net.mcreator.fnafmod.block.FNAF3Posters8Block;
import net.mcreator.fnafmod.block.FNAF3Posters7Block;
import net.mcreator.fnafmod.block.FNAF3Posters6Block;
import net.mcreator.fnafmod.block.FNAF3Posters5Block;
import net.mcreator.fnafmod.block.FNAF3Posters4Block;
import net.mcreator.fnafmod.block.FNAF3Posters3Block;
import net.mcreator.fnafmod.block.FNAF3Posters2Block;
import net.mcreator.fnafmod.block.FNAF3FloorBlock;
import net.mcreator.fnafmod.block.FNAF2CelebrateBlock;
import net.mcreator.fnafmod.block.FNAF1CelebrateBlock;
import net.mcreator.fnafmod.block.ErrorTileStairsCrackedBlock;
import net.mcreator.fnafmod.block.ErrorTileStairBlock;
import net.mcreator.fnafmod.block.ErrorTileSlabCrackedBlock;
import net.mcreator.fnafmod.block.ErrorTileSlabBlock;
import net.mcreator.fnafmod.block.ErrorTileCrackedBlock;
import net.mcreator.fnafmod.block.ErrorTileBlock;
import net.mcreator.fnafmod.block.EndoBlockBlock;
import net.mcreator.fnafmod.block.DoorButtonOnBlock;
import net.mcreator.fnafmod.block.DoorButtonOffBlock;
import net.mcreator.fnafmod.block.DeskBlock;
import net.mcreator.fnafmod.block.Desk3Block;
import net.mcreator.fnafmod.block.Desk2Block;
import net.mcreator.fnafmod.block.CornCurtainBlock;
import net.mcreator.fnafmod.block.CobaltCurtainBlock;
import net.mcreator.fnafmod.block.ClosetRightTopBlock;
import net.mcreator.fnafmod.block.ClosetRightOpenTopBlock;
import net.mcreator.fnafmod.block.ClosetRightOpenBottomBlock;
import net.mcreator.fnafmod.block.ClosetRightBottomBlock;
import net.mcreator.fnafmod.block.ClosetLeftTopBlock;
import net.mcreator.fnafmod.block.ClosetLeftOpenTopBlock;
import net.mcreator.fnafmod.block.ClosetLeftOpenBottomBlock;
import net.mcreator.fnafmod.block.ClosetLeftBottomBlock;
import net.mcreator.fnafmod.block.ChildrenDrawingsBlock;
import net.mcreator.fnafmod.block.ChildrenDrawings7Block;
import net.mcreator.fnafmod.block.ChildrenDrawings6Block;
import net.mcreator.fnafmod.block.ChildrenDrawings5Block;
import net.mcreator.fnafmod.block.ChildrenDrawings4Block;
import net.mcreator.fnafmod.block.ChildrenDrawings3Block;
import net.mcreator.fnafmod.block.ChildrenDrawings2Block;
import net.mcreator.fnafmod.block.ChicaPlushieBlock;
import net.mcreator.fnafmod.block.ChicaHeadDecorationBlock;
import net.mcreator.fnafmod.block.ChicaHeadBlock;
import net.mcreator.fnafmod.block.CheckeredWhiteWallTileBlock;
import net.mcreator.fnafmod.block.CheckeredWallTileBlock;
import net.mcreator.fnafmod.block.CheckeredWallBlock;
import net.mcreator.fnafmod.block.CheckeredTileBlock;
import net.mcreator.fnafmod.block.ChairBlock;
import net.mcreator.fnafmod.block.CandyCurtainBlock;
import net.mcreator.fnafmod.block.CactusCurtainBlock;
import net.mcreator.fnafmod.block.BonniePlushieBlock;
import net.mcreator.fnafmod.block.BonnieHeadBlock;
import net.mcreator.fnafmod.block.BlueBlackTileStairsCrackedBlock;
import net.mcreator.fnafmod.block.BlueBlackTileStairBlock;
import net.mcreator.fnafmod.block.BlueBlackTileSlabCrackedBlock;
import net.mcreator.fnafmod.block.BlueBlackTileSlabBlock;
import net.mcreator.fnafmod.block.BlueBlackTileCrackedBlock;
import net.mcreator.fnafmod.block.BlueBlackTileBlock;
import net.mcreator.fnafmod.block.BlackWhiteTileStairsCrackedBlock;
import net.mcreator.fnafmod.block.BlackWhiteTileStairBlock;
import net.mcreator.fnafmod.block.BlackWhiteTileSlabCrackedBlock;
import net.mcreator.fnafmod.block.BlackWhiteTileSlabBlock;
import net.mcreator.fnafmod.block.BlackWhiteTileCrackedBlock;
import net.mcreator.fnafmod.block.BlackWhiteTileBlock;
import net.mcreator.fnafmod.block.BlackWallBlock;
import net.mcreator.fnafmod.block.BalloonsBlock;
import net.mcreator.fnafmod.block.BalloonYellowBlock;
import net.mcreator.fnafmod.block.BalloonGreenBlock;
import net.mcreator.fnafmod.block.BalloonBlueBlock;
import net.mcreator.fnafmod.block.BalloonBlock;
import net.mcreator.fnafmod.block.BackstageDoorBlock;
import net.mcreator.fnafmod.block.ArcadeMachineFoxyBlock;
import net.mcreator.fnafmod.block.ArcadeMachineBonnieBlock;
import net.mcreator.fnafmod.block.ArcadeMachineBBBlock;
import net.mcreator.fnafmod.block.AlternateWhiteRedWallTileBlock;
import net.mcreator.fnafmod.block.AlternateWallTileBlock;
import net.mcreator.fnafmod.FnafModMod;

public class FnafModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FnafModMod.MODID);
	public static final RegistryObject<Block> BLACK_WHITE_TILE = REGISTRY.register("black_white_tile", () -> new BlackWhiteTileBlock());
	public static final RegistryObject<Block> BLACK_WHITE_TILE_SLAB = REGISTRY.register("black_white_tile_slab", () -> new BlackWhiteTileSlabBlock());
	public static final RegistryObject<Block> BLACK_WHITE_TILE_STAIR = REGISTRY.register("black_white_tile_stair",
			() -> new BlackWhiteTileStairBlock());
	public static final RegistryObject<Block> BLACK_WHITE_TILE_CRACKED = REGISTRY.register("black_white_tile_cracked",
			() -> new BlackWhiteTileCrackedBlock());
	public static final RegistryObject<Block> BLACK_WHITE_TILE_SLAB_CRACKED = REGISTRY.register("black_white_tile_slab_cracked",
			() -> new BlackWhiteTileSlabCrackedBlock());
	public static final RegistryObject<Block> BLACK_WHITE_TILE_STAIRS_CRACKED = REGISTRY.register("black_white_tile_stairs_cracked",
			() -> new BlackWhiteTileStairsCrackedBlock());
	public static final RegistryObject<Block> RED_BLUE_TILE = REGISTRY.register("red_blue_tile", () -> new RedBlueTileBlock());
	public static final RegistryObject<Block> RED_BLUE_TILE_SLAB = REGISTRY.register("red_blue_tile_slab", () -> new RedBlueTileSlabBlock());
	public static final RegistryObject<Block> RED_BLUE_TILE_STAIR = REGISTRY.register("red_blue_tile_stair", () -> new RedBlueTileStairBlock());
	public static final RegistryObject<Block> RED_BLUE_TILE_CRACKED = REGISTRY.register("red_blue_tile_cracked", () -> new RedBlueTileCrackedBlock());
	public static final RegistryObject<Block> RED_BLUE_TILE_SLAB_CRACKED = REGISTRY.register("red_blue_tile_slab_cracked",
			() -> new RedBlueTileSlabCrackedBlock());
	public static final RegistryObject<Block> RED_BLUE_TILE_STAIRS_CRACKED = REGISTRY.register("red_blue_tile_stairs_cracked",
			() -> new RedBlueTileStairsCrackedBlock());
	public static final RegistryObject<Block> RED_BLACK_TILE = REGISTRY.register("red_black_tile", () -> new RedBlackTileBlock());
	public static final RegistryObject<Block> RED_BLACK_TILE_SLAB = REGISTRY.register("red_black_tile_slab", () -> new RedBlackTileSlabBlock());
	public static final RegistryObject<Block> RED_BLACK_TILE_STAIR = REGISTRY.register("red_black_tile_stair", () -> new RedBlackTileStairBlock());
	public static final RegistryObject<Block> RED_BLACK_TILE_CRACKED = REGISTRY.register("red_black_tile_cracked",
			() -> new RedBlackTileCrackedBlock());
	public static final RegistryObject<Block> RED_BLACK_TILE_SLAB_CRACKED = REGISTRY.register("red_black_tile_slab_cracked",
			() -> new RedBlackTileSlabCrackedBlock());
	public static final RegistryObject<Block> RED_BLACK_TILE_STAIRS_CRACKED = REGISTRY.register("red_black_tile_stairs_cracked",
			() -> new RedBlackTileStairsCrackedBlock());
	public static final RegistryObject<Block> BLUE_BLACK_TILE = REGISTRY.register("blue_black_tile", () -> new BlueBlackTileBlock());
	public static final RegistryObject<Block> BLUE_BLACK_TILE_SLAB = REGISTRY.register("blue_black_tile_slab", () -> new BlueBlackTileSlabBlock());
	public static final RegistryObject<Block> BLUE_BLACK_TILE_STAIR = REGISTRY.register("blue_black_tile_stair", () -> new BlueBlackTileStairBlock());
	public static final RegistryObject<Block> BLUE_BLACK_TILE_CRACKED = REGISTRY.register("blue_black_tile_cracked",
			() -> new BlueBlackTileCrackedBlock());
	public static final RegistryObject<Block> BLUE_BLACK_TILE_SLAB_CRACKED = REGISTRY.register("blue_black_tile_slab_cracked",
			() -> new BlueBlackTileSlabCrackedBlock());
	public static final RegistryObject<Block> BLUE_BLACK_TILE_STAIRS_CRACKED = REGISTRY.register("blue_black_tile_stairs_cracked",
			() -> new BlueBlackTileStairsCrackedBlock());
	public static final RegistryObject<Block> FREDBEAR_FLOOR = REGISTRY.register("fredbear_floor", () -> new FredbearFloorBlock());
	public static final RegistryObject<Block> STAGE_BRICKS = REGISTRY.register("stage_bricks", () -> new StageBricksBlock());
	public static final RegistryObject<Block> STAGE_BRICK_TILES = REGISTRY.register("stage_brick_tiles", () -> new StageBrickTilesBlock());
	public static final RegistryObject<Block> WALL_TILE = REGISTRY.register("wall_tile", () -> new WallTileBlock());
	public static final RegistryObject<Block> ALTERNATE_WALL_TILE = REGISTRY.register("alternate_wall_tile", () -> new AlternateWallTileBlock());
	public static final RegistryObject<Block> WHITE_RED_WALL_TILE = REGISTRY.register("white_red_wall_tile", () -> new WhiteRedWallTileBlock());
	public static final RegistryObject<Block> WHITE_BLACK_WALL_TILE = REGISTRY.register("white_black_wall_tile", () -> new WhiteBlackWallTileBlock());
	public static final RegistryObject<Block> ALTERNATE_WHITE_RED_WALL_TILE = REGISTRY.register("alternate_white_red_wall_tile",
			() -> new AlternateWhiteRedWallTileBlock());
	public static final RegistryObject<Block> CHECKERED_TILE = REGISTRY.register("checkered_tile", () -> new CheckeredTileBlock());
	public static final RegistryObject<Block> CHECKERED_WALL = REGISTRY.register("checkered_wall", () -> new CheckeredWallBlock());
	public static final RegistryObject<Block> CHECKERED_WALL_TILE = REGISTRY.register("checkered_wall_tile", () -> new CheckeredWallTileBlock());
	public static final RegistryObject<Block> CHECKERED_WHITE_WALL_TILE = REGISTRY.register("checkered_white_wall_tile",
			() -> new CheckeredWhiteWallTileBlock());
	public static final RegistryObject<Block> BLACK_WALL = REGISTRY.register("black_wall", () -> new BlackWallBlock());
	public static final RegistryObject<Block> WHITE_WALL = REGISTRY.register("white_wall", () -> new WhiteWallBlock());
	public static final RegistryObject<Block> TOP_NORMAL = REGISTRY.register("top_normal", () -> new TopNormalBlock());
	public static final RegistryObject<Block> FNAF_3_WALL_TILE = REGISTRY.register("fnaf_3_wall_tile", () -> new FNAF3WallTileBlock());
	public static final RegistryObject<Block> FNAF_3_FLOOR = REGISTRY.register("fnaf_3_floor", () -> new FNAF3FloorBlock());
	public static final RegistryObject<Block> FNAF_3_WALL = REGISTRY.register("fnaf_3_wall", () -> new FNAF3WallBlock());
	public static final RegistryObject<Block> FNAF_3_WALL_SLAB = REGISTRY.register("fnaf_3_wall_slab", () -> new FNAF3WallSlanBlock());
	public static final RegistryObject<Block> FNAF_4_WALL_BOTTOM_ROTABLE = REGISTRY.register("fnaf_4_wall_bottom_rotable",
			() -> new FNAF4WallBottomRotableBlock());
	public static final RegistryObject<Block> FNAF_WALL_TOP_ROTABLE = REGISTRY.register("fnaf_wall_top_rotable", () -> new FNAFWallTopRotableBlock());
	public static final RegistryObject<Block> FNAF_4_WALL_ROOM_BOTTOM = REGISTRY.register("fnaf_4_wall_room_bottom",
			() -> new FNAF4WallRoomBottomBlock());
	public static final RegistryObject<Block> FNAF_4_WALL_BOTTOM_HALL = REGISTRY.register("fnaf_4_wall_bottom_hall",
			() -> new FNAF4WallBottomHallBlock());
	public static final RegistryObject<Block> FNAF_4_WALL_TOP_ROOM = REGISTRY.register("fnaf_4_wall_top_room", () -> new FNAF4WallTopRoomBlock());
	public static final RegistryObject<Block> FNAF_4_WALL_TOP_HALL = REGISTRY.register("fnaf_4_wall_top_hall", () -> new FNAF4WallTopHallBlock());
	public static final RegistryObject<Block> PURPLE_CURTAIN = REGISTRY.register("purple_curtain", () -> new PurpleCurtainBlock());
	public static final RegistryObject<Block> THIN_PURPLE_CURTAIN = REGISTRY.register("thin_purple_curtain", () -> new ThinPurpleCurtainBlock());
	public static final RegistryObject<Block> CORN_CURTAIN = REGISTRY.register("corn_curtain", () -> new CornCurtainBlock());
	public static final RegistryObject<Block> THIN_CORN_CURTAIN = REGISTRY.register("thin_corn_curtain", () -> new ThinCornCurtainBlock());
	public static final RegistryObject<Block> CANDY_CURTAIN = REGISTRY.register("candy_curtain", () -> new CandyCurtainBlock());
	public static final RegistryObject<Block> THIN_CANDY_CURTAIN = REGISTRY.register("thin_candy_curtain", () -> new ThinCandyCurtainBlock());
	public static final RegistryObject<Block> COBALT_CURTAIN = REGISTRY.register("cobalt_curtain", () -> new CobaltCurtainBlock());
	public static final RegistryObject<Block> THIN_COBALT_CURTAIN = REGISTRY.register("thin_cobalt_curtain", () -> new ThinCobaltCurtainBlock());
	public static final RegistryObject<Block> CACTUS_CURTAIN = REGISTRY.register("cactus_curtain", () -> new CactusCurtainBlock());
	public static final RegistryObject<Block> THIN_CACTUS_CURTAIN = REGISTRY.register("thin_cactus_curtain", () -> new ThinCactusCurtainBlock());
	public static final RegistryObject<Block> BACKSTAGE_DOOR = REGISTRY.register("backstage_door", () -> new BackstageDoorBlock());
	public static final RegistryObject<Block> FNAF_4_DOOR = REGISTRY.register("fnaf_4_door", () -> new Fnaf4DoorBlock());
	public static final RegistryObject<Block> CLOSET_LEFT_BOTTOM = REGISTRY.register("closet_left_bottom", () -> new ClosetLeftBottomBlock());
	public static final RegistryObject<Block> CLOSET_RIGHT_BOTTOM = REGISTRY.register("closet_right_bottom", () -> new ClosetRightBottomBlock());
	public static final RegistryObject<Block> TABLE_CLOTH = REGISTRY.register("table_cloth", () -> new TableClothBlock());
	public static final RegistryObject<Block> PIZZA_BOX_CLOSED = REGISTRY.register("pizza_box_closed", () -> new PizzaBoxClosedBlock());
	public static final RegistryObject<Block> PIZZA_BOX_OPEN = REGISTRY.register("pizza_box_open", () -> new PizzaBoxOpenBlock());
	public static final RegistryObject<Block> DOOR_BUTTON_OFF = REGISTRY.register("door_button_off", () -> new DoorButtonOffBlock());
	public static final RegistryObject<Block> LIGHT_BUTTON_OFF = REGISTRY.register("light_button_off", () -> new LightButtonOffBlock());
	public static final RegistryObject<Block> STARS = REGISTRY.register("stars", () -> new StarsBlock());
	public static final RegistryObject<Block> SECURITY_DOOR_OPEN = REGISTRY.register("security_door_open", () -> new SecurityDoorOpenBlock());
	public static final RegistryObject<Block> DESK = REGISTRY.register("desk", () -> new DeskBlock());
	public static final RegistryObject<Block> DESK_2 = REGISTRY.register("desk_2", () -> new Desk2Block());
	public static final RegistryObject<Block> DESK_3 = REGISTRY.register("desk_3", () -> new Desk3Block());
	public static final RegistryObject<Block> CHAIR = REGISTRY.register("chair", () -> new ChairBlock());
	public static final RegistryObject<Block> MONITORS = REGISTRY.register("monitors", () -> new MonitorsBlock());
	public static final RegistryObject<Block> SHELF = REGISTRY.register("shelf", () -> new ShelfBlock());
	public static final RegistryObject<Block> FAN = REGISTRY.register("fan", () -> new FanBlock());
	public static final RegistryObject<Block> PURPLE_FAN = REGISTRY.register("purple_fan", () -> new PurpleFanBlock());
	public static final RegistryObject<Block> SMALL_PIPES = REGISTRY.register("small_pipes", () -> new SmallPipesBlock());
	public static final RegistryObject<Block> WALL_PIZZA = REGISTRY.register("wall_pizza", () -> new WallPizzaBlock());
	public static final RegistryObject<Block> WARNING_SIGN = REGISTRY.register("warning_sign", () -> new WarningSignBlock());
	public static final RegistryObject<Block> FREDDY_HEAD = REGISTRY.register("freddy_head", () -> new FreddyHeadBlock());
	public static final RegistryObject<Block> BONNIE_HEAD = REGISTRY.register("bonnie_head", () -> new BonnieHeadBlock());
	public static final RegistryObject<Block> CHICA_HEAD = REGISTRY.register("chica_head", () -> new ChicaHeadBlock());
	public static final RegistryObject<Block> FOXY_HEAD = REGISTRY.register("foxy_head", () -> new FoxyHeadBlock());
	public static final RegistryObject<Block> ENDO_BLOCK = REGISTRY.register("endo_block", () -> new EndoBlockBlock());
	public static final RegistryObject<Block> FREDDY_PLUSHIE = REGISTRY.register("freddy_plushie", () -> new FreddyPlushieBlock());
	public static final RegistryObject<Block> GOLDEN_FREDDY_PLUSHIE = REGISTRY.register("golden_freddy_plushie",
			() -> new GoldenFreddyPlushieBlock());
	public static final RegistryObject<Block> FREDBEAR_PLUSHIE = REGISTRY.register("fredbear_plushie", () -> new FredbearPlushieBlock());
	public static final RegistryObject<Block> BONNIE_PLUSHIE = REGISTRY.register("bonnie_plushie", () -> new BonniePlushieBlock());
	public static final RegistryObject<Block> FOXY_PLUSHIE = REGISTRY.register("foxy_plushie", () -> new FoxyPlushieBlock());
	public static final RegistryObject<Block> CHICA_PLUSHIE = REGISTRY.register("chica_plushie", () -> new ChicaPlushieBlock());
	public static final RegistryObject<Block> SPRING_BONNIE_PLUSHIE = REGISTRY.register("spring_bonnie_plushie",
			() -> new SpringBonniePlushieBlock());
	public static final RegistryObject<Block> ARCADE_MACHINE_BONNIE = REGISTRY.register("arcade_machine_bonnie",
			() -> new ArcadeMachineBonnieBlock());
	public static final RegistryObject<Block> ARCADE_MACHINE_FOXY = REGISTRY.register("arcade_machine_foxy", () -> new ArcadeMachineFoxyBlock());
	public static final RegistryObject<Block> ARCADE_MACHINE_BB = REGISTRY.register("arcade_machine_bb", () -> new ArcadeMachineBBBlock());
	public static final RegistryObject<Block> LOCKET_BOTTOM = REGISTRY.register("locket_bottom", () -> new LocketBottomBlock());
	public static final RegistryObject<Block> WIRES = REGISTRY.register("wires", () -> new WiresBlock());
	public static final RegistryObject<Block> WALL_WIRES = REGISTRY.register("wall_wires", () -> new WallWiresBlock());
	public static final RegistryObject<Block> ORANGE_SPEAKER = REGISTRY.register("orange_speaker", () -> new OrangeSpeakerBlock());
	public static final RegistryObject<Block> SPEAKER = REGISTRY.register("speaker", () -> new SpeakerBlock());
	public static final RegistryObject<Block> REMNANT_INFUSER = REGISTRY.register("remnant_infuser", () -> new RemantInfuserBlock());
	public static final RegistryObject<Block> BALLOON = REGISTRY.register("balloon", () -> new BalloonBlock());
	public static final RegistryObject<Block> BALLOON_BLUE = REGISTRY.register("balloon_blue", () -> new BalloonBlueBlock());
	public static final RegistryObject<Block> BALLOON_YELLOW = REGISTRY.register("balloon_yellow", () -> new BalloonYellowBlock());
	public static final RegistryObject<Block> BALLOON_GREEN = REGISTRY.register("balloon_green", () -> new BalloonGreenBlock());
	public static final RegistryObject<Block> BALLOONS = REGISTRY.register("balloons", () -> new BalloonsBlock());
	public static final RegistryObject<Block> PRESENTS = REGISTRY.register("presents", () -> new PresentsBlock());
	public static final RegistryObject<Block> MUSIC_BOX = REGISTRY.register("music_box", () -> new MusicBoxBlock());
	public static final RegistryObject<Block> CHICA_HEAD_DECORATION = REGISTRY.register("chica_head_decoration",
			() -> new ChicaHeadDecorationBlock());
	public static final RegistryObject<Block> FOXY_HEAD_DECORATION = REGISTRY.register("foxy_head_decoration", () -> new FoxyHeadDecorationBlock());
	public static final RegistryObject<Block> PUPPET_MASK = REGISTRY.register("puppet_mask", () -> new PuppetMaskBlock());
	public static final RegistryObject<Block> VENT = REGISTRY.register("vent", () -> new VentBlock());
	public static final RegistryObject<Block> VENT_HATCH = REGISTRY.register("vent_hatch", () -> new VentHatchBlock());
	public static final RegistryObject<Block> TOY_BONNIE_SPAWN_BLOCK = REGISTRY.register("toy_bonnie_spawn_block",
			() -> new ToyBonnieSpawnBlockBlock());
	public static final RegistryObject<Block> MANGLE_SPAWN_BLOCK = REGISTRY.register("mangle_spawn_block", () -> new MangleSpawnBlockBlock());
	public static final RegistryObject<Block> TOY_CHICA_SPAWN_BLOCK = REGISTRY.register("toy_chica_spawn_block", () -> new ToyChicaSpawnBlockBlock());
	public static final RegistryObject<Block> TOY_FOXY_SPAWN_BLOCK = REGISTRY.register("toy_foxy_spawn_block", () -> new ToyFoxySpawnBlockBlock());
	public static final RegistryObject<Block> TOY_FREDDY_SPAWN_BLOCK = REGISTRY.register("toy_freddy_spawn_block",
			() -> new ToyFreddySpawnBlockBlock());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK = REGISTRY.register("structure_spawning_block",
			() -> new StructureSpawningBlockBlock());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_2 = REGISTRY.register("structure_spawning_block_2",
			() -> new StructureSpawningBlock2Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_3 = REGISTRY.register("structure_spawning_block_3",
			() -> new StructureSpawningBlock3Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_4 = REGISTRY.register("structure_spawning_block_4",
			() -> new StructureSpawningBlock4Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_5 = REGISTRY.register("structure_spawning_block_5",
			() -> new StructureSpawningBlock5Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_6 = REGISTRY.register("structure_spawning_block_6",
			() -> new StructureSpawningBlock6Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_7 = REGISTRY.register("structure_spawning_block_7",
			() -> new StructureSpawningBlock7Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_8 = REGISTRY.register("structure_spawning_block_8",
			() -> new StructureSpawningBlock8Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_9 = REGISTRY.register("structure_spawning_block_9",
			() -> new StructureSpawningBlock9Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_10 = REGISTRY.register("structure_spawning_block_10",
			() -> new StructureSpawningBlock10Block());
	public static final RegistryObject<Block> STRUCTURE_SPAWNING_BLOCK_11 = REGISTRY.register("structure_spawning_block_11",
			() -> new StructureSpawningBlock11Block());
	public static final RegistryObject<Block> SHACK_RANDOMIZER = REGISTRY.register("shack_randomizer", () -> new ShackRandomizerBlock());
	public static final RegistryObject<Block> CHILDREN_DRAWINGS = REGISTRY.register("children_drawings", () -> new ChildrenDrawingsBlock());
	public static final RegistryObject<Block> CHILDREN_DRAWINGS_2 = REGISTRY.register("children_drawings_2", () -> new ChildrenDrawings2Block());
	public static final RegistryObject<Block> CHILDREN_DRAWINGS_3 = REGISTRY.register("children_drawings_3", () -> new ChildrenDrawings3Block());
	public static final RegistryObject<Block> CHILDREN_DRAWINGS_4 = REGISTRY.register("children_drawings_4", () -> new ChildrenDrawings4Block());
	public static final RegistryObject<Block> CHILDREN_DRAWINGS_5 = REGISTRY.register("children_drawings_5", () -> new ChildrenDrawings5Block());
	public static final RegistryObject<Block> CHILDREN_DRAWINGS_6 = REGISTRY.register("children_drawings_6", () -> new ChildrenDrawings6Block());
	public static final RegistryObject<Block> CHILDREN_DRAWINGS_7 = REGISTRY.register("children_drawings_7", () -> new ChildrenDrawings7Block());
	public static final RegistryObject<Block> POSTER_1 = REGISTRY.register("poster_1", () -> new Poster1Block());
	public static final RegistryObject<Block> POSTER_2 = REGISTRY.register("poster_2", () -> new Poster2Block());
	public static final RegistryObject<Block> POSTER_3 = REGISTRY.register("poster_3", () -> new Poster3Block());
	public static final RegistryObject<Block> POSTER_4 = REGISTRY.register("poster_4", () -> new Poster4Block());
	public static final RegistryObject<Block> POSTER_5 = REGISTRY.register("poster_5", () -> new Poster5Block());
	public static final RegistryObject<Block> POSTER_6 = REGISTRY.register("poster_6", () -> new Poster6Block());
	public static final RegistryObject<Block> POSTER_7 = REGISTRY.register("poster_7", () -> new Poster7Block());
	public static final RegistryObject<Block> FNAF_3_POSTERS = REGISTRY.register("fnaf_3_posters", () -> new FNAF3PostersBlock());
	public static final RegistryObject<Block> PAPER_PAL_BONNIE = REGISTRY.register("paper_pal_bonnie", () -> new PaperPalBonnieBlock());
	public static final RegistryObject<Block> PAPER_PAL_FREDDY = REGISTRY.register("paper_pal_freddy", () -> new PaperPalFreddyBlock());
	public static final RegistryObject<Block> PAPER_PAL = REGISTRY.register("paper_pal", () -> new PaperPalBlock());
	public static final RegistryObject<Block> FNAF_1_CELEBRATE = REGISTRY.register("fnaf_1_celebrate", () -> new FNAF1CelebrateBlock());
	public static final RegistryObject<Block> FNAF_2_CELEBRATE = REGISTRY.register("fnaf_2_celebrate", () -> new FNAF2CelebrateBlock());
	public static final RegistryObject<Block> PRIZE_CORNER_POSTER = REGISTRY.register("prize_corner_poster", () -> new PrizeCornerPosterBlock());
	public static final RegistryObject<Block> DOOR_BUTTON_ON = REGISTRY.register("door_button_on", () -> new DoorButtonOnBlock());
	public static final RegistryObject<Block> OFFICE_DOOR = REGISTRY.register("office_door", () -> new OfficeDoorBlock());
	public static final RegistryObject<Block> LIGHT_BUTTON_ON = REGISTRY.register("light_button_on", () -> new LightButtonOnBlock());
	public static final RegistryObject<Block> LOCKER_TOP = REGISTRY.register("locker_top", () -> new LockerTopBlock());
	public static final RegistryObject<Block> FNAF_4_WALL_BOTTOM_ROTABLE_2 = REGISTRY.register("fnaf_4_wall_bottom_rotable_2",
			() -> new FNAF4WallBottomRotable2Block());
	public static final RegistryObject<Block> FNAF_4_WALL_BOTTOM_ROTABLE_3 = REGISTRY.register("fnaf_4_wall_bottom_rotable_3",
			() -> new FNAF4WallBottomRotable3Block());
	public static final RegistryObject<Block> FNAF_4_WALL_BOTTOM_ROTABLE_4 = REGISTRY.register("fnaf_4_wall_bottom_rotable_4",
			() -> new FNAF4WallBottomRotable4Block());
	public static final RegistryObject<Block> FNAF_WALL_TOP_ROTABLE_2 = REGISTRY.register("fnaf_wall_top_rotable_2",
			() -> new FNAFWallTopRotable2Block());
	public static final RegistryObject<Block> FNAF_WALL_TOP_ROTABLE_3 = REGISTRY.register("fnaf_wall_top_rotable_3",
			() -> new FNAFWallTopRotable3Block());
	public static final RegistryObject<Block> FNAF_WALL_TOP_ROTABLE_4 = REGISTRY.register("fnaf_wall_top_rotable_4",
			() -> new FNAFWallTopRotable4Block());
	public static final RegistryObject<Block> CLOSET_LEFT_TOP = REGISTRY.register("closet_left_top", () -> new ClosetLeftTopBlock());
	public static final RegistryObject<Block> CLOSET_RIGHT_TOP = REGISTRY.register("closet_right_top", () -> new ClosetRightTopBlock());
	public static final RegistryObject<Block> CLOSET_LEFT_OPEN_BOTTOM = REGISTRY.register("closet_left_open_bottom",
			() -> new ClosetLeftOpenBottomBlock());
	public static final RegistryObject<Block> CLOSET_LEFT_OPEN_TOP = REGISTRY.register("closet_left_open_top", () -> new ClosetLeftOpenTopBlock());
	public static final RegistryObject<Block> CLOSET_RIGHT_OPEN_BOTTOM = REGISTRY.register("closet_right_open_bottom",
			() -> new ClosetRightOpenBottomBlock());
	public static final RegistryObject<Block> CLOSET_RIGHT_OPEN_TOP = REGISTRY.register("closet_right_open_top", () -> new ClosetRightOpenTopBlock());
	public static final RegistryObject<Block> FREDBEAR_PLUSH = REGISTRY.register("fredbear_plush", () -> new FredbearPlushBlock());
	public static final RegistryObject<Block> SPRING_BONNIE_PLUSH = REGISTRY.register("spring_bonnie_plush", () -> new SpringBonniePlushBlock());
	public static final RegistryObject<Block> ERROR_TILE = REGISTRY.register("error_tile", () -> new ErrorTileBlock());
	public static final RegistryObject<Block> ERROR_TILE_SLAB = REGISTRY.register("error_tile_slab", () -> new ErrorTileSlabBlock());
	public static final RegistryObject<Block> ERROR_TILE_STAIR = REGISTRY.register("error_tile_stair", () -> new ErrorTileStairBlock());
	public static final RegistryObject<Block> ERROR_TILE_CRACKED = REGISTRY.register("error_tile_cracked", () -> new ErrorTileCrackedBlock());
	public static final RegistryObject<Block> ERROR_TILE_SLAB_CRACKED = REGISTRY.register("error_tile_slab_cracked",
			() -> new ErrorTileSlabCrackedBlock());
	public static final RegistryObject<Block> ERROR_TILE_STAIRS_CRACKED = REGISTRY.register("error_tile_stairs_cracked",
			() -> new ErrorTileStairsCrackedBlock());
	public static final RegistryObject<Block> ORANGE_SPEAKER_LEFT = REGISTRY.register("orange_speaker_left", () -> new OrangeSpeakerLeftBlock());
	public static final RegistryObject<Block> ORANGE_SPEAKE_RIGHT = REGISTRY.register("orange_speake_right", () -> new OrangeSpeakeRightBlock());
	public static final RegistryObject<Block> SPEAKER_LEFT = REGISTRY.register("speaker_left", () -> new SpeakerLeftBlock());
	public static final RegistryObject<Block> SPEAKER_RIGHT = REGISTRY.register("speaker_right", () -> new SpeakerRightBlock());
	public static final RegistryObject<Block> FNAF_3_POSTERS_2 = REGISTRY.register("fnaf_3_posters_2", () -> new FNAF3Posters2Block());
	public static final RegistryObject<Block> FNAF_3_POSTERS_3 = REGISTRY.register("fnaf_3_posters_3", () -> new FNAF3Posters3Block());
	public static final RegistryObject<Block> FNAF_3_POSTERS_4 = REGISTRY.register("fnaf_3_posters_4", () -> new FNAF3Posters4Block());
	public static final RegistryObject<Block> FNAF_3_POSTERS_5 = REGISTRY.register("fnaf_3_posters_5", () -> new FNAF3Posters5Block());
	public static final RegistryObject<Block> FNAF_3_POSTERS_6 = REGISTRY.register("fnaf_3_posters_6", () -> new FNAF3Posters6Block());
	public static final RegistryObject<Block> FNAF_3_POSTERS_7 = REGISTRY.register("fnaf_3_posters_7", () -> new FNAF3Posters7Block());
	public static final RegistryObject<Block> FNAF_3_POSTERS_8 = REGISTRY.register("fnaf_3_posters_8", () -> new FNAF3Posters8Block());
	public static final RegistryObject<Block> TOY_BONNIE_SPAWN_BLOCK_IDLE = REGISTRY.register("toy_bonnie_spawn_block_idle",
			() -> new ToyBonnieSpawnBlockIdleBlock());
	public static final RegistryObject<Block> MANGLE_SPAWN_BLOCK_IDLE = REGISTRY.register("mangle_spawn_block_idle",
			() -> new MangleSpawnBlockIdleBlock());
	public static final RegistryObject<Block> TOY_CHICA_SPAWN_BLOCK_IDLE = REGISTRY.register("toy_chica_spawn_block_idle",
			() -> new ToyChicaSpawnBlockIdleBlock());
	public static final RegistryObject<Block> TOY_FOXY_SPAWN_BLOCK_IDLE = REGISTRY.register("toy_foxy_spawn_block_idle",
			() -> new ToyFoxySpawnBlockIdleBlock());
	public static final RegistryObject<Block> TOY_FREDDY_SPAWN_BLOCK_IDLE = REGISTRY.register("toy_freddy_spawn_block_idle",
			() -> new ToyFreddySpawnBlockIdleBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ThinCornCurtainBlock.registerRenderLayer();
			BackstageDoorBlock.registerRenderLayer();
			Fnaf4DoorBlock.registerRenderLayer();
			ClosetLeftBottomBlock.registerRenderLayer();
			ClosetRightBottomBlock.registerRenderLayer();
			TableClothBlock.registerRenderLayer();
			PizzaBoxClosedBlock.registerRenderLayer();
			PizzaBoxOpenBlock.registerRenderLayer();
			DoorButtonOffBlock.registerRenderLayer();
			LightButtonOffBlock.registerRenderLayer();
			StarsBlock.registerRenderLayer();
			SecurityDoorOpenBlock.registerRenderLayer();
			DeskBlock.registerRenderLayer();
			Desk2Block.registerRenderLayer();
			Desk3Block.registerRenderLayer();
			ChairBlock.registerRenderLayer();
			MonitorsBlock.registerRenderLayer();
			ShelfBlock.registerRenderLayer();
			FanBlock.registerRenderLayer();
			PurpleFanBlock.registerRenderLayer();
			SmallPipesBlock.registerRenderLayer();
			WallPizzaBlock.registerRenderLayer();
			WarningSignBlock.registerRenderLayer();
			FreddyHeadBlock.registerRenderLayer();
			BonnieHeadBlock.registerRenderLayer();
			ChicaHeadBlock.registerRenderLayer();
			FoxyHeadBlock.registerRenderLayer();
			EndoBlockBlock.registerRenderLayer();
			FreddyPlushieBlock.registerRenderLayer();
			GoldenFreddyPlushieBlock.registerRenderLayer();
			FredbearPlushieBlock.registerRenderLayer();
			BonniePlushieBlock.registerRenderLayer();
			FoxyPlushieBlock.registerRenderLayer();
			ChicaPlushieBlock.registerRenderLayer();
			SpringBonniePlushieBlock.registerRenderLayer();
			ArcadeMachineBonnieBlock.registerRenderLayer();
			ArcadeMachineFoxyBlock.registerRenderLayer();
			ArcadeMachineBBBlock.registerRenderLayer();
			WiresBlock.registerRenderLayer();
			WallWiresBlock.registerRenderLayer();
			OrangeSpeakerBlock.registerRenderLayer();
			SpeakerBlock.registerRenderLayer();
			BalloonBlock.registerRenderLayer();
			BalloonBlueBlock.registerRenderLayer();
			BalloonYellowBlock.registerRenderLayer();
			BalloonGreenBlock.registerRenderLayer();
			BalloonsBlock.registerRenderLayer();
			PresentsBlock.registerRenderLayer();
			MusicBoxBlock.registerRenderLayer();
			ChicaHeadDecorationBlock.registerRenderLayer();
			FoxyHeadDecorationBlock.registerRenderLayer();
			PuppetMaskBlock.registerRenderLayer();
			VentHatchBlock.registerRenderLayer();
			ToyBonnieSpawnBlockBlock.registerRenderLayer();
			MangleSpawnBlockBlock.registerRenderLayer();
			ToyChicaSpawnBlockBlock.registerRenderLayer();
			ToyFoxySpawnBlockBlock.registerRenderLayer();
			ToyFreddySpawnBlockBlock.registerRenderLayer();
			ChildrenDrawingsBlock.registerRenderLayer();
			ChildrenDrawings2Block.registerRenderLayer();
			ChildrenDrawings3Block.registerRenderLayer();
			ChildrenDrawings4Block.registerRenderLayer();
			ChildrenDrawings5Block.registerRenderLayer();
			ChildrenDrawings6Block.registerRenderLayer();
			ChildrenDrawings7Block.registerRenderLayer();
			Poster1Block.registerRenderLayer();
			Poster2Block.registerRenderLayer();
			Poster3Block.registerRenderLayer();
			Poster4Block.registerRenderLayer();
			Poster5Block.registerRenderLayer();
			Poster6Block.registerRenderLayer();
			Poster7Block.registerRenderLayer();
			FNAF3PostersBlock.registerRenderLayer();
			PaperPalBonnieBlock.registerRenderLayer();
			PaperPalFreddyBlock.registerRenderLayer();
			PaperPalBlock.registerRenderLayer();
			FNAF1CelebrateBlock.registerRenderLayer();
			FNAF2CelebrateBlock.registerRenderLayer();
			PrizeCornerPosterBlock.registerRenderLayer();
			DoorButtonOnBlock.registerRenderLayer();
			OfficeDoorBlock.registerRenderLayer();
			LightButtonOnBlock.registerRenderLayer();
			ClosetLeftTopBlock.registerRenderLayer();
			ClosetRightTopBlock.registerRenderLayer();
			ClosetLeftOpenBottomBlock.registerRenderLayer();
			ClosetLeftOpenTopBlock.registerRenderLayer();
			ClosetRightOpenBottomBlock.registerRenderLayer();
			ClosetRightOpenTopBlock.registerRenderLayer();
			FredbearPlushBlock.registerRenderLayer();
			SpringBonniePlushBlock.registerRenderLayer();
			OrangeSpeakerLeftBlock.registerRenderLayer();
			OrangeSpeakeRightBlock.registerRenderLayer();
			SpeakerLeftBlock.registerRenderLayer();
			SpeakerRightBlock.registerRenderLayer();
			FNAF3Posters2Block.registerRenderLayer();
			FNAF3Posters3Block.registerRenderLayer();
			FNAF3Posters4Block.registerRenderLayer();
			FNAF3Posters5Block.registerRenderLayer();
			FNAF3Posters6Block.registerRenderLayer();
			FNAF3Posters7Block.registerRenderLayer();
			FNAF3Posters8Block.registerRenderLayer();
			ToyBonnieSpawnBlockIdleBlock.registerRenderLayer();
			MangleSpawnBlockIdleBlock.registerRenderLayer();
			ToyChicaSpawnBlockIdleBlock.registerRenderLayer();
			ToyFoxySpawnBlockIdleBlock.registerRenderLayer();
			ToyFreddySpawnBlockIdleBlock.registerRenderLayer();
		}
	}
}
