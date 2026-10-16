package com.teamabode.cave_enhancements.core.registry;

import com.kekecreations.jinxedlib.core.util.JinxedRegistryHelper;
import com.teamabode.cave_enhancements.CaveEnhancements;
import com.teamabode.cave_enhancements.common.util.CEBlockProperties;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class CEBlocks {

    public static Supplier<Block> GOOP_BLOCK = registerBlock("goop_block", true,
            () -> new Block(CEBlockProperties.goop(false).destroyTime(0.5F).speedFactor(0.3F).jumpFactor(0.9F)));



    private static Supplier<Block> registerBlock(String name, boolean hasItem, Supplier<Block> blockSupplier) {
        return JinxedRegistryHelper.registerBlock(CaveEnhancements.MOD_ID, name, hasItem, blockSupplier);
    }



    public static void register() {}
}
