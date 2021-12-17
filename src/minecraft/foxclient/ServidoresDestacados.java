package foxclient;

import net.minecraft.util.ResourceLocation;
import net.minecraft.client.multiplayer.ServerData;

public class ServidoresDestacados extends ServerData
{
    public static final ResourceLocation STAR_ICON = new ResourceLocation("foxclient/star.png");
    
    
    public ServidoresDestacados(String serverName,  String serverIP) {
        super(serverName, serverIP, false);
    }
}
