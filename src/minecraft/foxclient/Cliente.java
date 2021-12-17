package foxclient;

import foxclient.event.EventTarget;
import net.minecraft.client.Minecraft;
import foxclient.event.impl.ClientTickEvent;
import foxclient.mods.ModInstances;
import foxclient.util.font.FontUtil;
import foxclient.util.updater.UpdateChecker;

import java.io.File;

import foxclient.cosmetics.capaspartner.CosmeticInstances;
import foxclient.event.EventManager;
import foxclient.gui.SplashProgress;
import foxclient.gui.hud.HUDManager;

public class Cliente
{
	private static final Cliente INSTANCE;
	private DiscordRP discordRP;
	private HUDManager hudManager;

	static {
		INSTANCE = new Cliente();
	}

	public Cliente() {
		discordRP = new DiscordRP();
	}

	public static final Cliente getInstance() {
		return Cliente.INSTANCE;
	}

	public void init() {
		FileManager.init();
		SplashProgress.setProgress(0, "Cliente - Iniciando DiscordRP");
		discordRP.start();
		EventManager.register(this);

	}

	public void start() {
		ModInstances.register(this.hudManager = HUDManager.getInstance());
		FontUtil.bootstrap();
		CosmeticInstances.register(this.hudManager = HUDManager.getInstance());
	}

	public void shutdown() {
		discordRP.shutdown();
	}

	public DiscordRP getDiscordRP() {
		return discordRP;
	}

	@EventTarget
	public void onTick(final ClientTickEvent e) {
		if (Minecraft.getMinecraft().gameSettings.CLIENT_GUI_MOD_POS.isPressed()) {
			hudManager.openConfigScreen();
		}
		if(UpdateChecker.shouldUpdate()) {
			
			
		}
	}
}
