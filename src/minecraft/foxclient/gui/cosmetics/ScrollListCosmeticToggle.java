package foxclient.gui.cosmetics;

import java.util.Iterator;
import java.util.Collections;
import foxclient.gui.hud.IRenderer;
import foxclient.cosmetics.capaspartner.Cosmetic;
import foxclient.gui.hud.HUDManager;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import java.util.List;
import net.minecraft.client.gui.GuiListExtended;

public class ScrollListCosmeticToggle extends GuiListExtended
{
    private final List<CosmeticEntry> entrys;
    
    public ScrollListCosmeticToggle(final Minecraft mcIn, final GuiCosmeticToggle inGui) {
        super(mcIn, inGui.width, inGui.height, 63, inGui.height - 32, 20);
        this.entrys = new ArrayList<CosmeticEntry>();
        for (final IRenderer r : HUDManager.getInstance().getRegisteredRenderers()) {
            if (r instanceof Cosmetic) {
                final Cosmetic m = (Cosmetic)r;
                this.entrys.add(new CosmeticEntry(inGui, m));
            }
        }
        Collections.sort(this.entrys);
    }
    
    @Override
    public IGuiListEntry getListEntry(final int index) {
        return this.entrys.get(index);
    }
    
    @Override
    protected int getSize() {
        return this.entrys.size();
    }
}
