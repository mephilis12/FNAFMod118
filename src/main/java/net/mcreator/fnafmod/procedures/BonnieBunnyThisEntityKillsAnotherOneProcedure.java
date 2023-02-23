package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.network.FnafModModVariables;
import net.mcreator.fnafmod.FnafModMod;

public class BonnieBunnyThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:fnaf1_scream")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:fnaf1_scream")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		FnafModMod.queueServerWork(1, () -> {
			{
				boolean _setval = true;
				entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.BonnieFrame1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			FnafModMod.queueServerWork((int) 0.1, () -> {
				{
					boolean _setval = false;
					entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.BonnieFrame1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
			FnafModMod.queueServerWork(1, () -> {
				{
					boolean _setval = true;
					entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.BonnieFrame2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				FnafModMod.queueServerWork((int) 0.1, () -> {
					{
						boolean _setval = false;
						entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.BonnieFrame2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				});
				FnafModMod.queueServerWork(1, () -> {
					{
						boolean _setval = true;
						entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.BonnieFrame3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					FnafModMod.queueServerWork((int) 0.1, () -> {
						{
							boolean _setval = false;
							entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.BonnieFrame3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					});
					FnafModMod.queueServerWork(1, () -> {
						{
							boolean _setval = true;
							entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.BonnieFrame4 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						FnafModMod.queueServerWork((int) 0.1, () -> {
							{
								boolean _setval = false;
								entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.BonnieFrame4 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						});
						FnafModMod.queueServerWork(1, () -> {
							{
								boolean _setval = true;
								entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.BonnieFrame5 = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							FnafModMod.queueServerWork((int) 0.1, () -> {
								{
									boolean _setval = false;
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.BonnieFrame5 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							});
							FnafModMod.queueServerWork(1, () -> {
								{
									boolean _setval = true;
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.BonnieFrame1 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								FnafModMod.queueServerWork((int) 0.1, () -> {
									{
										boolean _setval = false;
										entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.BonnieFrame1 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								});
								FnafModMod.queueServerWork(1, () -> {
									{
										boolean _setval = true;
										entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.BonnieFrame2 = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									FnafModMod.queueServerWork((int) 0.1, () -> {
										{
											boolean _setval = false;
											entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.BonnieFrame2 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
									});
									FnafModMod.queueServerWork(1, () -> {
										{
											boolean _setval = true;
											entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.BonnieFrame3 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										FnafModMod.queueServerWork((int) 0.1, () -> {
											{
												boolean _setval = false;
												entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.BonnieFrame3 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										});
										FnafModMod.queueServerWork(1, () -> {
											{
												boolean _setval = true;
												entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.BonnieFrame4 = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
											FnafModMod.queueServerWork((int) 0.1, () -> {
												{
													boolean _setval = false;
													entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.BonnieFrame4 = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
											});
											FnafModMod.queueServerWork(1, () -> {
												{
													boolean _setval = true;
													entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
														capability.BonnieFrame5 = _setval;
														capability.syncPlayerVariables(entity);
													});
												}
												FnafModMod.queueServerWork((int) 0.1, () -> {
													{
														boolean _setval = false;
														entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
															capability.BonnieFrame5 = _setval;
															capability.syncPlayerVariables(entity);
														});
													}
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
	}
}
