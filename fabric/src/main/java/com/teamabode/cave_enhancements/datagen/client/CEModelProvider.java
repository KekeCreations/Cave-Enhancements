package com.teamabode.cave_enhancements.datagen.client;

import com.teamabode.cave_enhancements.core.registry.CEBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class CEModelProvider extends FabricModelProvider {
    public CEModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators gen) {
        gen.createTrivialCube(CEBlocks.GOOP_BLOCK.get());

    }

    @Override
    public void generateItemModels(ItemModelGenerators gen) {

    }
}
