package com.teamabode.cave_enhancements.common.util;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class CEBlockProperties {


    public static BlockBehaviour.Properties goop(boolean isDecoration) {
        BlockBehaviour.Properties properties = BlockBehaviour.Properties.copy(Blocks.CLAY).mapColor(MapColor.SAND)
                //.sound(!isDecoration ? ModSoundType.GOOP_BLOCK : ModSoundType.GOOP_DECORATION)
        ;
        if (isDecoration) properties.noCollission().noCollission().instabreak();
        return properties;
    }
}
