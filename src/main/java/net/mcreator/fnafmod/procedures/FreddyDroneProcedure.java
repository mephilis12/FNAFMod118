package net.mcreator.fnafmod.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.fnafmod.init.FnafModModItems;

import java.util.function.Supplier;
import java.util.Map;

public class FreddyDroneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "RemantEnergy") > 0 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "RemantEnergy") <= 3) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
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
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(2)).remove(1);
						_player.containerMenu.broadcastChanges();
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("Progress", 1);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(2)).remove(1);
						_player.containerMenu.broadcastChanges();
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
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).remove(1);
								_player.containerMenu.broadcastChanges();
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("Progress", 2);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).remove(1);
								_player.containerMenu.broadcastChanges();
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
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(2)).remove(1);
										_player.containerMenu.broadcastChanges();
									}
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("Progress", 3);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(2)).remove(1);
										_player.containerMenu.broadcastChanges();
									}
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(2)).remove(1);
										_player.containerMenu.broadcastChanges();
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
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												((Slot) _slots.get(2)).remove(1);
												_player.containerMenu.broadcastChanges();
											}
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("Progress", 4);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												((Slot) _slots.get(2)).remove(1);
												_player.containerMenu.broadcastChanges();
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
													if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
															&& _current.get() instanceof Map _slots) {
														((Slot) _slots.get(2)).remove(1);
														_player.containerMenu.broadcastChanges();
													}
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getTileData().putDouble("Progress", 5);
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
													if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
															&& _current.get() instanceof Map _slots) {
														((Slot) _slots.get(2)).remove(1);
														_player.containerMenu.broadcastChanges();
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
															if (entity instanceof ServerPlayer _player
																	&& _player.containerMenu instanceof Supplier _current
																	&& _current.get() instanceof Map _slots) {
																((Slot) _slots.get(2)).remove(1);
																_player.containerMenu.broadcastChanges();
															}
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getTileData().putDouble("Progress", 6);
																if (world instanceof Level _level)
																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
															}
															if (entity instanceof ServerPlayer _player
																	&& _player.containerMenu instanceof Supplier _current
																	&& _current.get() instanceof Map _slots) {
																((Slot) _slots.get(2)).remove(1);
																_player.containerMenu.broadcastChanges();
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
																	if (entity instanceof ServerPlayer _player
																			&& _player.containerMenu instanceof Supplier _current
																			&& _current.get() instanceof Map _slots) {
																		((Slot) _slots.get(2)).remove(1);
																		_player.containerMenu.broadcastChanges();
																	}
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getTileData().putDouble("Progress", 0);
																		if (world instanceof Level _level)
																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																	}
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getTileData().putDouble("RemantEnergy", ((new Object() {
																				public double getValue(LevelAccessor world, BlockPos pos,
																						String tag) {
																					BlockEntity blockEntity = world.getBlockEntity(pos);
																					if (blockEntity != null)
																						return blockEntity.getTileData().getDouble(tag);
																					return -1;
																				}
																			}.getValue(world, new BlockPos(x, y, z), "RemantEnergy")) - 1));
																		if (world instanceof Level _level)
																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																	}
																	{
																		BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																		if (_ent != null) {
																			final int _slotid = 2;
																			final ItemStack _setstack = new ItemStack(
																					FnafModModItems.FREDDY_SPAWN_ITEM.get());
																			_setstack.setCount(1);
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable)
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_slotid, _setstack);
																					});
																		}
																	}
																	if (entity instanceof ServerPlayer _player
																			&& _player.containerMenu instanceof Supplier _current
																			&& _current.get() instanceof Map _slots) {
																		((Slot) _slots.get(1)).remove(1);
																		_player.containerMenu.broadcastChanges();
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, 40);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 40);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 40);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 40);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 40);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 40);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 40);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "DarkEnergy") > 0 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "DarkEnergy") <= 3) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
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
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("Progress", 1);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						((Slot) _slots.get(2)).remove(1);
						_player.containerMenu.broadcastChanges();
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
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).remove(1);
								_player.containerMenu.broadcastChanges();
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("Progress", 2);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								((Slot) _slots.get(2)).remove(1);
								_player.containerMenu.broadcastChanges();
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
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(2)).remove(1);
										_player.containerMenu.broadcastChanges();
									}
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x, y, z);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("Progress", 3);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
									if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
											&& _current.get() instanceof Map _slots) {
										((Slot) _slots.get(2)).remove(1);
										_player.containerMenu.broadcastChanges();
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
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												((Slot) _slots.get(2)).remove(1);
												_player.containerMenu.broadcastChanges();
											}
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x, y, z);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("Progress", 4);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
											if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
													&& _current.get() instanceof Map _slots) {
												((Slot) _slots.get(2)).remove(1);
												_player.containerMenu.broadcastChanges();
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
													if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
															&& _current.get() instanceof Map _slots) {
														((Slot) _slots.get(2)).remove(1);
														_player.containerMenu.broadcastChanges();
													}
													if (!world.isClientSide()) {
														BlockPos _bp = new BlockPos(x, y, z);
														BlockEntity _blockEntity = world.getBlockEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_blockEntity != null)
															_blockEntity.getTileData().putDouble("Progress", 5);
														if (world instanceof Level _level)
															_level.sendBlockUpdated(_bp, _bs, _bs, 3);
													}
													if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
															&& _current.get() instanceof Map _slots) {
														((Slot) _slots.get(2)).remove(1);
														_player.containerMenu.broadcastChanges();
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
															if (entity instanceof ServerPlayer _player
																	&& _player.containerMenu instanceof Supplier _current
																	&& _current.get() instanceof Map _slots) {
																((Slot) _slots.get(2)).remove(1);
																_player.containerMenu.broadcastChanges();
															}
															if (!world.isClientSide()) {
																BlockPos _bp = new BlockPos(x, y, z);
																BlockEntity _blockEntity = world.getBlockEntity(_bp);
																BlockState _bs = world.getBlockState(_bp);
																if (_blockEntity != null)
																	_blockEntity.getTileData().putDouble("Progress", 6);
																if (world instanceof Level _level)
																	_level.sendBlockUpdated(_bp, _bs, _bs, 3);
															}
															if (entity instanceof ServerPlayer _player
																	&& _player.containerMenu instanceof Supplier _current
																	&& _current.get() instanceof Map _slots) {
																((Slot) _slots.get(2)).remove(1);
																_player.containerMenu.broadcastChanges();
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
																	if (entity instanceof ServerPlayer _player
																			&& _player.containerMenu instanceof Supplier _current
																			&& _current.get() instanceof Map _slots) {
																		((Slot) _slots.get(2)).remove(1);
																		_player.containerMenu.broadcastChanges();
																	}
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getTileData().putDouble("Progress", 0);
																		if (world instanceof Level _level)
																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																	}
																	if (!world.isClientSide()) {
																		BlockPos _bp = new BlockPos(x, y, z);
																		BlockEntity _blockEntity = world.getBlockEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_blockEntity != null)
																			_blockEntity.getTileData().putDouble("DarkEnergy", ((new Object() {
																				public double getValue(LevelAccessor world, BlockPos pos,
																						String tag) {
																					BlockEntity blockEntity = world.getBlockEntity(pos);
																					if (blockEntity != null)
																						return blockEntity.getTileData().getDouble(tag);
																					return -1;
																				}
																			}.getValue(world, new BlockPos(x, y, z), "DarkEnergy")) - 1));
																		if (world instanceof Level _level)
																			_level.sendBlockUpdated(_bp, _bs, _bs, 3);
																	}
																	{
																		BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
																		if (_ent != null) {
																			final int _slotid = 2;
																			final ItemStack _setstack = new ItemStack(
																					FnafModModItems.EVIL_FREDDY_ITEM_SPAWN.get());
																			_setstack.setCount(1);
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable)
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_slotid, _setstack);
																					});
																		}
																	}
																	if (entity instanceof ServerPlayer _player
																			&& _player.containerMenu instanceof Supplier _current
																			&& _current.get() instanceof Map _slots) {
																		((Slot) _slots.get(1)).remove(1);
																		_player.containerMenu.broadcastChanges();
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, 40);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 40);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 40);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 40);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 40);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 40);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 40);
		}
	}
}
