package net.ayham.firstmod.block;

import net.ayham.firstmod.FirstMod;
import net.ayham.firstmod.block.custom.SpeedyBlock;
import net.ayham.firstmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PHYSICAL_ESSENCE = registerBlock("physical_essence",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.ESSENCE);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(4.5f).requiresTool()), ModItemGroup.ESSENCE);

    public static final Block ASPHALT_ORE = registerBlock("asphalt_ore",
            new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(5.5f).requiresTool()), ModItemGroup.ESSENCE);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return  Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        FirstMod.LOGGER.info("Registering ModBlocks for" + FirstMod.MOD_ID);
    }
}
