package foxclient;

import net.arikia.dev.drpc.DiscordRichPresence;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordUser;
import net.arikia.dev.drpc.callbacks.ReadyCallback;
import net.arikia.dev.drpc.DiscordEventHandlers;

public class DiscordRP
{
    private boolean running = true;
    private long created = 0;
    
    public void start() {
    	
    	this.created = System.currentTimeMillis();
    	
    	DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler(new ReadyCallback() {
			
			@Override
			public void apply(DiscordUser user) {
				System.out.println("Iniciando presencia de Discord en la cuenta de " + user.username + "#" + user.discriminator);
				update("Iniciando cliente...", "");
			}
		}).build();
    	
    	DiscordRPC.discordInitialize("865164387127918642", handlers, true);
    	
    	new Thread("Discord RPC Callback") {
    		
    		@Override
    		public void run() {
    			
    			while(running) {
    				DiscordRPC.discordRunCallbacks();
    			}
    			
    		};
    		
    	}.start();
    }
    
    public void shutdown() {
    	running = false;
    	DiscordRPC.discordShutdown();
    }
    
    public void update(String firstLine, String secondLine) {
    	DiscordRichPresence.Builder b = new DiscordRichPresence.Builder(secondLine);
    	b.setBigImage("large", "Minecraft 1.8.8");
    	b.setDetails(firstLine);
    	b.setStartTimestamps(created);
    	
    	DiscordRPC.discordUpdatePresence(b.build());
    	
    }
}
