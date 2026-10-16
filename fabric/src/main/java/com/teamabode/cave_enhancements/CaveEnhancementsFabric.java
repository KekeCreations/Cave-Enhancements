package com.teamabode.cave_enhancements;

import net.fabricmc.api.ModInitializer;

public class CaveEnhancementsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CaveEnhancements.init();
    }
}
