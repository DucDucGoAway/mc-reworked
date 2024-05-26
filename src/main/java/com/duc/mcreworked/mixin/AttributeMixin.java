package com.duc.mcreworked.mixin;

import net.minecraft.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(EntityAttributes.class)
public class AttributeMixin {

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/attribute/EntityAttributes;register(Ljava/lang/String;Lnet/minecraft/entity/attribute/EntityAttribute;)Lnet/minecraft/registry/entry/RegistryEntry;"),
            slice = @Slice(from = @At(value = "INVOKE_ASSIGN", args = "stringValue=generic.gravity", target = "Lnet/minecraft/entity/attribute/EntityAttributes;register(Ljava/lang/String;Lnet/minecraft/entity/attribute/EntityAttribute;)Lnet/minecraft/registry/entry/RegistryEntry;")))
    private static String changeDefaultValueForGenericGravity(String original) {
        return "0.03";
    }

    /*
    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/GameRules$BooleanRule;create(Z)Lnet/minecraft/world/GameRules$Type;"),
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=doInsomnia")))
    private static boolean changeDefaultValueForDoInsomnia(boolean original) {
        return false;
    }

     */

}
