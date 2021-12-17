package foxclient.mods.impl;

import org.lwjgl.input.Mouse;
import foxclient.gui.hud.ScreenPosition;
import java.util.ArrayList;
import java.util.List;
import foxclient.mods.ModDraggable;

public class ModCPS extends ModDraggable
{
	
    private List<Long> clicks;
    private boolean wasPressed;
    private long lastPressed;
    private List<Long> clicks2;
    private boolean wasPressed2;
    private long lastPressed2;
    
    public ModCPS() {
        this.clicks = new ArrayList<Long>();
        this.clicks2 = new ArrayList<Long>();
    }
    
    @Override
    public int getWidth() {
        return this.font.getStringWidth("CPS: 2:2");
    }
    
    @Override
    public int getHeight() {
        return this.font.FONT_HEIGHT;
    }
    
    @Override
    public void render(final ScreenPosition paramScreenPosition) {
        final boolean lpressed = Mouse.isButtonDown(0);
        final boolean rpressed = Mouse.isButtonDown(1);
        if (lpressed != this.wasPressed) {
            this.lastPressed = System.currentTimeMillis() + 10L;
            if (this.wasPressed = lpressed) {
                this.clicks.add(this.lastPressed);
            }
        }
        if (rpressed != this.wasPressed2) {
            this.lastPressed2 = System.currentTimeMillis() + 10L;
            if (this.wasPressed2 = rpressed) {
                this.clicks2.add(this.lastPressed2);
            }
        }
        this.font.drawStringWithShadow("CPS§f " + this.getCPS() + ":" + this.getCPS2(), (float)(this.pos.getAbsoluteX() + 1), (float)(this.pos.getAbsoluteY() + 1), 5855577);
    }
    
    @Override
    public void renderDummy(final ScreenPosition pos) {
        this.font.drawStringWithShadow("CPS§f 1:1", (float)(pos.getAbsoluteX() + 1), (float)(pos.getAbsoluteY() + 1), 5855577);
    }
    
    private int getCPS() {
        final long time = System.currentTimeMillis();
        this.clicks.removeIf(aLong -> aLong + 1000L < time);
        return this.clicks.size();
    }
    
    private int getCPS2() {
        final long time2 = System.currentTimeMillis();
        this.clicks2.removeIf(aLong2 -> aLong2 + 1000L < time2);
        return this.clicks2.size();
    }
}
