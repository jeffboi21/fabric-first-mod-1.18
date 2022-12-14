package net.ayham.firstmod.item;

import net.ayham.firstmod.FirstMod;
import net.ayham.firstmod.item.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item AQUA_ESSENCE = registerItem("aqua_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.ESSENCE)));

    public static final Item AQUA_BAR = registerItem("aqua_bar",
            new Item(new FabricItemSettings().group(ModItemGroup.ESSENCE)));

    public static final Item AQUA_NUGGET = registerItem("aqua_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.ESSENCE)));

    public static final Item RAW_ASPHALT = registerItem("raw_asphalt",
            new Item(new FabricItemSettings().group(ModItemGroup.ESSENCE)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.ESSENCE).maxDamage(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }
    public static void registerModItems()   {
        FirstMod.LOGGER.info("Registering mod items for " + FirstMod.MOD_ID);

    }
}
