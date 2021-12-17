package foxclient.gui.hud;

public interface IRenderConfig
{
    void save(ScreenPosition p0);
    
    ScreenPosition load();
}
