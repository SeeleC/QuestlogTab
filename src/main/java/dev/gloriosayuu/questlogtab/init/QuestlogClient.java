package dev.gloriosayuu.questlogtab.init;

import dev.gloriosayuu.questlogtab.QuestlogTab;
import dev.gloriosayuu.questlogtab.tab.TabQuestlog;
import dev.xkmc.l2tabs.tabs.core.TabRegistry;
import dev.xkmc.l2tabs.tabs.core.TabToken;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = QuestlogTab.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class QuestlogClient {

    public static TabToken<TabQuestlog> TAB_QUESTLOG;

    @SubscribeEvent
	public static void client(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			TAB_QUESTLOG = TabRegistry.registerTab(6000, TabQuestlog::new,
					() -> Items.AIR, Component.translatable("questlogtab.tab.title"));
		});
	}

}
