package net.xtrajohn.mmi;

import net.fabricmc.api.ModInitializer;

import net.xtrajohn.mmi.item.ModItemGroups;
import net.xtrajohn.mmi.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MinecraftModInformatica implements ModInitializer {
	public static final String MOD_ID = "mmi";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}