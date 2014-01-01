package com.PlayPrey.AchievExtrem.Handler;

import com.PlayPrey.AchievExtrem.AchievExtrem;
import com.PlayPrey.AchievExtrem.NameIDS.ModInformation;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import cpw.mods.fml.common.IPickupNotifier;



public class PickupHandler implements IPickupNotifier 
{
	public int oakWood = 0;
	public int birchWood = 0;
	public int spruceWood = 0;
	public int jungleWood = 0;
	
	
	
	@Override
	public void notifyPickup(EntityItem item, EntityPlayer player) 
	{
		//Mine Once
				if(new ItemStack(item.getEntityItem().itemID,1,0) == new ItemStack(Block.wood.blockID,1,1))
				{
				player.addStat(AchievExtrem.DigWood, 1);
				}
				if(item.getEntityItem().itemID == Block.dirt.blockID)
				{
				player.addStat(AchievExtrem.DigDirt, 1);
				}
				if(item.getEntityItem().itemID == Block.cobblestone.blockID)
				{
				player.addStat(AchievExtrem.DigStone, 1);
				}
				if(item.getEntityItem().itemID == Item.coal.itemID)
				{
				player.addStat(AchievExtrem.DigCoalOre, 1);
				}
				if(item.getEntityItem().itemID == Block.oreIron.blockID)
				{
				player.addStat(AchievExtrem.DigIronOre, 1);
				}
				if(item.getEntityItem().itemID == Block.oreGold.blockID)
				{
				player.addStat(AchievExtrem.DigGoldOre, 1);
				}
				if(item.getEntityItem().itemID == Item.diamond.itemID)
				{
				player.addStat(AchievExtrem.DigDiamondOre, 1);
				}
				if(item.getEntityItem().itemID == Block.obsidian.blockID)
				{
				player.addStat(AchievExtrem.DigObsidian, 1);

				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
