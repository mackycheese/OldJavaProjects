package co.megadodo.mackycheese.game.terrain.blocks;

public enum Block {
	ANDESITE(0,0),
	STONE(0,1),
	DIRT(0,2),
	GRASS(0,3),
	OAK_PLANKS(0,4),
	DOUBLE_STONE_SLAB(0,5),
	STONE_SLAP_TOP(0,6),
	BRICKS(0,7),
	TNT_SIDE(0,8),
	TNT_TOP(0,9),
	TNT_BOTTOM(0,10),
	COBWEB(0,11),
	ROSE(0,12),
	YELLOW_FLOWER(0,13),
	BLUE(0,14),
	OAK_SAPLING(0,15),
	
	COBBLE_STONE(1,0),
	BEDROCK(1,1),
	SAND(1,2),
	GRAVEL(1,3),
	OAK_WOOD_SIDE(1,4),
	OAK_WOOD_TOP(1,5),
	IRON_BLOCK(1,6),
	GOLD_BLOCK(1,7),
	DIAMOND_BLOCK(1,8),
	EMERALD_BLOCK(1,9),
	EMPTY1(1,10),
	EMPTY2(1,11),
	MUSHROOM_RED(1,12),
	MUSHROOM_BROWN(1,13),
	JUNGLE_SAPLING(1,14),
	EMPTY3(1,15),
	
	GOLD_ORE(2,0),
	IRON_ORE(2,1),
	COAL_ORE(2,2),
	BOOKSHELF(2,3),
	MOSSY_COBBLE(2,4),
	OBSIDIAN(2,5),
	GREY_MOSS(2,6),
	GREY_GRASS(2,7),
	GREY_GRASS_TOP(2,8),
	BEACON_TOP(2,9),
	EMPTY4(2,10),
	CRAFTING_TABLE_TOP(2,11),
	FURNACE_FRONT(2,12),
	FURNACE_BACK(2,13),
	DISPENSOR_FRONT(2,14),
	EMPTY5(2,15),
	
	SPONGE_DRY(3,0),
	GLASS(3,1),
	DIAMOND_ORE(3,2),
	REDSTONE_ORE(3,3),
	LEAF1_GREY(3,4),
	LEAF2_GREY(3,5),
	STONE_BRICK(3,6),
	DEAD_BUSH(3,7),
	GREY_FERN(3,8),
	EMPTY6(3,9),
	EMPTY7(3,10),
	CRAFTING_TABLE_SIDE1(3,11),
	CRAFTING_TABLE_SIDE2(3,12),
	FURNACE_FRONT_ON(3,13),
	FURNACE_TOP(3,14),
	SPRUCE_SAPLING(3,15),
	
	WOOL_WHITE(4,0),
	MONSTER_SPAWNER(4,1),
	SNOW(4,2),
	ICE(4,3),
	SNOWY_GRASS(4,4),
	CACTUS_TOP(4,5),
	CACTUS_SIDE(4,6),
	CACTUS_BOTTOM(4,7),
	CLAY(4,8),
	REEDS(4,9),
	JUKEBOX_SIDE(4,10),
	JUKEBOX_TOP(4,11),
	LILY_PAD_GREY(4,12),
	DIRT_MYCELIUM(4,13),
	MYCELIUM_TOP(4,14),
	BIRCH_SAPLING(4,15),
	
	TORCH(5,0),
	WOOD_DOOR_TOP(5,1),
	IRON_DOOR_TOP(5,2),
	LADDER(5,3),
	TRAPDOOR(5,4),
	IRON_BARS(5,5),
	FERTILIZED_DIRT(5,6),
	HOED_DIRT(5,7),
	WHEAT_STAGE_1(5,8),
	WHEAT_STAGE_2(5,9),
	WHEAT_STAGE_3(5,10),
	WHEAT_STAGE_4(5,11),
	WHEAT_STAGE_5(5,12),
	WHEAT_STAGE_6(5,13),
	WHEAT_STAGE_7(5,14),
	WHEAT_STAGE_8(5,15),
	
	LEVER(6,0),
	WOOD_DOOR_BOTTOM(6,1),
	IRON_DOOR_BOTTOM(6,2),
	REDSTONE_TORCH_ON(6,3),
	MOSSY_STONE_BRICK(6,4),
	CRACKED_STONE_BRICK(6,5),
	PUMPKIN_TOP(6,6),
	NETHER_RACK(6,7),
	SOUL_SAND(6,8),
	GLOWSTONE(6,9),
	STICKY_PISTON_HEAD(6,10),
	PISTON_HEAD(6,11),
	PISTON_SIDE(6,12),
	PISTON_BOTTOM(6,13),
	DROPPER_FRONT(6,14),
	STEM_UP_GREY(6,15),
	
	RAIL_CURVED(7,0),
	WOOL_BLACK(7,1),
	WOOL_DARK_GREY(7,2),
	REDSTONE_TORCH_OFF(7,3),
	SPRUCE_WOOD_SIDE(7,4),
	BIRCH_WOOD_SIDE(7,5),
	PUMPKIN_SIDE(7,6),
	PUMPKIN_OFF(7,7),
	PUMPKIN_ON(7,8),
	CAKE_TOP(7,9),
	CAKE_SIDE1(7,10),
	CAKE_SIDE2(7,11),
	CAKE_BOTTOM(7,12),
	MUSHROOM_RED_BLOCK(7,13),
	MUSHROOM_BROWN_BLOCK(7,14),
	STEM_LEFT(7,15),
	
