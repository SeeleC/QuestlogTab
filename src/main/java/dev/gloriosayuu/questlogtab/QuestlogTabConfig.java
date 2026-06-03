package dev.gloriosayuu.questlogtab;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class QuestlogTabConfig {
    public static ForgeConfigSpec CONFIG;

    public static ForgeConfigSpec.BooleanValue useOriginalIcon;

    public static ForgeConfigSpec init() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        useOriginalIcon = builder.define("useOriginalIcon", false);

        CONFIG = builder.build();
        return CONFIG;
    }
}
