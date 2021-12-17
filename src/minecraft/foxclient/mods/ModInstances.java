package foxclient.mods;

import foxclient.gui.hud.HUDManager;
import foxclient.mods.impl.ModArmorStatus;
import foxclient.mods.impl.ModBlockOverlay;
import foxclient.mods.impl.ModCPS;
import foxclient.mods.impl.ModCleanChat;
import foxclient.mods.impl.ModCleanScoreboard;
import foxclient.mods.impl.ModCoordenadas;
import foxclient.mods.impl.ModFPS;
import foxclient.mods.impl.ModKeystrokes;
import foxclient.mods.impl.ModPerspective;
import foxclient.mods.impl.ModPing;
import foxclient.mods.impl.ModPlayerInfo;
import foxclient.mods.impl.ModPotionStatus;
import foxclient.mods.impl.ModShowIGN;
import foxclient.mods.impl.ModSmallItems;
import foxclient.mods.impl.ModTNTTimer;
import foxclient.mods.impl.ModTimeChanger;
import foxclient.mods.impl.ModToggleSprint;
import net.minecraft.client.Minecraft;

public class ModInstances {
	
	private static ModArmorStatus modArmorStatus;
	private static ModBlockOverlay modBlockOverlay;
	private static ModCleanChat modCleanChat;
	private static ModCleanScoreboard modCleanScoreboard;
	private static ModCoordenadas modCoordenadas;
	private static  ModCPS modCPS;
	private static ModFPS modFPS;
	private static ModKeystrokes modKeystrokes;
	private static ModPerspective modPerspective;
	private static ModPing modPing;
	private static ModPlayerInfo modPlayerInfo;
	private static ModPotionStatus modPotionStatus;
	private static ModShowIGN modShowIGN;
	private static ModSmallItems modSmallItems;
	private static ModTimeChanger modTimeChanger;
	private static ModTNTTimer modTNTTimer;
	private static ModToggleSprint modToggleSprint;
	

	public static void register (HUDManager api) {
		modArmorStatus = new ModArmorStatus();
		api.register(modArmorStatus);
		
		modBlockOverlay = new ModBlockOverlay();
		api.register(modBlockOverlay);

		modCleanChat = new ModCleanChat();
		api.register(modCleanChat);
		
		modCleanScoreboard = new ModCleanScoreboard();
		api.register(modCleanScoreboard);
		
		modCoordenadas = new ModCoordenadas();
		api.register(modCoordenadas);
		
		modCPS = new ModCPS();
		api.register(modCPS);
		
		modFPS = new ModFPS();
		api.register(modFPS);
		
		modKeystrokes = new ModKeystrokes();
		api.register(modKeystrokes);
		
		modPerspective = new ModPerspective();
		api.register(modPerspective);
		
		modPing = new ModPing();
		api.register(modPing);
		
		modPlayerInfo = new ModPlayerInfo();
		api.register(modPlayerInfo);
		
		modPotionStatus = new ModPotionStatus();
		api.register(modPotionStatus);
		
		modShowIGN = new ModShowIGN();
		api.register(modShowIGN);
		
		modSmallItems = new ModSmallItems();
		api.register(modSmallItems);
		
		modTimeChanger = new ModTimeChanger();
		api.register(modTimeChanger);
		
		modTNTTimer = new ModTNTTimer();
		api.register(modTNTTimer);
		
		modToggleSprint = new ModToggleSprint();
		api.register(modToggleSprint);
	}
	
	public static ModToggleSprint getModToggleSprint() {
		return modToggleSprint;
	}
	
	public static ModPerspective getModPerspective() {
		return modPerspective;
	}
	
	public static ModShowIGN getModShowIGN() {
		return modShowIGN;
	}
	
	public static ModSmallItems getModSmallSword() {
		return modSmallItems;
	}
	
	public static ModTimeChanger getModTimeChanger() {
		return modTimeChanger;
	}
	
	public static ModTNTTimer getModTNTTimer() {
		return modTNTTimer;
	}
	
	public static ModBlockOverlay getModBlockOverlay() {
		return modBlockOverlay;
	}
	
	public static ModCleanChat getModBetterChat() {
		return modCleanChat;
	}
	
	public static ModCleanScoreboard betterScoreboard() {
		return modCleanScoreboard;
	}
	
}
