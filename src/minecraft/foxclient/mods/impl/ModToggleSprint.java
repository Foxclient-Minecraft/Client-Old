package foxclient.mods.impl;

import foxclient.gui.hud.ScreenPosition;
import foxclient.mods.ModDraggable;

public class ModToggleSprint extends ModDraggable {
	
	public boolean flyBoost = false;
	public float flyBoostFactor = 1;
	public int keyHoldTicks = 7;
	public boolean shiftToggled = false;

	@Override
	public int getWidth() {
		return font.getStringWidth("[Sprinting (Toggled)]");
	}

	@Override
	public int getHeight() {
		return font.FONT_HEIGHT;
	}

	@Override
	public void render(ScreenPosition pos) {
		String textToRender = mc.thePlayer.movementInput.getDisplayText();
		font.drawString(textToRender, pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}
	
	@Override
	public void renderDummy(ScreenPosition pos) {
		String textToRenderDummy = "[Sprinting (Toggled)]";
		font.drawString(textToRenderDummy, pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
	}

}