	RAIL_STRAIGHT(8,0),
	WOOL_RED(8,1),
	WOOL_PINK(8,2),
	REDSTONE_GADGET_OFF(8,3),
	LEAF3_GREY(8,4),
	LEAF4_GREY(8,5),
	BED_TOP_LEFT(8,6),
	BED_TOP_RIGHT(8,7),
	MELON_SIDE(8,8),
	MELON_TOP(8,9),
	CAULDRON_TOP(8,10),
	CAULDRON_INSIDE(8,11),
	CAKE_ITEM(8,12),
	MUSHROOM_STEM_BLOCK(8,13),
	MUSHROOM_BLOCK_INSIDE(8,14),
	VINE_GREY(8,15),
	
	LAPIS_BLOCK(9,0),
	WOOL_DARK_GREEN(9,1),
	WOOL_LIME(9,2),
	REDSTONE_GADGET_ON(9,3),
	GLASS_PANE_SIDE(9,4),
	BED_FRONT(9,5),
	BED_SIDE_1(9,6),
	BED_SIDE_2(9,7),
	BED_BACK(9,8),
	JUNGLE_WOOD_SIDE(9,9),
	CAULDRON_SIDE(9,10),
	CAULDRON_BOTTOM(9,11),
	REDSTONE_GADGET_BOTTOM(9,12),
	BREWING_STAND(9,13),
	END_PORTAL_TOP(9,14),
	END_PORTAL_SIDE(9,15),
	
	LAPIS_ORE(10,0),
	WOOL_BROWN(10,1),
	WOOL_YELLOW(10,2),
	POWERED_RAIL_OFF(10,3),
	COBWEB_2(10,4),
	TRIP_WIRE(10,5),
	ENCHANTING_TABLE_TOP(10,6),
	ENCHANTING_TABLE_BOTTOM(10,7),
	COCO_BEANS_STAGE_3(10,8),
	COCO_BEANS_STAGE_2(10,9),
	COCO_BEANS_STAGE_1(10,10),
	EMERALD_ORE(10,11),
	TRIPWIRE_HOOK(10,12),
	EMPTY8(10,13),
	EYE_OF_ENDER_PORTAL(10,14),
	END_STONE(10,15),
	
	SMOOTH_SANDSTONE(11,0),
	WOOL_DARK_BLUE(11,1),
	WOOL_BLUE(11,2),
	POWERED_RAIL_ON(11,3),
	EMPTY9(11,4),
	EMPTY10(11,5),
	ENCHANTING_TABLE_SIDE(11,6),
	OBSIDIAN2(11,7),
	COMMAND_BLOCK(11,8),
	EMPTY11(11,9),
	EMPTY12(11,10),
	EMPTY13(11,11),
	EMPTY14(11,12),
	EMPTY15(11,13),
	EMPTY16(11,14),
	EMPTY17(11,15),
	
	SANDSTONE_SIDE(12,0),
	WOOL_PURPLE(12,1),
	WOOL_LIGHT_PURPLE(12,2),
	DETECTOR_RAIL(12,3),
	JUNGLE_LEAF_1(12,4),
	JUNGLE_LEAF_2(12,5),
	SPRUCE_PLANKS(12,6),
	JUNGLE_PLANKS(12,7),
	ROOTS_STAGE_1(12,8),
	ROOTS_STAGE_2(12,9),
	ROOTS_STAGE_3(12,10),
	CARROTS_GROWN(12,11),
	POTATOS_GROWN(12,12),
	WATER_1(12,13),
	WATER_2(12,14),
	WATER_3(12,15),
	
	CRACKED_SANDSTONE(13,0),
	WOOL_CYAN(13,1),
	WOOL_ORANGE(13,2),
	LAMP_OFF(13,3),
	LAMP_ON(13,4),
	CARVED_STONE_BRICK(13,5),
	BIRCH_PLANKS(13,6),
	ANVIL_BOTTOM(13,7),
	ANVIL_TOP_2(13,8),
	EMPTY18(13,9),
	EMPTY19(13,10),
	EMPTY20(13,11),
	EMPTY21(13,12),
	EMPTY22(13,13),
	WATER_4(13,14),
	WATER_5(13,15),
	
	NETHER_BRICK(14,0),
	WOOL_GREY(14,1),
	NETHER_WART_STAGE_1(14,2),
	NETHER_WART_STAGE_2(14,3),
	NETHER_WART_STAGE_3(14,4),
	SANDSTONE_CARVED(14,5),
	SANDSTONE_SMOOTH_SIDE(14,6),
	ANVIL_TOP_3(14,7),
	ANVIL_TOP_1(14,8),
	EMPTY23(14,9),
	EMPTY24(14,10),
	EMPTY25(14,11),
	EMPTY26(14,12),
	LAVA_1(14,13),
	LAVA_2(14,14),
	LAVA_3(14,15),
	
	BREAK_STAGE_1(15,0),
	BREAK_STAGE_2(15,1),
	BREAK_STAGE_3(15,2),
	BREAK_STAGE_4(15,3),
	BREAK_STAGE_5(15,4),
	BREAK_STAGE_6(15,5),
	BREAK_STAGE_7(15,6),
	BREAK_STAGE_8(15,7),
	BREAK_STAGE_9(15,8),
	BREAK_STAGE_10(15,9),
	EMPTY27(15,10),
	EMPTY28(15,11),
	EMPTY29(15,12),
	EMPTY30(15,13),
	LAVA_4(15,14),
	LAVA_5(15,15)
	
	;
	public int x,y;
	Block(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static Block randomWater() {
		Block[] list = new Block[] { WATER_1, WATER_2, WATER_3, WATER_4, WATER_5 };
		return list[(int)(Math.random() * 5)];
	}
}
