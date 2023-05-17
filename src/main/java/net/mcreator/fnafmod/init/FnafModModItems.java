
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fnafmod.item.YellowbearItem;
import net.mcreator.fnafmod.item.YellowPlasticItem;
import net.mcreator.fnafmod.item.WhitePlasticItem;
import net.mcreator.fnafmod.item.ToyCupcakeItem;
import net.mcreator.fnafmod.item.ToreadorMarchItem;
import net.mcreator.fnafmod.item.StatueFreddyItemItem;
import net.mcreator.fnafmod.item.StatueFoxyItemItem;
import net.mcreator.fnafmod.item.StatueChicaItemItem;
import net.mcreator.fnafmod.item.StatueBonnieSpawnItem;
import net.mcreator.fnafmod.item.SpringlockedSuitItem;
import net.mcreator.fnafmod.item.SpringlockedFredbearSuitItem;
import net.mcreator.fnafmod.item.SpringLockSuitItem;
import net.mcreator.fnafmod.item.SpringBonnieItem;
import net.mcreator.fnafmod.item.ShowtimeMadameMacabreBitemarkRemixItem;
import net.mcreator.fnafmod.item.ShadowRemnantItem;
import net.mcreator.fnafmod.item.RemnantItem;
import net.mcreator.fnafmod.item.RedPlasticItem;
import net.mcreator.fnafmod.item.PizzaSliceItem;
import net.mcreator.fnafmod.item.PitBonnieSuitItem;
import net.mcreator.fnafmod.item.PinkPlasticItem;
import net.mcreator.fnafmod.item.PaintBrushItem;
import net.mcreator.fnafmod.item.OurLittleHorrorStoryItem;
import net.mcreator.fnafmod.item.OfficeChairItemItem;
import net.mcreator.fnafmod.item.MicrophoneItem;
import net.mcreator.fnafmod.item.LightBluePlasticItem;
import net.mcreator.fnafmod.item.ItsBeenSoLongItem;
import net.mcreator.fnafmod.item.HappiestDayItem;
import net.mcreator.fnafmod.item.GuardHatItem;
import net.mcreator.fnafmod.item.GlitchtrapSuitItem;
import net.mcreator.fnafmod.item.FreddySpawnItemItem;
import net.mcreator.fnafmod.item.FreddyMaskItem;
import net.mcreator.fnafmod.item.FreddyItem;
import net.mcreator.fnafmod.item.FreddyFabricItem;
import net.mcreator.fnafmod.item.FredbearSpringLockSuitItem;
import net.mcreator.fnafmod.item.FredbearItemItem;
import net.mcreator.fnafmod.item.FoxySpawnItem;
import net.mcreator.fnafmod.item.FoxyItem;
import net.mcreator.fnafmod.item.FoxyFabricItem;
import net.mcreator.fnafmod.item.FlashLightOnItem;
import net.mcreator.fnafmod.item.FlashLightItem;
import net.mcreator.fnafmod.item.FazbearShowtimeItem;
import net.mcreator.fnafmod.item.EvilFreddyItemSpawnItem;
import net.mcreator.fnafmod.item.EvilFoxyItemItem;
import net.mcreator.fnafmod.item.EvilChicaItemItem;
import net.mcreator.fnafmod.item.EvilBonnieItem;
import net.mcreator.fnafmod.item.EndoItem;
import net.mcreator.fnafmod.item.DontGoItem;
import net.mcreator.fnafmod.item.CupcakeItem;
import net.mcreator.fnafmod.item.CircuitBoardItem;
import net.mcreator.fnafmod.item.ChicaSpawnItemItem;
import net.mcreator.fnafmod.item.ChicaItem;
import net.mcreator.fnafmod.item.ChicaFabricItem;
import net.mcreator.fnafmod.item.CameraMonitorItem;
import net.mcreator.fnafmod.item.BrownPlasticItem;
import net.mcreator.fnafmod.item.BrokenFlashLightItem;
import net.mcreator.fnafmod.item.BonnieSpawnItem;
import net.mcreator.fnafmod.item.BonnieItem;
import net.mcreator.fnafmod.item.BonnieGuitarItem;
import net.mcreator.fnafmod.item.BonnieFabricItem;
import net.mcreator.fnafmod.item.BlackPlasticItem;
import net.mcreator.fnafmod.item.BatteryItem;
import net.mcreator.fnafmod.block.display.UnWitheredFreddyHeadDisplayItem;
import net.mcreator.fnafmod.block.display.UnWitheredFoxyHeadDisplayItem;
import net.mcreator.fnafmod.block.display.UnWitheredChicaHeadDisplayItem;
import net.mcreator.fnafmod.block.display.UnWitheredBonnieHeadDisplayItem;
import net.mcreator.fnafmod.block.display.TrashCanDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightRedOnDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightRedOffDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightPinkOnDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightPinkOffDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightOrangeOnDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightOrangeOffDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightOnDisplayItem;
import net.mcreator.fnafmod.block.display.StageLightOffDisplayItem;
import net.mcreator.fnafmod.block.display.SpringBonnieHeadDisplayItem;
import net.mcreator.fnafmod.block.display.MeshTrashCanDisplayItem;
import net.mcreator.fnafmod.block.display.FreddyHeadDisplayItem;
import net.mcreator.fnafmod.block.display.FredbearHeadDisplayItem;
import net.mcreator.fnafmod.block.display.FoxyHeadDisplayItem;
import net.mcreator.fnafmod.block.display.EndoBlockDisplayItem;
import net.mcreator.fnafmod.block.display.ChicaHeadDisplayItem;
import net.mcreator.fnafmod.block.display.BonnieHeadDisplayItem;
import net.mcreator.fnafmod.FnafModMod;

