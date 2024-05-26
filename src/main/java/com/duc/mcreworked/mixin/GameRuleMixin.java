package com.duc.mcreworked.mixin;


import net.minecraft.world.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;




@Mixin(GameRules.class)
public class GameRuleMixin {


    //.7410 on discord
    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/GameRules$BooleanRule;create(Z)Lnet/minecraft/world/GameRules$Type;"),
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=doInsomnia")))
    private static boolean changeDefaultValueForDoInsomnia(boolean original) {
        return false;
    }

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/GameRules$BooleanRule;create(Z)Lnet/minecraft/world/GameRules$Type;"),
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=disableElytraMovementCheck")))
    private static boolean changeDefaultValueForDisableElytraMovementCheck(boolean original) {
        return true;
    }

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/GameRules$BooleanRule;create(Z)Lnet/minecraft/world/GameRules$Type;"),
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=mobExplosionDropDecay")))
    private static boolean changeDefaultValueForMobExplosionDropDecay(boolean original) {
        return false;
    }

}