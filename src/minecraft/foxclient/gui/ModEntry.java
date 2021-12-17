package foxclient.gui;

import net.minecraft.client.Minecraft;
import org.apache.commons.lang3.StringUtils;
import foxclient.mods.Mod;
import foxclient.util.font.FontUtil;
import net.minecraft.client.gui.GuiListExtended;

public class ModEntry implements GuiListExtended.IGuiListEntry, Comparable<ModEntry>
{
    private final GuiCheckBox checkbox;
    private final String name;
    private final Mod mod;
    private final GuiModToggle gui;
    
    public ModEntry(final GuiModToggle inGui, final Mod mod) {
        this.mod = mod;
        this.name = StringUtils.join((Object[])StringUtils.splitByCharacterTypeCamelCase(mod.getClass().getSimpleName().replace("Mod", "").replaceAll("\\d+", "")), " ");
        this.checkbox = new GuiCheckBox(0, 0, 0, mod.isEnabled());
        this.gui = inGui;
    }
    
    @Override
    public void drawEntry(final int slotIndex, final int x, final int y, final int listWidth, final int slotHeight, final int mouseX, final int mouseY, final boolean isSelected) {
        this.checkbox.xPosition = x + 200;
        this.checkbox.yPosition = y;
        this.checkbox.drawButton(Minecraft.getMinecraft(), mouseX, mouseY);
        this.mod.setEnabled(this.checkbox.isChecked());
        FontUtil.normal.drawCenteredString(this.name, x, y + 4, -1);
    }
    
    @Override
    public boolean mousePressed(final int slotIndex, final int x, final int y, final int p_148278_4_, final int p_148278_5_, final int p_148278_6_) {
        return this.checkbox.mousePressed(Minecraft.getMinecraft(), x, y);
    }
    
    @Override
    public void mouseReleased(final int slotIndex, final int x, final int y, final int mouseEvent, final int relativeX, final int relativeY) {
        this.checkbox.mouseReleased(x, y);
    }
    
    @Override
    public void setSelected(final int p_178011_1_, final int p_178011_2_, final int p_178011_3_) {
    }
    
    @Override
    public int compareTo(final ModEntry o) {
        return this.name.compareTo(o.name);
    }
}
