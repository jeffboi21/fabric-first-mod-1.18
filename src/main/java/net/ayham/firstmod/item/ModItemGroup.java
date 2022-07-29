package net.ayham.firstmod.item;

import net.ayham.firstmod.FirstMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ESSENCE = FabricItemGroupBuilder.build(new Identifier(FirstMod.MOD_ID, "essence"),
            ()-> new ItemStack(ModItems.AQUA_ESSENCE));
}
