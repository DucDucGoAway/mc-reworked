package com.duc.mcreworked.gamerule;


import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class CustomGameRules {


    public static final GameRules.Key<GameRules.IntRule> OVERWORLD_GRAVITY = registerIntGameRule("overworldGravity", 80);
    public static final GameRules.Key<GameRules.IntRule> AEON_GRAVITY = registerIntGameRule("aeonGravity", 30);
    public static final GameRules.Key<GameRules.IntRule> NETHER_GRAVITY = registerIntGameRule("netherGravity", 85);


    public static void gameRuleFunctionality() {



    }


    //GameRule Creation Method
    public static GameRules.Key<GameRules.IntRule> registerIntGameRule(String name, int defaultValue) {
        return GameRuleRegistry.register(name, GameRules.Category.MISC, GameRuleFactory.createIntRule(defaultValue));
    }
    public static GameRules.Key<GameRules.BooleanRule> registerIntGameRule(String name, boolean defaultValue) {
        return GameRuleRegistry.register(name, GameRules.Category.MISC, GameRuleFactory.createBooleanRule(defaultValue));
    }

}
