package foxclient.mods;

import foxclient.event.EventManager;
import foxclient.Cliente;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.Minecraft;

public class Mod
{
    public boolean isEnabled;
    protected final Minecraft mc;
    protected final FontRenderer font;
    protected final Cliente client;
    
    public Mod() {
        this.isEnabled = false;
        this.mc = Minecraft.getMinecraft();
        this.font = this.mc.fontRendererObj;
        this.client = Cliente.getInstance();
        this.setEnabled(this.isEnabled);
    }
    
    public void setEnabled(final boolean isEnabled) {
        this.isEnabled = isEnabled;
        if (isEnabled) {
            EventManager.register(this);
        }
        else {
            EventManager.unregister(this);
        }
    }
    
    public boolean isEnabled() {
        return this.isEnabled;
    }
}
