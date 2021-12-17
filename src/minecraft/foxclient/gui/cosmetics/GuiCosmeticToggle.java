package foxclient.gui.cosmetics;

import java.io.IOException;
import net.minecraft.client.gui.GuiScreen;

public class GuiCosmeticToggle extends GuiScreen
{
    private ScrollListCosmeticToggle scrollPanel;
    
    @Override
    public void initGui() {
        this.scrollPanel = new ScrollListCosmeticToggle(this.mc, this);
        this.buttonList.clear();
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.scrollPanel.handleMouseInput();
    }
    
    @Override
    protected void mouseClicked(final int mouseX, final int mouseY, final int mouseButton) throws IOException {
        this.scrollPanel.mouseClicked(mouseX, mouseY, mouseButton);
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }
    
    @Override
    protected void mouseReleased(final int mouseX, final int mouseY, final int state) {
        this.scrollPanel.mouseReleased(mouseX, mouseY, state);
        super.mouseReleased(mouseX, mouseY, state);
    }
    
    @Override
    public void drawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        this.drawDefaultBackground();
        this.scrollPanel.drawScreen(mouseX, mouseY, partialTicks);
        this.drawCenteredString(this.fontRendererObj, "Activar/Desactivar Cosmeticos", this.width / 2, 8, 16777215);
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
