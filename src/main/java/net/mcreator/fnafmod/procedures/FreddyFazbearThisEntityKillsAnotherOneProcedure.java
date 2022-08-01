package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.network.FnafModModVariables;

public class FreddyFazbearThisEntityKillsAnotherOneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:fnaf1_scream")),
						SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:fnaf1_scream")),
						SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				{
					boolean _setval = true;
					entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FreddyFrame1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							boolean _setval = false;
							entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.FreddyFrame1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 0.1);
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							boolean _setval = true;
							entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.FreddyFrame2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									boolean _setval = false;
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FreddyFrame2 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 0.1);
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									boolean _setval = true;
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FreddyFrame3 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 1);
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									boolean _setval = false;
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FreddyFrame3 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 0.1);
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private LevelAccessor world;

							public void start(LevelAccessor world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									boolean _setval = true;
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FreddyFrame4 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										{
											boolean _setval = false;
											entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.FreddyFrame4 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 0.1);
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private LevelAccessor world;

									public void start(LevelAccessor world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										{
											boolean _setval = true;
											entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.FreddyFrame5 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												{
													boolean _setval = false;
													entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.FreddyFrame5 = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 0.1);
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private LevelAccessor world;

											public void start(LevelAccessor world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												{
													boolean _setval = true;
													entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.FreddyFrame1 = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														{
															boolean _setval = false;
															entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.ifPresent(capability -> {
																		capability.FreddyFrame1 = _setval;
																		capability.syncPlayerVariables(entity);
																	});
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 0.1);
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private LevelAccessor world;

													public void start(LevelAccessor world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														{
															boolean _setval = true;
															entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.ifPresent(capability -> {
																		capability.FreddyFrame2 = _setval;
																		capability.syncPlayerVariables(entity);
																	});
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																{
																	boolean _setval = false;
																	entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.FreddyFrame2 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 0.1);
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																{
																	boolean _setval = true;
																	entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.FreddyFrame3 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 1);
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																{
																	boolean _setval = false;
																	entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.FreddyFrame3 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 0.1);
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private LevelAccessor world;

															public void start(LevelAccessor world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																{
																	boolean _setval = true;
																	entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.FreddyFrame4 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private LevelAccessor world;

																	public void start(LevelAccessor world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		{
																			boolean _setval = false;
																			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY,
																					null).ifPresent(capability -> {
																						capability.FreddyFrame4 = _setval;
																						capability.syncPlayerVariables(entity);
																					});
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 0.1);
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private LevelAccessor world;

																	public void start(LevelAccessor world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		{
																			boolean _setval = true;
																			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY,
																					null).ifPresent(capability -> {
																						capability.FreddyFrame5 = _setval;
																						capability.syncPlayerVariables(entity);
																					});
																		}
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private LevelAccessor world;

																			public void start(LevelAccessor world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				{
																					boolean _setval = false;
																					entity.getCapability(
																							FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.ifPresent(capability -> {
																								capability.FreddyFrame5 = _setval;
																								capability.syncPlayerVariables(entity);
																							});
																				}
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 0.1);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, 1);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, 1);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, 1);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, 1);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 1);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 1);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 1);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 1);
	}
}
