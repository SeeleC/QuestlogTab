package dev.gloriosayuu.questlogtab.tab;

import dev.gloriosayuu.questlogtab.QuestlogTab;
import dev.xkmc.l2tabs.tabs.core.BaseTab;
import dev.xkmc.l2tabs.tabs.core.TabManager;
import dev.xkmc.l2tabs.tabs.core.TabToken;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.infernalstudios.questlog.client.gui.screen.QuestlogScreen;

public class TabQuestlog extends BaseTab<TabQuestlog> {
    public TabQuestlog(TabToken<TabQuestlog> token, TabManager manager, ItemStack stack, Component title) {
        super(token, manager, stack, title);
    }

    public void onTabClicked() {
        Minecraft.getInstance().setScreen(new QuestlogScreen(Minecraft.getInstance().screen));
    }

    @Override
	public void renderBackground(GuiGraphics g) {
		if (this.visible) {
			token.type.draw(g, TEXTURE, getX(), getY(), manager.selected == token, token.getIndex());
			g.blit(new ResourceLocation(QuestlogTab.MODID, "textures/gui/icon.png"),
					getX() + 5, getY() + 9, 0, 0, 16, 16);
		}
	}
}
