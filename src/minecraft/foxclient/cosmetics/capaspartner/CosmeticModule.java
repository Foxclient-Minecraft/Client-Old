package foxclient.cosmetics.capaspartner;

import java.io.File;
import foxclient.gui.hud.ScreenPosition;
import foxclient.gui.hud.IRenderer;

public abstract class CosmeticModule extends Cosmetic implements IRenderer
{
    protected ScreenPosition pos;
    
    public CosmeticModule() {
        
    }
    
    @Override
    public ScreenPosition load() {
        return this.pos;
    }
    
    @Override
    public void save(final ScreenPosition pos) {
        this.pos = pos;
    }
    
    
    public final int getLineOffset(final ScreenPosition pos, final int lineNum) {
        return pos.getAbsoluteY() + this.getLineOffset(lineNum);
    }
    
    private int getLineOffset(final int lineNum) {
        return (this.font.FONT_HEIGHT + 3) * lineNum;
    }
}
