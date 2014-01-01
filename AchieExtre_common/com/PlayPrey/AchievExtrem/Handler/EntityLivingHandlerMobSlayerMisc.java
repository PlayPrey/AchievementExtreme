package com.PlayPrey.AchievExtrem.Handler;

import com.PlayPrey.AchievExtrem.AchievExtrem;

import cpw.mods.fml.common.IPickupNotifier;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeInstance;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.entity.ai.attributes.ServersideAttributeMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class EntityLivingHandlerMobSlayerMisc 

{  
	
	

	public int cowsKilled = 0;
	public int pigsKilled = 0;

 	
	@ForgeSubscribe
	public void onEntityLivingDeath(LivingDeathEvent event)
	{
		
		
		//Creeper
		if (event.source.getEntity() instanceof EntityPlayer) 
		{
			   if (event.entityLiving instanceof EntityCow) 
			   { 
			        EntityCow cow = (EntityCow) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        cowsKilled = cowsKilled + 1;
			   }
			   if (event.entityLiving instanceof EntityPig) 
			   { 
			        EntityPig pig = (EntityPig) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 
			        pigsKilled = pigsKilled + 1;
			   }
			   if (pigsKilled == 1 && cowsKilled == 1) 
			   { 
			        EntityPig pig = (EntityPig) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        player.addStat(AchievExtrem.SlayMisc_MeatAnimal, 1);
			   }
		}
		
	}
}
		
	
	
	


