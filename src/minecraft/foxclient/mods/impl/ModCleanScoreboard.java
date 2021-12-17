package foxclient.mods.impl;

import foxclient.gui.hud.ScreenPosition;
import foxclient.mods.ModDraggable;

public class ModCleanScoreboard extends ModDraggable{
	
	public boolean transparent = true;
	public boolean noNumbers = true;

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}

	@Override
	public void render(ScreenPosition p0) {}

}
