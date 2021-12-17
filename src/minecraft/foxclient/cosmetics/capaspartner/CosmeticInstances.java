package foxclient.cosmetics.capaspartner;

import foxclient.cosmetics.capaspartner.impl.CosmeticAjolotes;
import foxclient.cosmetics.capaspartner.impl.CosmeticCaraotacraft;
import foxclient.cosmetics.capaspartner.impl.CosmeticCristal;
import foxclient.cosmetics.capaspartner.impl.CosmeticDayitube682;
import foxclient.cosmetics.capaspartner.impl.CosmeticFoxPixel;
import foxclient.cosmetics.capaspartner.impl.CosmeticFoxclient;
import foxclient.cosmetics.capaspartner.impl.CosmeticFrancoBM;
import foxclient.cosmetics.capaspartner.impl.CosmeticGataReina;
import foxclient.cosmetics.capaspartner.impl.CosmeticHacker;
import foxclient.cosmetics.capaspartner.impl.CosmeticHelmsShoto;
import foxclient.cosmetics.capaspartner.impl.CosmeticLuquistroll209;
import foxclient.cosmetics.capaspartner.impl.CosmeticMexico;
import foxclient.cosmetics.capaspartner.impl.CosmeticMigracion;
import foxclient.cosmetics.capaspartner.impl.CosmeticNether;
import foxclient.cosmetics.capaspartner.impl.CosmeticNigxht;
import foxclient.cosmetics.capaspartner.impl.CosmeticPescado;
import foxclient.cosmetics.capaspartner.impl.CosmeticRickRoll;
import foxclient.cosmetics.capaspartner.impl.CosmeticSombrioDeAmor;
import foxclient.cosmetics.capaspartner.impl.CosmeticTwitch;
import foxclient.cosmetics.capaspartner.impl.CosmeticYurimorales;
import foxclient.gui.SplashProgress;
import foxclient.gui.hud.HUDManager;

public class CosmeticInstances
{
	
	private static CosmeticFoxclient capaFoxclient;
	private static CosmeticCaraotacraft capaCaraotacraft;
	private static CosmeticFrancoBM capaFrancoBM;
	private static CosmeticDayitube682 capaDayitube682;
	private static CosmeticHelmsShoto capaHelmsShoto;
	private static CosmeticLuquistroll209 capaLuquistroll209;
	private static CosmeticMexico capaMexico;
	private static CosmeticNigxht capaNigxht;
    private static CosmeticYurimorales capaYurimorales;
    private static CosmeticTwitch capaTwitch;
    private static CosmeticMigracion capaMigracion;
    private static CosmeticRickRoll capaRickRoll;
    
    /*----------------------------------------------------------------------*/
    private static CosmeticFoxPixel capaFoxPixel;
    private static CosmeticHacker capaHacker;
    private static CosmeticGataReina capaGataReina;
    private static CosmeticNether capaNether;
    private static CosmeticAjolotes capaAjolotes;
    private static CosmeticSombrioDeAmor capaSombrioDeAmor;
    private static CosmeticCristal capaCristal;
    private static CosmeticPescado capaPescado;
    
	
    public static void register(HUDManager api) {
        
        capaFoxclient = new CosmeticFoxclient();
        api.register(capaFoxclient);
        
        capaCaraotacraft = new CosmeticCaraotacraft();
        api.register(capaCaraotacraft);
        
        capaFrancoBM = new CosmeticFrancoBM();
        api.register(capaFrancoBM);
        
        capaDayitube682 = new CosmeticDayitube682();
        api.register(capaDayitube682);
        
        capaHelmsShoto = new CosmeticHelmsShoto();
        api.register(capaHelmsShoto);
        
        capaLuquistroll209 = new CosmeticLuquistroll209();
        api.register(capaLuquistroll209);
        
        capaMexico = new CosmeticMexico();
        api.register(capaMexico);
        
        capaNigxht = new CosmeticNigxht();
        api.register(capaNigxht);
        
        capaYurimorales = new CosmeticYurimorales();
        api.register(capaYurimorales);
        
        capaTwitch = new CosmeticTwitch();
        api.register(capaTwitch);
        
        capaMigracion = new CosmeticMigracion();
        api.register(capaMigracion);
        
        capaRickRoll = new CosmeticRickRoll();
        api.register(capaRickRoll);
        
        capaFoxPixel = new CosmeticFoxPixel();
        api.register(capaFoxPixel);
        
        capaHacker = new CosmeticHacker();
        api.register(capaHacker);
        
        capaGataReina = new CosmeticGataReina();
        api.register(capaGataReina);
        
        capaNether = new CosmeticNether();
        api.register(capaNether);
        
        capaAjolotes = new CosmeticAjolotes();
        api.register(capaAjolotes);
        
        capaSombrioDeAmor = new CosmeticSombrioDeAmor();
        api.register(capaSombrioDeAmor);
        
        capaCristal = new CosmeticCristal();
        api.register(capaCristal);
        
        capaPescado = new CosmeticPescado();
        api.register(capaPescado);
    }
    
    public static CosmeticFoxclient getCapaFoxclient() {
		return capaFoxclient;
	}
    
    public static CosmeticCaraotacraft getCapaCaraotacraft() {
		return capaCaraotacraft;
	}
    
    public static CosmeticFrancoBM getCapaFrancoBM() {
		return capaFrancoBM;
	}
    
    public static CosmeticDayitube682 getCapaDayitube682() {
		return capaDayitube682;
	}
    
    public static CosmeticHelmsShoto getCapaHelmsShoto() {
		return capaHelmsShoto;
	}
    
    public static CosmeticLuquistroll209 getCapaLuquistroll209() {
		return capaLuquistroll209;
	}
    
    public static CosmeticMexico getCapaMexico() {
		return capaMexico;
	}
    
    public static CosmeticNigxht getCapaNigxht() {
		return capaNigxht;
	}
    
    public static CosmeticYurimorales getCapaYurimorales() {
		return capaYurimorales;
	}
    
    public static CosmeticTwitch getCapaTwitch() {
		return capaTwitch;
	}
    
    public static CosmeticMigracion getCapaMigracion() {
    	return capaMigracion;
    }
    
    public static CosmeticRickRoll getCapaRickRoll() {
		return capaRickRoll;
	}
    
    public static CosmeticFoxPixel getCapaFoxPixel() {
		return capaFoxPixel;
	}
    
    public static CosmeticHacker getCapaHacker() {
		return capaHacker;
	}
    
    public static CosmeticGataReina getCapaGataReina() {
		return capaGataReina;
	}
    
    public static CosmeticNether getCapaNether() {
		return capaNether;
	}
    
    public static CosmeticAjolotes getCapaAjolotes() {
		return capaAjolotes;
	}
    
    public static CosmeticSombrioDeAmor getCapaSombrioDeAmor() {
		return capaSombrioDeAmor;
	}
    
    public static CosmeticCristal getCapaCristal() {
		return capaCristal;
	}
    
    public static CosmeticPescado getCapaPescado() {
		return capaPescado;
	}
}
