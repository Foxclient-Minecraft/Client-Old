package foxclient.mods.impl;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import foxclient.gui.hud.ScreenPosition;
import foxclient.mods.ModDraggable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModPlayerInfo extends ModDraggable {
	
	private Color healthColor;
	private int healthRect;
	private String winning;

	@Override
	public int getWidth() {
		return 154;
	}

	@Override
	public int getHeight() {
		return 52;
	}
	// 486, 350, 630, 300

	@Override
	public void render(ScreenPosition pos) {
	if (this.mc.pointedEntity instanceof EntityLivingBase && !this.mc.pointedEntity.isInvisible()) {
		EntityLivingBase currentTarget = (EntityLivingBase) this.mc.pointedEntity;
		 String targetString = currentTarget.getName();
		 
		 Gui.drawRect(pos.getAbsoluteX(), pos.getAbsoluteY(), pos.getAbsoluteX() + getWidth(), pos.getAbsoluteY() + getHeight(), 0x90000000);
		 
		 //target
	     mc.fontRendererObj.drawString(targetString, pos.getAbsoluteX() + 31, pos.getAbsoluteY() + 8, -1);
	     mc.fontRendererObj.drawString((int) currentTarget.getHealth() + " \u2764", pos.getAbsoluteX() + 31, pos.getAbsoluteY() + 20, new Color(255, 255, 255, 255).getRGB());
	     GuiInventory.drawEntityOnScreen(pos.getAbsoluteX() + 12, pos.getAbsoluteY() + 45, 25, -35, -5, currentTarget);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(((EntityPlayer) currentTarget).getCurrentEquippedItem(), pos.getAbsoluteX() + 30, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(currentTarget.getCurrentArmor(3), pos.getAbsoluteX() + 45, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(currentTarget.getCurrentArmor(2), pos.getAbsoluteX() + 60, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(currentTarget.getCurrentArmor(1), pos.getAbsoluteX() + 75, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(currentTarget.getCurrentArmor(0), pos.getAbsoluteX() + 90, pos.getAbsoluteY() + 30);
	     mc.fontRendererObj.drawString(getWin(), pos.getAbsoluteX() + 59, pos.getAbsoluteY() + 20, getWinColor());
	     
	    drawEntityHealth();
	    
	     
		}
	}
	
	private String getWin() {
		EntityLivingBase currentTarget = (EntityLivingBase) this.mc.pointedEntity;
		if (currentTarget.getHealth() > mc.thePlayer.getHealth()) {
			return "Estas perdiendo";
		} else if (currentTarget.getHealth() == mc.thePlayer.getHealth() && currentTarget.getHealth() != 20 && mc.thePlayer.getHealth() != 20) {
			return "Puedes ganar";
		} else if (currentTarget.getHealth() < mc.thePlayer.getHealth()) {
			return "Estas ganando";
		} else if (currentTarget.getHealth() == 0) {
			return "Has ganado!";
		} else if (mc.thePlayer.getHealth() == 0) {
			return "Has perdido!";
		} else if (currentTarget.getHealth() == 20 && mc.thePlayer.getHealth() == 20) {
			return "Not fighting";
		} else {
			return "Puedes ganar";
		}
	}
	
	private int getWinColor() {
		EntityLivingBase currentTarget = (EntityLivingBase) this.mc.pointedEntity;
		if (currentTarget.getHealth() > mc.thePlayer.getHealth()) {
			return new Color(255, 0, 0, 255).getRGB();
		} else if (currentTarget.getHealth() == mc.thePlayer.getHealth() && currentTarget.getHealth() != 20 && mc.thePlayer.getHealth() != 20) {
			return new Color(255, 255, 0, 255).getRGB();
		} else if (currentTarget.getHealth() < mc.thePlayer.getHealth()) {
			return new Color(0, 255, 0, 255).getRGB();
		} else if (currentTarget.getHealth() == 0) {
			return new Color(0, 255, 0, 255).getRGB();
		}else if (mc.thePlayer.getHealth() == 0) {
			return new Color(255, 0, 0, 255).getRGB();
		} else if (currentTarget.getHealth() == 20 && mc.thePlayer.getHealth() == 20) {
			return new Color(0, 188, 255, 255).getRGB();
		} 
		else {
			return new Color(0, 0, 255, 255).getRGB();
		}
	}
	
	@Override
	public void renderDummy(ScreenPosition pos) {
		 
		 Gui.drawRect(pos.getAbsoluteX(), pos.getAbsoluteY(), pos.getAbsoluteX() + getWidth(), pos.getAbsoluteY() + getHeight(), 0x90000000);
		 
		 //target
	     mc.fontRendererObj.drawString("Nombre", pos.getAbsoluteX() + 28, pos.getAbsoluteY() + 8, -1);
	     mc.fontRendererObj.drawString("HP", pos.getAbsoluteX() + 28, pos.getAbsoluteY() + 20, -1);
	     GuiInventory.drawEntityOnScreen(pos.getAbsoluteX() + 12, pos.getAbsoluteY() + 45, 25, -35, -5, mc.thePlayer);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(mc.thePlayer.getCurrentEquippedItem(), pos.getAbsoluteX() + 30, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(mc.thePlayer.getCurrentArmor(3), pos.getAbsoluteX() + 45, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(mc.thePlayer.getCurrentArmor(2), pos.getAbsoluteX() + 60, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(mc.thePlayer.getCurrentArmor(1), pos.getAbsoluteX() + 75, pos.getAbsoluteY() + 30);
	     mc.getRenderItem().renderItemAndEffectIntoGUI(mc.thePlayer.getCurrentArmor(0), pos.getAbsoluteX() + 90, pos.getAbsoluteY() + 30);
	     mc.fontRendererObj.drawString("Probabilidades de ganar", pos.getAbsoluteX() + 59, pos.getAbsoluteY() + 20, new Color(0, 188, 255, 255).getRGB());
	     
	     Gui.drawRect(pos.getAbsoluteX(), pos.getAbsoluteY() + 52, pos.getAbsoluteX() + 154, pos.getAbsoluteY() + 50, new Color(0, 255, 0, 255).getRGB());
	}
	
	private void drawEntityHealth() {
		EntityLivingBase currentTarget = (EntityLivingBase) this.mc.pointedEntity;
		
		if(currentTarget.getHealth() >= currentTarget.getMaxHealth()) {
			healthColor = new Color(0, 255, 0, 255);
			healthRect = 154;
		} else if (currentTarget.getHealth() >= 18) {
			healthColor = new Color(255, 242, 0, 255);
			healthRect = 132;
		} else if (currentTarget.getHealth() >= 13) {
			healthColor = new Color(173, 117, 3, 255);
			healthRect = 110;
		} else if (currentTarget.getHealth() >= 10) {
			healthColor = new Color(173, 80, 3, 255);
			healthRect = 88;
		} else if (currentTarget.getHealth() >= 7) {
			healthColor = new Color(173, 80, 3, 255);
			healthRect = 66;
		} else if (currentTarget.getHealth() >= 5) {
			healthColor = new Color(184, 43, 0, 255);
			healthRect = 44;
		} else if (currentTarget.getHealth() <= 3) {
			healthColor = new Color(255, 0, 0, 255);
			healthRect = 22;
		}
		
		//Gui.drawRect(pos.getAbsoluteX() + 77, pos.getAbsoluteY(), pos.getAbsoluteX() + 79, pos.getAbsoluteY() + getHeight(), healthColor.getRGB());
		//154
		Gui.drawRect(pos.getAbsoluteX(), pos.getAbsoluteY() + 52, pos.getAbsoluteX() + healthRect, pos.getAbsoluteY() + 50, healthColor.getRGB());
		
	}
	
	private void renderItemStack(ScreenPosition pos, int i, ItemStack is) {
		
		if(is == null) {
			return;
		}
		
		GL11.glPushMatrix();
		int yAdd = (-16 * i) + 48;
		
		/*if(is.getItem().isDamageable()) {
			double damage = ((is.getMaxDamage() - is.getItemDamage()) / (double) is.getMaxDamage() * 100);
			font.drawString(String.format("%.0f", damage), pos.getAbsoluteX() + 20, pos.getAbsoluteY() + yAdd + 5, 0x00ff00);
		}*/
		
		RenderHelper.enableGUIStandardItemLighting();
		mc.getRenderItem().renderItemAndEffectIntoGUI(is, pos.getAbsoluteX(), pos.getAbsoluteY() + yAdd);
		GL11.glPopMatrix();
		
	}

}
