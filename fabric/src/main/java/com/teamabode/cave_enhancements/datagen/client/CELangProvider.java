package com.teamabode.cave_enhancements.datagen.client;

import com.teamabode.cave_enhancements.core.registry.CEBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class CELangProvider extends FabricLanguageProvider {


    public CELangProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(CEBlocks.GOOP_BLOCK.get(), "Goop Block");

    }
}
