package foxclient.mods.impl;

import java.awt.Color;

import foxclient.gui.hud.ScreenPosition;
import foxclient.mods.ModDraggable;
import net.minecraft.client.gui.Gui;

public class ModCoordenadas extends ModDraggable {
private Color background = new Color(45, 45, 45, 180);

@Override
public int getWidth() {
    return this.font.getStringWidth("X: 000");
}

@Override
public int getHeight() {
    return this.font.FONT_HEIGHT * 3 + 2;
}

@Override
public void render(ScreenPosition pos) {
    int width = this.font.getStringWidth("X: 000");
    if(this.mc.getRenderViewEntity().posX >= this.mc.getRenderViewEntity().posY && this.mc.getRenderViewEntity().posX >= this.mc.getRenderViewEntity().posZ) {
        width = this.font.getStringWidth("X: " + (int) this.mc.getRenderViewEntity().posX);

    } else if(this.mc.getRenderViewEntity().posY >= this.mc.getRenderViewEntity().posX && this.mc.getRenderViewEntity().posY >= this.mc.getRenderViewEntity().posZ) {
        width = this.font.getStringWidth("Y: " + (int) this.mc.getRenderViewEntity().posY);

    } else if(this.mc.getRenderViewEntity().posZ >= this.mc.getRenderViewEntity().posX && this.mc.getRenderViewEntity().posZ >= this.mc.getRenderViewEntity().posY) {
        width = this.font.getStringWidth("Z: " + (int) this.mc.getRenderViewEntity().posZ);
    }
    Gui.drawRect(pos.getAbsoluteX() - 1, pos.getAbsoluteY() - 1, pos.getAbsoluteX() + width + 2, pos.getAbsoluteY() + this.getHeight() + 1, background.getRGB());
    this.font.drawString("X: " + (int) this.mc.getRenderViewEntity().posX, pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, -1);
    this.font.drawString("Y: " + (int) this.mc.getRenderViewEntity().posY, pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1 + this.font.FONT_HEIGHT, -1);
    this.font.drawString("Z: " + (int) this.mc.getRenderViewEntity().posZ, pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1 + this.font.FONT_HEIGHT * 2, -1);
}
}

