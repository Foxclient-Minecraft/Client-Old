package foxclient.mods.impl;

import net.minecraft.client.Minecraft;
import foxclient.gui.hud.ScreenPosition;
import foxclient.mods.ModDraggable;

public class ModFPS extends ModDraggable
{
    @Override
    public int getWidth() {
        return 50;
    }
    
    @Override
    public int getHeight() {
        return this.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(ScreenPosition pos) {
        this.font.drawString("FPS: " + Minecraft.getDebugFPS(), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
    }
}
