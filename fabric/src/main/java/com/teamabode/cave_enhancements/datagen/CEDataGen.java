package com.teamabode.cave_enhancements.datagen;

import com.teamabode.cave_enhancements.datagen.client.CELangProvider;
import com.teamabode.cave_enhancements.datagen.client.CEModelProvider;
import com.teamabode.cave_enhancements.datagen.server.CEBlockLootTableProvider;
import com.teamabode.cave_enhancements.datagen.server.CEBlockTagProvider;
import com.teamabode.cave_enhancements.datagen.server.CEItemTagProvider;
import com.teamabode.cave_enhancements.datagen.server.CERecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CEDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Server Data
        pack.addProvider(CEItemTagProvider::new);
        pack.addProvider(CEBlockTagProvider::new);
        pack.addProvider(CEBlockLootTableProvider::new);
        pack.addProvider(CERecipeProvider::new);

        // Client Data
        pack.addProvider(CELangProvider::new);
        pack.addProvider(CEModelProvider::new);
    }
}
