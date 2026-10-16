package com.teamabode.cave_enhancements.datagen.server;

import com.teamabode.cave_enhancements.core.registry.CEBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CEBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public CEBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        appendHoeMineable();

    }

    private void appendHoeMineable() {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(CEBlocks.GOOP_BLOCK.get());
    }
}
