package net.xtrajohn.mmi.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.xtrajohn.mmi.MinecraftModInformatica;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BASK_ROD = registerItem("bask_rod", new Item(new FabricItem.Settings()));
    public static final Item BASK_POWDER = registerItem("bask_powder", new Item(new FabricItem.Settings()));
    public static final Item BASK_BALL = registerItem("bask_ball", new Item(new FabricItem.Settings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BASK_ROD);
        entries.add(BASK_POWDER);
        entries.add(BASK_BALL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MinecraftModInformatica.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinecraftModInformatica.LOGGER.info("Registring Mod Items for" + MinecraftModInformatica.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
