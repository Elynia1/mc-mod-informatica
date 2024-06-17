package net.xtrajohn.mmi.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xtrajohn.mmi.MinecraftModInformatica;

public class ModItemGroups {
    public static final ItemGroup MMI_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftModInformatica.MOD_ID, "blaze_powder"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mmi"))
                    .icon(() -> new ItemStack(Items.BLAZE_POWDER)).entries((displayContext, entries) -> {
                        entries.add(Items.BLAZE_ROD);
                        entries.add(ModItems.BASK_ROD);
                        entries.add(Items.BLAZE_POWDER);
                        entries.add(ModItems.BASK_POWDER);
                        entries.add(Items.FIRE_CHARGE);
                        entries.add(ModItems.BASK_BALL);

                    }).build());

    public static void registerItemGroups() {
        MinecraftModInformatica.LOGGER.info("Registring Item Groups for" + MinecraftModInformatica.MOD_ID);
    }
}
