package com.teamabode.cave_enhancements;

import com.teamabode.cave_enhancements.core.registry.CEBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CaveEnhancements {

    public static final String MOD_ID = "cave_enhancements";
    public static final String MOD_NAME = "Cave Enhancements";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        CEBlocks.register();
    }
}