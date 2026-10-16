package com.teamabode.cave_enhancements.datagen.server;

import com.teamabode.cave_enhancements.core.registry.CEBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class CEBlockLootTableProvider extends FabricBlockLootTableProvider {
    public CEBlockLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        goop();

    }

    private void goop() {
        dropSelf(CEBlocks.GOOP_BLOCK.get());

    }
}