public class FnafModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FnafModMod.MODID);
	public static final RegistryObject<Item> BLACK_WHITE_TILE = block(FnafModModBlocks.BLACK_WHITE_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILE_SLAB = block(FnafModModBlocks.BLACK_WHITE_TILE_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILE_STAIR = block(FnafModModBlocks.BLACK_WHITE_TILE_STAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILE_CRACKED = block(FnafModModBlocks.BLACK_WHITE_TILE_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILE_SLAB_CRACKED = block(FnafModModBlocks.BLACK_WHITE_TILE_SLAB_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_WHITE_TILE_STAIRS_CRACKED = block(FnafModModBlocks.BLACK_WHITE_TILE_STAIRS_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILE = block(FnafModModBlocks.RED_BLUE_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILE_SLAB = block(FnafModModBlocks.RED_BLUE_TILE_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILE_STAIR = block(FnafModModBlocks.RED_BLUE_TILE_STAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILE_CRACKED = block(FnafModModBlocks.RED_BLUE_TILE_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILE_SLAB_CRACKED = block(FnafModModBlocks.RED_BLUE_TILE_SLAB_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_TILE_STAIRS_CRACKED = block(FnafModModBlocks.RED_BLUE_TILE_STAIRS_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLACK_TILE = block(FnafModModBlocks.RED_BLACK_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLACK_TILE_SLAB = block(FnafModModBlocks.RED_BLACK_TILE_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLACK_TILE_STAIR = block(FnafModModBlocks.RED_BLACK_TILE_STAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLACK_TILE_CRACKED = block(FnafModModBlocks.RED_BLACK_TILE_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLACK_TILE_SLAB_CRACKED = block(FnafModModBlocks.RED_BLACK_TILE_SLAB_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_BLACK_TILE_STAIRS_CRACKED = block(FnafModModBlocks.RED_BLACK_TILE_STAIRS_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLUE_BLACK_TILE = block(FnafModModBlocks.BLUE_BLACK_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLUE_BLACK_TILE_SLAB = block(FnafModModBlocks.BLUE_BLACK_TILE_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLUE_BLACK_TILE_STAIR = block(FnafModModBlocks.BLUE_BLACK_TILE_STAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLUE_BLACK_TILE_CRACKED = block(FnafModModBlocks.BLUE_BLACK_TILE_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLUE_BLACK_TILE_SLAB_CRACKED = block(FnafModModBlocks.BLUE_BLACK_TILE_SLAB_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLUE_BLACK_TILE_STAIRS_CRACKED = block(FnafModModBlocks.BLUE_BLACK_TILE_STAIRS_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILE = block(FnafModModBlocks.RED_WHITE_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILE_SLAB = block(FnafModModBlocks.RED_WHITE_TILE_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILE_STAIR = block(FnafModModBlocks.RED_WHITE_TILE_STAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILE_CRACKED = block(FnafModModBlocks.RED_WHITE_TILE_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILE_SLAB_CRACKED = block(FnafModModBlocks.RED_WHITE_TILE_SLAB_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_WHITE_TILE_STAIR_CRACKED = block(FnafModModBlocks.RED_WHITE_TILE_STAIR_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GREEN_BLUE_TILE = block(FnafModModBlocks.GREEN_BLUE_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GREEN_BLUE_TILE_SLAB = block(FnafModModBlocks.GREEN_BLUE_TILE_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GREEN_BLUE_TILE_STAIR = block(FnafModModBlocks.GREEN_BLUE_TILE_STAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GREEN_BLUE_TILE_CRACKED = block(FnafModModBlocks.GREEN_BLUE_TILE_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GREEN_BLUE_TILE_STAIR_CRACKED = block(FnafModModBlocks.GREEN_BLUE_TILE_STAIR_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GREEN_BLUE_TILE_SLAB_CRACKED = block(FnafModModBlocks.GREEN_BLUE_TILE_SLAB_CRACKED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDBEAR_FLOOR = block(FnafModModBlocks.FREDBEAR_FLOOR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDBEAR_FLOOR_CLEAN = block(FnafModModBlocks.FREDBEAR_FLOOR_CLEAN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> STAGE_BRICKS = block(FnafModModBlocks.STAGE_BRICKS, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> STAGE_BRICK_TILES = block(FnafModModBlocks.STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_STAGE_BRICK_TILES = block(FnafModModBlocks.ALTERNATE_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PURPLE_STAGE_BRICK_TILES = block(FnafModModBlocks.PURPLE_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_PURPLE_STAGE_BRICK_TILES = block(FnafModModBlocks.ALTERNATE_PURPLE_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WALL_TILE = block(FnafModModBlocks.WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_WALL_TILE = block(FnafModModBlocks.ALTERNATE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_PURPLE_WALL_TILE = block(FnafModModBlocks.BLACK_PURPLE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BLACK_PURPLE_WALL_TILE = block(FnafModModBlocks.ALTERNATE_BLACK_PURPLE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WHITE_RED_WALL_TILE = block(FnafModModBlocks.WHITE_RED_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_WHITE_RED_WALL_TILE = block(FnafModModBlocks.ALTERNATE_WHITE_RED_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WHITE_PURPLE_WALL_TILE = block(FnafModModBlocks.WHITE_PURPLE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_WHITE_PURPLE_WALL_TILES = block(FnafModModBlocks.ALTERNATE_WHITE_PURPLE_WALL_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WHITE_BLACK_WALL_TILE = block(FnafModModBlocks.WHITE_BLACK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CHECKERED_TILE = block(FnafModModBlocks.CHECKERED_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_WHITE_BLACK_WALL_TILE = block(FnafModModBlocks.ALTERNATE_WHITE_BLACK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CHECKERED_WALL = block(FnafModModBlocks.CHECKERED_WALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CHECKERED_WALL_TILE = block(FnafModModBlocks.CHECKERED_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CHECKERED_WHITE_WALL_TILE = block(FnafModModBlocks.CHECKERED_WHITE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_STAGE_BRICK_TILES = block(FnafModModBlocks.BIG_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_STAGE_BRICK_TILES = block(FnafModModBlocks.ALTERNATE_BIG_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_PURPLE_STAGE_BRICK_TILES = block(FnafModModBlocks.BIG_PURPLE_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_PURPLE_STAGE_BRICK_TILES = block(FnafModModBlocks.ALTERNATE_BIG_PURPLE_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_WALL_TILE = block(FnafModModBlocks.BIG_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_WALL_TILE = block(FnafModModBlocks.ALTERNATE_BIG_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_PURPLE_WALL_TILE = block(FnafModModBlocks.BIG_BLACK_PURPLE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_BLACK_PURPLE_WALL_TILE = block(FnafModModBlocks.ALTERNATE_BIG_BLACK_PURPLE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_WHITE_RED_WALL_TILE = block(FnafModModBlocks.BIG_WHITE_RED_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_WHITE_RED_WALL_TILE = block(FnafModModBlocks.ALTERNATE_BIG_WHITE_RED_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_WHITE_BLACK_WALL_TILE = block(FnafModModBlocks.BIG_WHITE_BLACK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_WHITE_BLACK_WALL_TILE = block(FnafModModBlocks.ALTERNATE_BIG_WHITE_BLACK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_WHITE_PURPLE_TILE = block(FnafModModBlocks.BIG_WHITE_PURPLE_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_WHITE_PURPLE_TILE = block(FnafModModBlocks.ALTERNATE_BIG_WHITE_PURPLE_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_RANCID_WALL_TILES = block(FnafModModBlocks.BIG_RANCID_WALL_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_RANCID_WALL_TILES = block(FnafModModBlocks.ALTERNATE_BIG_RANCID_WALL_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_CHECKERED_TILES = block(FnafModModBlocks.BIG_CHECKERED_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_CHECKERED_WALL = block(FnafModModBlocks.BIG_CHECKERED_WALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_WHITE_CHECKERED_WALL = block(FnafModModBlocks.BIG_WHITE_CHECKERED_WALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_CHECKERED_WALL_TILE = block(FnafModModBlocks.BIG_CHECKERED_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_CHECKERED_WHITE_WALL_TILE = block(FnafModModBlocks.BIG_CHECKERED_WHITE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_WALL = block(FnafModModBlocks.BLACK_WALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WHITE_WALL = block(FnafModModBlocks.WHITE_WALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOP_NORMAL = block(FnafModModBlocks.TOP_NORMAL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_3_WALL_TILE = block(FnafModModBlocks.FNAF_3_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_3_FLOOR = block(FnafModModBlocks.FNAF_3_FLOOR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_3_WALL = block(FnafModModBlocks.FNAF_3_WALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_3_WALL_SLAB = block(FnafModModBlocks.FNAF_3_WALL_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_4_WALL_BOTTOM_ROTABLE = block(FnafModModBlocks.FNAF_4_WALL_BOTTOM_ROTABLE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_WALL_TOP_ROTABLE = block(FnafModModBlocks.FNAF_WALL_TOP_ROTABLE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_4_WALL_ROOM_BOTTOM = block(FnafModModBlocks.FNAF_4_WALL_ROOM_BOTTOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_4_WALL_BOTTOM_HALL = block(FnafModModBlocks.FNAF_4_WALL_BOTTOM_HALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_4_WALL_TOP_ROOM = block(FnafModModBlocks.FNAF_4_WALL_TOP_ROOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_4_WALL_TOP_HALL = block(FnafModModBlocks.FNAF_4_WALL_TOP_HALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PURPLE_CURTAIN = block(FnafModModBlocks.PURPLE_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> THIN_PURPLE_CURTAIN = block(FnafModModBlocks.THIN_PURPLE_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CORN_CURTAIN = block(FnafModModBlocks.CORN_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> THIN_CORN_CURTAIN = block(FnafModModBlocks.THIN_CORN_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CANDY_CURTAIN = block(FnafModModBlocks.CANDY_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> THIN_CANDY_CURTAIN = block(FnafModModBlocks.THIN_CANDY_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> COBALT_CURTAIN = block(FnafModModBlocks.COBALT_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> THIN_COBALT_CURTAIN = block(FnafModModBlocks.THIN_COBALT_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CACTUS_CURTAIN = block(FnafModModBlocks.CACTUS_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> THIN_CACTUS_CURTAIN = block(FnafModModBlocks.THIN_CACTUS_CURTAIN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BACKSTAGE_DOOR = doubleBlock(FnafModModBlocks.BACKSTAGE_DOOR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FNAF_4_DOOR = doubleBlock(FnafModModBlocks.FNAF_4_DOOR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CLOSET_LEFT_BOTTOM = block(FnafModModBlocks.CLOSET_LEFT_BOTTOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CLOSET_RIGHT_BOTTOM = block(FnafModModBlocks.CLOSET_RIGHT_BOTTOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TABLE_CLOTH = block(FnafModModBlocks.TABLE_CLOTH, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PIZZA_BOX_CLOSED = block(FnafModModBlocks.PIZZA_BOX_CLOSED, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PIZZA_BOX_OPEN = block(FnafModModBlocks.PIZZA_BOX_OPEN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DOOR_BUTTON_OFF = block(FnafModModBlocks.DOOR_BUTTON_OFF, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> LIGHT_BUTTON_OFF = block(FnafModModBlocks.LIGHT_BUTTON_OFF, null);
	public static final RegistryObject<Item> STARS = block(FnafModModBlocks.STARS, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DESK = block(FnafModModBlocks.DESK, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> SECURITY_DOOR_OPEN = block(FnafModModBlocks.SECURITY_DOOR_OPEN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DESK_2 = block(FnafModModBlocks.DESK_2, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DESK_3 = block(FnafModModBlocks.DESK_3, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CHAIR = block(FnafModModBlocks.CHAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> MONITORS = block(FnafModModBlocks.MONITORS, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> SHELF = block(FnafModModBlocks.SHELF, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FAN = block(FnafModModBlocks.FAN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PURPLE_FAN = block(FnafModModBlocks.PURPLE_FAN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> SMALL_PIPES = block(FnafModModBlocks.SMALL_PIPES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WALL_PIZZA = block(FnafModModBlocks.WALL_PIZZA, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WARNING_SIGN = block(FnafModModBlocks.WARNING_SIGN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDDY_PLUSHIE = block(FnafModModBlocks.FREDDY_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GOLDEN_FREDDY_PLUSHIE = block(FnafModModBlocks.GOLDEN_FREDDY_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDBEAR_PLUSHIE = block(FnafModModBlocks.FREDBEAR_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BONNIE_PLUSHIE = block(FnafModModBlocks.BONNIE_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FOXY_PLUSHIE = block(FnafModModBlocks.FOXY_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CHICA_PLUSHIE = block(FnafModModBlocks.CHICA_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> SPRING_BONNIE_PLUSHIE = block(FnafModModBlocks.SPRING_BONNIE_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PLUSH_FREDDY = block(FnafModModBlocks.PLUSH_FREDDY, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PLUSH_BONNIE = block(FnafModModBlocks.PLUSH_BONNIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PLUSH_CHICA = block(FnafModModBlocks.PLUSH_CHICA, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PLUSH_FOXY = block(FnafModModBlocks.PLUSH_FOXY, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PLUSH_FREDBEAR = block(FnafModModBlocks.PLUSH_FREDBEAR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ARCADE_MACHINE_BONNIE = block(FnafModModBlocks.ARCADE_MACHINE_BONNIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ARCADE_MACHINE_FREDDY = block(FnafModModBlocks.ARCADE_MACHINE_FREDDY, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ARCADE_MACHINE_FOXY_2 = block(FnafModModBlocks.ARCADE_MACHINE_FOXY_2, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ARCADE_MACHINE_CHICA = block(FnafModModBlocks.ARCADE_MACHINE_CHICA, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ARCADE_MACHINE_FOXY = block(FnafModModBlocks.ARCADE_MACHINE_FOXY, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> LOCKET_BOTTOM = block(FnafModModBlocks.LOCKET_BOTTOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WIRES = block(FnafModModBlocks.WIRES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WALL_WIRES = block(FnafModModBlocks.WALL_WIRES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ORANGE_SPEAKER = block(FnafModModBlocks.ORANGE_SPEAKER, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> SPEAKER = block(FnafModModBlocks.SPEAKER, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> REMNANT_INFUSER = block(FnafModModBlocks.REMNANT_INFUSER, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BALLOON = block(FnafModModBlocks.BALLOON, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BALLOON_BLUE = block(FnafModModBlocks.BALLOON_BLUE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BALLOON_YELLOW = block(FnafModModBlocks.BALLOON_YELLOW, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BALLOON_GREEN = block(FnafModModBlocks.BALLOON_GREEN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BALLOONS = block(FnafModModBlocks.BALLOONS, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PRESENTS = block(FnafModModBlocks.PRESENTS, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> MUSIC_BOX = block(FnafModModBlocks.MUSIC_BOX, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDDY_STAND_SPAWN_EGG = REGISTRY.register("freddy_stand_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FREDDY_STAND, -1, -1, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> BONNIE_STAND_SPAWN_EGG = REGISTRY.register("bonnie_stand_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.BONNIE_STAND, -1, -1, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> CHICA_HEAD_DECORATION = block(FnafModModBlocks.CHICA_HEAD_DECORATION, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FOXY_HEAD_DECORATION = block(FnafModModBlocks.FOXY_HEAD_DECORATION, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> PUPPET_MASK = block(FnafModModBlocks.PUPPET_MASK, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_BOX_SPAWN_EGG = REGISTRY.register("toy_box_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.TOY_BOX, -1, -1, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> VENT = block(FnafModModBlocks.VENT, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> VENT_HATCH = block(FnafModModBlocks.VENT_HATCH, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_BONNIE_SPAWN_BLOCK = block(FnafModModBlocks.TOY_BONNIE_SPAWN_BLOCK, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> MANGLE_SPAWN_BLOCK = block(FnafModModBlocks.MANGLE_SPAWN_BLOCK, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_CHICA_SPAWN_BLOCK = block(FnafModModBlocks.TOY_CHICA_SPAWN_BLOCK, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_FOXY_SPAWN_BLOCK = block(FnafModModBlocks.TOY_FOXY_SPAWN_BLOCK, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_FREDDY_SPAWN_BLOCK = block(FnafModModBlocks.TOY_FREDDY_SPAWN_BLOCK, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> CAMERA_SPAWN_EGG = REGISTRY.register("camera_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CAMERA, -10066330, -6710887, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> PHONE = block(FnafModModBlocks.PHONE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> RED_WOOD_DOOR = doubleBlock(FnafModModBlocks.RED_WOOD_DOOR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> MICROPHONE = REGISTRY.register("microphone", () -> new MicrophoneItem());
	public static final RegistryObject<Item> CUPCAKE = REGISTRY.register("cupcake", () -> new CupcakeItem());
	public static final RegistryObject<Item> TOY_CUPCAKE = REGISTRY.register("toy_cupcake", () -> new ToyCupcakeItem());
	public static final RegistryObject<Item> BONNIE_GUITAR = REGISTRY.register("bonnie_guitar", () -> new BonnieGuitarItem());
	public static final RegistryObject<Item> FLASH_LIGHT = REGISTRY.register("flash_light", () -> new FlashLightItem());
	public static final RegistryObject<Item> FREDDY_MASK_HELMET = REGISTRY.register("freddy_mask_helmet", () -> new FreddyMaskItem.Helmet());
	public static final RegistryObject<Item> OFFICE_CHAIR_ITEM = REGISTRY.register("office_chair_item", () -> new OfficeChairItemItem());
	public static final RegistryObject<Item> SPRING_LOCK_SUIT_HELMET = REGISTRY.register("spring_lock_suit_helmet", () -> new SpringLockSuitItem.Helmet());
	public static final RegistryObject<Item> SPRING_LOCK_SUIT_CHESTPLATE = REGISTRY.register("spring_lock_suit_chestplate", () -> new SpringLockSuitItem.Chestplate());
	public static final RegistryObject<Item> SPRING_LOCK_SUIT_LEGGINGS = REGISTRY.register("spring_lock_suit_leggings", () -> new SpringLockSuitItem.Leggings());
	public static final RegistryObject<Item> SPRING_LOCK_SUIT_BOOTS = REGISTRY.register("spring_lock_suit_boots", () -> new SpringLockSuitItem.Boots());
	public static final RegistryObject<Item> FREDBEAR_SPRING_LOCK_SUIT_HELMET = REGISTRY.register("fredbear_spring_lock_suit_helmet", () -> new FredbearSpringLockSuitItem.Helmet());
	public static final RegistryObject<Item> FREDBEAR_SPRING_LOCK_SUIT_CHESTPLATE = REGISTRY.register("fredbear_spring_lock_suit_chestplate", () -> new FredbearSpringLockSuitItem.Chestplate());
	public static final RegistryObject<Item> FREDBEAR_SPRING_LOCK_SUIT_LEGGINGS = REGISTRY.register("fredbear_spring_lock_suit_leggings", () -> new FredbearSpringLockSuitItem.Leggings());
	public static final RegistryObject<Item> FREDBEAR_SPRING_LOCK_SUIT_BOOTS = REGISTRY.register("fredbear_spring_lock_suit_boots", () -> new FredbearSpringLockSuitItem.Boots());
	public static final RegistryObject<Item> ENDO = REGISTRY.register("endo", () -> new EndoItem());
	public static final RegistryObject<Item> CIRCUIT_BOARD = REGISTRY.register("circuit_board", () -> new CircuitBoardItem());
	public static final RegistryObject<Item> FREDDY_FABRIC = REGISTRY.register("freddy_fabric", () -> new FreddyFabricItem());
	public static final RegistryObject<Item> BONNIE_FABRIC = REGISTRY.register("bonnie_fabric", () -> new BonnieFabricItem());
	public static final RegistryObject<Item> CHICA_FABRIC = REGISTRY.register("chica_fabric", () -> new ChicaFabricItem());
	public static final RegistryObject<Item> FOXY_FABRIC = REGISTRY.register("foxy_fabric", () -> new FoxyFabricItem());
	public static final RegistryObject<Item> BLACK_PLASTIC = REGISTRY.register("black_plastic", () -> new BlackPlasticItem());
	public static final RegistryObject<Item> LIGHT_BLUE_PLASTIC = REGISTRY.register("light_blue_plastic", () -> new LightBluePlasticItem());
	public static final RegistryObject<Item> BROWN_PLASTIC = REGISTRY.register("brown_plastic", () -> new BrownPlasticItem());
	public static final RegistryObject<Item> YELLOW_PLASTIC = REGISTRY.register("yellow_plastic", () -> new YellowPlasticItem());
	public static final RegistryObject<Item> PINK_PLASTIC = REGISTRY.register("pink_plastic", () -> new PinkPlasticItem());
	public static final RegistryObject<Item> RED_PLASTIC = REGISTRY.register("red_plastic", () -> new RedPlasticItem());
	public static final RegistryObject<Item> WHITE_PLASTIC = REGISTRY.register("white_plastic", () -> new WhitePlasticItem());
	public static final RegistryObject<Item> REMNANT = REGISTRY.register("remnant", () -> new RemnantItem());
	public static final RegistryObject<Item> SHADOW_REMNANT = REGISTRY.register("shadow_remnant", () -> new ShadowRemnantItem());
	public static final RegistryObject<Item> PIZZA_SLICE = REGISTRY.register("pizza_slice", () -> new PizzaSliceItem());
	public static final RegistryObject<Item> GLITCHTRAP_SUIT_HELMET = REGISTRY.register("glitchtrap_suit_helmet", () -> new GlitchtrapSuitItem.Helmet());
	public static final RegistryObject<Item> GLITCHTRAP_SUIT_CHESTPLATE = REGISTRY.register("glitchtrap_suit_chestplate", () -> new GlitchtrapSuitItem.Chestplate());
	public static final RegistryObject<Item> GLITCHTRAP_SUIT_LEGGINGS = REGISTRY.register("glitchtrap_suit_leggings", () -> new GlitchtrapSuitItem.Leggings());
	public static final RegistryObject<Item> GLITCHTRAP_SUIT_BOOTS = REGISTRY.register("glitchtrap_suit_boots", () -> new GlitchtrapSuitItem.Boots());
	public static final RegistryObject<Item> GUARD_HAT_HELMET = REGISTRY.register("guard_hat_helmet", () -> new GuardHatItem.Helmet());
	public static final RegistryObject<Item> CAMERA_MONITOR = REGISTRY.register("camera_monitor", () -> new CameraMonitorItem());
	public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
	public static final RegistryObject<Item> ENDO_SKELETON_SPAWN_EGG = REGISTRY.register("endo_skeleton_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.ENDO_SKELETON, -6776939, -14606047, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SHADOW_FREDDY_SPAWN_EGG = REGISTRY.register("shadow_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SHADOW_FREDDY, -14942183, -16777216, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DED_WITHERED_FREDDY_SPAWN_EGG = REGISTRY.register("ded_withered_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.DED_WITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MANGLE_SITTING_SPAWN_EGG = REGISTRY.register("mangle_sitting_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.MANGLE_SITTING, -1, -3514924, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DAY_TIME_TOY_FREDDY_SPAWN_EGG = REGISTRY.register("day_time_toy_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_TOY_FREDDY, -9618409, -16777216, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DAY_TIME_TOY_BONNIE_SPAWN_EGG = REGISTRY.register("day_time_toy_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_TOY_BONNIE, -16737793, -1, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> BB_SPAWN_EGG = REGISTRY.register("bb_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.BB, -2087900, -9321766, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PUPPET_SPAWN_EGG = REGISTRY.register("puppet_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PUPPET, -15592942, -1315861, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SHADOW_BONNIE_SPAWN_EGG = REGISTRY.register("shadow_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SHADOW_BONNIE, -16056302, -15794150, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> ENDO_02_SPAWN_EGG = REGISTRY.register("endo_02_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.ENDO_02, -6776939, -14606047, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DAY_TIME_TOY_FOXY_SPAWN_EGG = REGISTRY.register("day_time_toy_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_TOY_FOXY, -1, -3407668, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> TOY_CHICA_SPAWN_EGG = REGISTRY.register("toy_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.TOY_CHICA, -1055193, -38689, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> JJ_SPAWN_EGG = REGISTRY.register("jj_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.JJ, -2808864, -6262310, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SPRINGLOCKED_ZOMBIE_FREDBEAR_SPAWN_EGG = REGISTRY.register("springlocked_zombie_fredbear_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SPRINGLOCKED_ZOMBIE_FREDBEAR, -12315371, -11131868, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SPRING_LOCKED_ZOMBIE_SPRING_BONNIE_SPAWN_EGG = REGISTRY.register("spring_locked_zombie_spring_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SPRING_LOCKED_ZOMBIE_SPRING_BONNIE, -11918557, -8049877, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SHADOW_FREDDY_STANDING_SPAWN_EGG = REGISTRY.register("shadow_freddy_standing_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SHADOW_FREDDY_STANDING, -16056302, -15794150, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SPRINGTRAP_SPAWN_EGG = REGISTRY.register("springtrap_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.SPRINGTRAP, -10066432, -6711040, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PHANTOM_CHICA_SPAWN_EGG = REGISTRY.register("phantom_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_CHICA, -10066432, -13421824, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PHANTOM_BB_SPAWN_EGG = REGISTRY.register("phantom_bb_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_BB, -13421824, -10066432, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PHANTOM_PUPPET_SPAWN_EGG = REGISTRY.register("phantom_puppet_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_PUPPET, -13421824, -10066432, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PHANTOM_MANGLE_SPAWN_EGG = REGISTRY.register("phantom_mangle_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_MANGLE, -13421824, -6711040, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PHANTOM_FREDDY_SPAWN_EGG = REGISTRY.register("phantom_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_FREDDY, -12893424, -14539005, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_FREDDY_SPAWN_EGG = REGISTRY.register("nightmare_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_FREDDY, -12046058, -11583954, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_BONNIE_SPAWN_EGG = REGISTRY.register("nightmare_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_BONNIE, -14207646, -11969417, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_CHICA_SPAWN_EGG = REGISTRY.register("nightmare_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_CHICA, -3625942, -7258200, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_FOXY_SPAWN_EGG = REGISTRY.register("nightmare_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_FOXY, -9817809, -12109269, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_FREDBEAR_SPAWN_EGG = REGISTRY.register("nightmare_fredbear_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_FREDBEAR, -4494329, -4817880, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARIONNE_SPAWN_EGG = REGISTRY.register("nightmarionne_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARIONNE, -15132391, -1780582, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_FREDDY_STATUE_SPAWN_EGG = REGISTRY.register("nightmare_freddy_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_FREDDY_STATUE, -13032690, -16777216, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_BONNIE_STATUE_SPAWN_EGG = REGISTRY.register("nightmare_bonnie_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_BONNIE_STATUE, -14282920, -10919532, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_CHICA_STATUE_SPAWN_EGG = REGISTRY.register("nightmare_chica_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_CHICA_STATUE, -5269983, -5882725, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_FOXY_STATUE_SPAWN_EGG = REGISTRY.register("nightmare_foxy_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_FOXY_STATUE, -6410214, -13360637, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_FREDBEAR_STATUE_SPAWN_EGG = REGISTRY.register("nightmare_fredbear_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_FREDBEAR_STATUE, -2652416, -11531960, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARIONE_STATUE_SPAWN_EGG = REGISTRY.register("nightmarione_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARIONE_STATUE, -16185079, -132391, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> FREDBEAR_CUT_OUT_SPAWN_EGG = REGISTRY.register("fredbear_cut_out_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEAR_CUT_OUT, -4810998, -12582330, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SPRING_BONNIE_CUT_OUT_SPAWN_EGG = REGISTRY.register("spring_bonnie_cut_out_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SPRING_BONNIE_CUT_OUT, -4810998, -12582330, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> STATUE_FREDDY_ITEM = REGISTRY.register("statue_freddy_item", () -> new StatueFreddyItemItem());
	public static final RegistryObject<Item> FREDDY_SPAWN_ITEM = REGISTRY.register("freddy_spawn_item", () -> new FreddySpawnItemItem());
	public static final RegistryObject<Item> EVIL_FREDDY_ITEM_SPAWN = REGISTRY.register("evil_freddy_item_spawn", () -> new EvilFreddyItemSpawnItem());
	public static final RegistryObject<Item> STATUE_CHICA_ITEM = REGISTRY.register("statue_chica_item", () -> new StatueChicaItemItem());
	public static final RegistryObject<Item> CHICA_SPAWN_ITEM = REGISTRY.register("chica_spawn_item", () -> new ChicaSpawnItemItem());
	public static final RegistryObject<Item> EVIL_CHICA_ITEM = REGISTRY.register("evil_chica_item", () -> new EvilChicaItemItem());
	public static final RegistryObject<Item> STATUE_FOXY_ITEM = REGISTRY.register("statue_foxy_item", () -> new StatueFoxyItemItem());
	public static final RegistryObject<Item> FOXY_SPAWN = REGISTRY.register("foxy_spawn", () -> new FoxySpawnItem());
	public static final RegistryObject<Item> EVIL_FOXY_ITEM = REGISTRY.register("evil_foxy_item", () -> new EvilFoxyItemItem());
	public static final RegistryObject<Item> STATUE_BONNIE_SPAWN = REGISTRY.register("statue_bonnie_spawn", () -> new StatueBonnieSpawnItem());
	public static final RegistryObject<Item> BONNIE_SPAWN = REGISTRY.register("bonnie_spawn", () -> new BonnieSpawnItem());
	public static final RegistryObject<Item> EVIL_BONNIE = REGISTRY.register("evil_bonnie", () -> new EvilBonnieItem());
	public static final RegistryObject<Item> FREDDY = REGISTRY.register("freddy", () -> new FreddyItem());
	public static final RegistryObject<Item> BONNIE = REGISTRY.register("bonnie", () -> new BonnieItem());
	public static final RegistryObject<Item> CHICA = REGISTRY.register("chica", () -> new ChicaItem());
	public static final RegistryObject<Item> FOXY = REGISTRY.register("foxy", () -> new FoxyItem());
	public static final RegistryObject<Item> YELLOWBEAR = REGISTRY.register("yellowbear", () -> new YellowbearItem());
	public static final RegistryObject<Item> FREDBEAR_ITEM = REGISTRY.register("fredbear_item", () -> new FredbearItemItem());
	public static final RegistryObject<Item> SPRING_BONNIE = REGISTRY.register("spring_bonnie", () -> new SpringBonnieItem());
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_2 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_2, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_3 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_3, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_4 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_4, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_5 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_5, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_6 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_6, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_7 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_7, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_8 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_8, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_9 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_9, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_10 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_10, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> STRUCTURE_SPAWNING_BLOCK_11 = block(FnafModModBlocks.STRUCTURE_SPAWNING_BLOCK_11, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> SHACK_RANDOMIZER = block(FnafModModBlocks.SHACK_RANDOMIZER, FnafModModTabs.TAB_STRUCTURE_SPAWNERS);
	public static final RegistryObject<Item> DONT_GO = REGISTRY.register("dont_go", () -> new DontGoItem());
	public static final RegistryObject<Item> HAPPIEST_DAY = REGISTRY.register("happiest_day", () -> new HappiestDayItem());
	public static final RegistryObject<Item> TOREADOR_MARCH = REGISTRY.register("toreador_march", () -> new ToreadorMarchItem());
	public static final RegistryObject<Item> SHOWTIME_MADAME_MACABRE_BITEMARK_REMIX = REGISTRY.register("showtime_madame_macabre_bitemark_remix", () -> new ShowtimeMadameMacabreBitemarkRemixItem());
	public static final RegistryObject<Item> CHILDREN_DRAWINGS = block(FnafModModBlocks.CHILDREN_DRAWINGS, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> CHILDREN_DRAWINGS_2 = block(FnafModModBlocks.CHILDREN_DRAWINGS_2, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> CHILDREN_DRAWINGS_3 = block(FnafModModBlocks.CHILDREN_DRAWINGS_3, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> CHILDREN_DRAWINGS_4 = block(FnafModModBlocks.CHILDREN_DRAWINGS_4, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> CHILDREN_DRAWINGS_5 = block(FnafModModBlocks.CHILDREN_DRAWINGS_5, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> CHILDREN_DRAWINGS_6 = block(FnafModModBlocks.CHILDREN_DRAWINGS_6, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> CHILDREN_DRAWINGS_7 = block(FnafModModBlocks.CHILDREN_DRAWINGS_7, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> POSTER_1 = block(FnafModModBlocks.POSTER_1, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> POSTER_2 = block(FnafModModBlocks.POSTER_2, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> POSTER_3 = block(FnafModModBlocks.POSTER_3, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> POSTER_4 = block(FnafModModBlocks.POSTER_4, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> POSTER_5 = block(FnafModModBlocks.POSTER_5, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> POSTER_6 = block(FnafModModBlocks.POSTER_6, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> POSTER_7 = block(FnafModModBlocks.POSTER_7, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> FNAF_3_POSTERS = block(FnafModModBlocks.FNAF_3_POSTERS, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> PAPER_PAL_BONNIE = block(FnafModModBlocks.PAPER_PAL_BONNIE, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> PAPER_PAL_FREDDY = block(FnafModModBlocks.PAPER_PAL_FREDDY, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> PAPER_PAL = block(FnafModModBlocks.PAPER_PAL, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> FNAF_1_CELEBRATE = block(FnafModModBlocks.FNAF_1_CELEBRATE, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> FNAF_2_CELEBRATE = block(FnafModModBlocks.FNAF_2_CELEBRATE, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> PRIZE_CORNER_POSTER = block(FnafModModBlocks.PRIZE_CORNER_POSTER, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> PAINT_BRUSH = REGISTRY.register("paint_brush", () -> new PaintBrushItem());
	public static final RegistryObject<Item> DOOR_BUTTON_ON = block(FnafModModBlocks.DOOR_BUTTON_ON, null);
	public static final RegistryObject<Item> OFFICE_DOOR = block(FnafModModBlocks.OFFICE_DOOR, null);
	public static final RegistryObject<Item> LIGHT_BUTTON_ON = block(FnafModModBlocks.LIGHT_BUTTON_ON, null);
	public static final RegistryObject<Item> SPRING_BONNIE_CREATURE_SPAWN_EGG = REGISTRY.register("spring_bonnie_creature_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.SPRING_BONNIE_CREATURE, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FREDBEAR_CREATURE_SPAWN_EGG = REGISTRY.register("fredbear_creature_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEAR_CREATURE, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PASSIVE_FREDDY_SPAWN_EGG = REGISTRY.register("passive_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PASSIVE_FREDDY, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PASSIVE_GOLDIE_SPAWN_EGG = REGISTRY.register("passive_goldie_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PASSIVE_GOLDIE, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PASSIVE_FREDBEAR_SPAWN_EGG = REGISTRY.register("passive_fredbear_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PASSIVE_FREDBEAR, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PASSIVE_BONNIE_SPAWN_EGG = REGISTRY.register("passive_bonnie_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PASSIVE_BONNIE, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PASSIVE_SPRING_BONNIE_SPAWN_EGG = REGISTRY.register("passive_spring_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PASSIVE_SPRING_BONNIE, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PASSIVE_CHICA_SPAWN_EGG = REGISTRY.register("passive_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PASSIVE_CHICA, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PASSIVE_FOXY_SPAWN_EGG = REGISTRY.register("passive_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PASSIVE_FOXY, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FLASH_LIGHT_ON = REGISTRY.register("flash_light_on", () -> new FlashLightOnItem());
	public static final RegistryObject<Item> LOCKER_TOP = block(FnafModModBlocks.LOCKER_TOP, null);
	public static final RegistryObject<Item> FNAF_4_WALL_BOTTOM_ROTABLE_2 = block(FnafModModBlocks.FNAF_4_WALL_BOTTOM_ROTABLE_2, null);
	public static final RegistryObject<Item> FNAF_4_WALL_BOTTOM_ROTABLE_3 = block(FnafModModBlocks.FNAF_4_WALL_BOTTOM_ROTABLE_3, null);
	public static final RegistryObject<Item> FNAF_4_WALL_BOTTOM_ROTABLE_4 = block(FnafModModBlocks.FNAF_4_WALL_BOTTOM_ROTABLE_4, null);
	public static final RegistryObject<Item> FNAF_WALL_TOP_ROTABLE_2 = block(FnafModModBlocks.FNAF_WALL_TOP_ROTABLE_2, null);
	public static final RegistryObject<Item> FNAF_WALL_TOP_ROTABLE_3 = block(FnafModModBlocks.FNAF_WALL_TOP_ROTABLE_3, null);
	public static final RegistryObject<Item> FNAF_WALL_TOP_ROTABLE_4 = block(FnafModModBlocks.FNAF_WALL_TOP_ROTABLE_4, null);
	public static final RegistryObject<Item> CLOSET_LEFT_TOP = block(FnafModModBlocks.CLOSET_LEFT_TOP, null);
	public static final RegistryObject<Item> CLOSET_RIGHT_TOP = block(FnafModModBlocks.CLOSET_RIGHT_TOP, null);
	public static final RegistryObject<Item> CLOSET_LEFT_OPEN_BOTTOM = block(FnafModModBlocks.CLOSET_LEFT_OPEN_BOTTOM, null);
	public static final RegistryObject<Item> CLOSET_LEFT_OPEN_TOP = block(FnafModModBlocks.CLOSET_LEFT_OPEN_TOP, null);
	public static final RegistryObject<Item> CLOSET_RIGHT_OPEN_BOTTOM = block(FnafModModBlocks.CLOSET_RIGHT_OPEN_BOTTOM, null);
	public static final RegistryObject<Item> CLOSET_RIGHT_OPEN_TOP = block(FnafModModBlocks.CLOSET_RIGHT_OPEN_TOP, null);
	public static final RegistryObject<Item> DAY_TIME_PUPPET_SPAWN_EGG = REGISTRY.register("day_time_puppet_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_PUPPET, -16777216, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DAY_TIME_BB_SPAWN_EGG = REGISTRY.register("day_time_bb_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_BB, -65485, -16724737, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> PAT_PAT_SPAWN_EGG = REGISTRY.register("pat_pat_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PAT_PAT, -256, -13421773, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FRED_BEAR_CRATURE_SPAWN_EGG = REGISTRY.register("fred_bear_crature_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FRED_BEAR_CRATURE, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SPRINGLOCKED_SUIT_HELMET = REGISTRY.register("springlocked_suit_helmet", () -> new SpringlockedSuitItem.Helmet());
	public static final RegistryObject<Item> SPRINGLOCKED_SUIT_CHESTPLATE = REGISTRY.register("springlocked_suit_chestplate", () -> new SpringlockedSuitItem.Chestplate());
	public static final RegistryObject<Item> SPRINGLOCKED_SUIT_LEGGINGS = REGISTRY.register("springlocked_suit_leggings", () -> new SpringlockedSuitItem.Leggings());
	public static final RegistryObject<Item> SPRINGLOCKED_SUIT_BOOTS = REGISTRY.register("springlocked_suit_boots", () -> new SpringlockedSuitItem.Boots());
	public static final RegistryObject<Item> SPRINGLOCKED_FREDBEAR_SUIT_HELMET = REGISTRY.register("springlocked_fredbear_suit_helmet", () -> new SpringlockedFredbearSuitItem.Helmet());
	public static final RegistryObject<Item> SPRINGLOCKED_FREDBEAR_SUIT_CHESTPLATE = REGISTRY.register("springlocked_fredbear_suit_chestplate", () -> new SpringlockedFredbearSuitItem.Chestplate());
	public static final RegistryObject<Item> SPRINGLOCKED_FREDBEAR_SUIT_LEGGINGS = REGISTRY.register("springlocked_fredbear_suit_leggings", () -> new SpringlockedFredbearSuitItem.Leggings());
	public static final RegistryObject<Item> SPRINGLOCKED_FREDBEAR_SUIT_BOOTS = REGISTRY.register("springlocked_fredbear_suit_boots", () -> new SpringlockedFredbearSuitItem.Boots());
	public static final RegistryObject<Item> PIT_BONNIE_SUIT_HELMET = REGISTRY.register("pit_bonnie_suit_helmet", () -> new PitBonnieSuitItem.Helmet());
	public static final RegistryObject<Item> PIT_BONNIE_SUIT_CHESTPLATE = REGISTRY.register("pit_bonnie_suit_chestplate", () -> new PitBonnieSuitItem.Chestplate());
	public static final RegistryObject<Item> PIT_BONNIE_SUIT_LEGGINGS = REGISTRY.register("pit_bonnie_suit_leggings", () -> new PitBonnieSuitItem.Leggings());
	public static final RegistryObject<Item> PIT_BONNIE_SUIT_BOOTS = REGISTRY.register("pit_bonnie_suit_boots", () -> new PitBonnieSuitItem.Boots());
	public static final RegistryObject<Item> FREDBEAR_PLUSH = block(FnafModModBlocks.FREDBEAR_PLUSH, null);
	public static final RegistryObject<Item> SPRING_BONNIE_PLUSH = block(FnafModModBlocks.SPRING_BONNIE_PLUSH, null);
	public static final RegistryObject<Item> ERROR_TILE = block(FnafModModBlocks.ERROR_TILE, null);
	public static final RegistryObject<Item> ERROR_TILE_SLAB = block(FnafModModBlocks.ERROR_TILE_SLAB, null);
	public static final RegistryObject<Item> ERROR_TILE_STAIR = block(FnafModModBlocks.ERROR_TILE_STAIR, null);
	public static final RegistryObject<Item> ERROR_TILE_CRACKED = block(FnafModModBlocks.ERROR_TILE_CRACKED, null);
	public static final RegistryObject<Item> ERROR_TILE_SLAB_CRACKED = block(FnafModModBlocks.ERROR_TILE_SLAB_CRACKED, null);
	public static final RegistryObject<Item> ERROR_TILE_STAIRS_CRACKED = block(FnafModModBlocks.ERROR_TILE_STAIRS_CRACKED, null);
	public static final RegistryObject<Item> OFFICE_CHAIR_SPAWN_EGG = REGISTRY.register("office_chair_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.OFFICE_CHAIR, -13693683, -10658467, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ORANGE_SPEAKER_LEFT = block(FnafModModBlocks.ORANGE_SPEAKER_LEFT, null);
	public static final RegistryObject<Item> ORANGE_SPEAKE_RIGHT = block(FnafModModBlocks.ORANGE_SPEAKE_RIGHT, null);
	public static final RegistryObject<Item> SPEAKER_LEFT = block(FnafModModBlocks.SPEAKER_LEFT, null);
	public static final RegistryObject<Item> SPEAKER_RIGHT = block(FnafModModBlocks.SPEAKER_RIGHT, null);
	public static final RegistryObject<Item> FULL_HOSTILE_FREDDY_SPAWN_EGG = REGISTRY.register("full_hostile_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FULL_HOSTILE_FREDDY, -9682156, -16777216, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FULL_HOSTILE_CHICA_SPAWN_EGG = REGISTRY.register("full_hostile_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FULL_HOSTILE_CHICA, -3355648, -3407668, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FULL_HOSTILE_FOXY_SPAWN_EGG = REGISTRY.register("full_hostile_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FULL_HOSTILE_FOXY, -6750208, -13159, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FULL_HOSTILE_BONNIE_SPAWN_EGG = REGISTRY.register("full_hostile_bonnie_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FULL_HOSTILE_BONNIE, -6749953, -6710785, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SPRING_BONNIE_CREATURE_2_THE_SEQUEL_SPAWN_EGG = REGISTRY.register("spring_bonnie_creature_2_the_sequel_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SPRING_BONNIE_CREATURE_2_THE_SEQUEL, -1, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FNAF_3_POSTERS_2 = block(FnafModModBlocks.FNAF_3_POSTERS_2, null);
	public static final RegistryObject<Item> FNAF_3_POSTERS_3 = block(FnafModModBlocks.FNAF_3_POSTERS_3, null);
	public static final RegistryObject<Item> FNAF_3_POSTERS_4 = block(FnafModModBlocks.FNAF_3_POSTERS_4, null);
	public static final RegistryObject<Item> FNAF_3_POSTERS_5 = block(FnafModModBlocks.FNAF_3_POSTERS_5, null);
	public static final RegistryObject<Item> FNAF_3_POSTERS_6 = block(FnafModModBlocks.FNAF_3_POSTERS_6, null);
	public static final RegistryObject<Item> FNAF_3_POSTERS_7 = block(FnafModModBlocks.FNAF_3_POSTERS_7, null);
	public static final RegistryObject<Item> FNAF_3_POSTERS_8 = block(FnafModModBlocks.FNAF_3_POSTERS_8, null);
	public static final RegistryObject<Item> SITTING_DAYTIME_SPRINGTRAP_SPAWN_EGG = REGISTRY.register("sitting_daytime_springtrap_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_DAYTIME_SPRINGTRAP, -10066432, -6711040, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STANDING_DAYTIME_SPRINGTRAP_SPAWN_EGG = REGISTRY.register("standing_daytime_springtrap_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.STANDING_DAYTIME_SPRINGTRAP, -10066432, -6711040, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TOY_BONNIE_SPAWN_BLOCK_IDLE = block(FnafModModBlocks.TOY_BONNIE_SPAWN_BLOCK_IDLE, null);
	public static final RegistryObject<Item> CRAWLING_TOY_BONNIE_SPAWN_EGG = REGISTRY.register("crawling_toy_bonnie_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CRAWLING_TOY_BONNIE, -16737793, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CRAWLING_MANGLE_SPAWN_EGG = REGISTRY.register("crawling_mangle_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CRAWLING_MANGLE, -1, -26113, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MANGLE_SPAWN_BLOCK_IDLE = block(FnafModModBlocks.MANGLE_SPAWN_BLOCK_IDLE, null);
	public static final RegistryObject<Item> TOY_CHICA_SPAWN_BLOCK_IDLE = block(FnafModModBlocks.TOY_CHICA_SPAWN_BLOCK_IDLE, null);
	public static final RegistryObject<Item> TOY_FOXY_SPAWN_BLOCK_IDLE = block(FnafModModBlocks.TOY_FOXY_SPAWN_BLOCK_IDLE, null);
	public static final RegistryObject<Item> TOY_FREDDY_SPAWN_BLOCK_IDLE = block(FnafModModBlocks.TOY_FREDDY_SPAWN_BLOCK_IDLE, null);
	public static final RegistryObject<Item> CRAWLING_TOY_FOXY_SPAWN_EGG = REGISTRY.register("crawling_toy_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CRAWLING_TOY_FOXY, -1, -26113, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CRAWLING_TOY_CHICA_SPAWN_EGG = REGISTRY.register("crawling_toy_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CRAWLING_TOY_CHICA, -205, -39169, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CRAWLING_SPRINGTRAP_SPAWN_EGG = REGISTRY.register("crawling_springtrap_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.CRAWLING_SPRINGTRAP, -10066432, -13421824, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> GLITCH_BONNIE_STATUE_SPAWN_EGG = REGISTRY.register("glitch_bonnie_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.GLITCH_BONNIE_STATUE, -4810998, -12582330, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> GLITCH_BONNIE_CUT_OUT_SPAWN_EGG = REGISTRY.register("glitch_bonnie_cut_out_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.GLITCH_BONNIE_CUT_OUT, -4810998, -12582330, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FLASH_LIGHT_LIGHT = block(FnafModModBlocks.FLASH_LIGHT_LIGHT, null);
	public static final RegistryObject<Item> BROKEN_FLASH_LIGHT = REGISTRY.register("broken_flash_light", () -> new BrokenFlashLightItem());
	public static final RegistryObject<Item> PLUSHTRAP_SPAWN_EGG = REGISTRY.register("plushtrap_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.PLUSHTRAP, -11246810, -8484312, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ARCADE_MACHINE_SHADOW_FREDDY = block(FnafModModBlocks.ARCADE_MACHINE_SHADOW_FREDDY, null);
	public static final RegistryObject<Item> OUR_LITTLE_HORROR_STORY = REGISTRY.register("our_little_horror_story", () -> new OurLittleHorrorStoryItem());
	public static final RegistryObject<Item> FAZBEAR_SHOWTIME = REGISTRY.register("fazbear_showtime", () -> new FazbearShowtimeItem());
	public static final RegistryObject<Item> ITS_BEEN_SO_LONG = REGISTRY.register("its_been_so_long", () -> new ItsBeenSoLongItem());
	public static final RegistryObject<Item> SITTING_PLUSHTRAP_SPAWN_EGG = REGISTRY.register("sitting_plushtrap_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_PLUSHTRAP, -10066432, -13421824, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DINER_CHAIR = block(FnafModModBlocks.DINER_CHAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DINER_CHAIR_2 = block(FnafModModBlocks.DINER_CHAIR_2, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DINER_CHAIR_3 = block(FnafModModBlocks.DINER_CHAIR_3, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DINER_CHAIR_4 = block(FnafModModBlocks.DINER_CHAIR_4, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DINER_CHAIR_5 = block(FnafModModBlocks.DINER_CHAIR_5, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> VENDING_BOTTOM = block(FnafModModBlocks.VENDING_BOTTOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> VENDING_TOP = block(FnafModModBlocks.VENDING_TOP, null);
	public static final RegistryObject<Item> CRYING_CHILD_SPAWN_EGG = REGISTRY.register("crying_child_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CRYING_CHILD, -1, -3355444, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_FREDDY_SPAWN_EGG = REGISTRY.register("withered_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> UNWITHERED_FREDDY_SPAWN_EGG = REGISTRY.register("unwithered_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_FREDDY, -10994921, -5737400, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_GOLDEN_FREDDY_SPAWN_EGG = REGISTRY.register("withered_golden_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_GOLDEN_FREDDY, -6328817, -6127097, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PHANTOM_FOXY_SPAWN_EGG = REGISTRY.register("phantom_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PHANTOM_FOXY, -13233395, -12181729, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_FOXY_SPAWN_EGG = REGISTRY.register("withered_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_FOXY, -9625322, -4762045, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DAY_TIME_WITHERED_FOXY_SPAWN_EGG = REGISTRY.register("day_time_withered_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_WITHERED_FOXY, -10674658, -9097947, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> WITHERED_BONNIE_SPAWN_EGG = REGISTRY.register("withered_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_BONNIE, -12045717, -9018738, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> WITHERED_CHICA_SPAWN_EGG = REGISTRY.register("withered_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.WITHERED_CHICA, -2446336, -2524384, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SITTING_WITHERED_BONNIE_SPAWN_EGG = REGISTRY.register("sitting_withered_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_WITHERED_BONNIE, -12906113, -12766348, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SITTING_WITHERED_CHICA_SPAWN_EGG = REGISTRY.register("sitting_withered_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_WITHERED_CHICA, -2836468, -5021928, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> UNWITHERED_FOXY_SPAWN_EGG = REGISTRY.register("unwithered_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_FOXY, -11660525, -7715532, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> UNWITHERED_BONNIE_SPAWN_EGG = REGISTRY.register("unwithered_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_BONNIE, -12967297, -9023088, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> UNWITHERED_CHICA_SPAWN_EGG = REGISTRY.register("unwithered_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.UNWITHERED_CHICA, -2647535, -4473925, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> FREDDY_FAZBEAR_SPAWN_EGG = REGISTRY.register("freddy_fazbear_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FREDDY_FAZBEAR, -10994921, -16711423, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> BONNIE_BUNNY_SPAWN_EGG = REGISTRY.register("bonnie_bunny_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.BONNIE_BUNNY, -14018972, -10289152, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CHICA_CHICKEN_SPAWN_EGG = REGISTRY.register("chica_chicken_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.CHICA_CHICKEN, -11776, -4297467, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> FOXY_PIRATE_SPAWN_EGG = REGISTRY.register("foxy_pirate_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FOXY_PIRATE, -6147561, -7711419, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MESH_TRASH_CAN = REGISTRY.register(FnafModModBlocks.MESH_TRASH_CAN.getId().getPath(),
			() -> new MeshTrashCanDisplayItem(FnafModModBlocks.MESH_TRASH_CAN.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> TRASH_CAN = REGISTRY.register(FnafModModBlocks.TRASH_CAN.getId().getPath(), () -> new TrashCanDisplayItem(FnafModModBlocks.TRASH_CAN.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> FREDBEAR_ANIMATRONIC_SPAWN_EGG = REGISTRY.register("fredbear_animatronic_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEAR_ANIMATRONIC, -2645248, -10270720, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SPRING_BONNIE_ANIMATRONIC_SPAWN_EGG = REGISTRY.register("spring_bonnie_animatronic_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SPRING_BONNIE_ANIMATRONIC, -6589184, -10071038, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DAY_TIME_FREDDY_SPAWN_EGG = REGISTRY.register("day_time_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_FREDDY, -11651049, -11389160, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DAYTIME_CHICA_SPAWN_EGG = REGISTRY.register("daytime_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAYTIME_CHICA, -1123584, -1147648, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DAY_TIME_BONNIE_SPAWN_EGG = REGISTRY.register("day_time_bonnie_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_BONNIE, -13429149, -12436622, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> DAY_TIME_FOXY_SPAWN_EGG = REGISTRY.register("day_time_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.DAY_TIME_FOXY, -6152192, -6404555, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> GLITCH_BONNIE_ANIMATRONIC_SPAWN_EGG = REGISTRY.register("glitch_bonnie_animatronic_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.GLITCH_BONNIE_ANIMATRONIC, -6589184, -12058557, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> OVDR_PLUSHIE = block(FnafModModBlocks.OVDR_PLUSHIE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BLACK_STRIPE_DARK_WALL_TILE = block(FnafModModBlocks.BLACK_STRIPE_DARK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BLACK_STRIPE_DARK_WALL_TILE = block(FnafModModBlocks.ALTERNATE_BLACK_STRIPE_DARK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_WHITE_BLACK_STRIPE_WALL_TILE = block(FnafModModBlocks.ALTERNATE_WHITE_BLACK_STRIPE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WHITE_BLACK_STRIPE_WALL_TILE = block(FnafModModBlocks.WHITE_BLACK_STRIPE_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> STAGE_BLACK_STRIPE_TILES = block(FnafModModBlocks.STAGE_BLACK_STRIPE_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_STAGE_BLACK_STRIPE_TILES = block(FnafModModBlocks.ALTERNATE_STAGE_BLACK_STRIPE_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_STRIPE_DARK_WALL_TILE = block(FnafModModBlocks.BIG_BLACK_STRIPE_DARK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_BLACK_STRIPE_DARK_WALL_TILE = block(FnafModModBlocks.ALTERNATE_BIG_BLACK_STRIPE_DARK_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_WHITE_BLACK_STRIPED_WALL_TILE = block(FnafModModBlocks.BIG_WHITE_BLACK_STRIPED_WALL_TILE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_WHITE_BLACK_STRIPED_WALL_TILES = block(FnafModModBlocks.ALTERNATE_BIG_WHITE_BLACK_STRIPED_WALL_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BIG_BLACK_STRIPED_STAGE_BRICK_TILES = block(FnafModModBlocks.BIG_BLACK_STRIPED_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> ALTERNATE_BIG_BLACK_STRIPED_STAGE_BRICK_TILES = block(FnafModModBlocks.ALTERNATE_BIG_BLACK_STRIPED_STAGE_BRICK_TILES, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> GOLDEN_FREDDY_SPAWN_EGG = REGISTRY.register("golden_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.GOLDEN_FREDDY, -2376924, -15790321, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> SITTING_SPRING_BONNIE_SPAWN_EGG = REGISTRY.register("sitting_spring_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_SPRING_BONNIE, -6328817, -9557906, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> STATUE_FREDDY_SPAWN_EGG = REGISTRY.register("statue_freddy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.STATUE_FREDDY, -11129586, -10994406, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STATUE_CHICA_SPAWN_EGG = REGISTRY.register("statue_chica_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.STATUE_CHICA, -5464040, -3575552, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STATUE_FOXY_SPAWN_EGG = REGISTRY.register("statue_foxy_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.STATUE_FOXY, -5492712, -7715522, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STATUE_BONNIE_SPAWN_EGG = REGISTRY.register("statue_bonnie_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.STATUE_BONNIE, -12117844, -10200673, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SCREEN = block(FnafModModBlocks.SCREEN, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDDLES_SPAWN_EGG = REGISTRY.register("freddles_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.FREDDLES, -14412021, -16777216, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PLUSHTRAP_CHAIR = block(FnafModModBlocks.PLUSHTRAP_CHAIR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDDY_HEAD = REGISTRY.register(FnafModModBlocks.FREDDY_HEAD.getId().getPath(),
			() -> new FreddyHeadDisplayItem(FnafModModBlocks.FREDDY_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> BONNIE_HEAD = REGISTRY.register(FnafModModBlocks.BONNIE_HEAD.getId().getPath(),
			() -> new BonnieHeadDisplayItem(FnafModModBlocks.BONNIE_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> CHICA_HEAD = REGISTRY.register(FnafModModBlocks.CHICA_HEAD.getId().getPath(), () -> new ChicaHeadDisplayItem(FnafModModBlocks.CHICA_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> FOXY_HEAD = REGISTRY.register(FnafModModBlocks.FOXY_HEAD.getId().getPath(), () -> new FoxyHeadDisplayItem(FnafModModBlocks.FOXY_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> FREDBEAR_HEAD = REGISTRY.register(FnafModModBlocks.FREDBEAR_HEAD.getId().getPath(),
			() -> new FredbearHeadDisplayItem(FnafModModBlocks.FREDBEAR_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> SPRING_BONNIE_HEAD = REGISTRY.register(FnafModModBlocks.SPRING_BONNIE_HEAD.getId().getPath(),
			() -> new SpringBonnieHeadDisplayItem(FnafModModBlocks.SPRING_BONNIE_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> SITTING_FREDBEAR_SPAWN_EGG = REGISTRY.register("sitting_fredbear_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_FREDBEAR, -7052775, -12253365, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> ENDO_BLOCK = REGISTRY.register(FnafModModBlocks.ENDO_BLOCK.getId().getPath(), () -> new EndoBlockDisplayItem(FnafModModBlocks.ENDO_BLOCK.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> LIGHT_BUTTON = block(FnafModModBlocks.LIGHT_BUTTON, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_TELEPHONE = block(FnafModModBlocks.TOY_TELEPHONE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_CATERPILLAR = block(FnafModModBlocks.TOY_CATERPILLAR, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> TOY_ROBOT = block(FnafModModBlocks.TOY_ROBOT, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> UN_WITHERED_FREDDY_HEAD = REGISTRY.register(FnafModModBlocks.UN_WITHERED_FREDDY_HEAD.getId().getPath(),
			() -> new UnWitheredFreddyHeadDisplayItem(FnafModModBlocks.UN_WITHERED_FREDDY_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> UN_WITHERED_BONNIE_HEAD = REGISTRY.register(FnafModModBlocks.UN_WITHERED_BONNIE_HEAD.getId().getPath(),
			() -> new UnWitheredBonnieHeadDisplayItem(FnafModModBlocks.UN_WITHERED_BONNIE_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> UN_WITHERED_FOXY_HEAD = REGISTRY.register(FnafModModBlocks.UN_WITHERED_FOXY_HEAD.getId().getPath(),
			() -> new UnWitheredFoxyHeadDisplayItem(FnafModModBlocks.UN_WITHERED_FOXY_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> UN_WITHERED_CHICA_HEAD = REGISTRY.register(FnafModModBlocks.UN_WITHERED_CHICA_HEAD.getId().getPath(),
			() -> new UnWitheredChicaHeadDisplayItem(FnafModModBlocks.UN_WITHERED_CHICA_HEAD.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> FREDBEAR_POSTER_1 = block(FnafModModBlocks.FREDBEAR_POSTER_1, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> FREDBEAR_POSTER_2 = block(FnafModModBlocks.FREDBEAR_POSTER_2, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> FREDBEAR_POSTER_3 = block(FnafModModBlocks.FREDBEAR_POSTER_3, FnafModModTabs.TAB_DRAWINGS_POSTERS);
	public static final RegistryObject<Item> FREDBEAR_POSTER_4 = block(FnafModModBlocks.FREDBEAR_POSTER_4, null);
	public static final RegistryObject<Item> WHITE_WALL_STAIRS = block(FnafModModBlocks.WHITE_WALL_STAIRS, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> WHITE_WALL_SLAB = block(FnafModModBlocks.WHITE_WALL_SLAB, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> BALLOON_PURPLE = block(FnafModModBlocks.BALLOON_PURPLE, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> LINED_WALL = block(FnafModModBlocks.LINED_WALL, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> FREDBEARS_FREDDY_SPAWN_EGG = REGISTRY.register("fredbears_freddy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEARS_FREDDY, -13296120, -8830717, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> FREDBEARS_BONNIE_SPAWN_EGG = REGISTRY.register("fredbears_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEARS_BONNIE, -13490595, -10724730, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> FREDBEARS_CHICA_SPAWN_EGG = REGISTRY.register("fredbears_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEARS_CHICA, -5209330, -6532331, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> FREDBEARS_FOXY_SPAWN_EGG = REGISTRY.register("fredbears_foxy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.FREDBEARS_FOXY, -12184303, -6335661, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_BB_SPAWN_EGG = REGISTRY.register("nightmare_bb_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_BB, -5701406, -2025705, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> SITTING_NIGHTMARE_BB_SPAWN_EGG = REGISTRY.register("sitting_nightmare_bb_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.SITTING_NIGHTMARE_BB, -10089213, -13820081, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> PLUSHTRAP_TOY_SPAWN_EGG = REGISTRY.register("plushtrap_toy_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.PLUSHTRAP_TOY, -5010412, -4679615, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_SPAWN_EGG = REGISTRY.register("nightmare_spawn_egg", () -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE, -15132391, -1253575, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> JACK_O_BONNIE_SPAWN_EGG = REGISTRY.register("jack_o_bonnie_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.JACK_O_BONNIE, -4760037, -7905500, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> JACK_O_CHICA_SPAWN_EGG = REGISTRY.register("jack_o_chica_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.JACK_O_CHICA, -3637975, -5739458, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> NIGHTMARE_MANGLE_SPAWN_EGG = REGISTRY.register("nightmare_mangle_spawn_egg",
			() -> new ForgeSpawnEggItem(FnafModModEntities.NIGHTMARE_MANGLE, -1131591, -646018, new Item.Properties().tab(FnafModModTabs.TAB_FNAF_MOBS)));
	public static final RegistryObject<Item> DIAGONAL_WALL_CONNECTOR_BOTTOM = block(FnafModModBlocks.DIAGONAL_WALL_CONNECTOR_BOTTOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DIAGONAL_WALL_BOTTOM = block(FnafModModBlocks.DIAGONAL_WALL_BOTTOM, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DIAGONAL_WALL_TOP = block(FnafModModBlocks.DIAGONAL_WALL_TOP, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> DIAGONAL_WALL_CONNECTOR_TOP = block(FnafModModBlocks.DIAGONAL_WALL_CONNECTOR_TOP, FnafModModTabs.TAB_FNAF_BLOCKS);
	public static final RegistryObject<Item> STAGE_LIGHT_OFF = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_OFF.getId().getPath(),
			() -> new StageLightOffDisplayItem(FnafModModBlocks.STAGE_LIGHT_OFF.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> STAGE_LIGHT_ON = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_ON.getId().getPath(), () -> new StageLightOnDisplayItem(FnafModModBlocks.STAGE_LIGHT_ON.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STAGE_LIGHT_PINK_OFF = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_PINK_OFF.getId().getPath(),
			() -> new StageLightPinkOffDisplayItem(FnafModModBlocks.STAGE_LIGHT_PINK_OFF.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> STAGE_LIGHT_PINK_ON = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_PINK_ON.getId().getPath(),
			() -> new StageLightPinkOnDisplayItem(FnafModModBlocks.STAGE_LIGHT_PINK_ON.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STAGE_LIGHT_ORANGE_OFF = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_ORANGE_OFF.getId().getPath(),
			() -> new StageLightOrangeOffDisplayItem(FnafModModBlocks.STAGE_LIGHT_ORANGE_OFF.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> STAGE_LIGHT_ORANGE_ON = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_ORANGE_ON.getId().getPath(),
			() -> new StageLightOrangeOnDisplayItem(FnafModModBlocks.STAGE_LIGHT_ORANGE_ON.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> STAGE_LIGHT_RED_OFF = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_RED_OFF.getId().getPath(),
			() -> new StageLightRedOffDisplayItem(FnafModModBlocks.STAGE_LIGHT_RED_OFF.get(), new Item.Properties().tab(FnafModModTabs.TAB_FNAF_BLOCKS)));
	public static final RegistryObject<Item> STAGE_LIGHT_RED_ON = REGISTRY.register(FnafModModBlocks.STAGE_LIGHT_RED_ON.getId().getPath(),
			() -> new StageLightRedOnDisplayItem(FnafModModBlocks.STAGE_LIGHT_RED_ON.get(), new Item.Properties().tab(null)));
	public static final RegistryObject<Item> CEILING_BLOCK = block(FnafModModBlocks.CEILING_BLOCK, FnafModModTabs.TAB_FNAF_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
