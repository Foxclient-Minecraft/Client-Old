package foxclient.mods.impl;

import foxclient.gui.hud.ScreenPosition;
import foxclient.mods.ModDraggable;

public class ModPing extends ModDraggable{

	@Override
	public int getWidth() {
		int ping = mc.getMinecraft().getNetHandler().getPlayerInfo(mc.getMinecraft().thePlayer.getUniqueID()).getResponseTime();
		return font.getStringWidth("Ping: " + ping + " ms");
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		int ping = mc.getMinecraft().getNetHandler().getPlayerInfo(mc.getMinecraft().thePlayer.getUniqueID()).getResponseTime();
		if(ping <= 10) {
			font.drawStringWithShadow("§bPing: " + ping + " ms", pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
			return;
		} else if (ping <= 50) {
			font.drawStringWithShadow("§aPing: " + ping + " ms", pos.getAbsoluteX() + getWidth(), pos.getAbsoluteY() + 1, -1);
			return;
		} else if (ping <= 100) {
			font.drawStringWithShadow("§2Ping: " + ping + " ms", pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
			return;
		} else if (ping <= 150) {
			font.drawStringWithShadow("§ePing: " + ping + " ms" , pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
			return;
		} else if (ping <= 180) {
			font.drawStringWithShadow("§cPing: " + ping + " ms", pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
			return;
		} else {
			font.drawStringWithShadow("§1Ping: " + ping + " ms", pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
			return;
		}
		
	}
	
	@Override
	public void renderDummy(ScreenPosition pos) {
		font.drawStringWithShadow("Ping: 0 ms", pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
	}
}
