package icu.ttserver;

import icu.ttserver.item.ModItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Primogem implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("primogem");
	public static final String MOD_ID="primogem";
	@Override
	public void onInitialize() {
		ModItem.registerModItem();
		LOGGER.info("Hello Fabric world!");
	}
}