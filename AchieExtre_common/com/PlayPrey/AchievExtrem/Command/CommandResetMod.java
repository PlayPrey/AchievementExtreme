package com.PlayPrey.AchievExtrem.Command;

import com.PlayPrey.AchievExtrem.AchievExtrem;
import com.PlayPrey.AchievExtrem.Handler.EntityLivingHandlerMobSlayerMisc;
import com.PlayPrey.AchievExtrem.NameIDS.ModInformation;

import net.minecraft.client.settings.GameSettings;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityDispenser;

public class CommandResetMod extends CommandBase
{

public String pigsKilled = EntityLivingHandlerMobSlayerMisc.pigsKilled + "";



@Override
public String getCommandName()
{
return "ae.pigsKilled"; 
}
public int pigsKilledSetter()
{ 
return pigsKilled;
}
@Override
public void processCommand(ICommandSender icommandsender, String[] astring)
{
	 if(icommandsender instanceof EntityPlayer)
     {
             EntityPlayer player = (EntityPlayer)icommandsender;

           // player.addChatMessage(MobKills.pigsKilled);
            
           
     
           
     
     
     }
}

@Override
public String getCommandUsage(ICommandSender icommandsender) {
	// TODO Auto-generated method stub
	return null;
}

}