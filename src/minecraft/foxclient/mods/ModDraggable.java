package foxclient.mods;

import foxclient.FileManager;
import java.io.File;
import foxclient.gui.hud.ScreenPosition;
import foxclient.gui.hud.IRenderer;

public abstract class ModDraggable extends Mod implements IRenderer
{
    protected ScreenPosition pos;
    
    public ModDraggable() {
        this.pos = this.loadPositionFromFile();
    }
    
    @Override
    public ScreenPosition load() {
        return this.pos;
    }
    
    @Override
    public void save(final ScreenPosition pos) {
        this.pos = pos;
        this.savePositionToFile();
    }
    
    private File getFolder() {
        final File folder = new File(FileManager.getModsDirectory(), this.getClass().getSimpleName());
        folder.mkdirs();
        return folder;
    }
    
    private void savePositionToFile() {
        FileManager.writeJsonToFile(new File(this.getFolder(), "pos.json"), this.pos);
    }
    
    private ScreenPosition loadPositionFromFile() {
        ScreenPosition loaded = FileManager.readFromJson(new File(this.getFolder(), "pos.json"), ScreenPosition.class);
        if (loaded == null) {
            loaded = ScreenPosition.fromRelativePosition(0.5, 0.5);
            this.pos = loaded;
            this.savePositionToFile();
        }
        return loaded;
    }
    
    public final int getLineOffset(final ScreenPosition pos, final int lineNum) {
        return pos.getAbsoluteY() + this.getLineOffset(lineNum);
    }
    
    private int getLineOffset(final int lineNum) {
        return (this.font.FONT_HEIGHT + 3) * lineNum;
    }
}
