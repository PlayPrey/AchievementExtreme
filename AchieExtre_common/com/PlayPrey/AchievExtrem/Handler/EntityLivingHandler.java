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

public class EntityLivingHandler 

{  
	
	

	public int creepersKilled = 0;
	public int skeletonsKilled = 0;
	public int zombiesKilled = 0;
	public int spidersKilled = 0;
	public int endermansKilled = 0;
 	public int playermpsKilled = 0;
 	public int slimesKilled = 0;
 	public int blazesKilled = 0;
 	public int ghastsKilled = 0;
 	public int cavespidersKilled = 0;
 	public int mobsKilled = 0;
 	
	@ForgeSubscribe
	public void onEntityLivingDeath(LivingDeathEvent event)
	{
		
		
		//Creeper
		if (event.source.getEntity() instanceof EntityPlayer) 
		{
			   if (event.entityLiving instanceof EntityCreeper) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        creepersKilled = creepersKilled + 1;
			        mobsKilled = mobsKilled + 1;
			        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
			   }
			   if (event.entityLiving instanceof EntityCreeper && creepersKilled == 5) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        
			        player.addStat(AchievExtrem.Slay_FIVE_Creeper,1); 
			   }
			   if (event.entityLiving instanceof EntityCreeper && creepersKilled == 10) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        
			        player.addStat(AchievExtrem.Slay_TEN_Creeper,1); 
			   }
			   if (event.entityLiving instanceof EntityCreeper && creepersKilled == 25) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        
			        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Creeper,1); 
			   }
			   if (event.entityLiving instanceof EntityCreeper && creepersKilled == 50) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        
			        player.addStat(AchievExtrem.Slay_FIFTY_Creeper,1); 
			   }
			   if (event.entityLiving instanceof EntityCreeper && creepersKilled == 75) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        
			        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Creeper,1); 
			   }
			   if (event.entityLiving instanceof EntityCreeper && creepersKilled == 100) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        
			        player.addStat(AchievExtrem.Slay_HOUNDRED_Creeper,1); 
			   }
			   if (event.entityLiving instanceof EntityCreeper && creepersKilled == 150) 
			   { 
			        EntityCreeper creeper = (EntityCreeper) event.entityLiving;
			        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

			        
			        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Creeper,1); 
			   }
			  }   
			
		
		
		//Skeleton
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySkeleton) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       skeletonsKilled = skeletonsKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Skeleton,1); 
		   }
		   if (event.entityLiving instanceof EntitySkeleton && skeletonsKilled == 5) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_Skeleton,1); 
		   }
		   if (event.entityLiving instanceof EntitySkeleton && skeletonsKilled == 10) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_Skeleton,1); 
		   }
		   if (event.entityLiving instanceof EntitySkeleton && skeletonsKilled == 25) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Skeleton,1); 
		   }
		   if (event.entityLiving instanceof EntitySkeleton && skeletonsKilled == 50) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_Skeleton,1 ); 
		   }
		   if (event.entityLiving instanceof EntitySkeleton && skeletonsKilled == 75) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Skeleton,1); 
		   }
		   if (event.entityLiving instanceof EntitySkeleton && skeletonsKilled == 100) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_Skeleton,1); 
		   }
		   if (event.entityLiving instanceof EntitySkeleton && skeletonsKilled == 150) 
		   {
			   EntitySkeleton skeleton = (EntitySkeleton) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Skeleton,1); 
		   }
		  }   
		
	
	
	
	
	
	
	
	
	//Zombie
	if (event.source.getEntity() instanceof EntityPlayer) 
	{
		 if (event.entityLiving instanceof EntityZombie) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       zombiesKilled = zombiesKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Zombie,1); 
		   }
		   if (event.entityLiving instanceof EntityZombie && zombiesKilled == 5) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_Zombie,1); 
		   }
		   if (event.entityLiving instanceof EntityZombie && zombiesKilled == 10) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_Zombie,1); 
		   }
		   if (event.entityLiving instanceof EntityZombie && zombiesKilled == 25) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Zombie,1); 
		   }
		   if (event.entityLiving instanceof EntityZombie && zombiesKilled == 50) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_Zombie,1 ); 
		   }
		   if (event.entityLiving instanceof EntityZombie && zombiesKilled == 75) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Zombie,1); 
		   }
		   if (event.entityLiving instanceof EntityZombie && zombiesKilled == 100) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_Zombie,1); 
		   }
		   if (event.entityLiving instanceof EntityZombie && zombiesKilled == 150) 
		   {
			   EntityZombie zombie = (EntityZombie) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Zombie,1); 
		   }
		  }   
		
	
	
	
	
	
	//Spider
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		 if (event.entityLiving instanceof EntitySpider) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       spidersKilled = spidersKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Spider,1); 
		   }
		   if (event.entityLiving instanceof EntitySpider && spidersKilled == 5) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_Spider,1); 
		   }
		   if (event.entityLiving instanceof EntitySpider && spidersKilled == 10) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_Spider,1); 
		   }
		   if (event.entityLiving instanceof EntitySpider && spidersKilled == 25) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Spider,1); 
		   }
		   if (event.entityLiving instanceof EntitySpider && spidersKilled == 50) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_Spider,1 ); 
		   }
		   if (event.entityLiving instanceof EntitySpider && spidersKilled == 75) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Spider,1); 
		   }
		   if (event.entityLiving instanceof EntitySpider && spidersKilled == 100) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_Spider,1); 
		   }
		   if (event.entityLiving instanceof EntitySpider && spidersKilled == 150) 
		   {
			   EntitySpider spider = (EntitySpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Spider,1); 
		   }
		  }   
		
	
	
	//Enderman
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		 if (event.entityLiving instanceof EntityEnderman) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       endermansKilled = endermansKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Enderman,1); 
		   }
		   if (event.entityLiving instanceof EntityEnderman && endermansKilled == 5) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_Enderman,1); 
		   }
		   if (event.entityLiving instanceof EntityEnderman && endermansKilled == 10) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_Enderman,1); 
		   }
		   if (event.entityLiving instanceof EntityEnderman && endermansKilled == 25) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Enderman,1); 
		   }
		   if (event.entityLiving instanceof EntityEnderman && endermansKilled == 50) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_Enderman,1 ); 
		   }
		   if (event.entityLiving instanceof EntityEnderman && endermansKilled == 75) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Enderman,1); 
		   }
		   if (event.entityLiving instanceof EntityEnderman && endermansKilled == 100) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_Enderman,1); 
		   }
		   if (event.entityLiving instanceof EntityEnderman && endermansKilled == 150) 
		   {
			   EntityEnderman enderman = (EntityEnderman) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Enderman,1); 
		   }
		  }   
		
	
	//Other Player
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		 if (event.entityLiving instanceof EntityPlayerMP) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       playermpsKilled = playermpsKilled +1;
		       
		        player.addStat(AchievExtrem.Slay_ONE_PlayerMP,1); 
		   }
		   if (event.entityLiving instanceof EntityPlayerMP && playermpsKilled == 5) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_PlayerMP,1); 
		   }
		   if (event.entityLiving instanceof EntityPlayerMP && playermpsKilled == 10) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_PlayerMP,1); 
		   }
		   if (event.entityLiving instanceof EntityPlayerMP && playermpsKilled == 25) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_PlayerMP,1); 
		   }
		   if (event.entityLiving instanceof EntityPlayerMP && playermpsKilled == 50) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_PlayerMP,1 ); 
		   }
		   if (event.entityLiving instanceof EntityPlayerMP && playermpsKilled == 75) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_PlayerMP,1); 
		   }
		   if (event.entityLiving instanceof EntityPlayerMP && playermpsKilled == 100) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_PlayerMP,1); 
		   }
		   if (event.entityLiving instanceof EntityPlayerMP && playermpsKilled == 150) 
		   {
			   EntityPlayerMP playermp = (EntityPlayerMP) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_PlayerMP,1); 
		   }
		  }   
		
	
	//Slime
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		if (event.entityLiving instanceof EntitySlime) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       slimesKilled = slimesKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Slime,1); 
		   }
		   if (event.entityLiving instanceof EntitySlime && slimesKilled == 5) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_Slime,1); 
		   }
		   if (event.entityLiving instanceof EntitySlime && slimesKilled == 10) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_Slime,1); 
		   }
		   if (event.entityLiving instanceof EntitySlime && slimesKilled == 25) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Slime,1); 
		   }
		   if (event.entityLiving instanceof EntitySlime && slimesKilled == 50) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_Slime,1 ); 
		   }
		   if (event.entityLiving instanceof EntitySlime && slimesKilled == 75) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Slime,1); 
		   }
		   if (event.entityLiving instanceof EntitySlime && slimesKilled == 100) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_Slime,1); 
		   }
		   if (event.entityLiving instanceof EntitySlime && slimesKilled == 150) 
		   {
			   EntitySlime slime = (EntitySlime) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Slime,1); 
		   }
		  } 
	
	//Blaze
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		if (event.entityLiving instanceof EntityBlaze) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       blazesKilled = blazesKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Blaze,1); 
		   }
		   if (event.entityLiving instanceof EntityBlaze && blazesKilled == 5) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_Blaze,1); 
		   }
		   if (event.entityLiving instanceof EntityBlaze && blazesKilled == 10) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_Blaze,1); 
		   }
		   if (event.entityLiving instanceof EntityBlaze && blazesKilled == 25) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Blaze,1); 
		   }
		   if (event.entityLiving instanceof EntityBlaze && blazesKilled == 50) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_Blaze,1 ); 
		   }
		   if (event.entityLiving instanceof EntityBlaze && blazesKilled == 75) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Blaze,1); 
		   }
		   if (event.entityLiving instanceof EntityBlaze && blazesKilled == 100) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_Blaze,1); 
		   }
		   if (event.entityLiving instanceof EntityBlaze && blazesKilled == 150) 
		   {
			   EntityBlaze blaze = (EntityBlaze) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Blaze,1); 
		   }
		  } 
	
	//Ghast
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		if (event.entityLiving instanceof EntityGhast) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       ghastsKilled = ghastsKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Ghast,1); 
		   }
		   if (event.entityLiving instanceof EntityGhast && ghastsKilled == 5) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_Ghast,1); 
		   }
		   if (event.entityLiving instanceof EntityGhast && ghastsKilled == 10) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_Ghast,1); 
		   }
		   if (event.entityLiving instanceof EntityGhast && ghastsKilled == 25) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_Ghast,1); 
		   }
		   if (event.entityLiving instanceof EntityGhast && ghastsKilled == 50) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_Ghast,1 ); 
		   }
		   if (event.entityLiving instanceof EntityGhast && ghastsKilled == 75) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_Ghast,1); 
		   }
		   if (event.entityLiving instanceof EntityGhast && ghastsKilled == 100) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_Ghast,1); 
		   }
		   if (event.entityLiving instanceof EntityGhast && ghastsKilled == 150) 
		   {
			   EntityGhast ghast = (EntityGhast) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_Ghast,1); 
		   }
		  } 
	
	
	//CaveSpider
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		if (event.entityLiving instanceof EntityCaveSpider) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       cavespidersKilled = cavespidersKilled +1;
		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_CaveSpider,1); 
		   }
		   if (event.entityLiving instanceof EntityCaveSpider && cavespidersKilled == 5) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIVE_CaveSpider,1); 
		   }
		   if (event.entityLiving instanceof EntityCaveSpider && cavespidersKilled == 10) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TEN_CaveSpider,1); 
		   }
		   if (event.entityLiving instanceof EntityCaveSpider && cavespidersKilled == 25) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_TWENTYFIVE_CaveSpider,1); 
		   }
		   if (event.entityLiving instanceof EntityCaveSpider && cavespidersKilled == 50) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_FIFTY_CaveSpider,1 ); 
		   }
		   if (event.entityLiving instanceof EntityCaveSpider && cavespidersKilled == 75) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_SEVENTYFIVE_CaveSpider,1); 
		   }
		   if (event.entityLiving instanceof EntityCaveSpider && cavespidersKilled == 100) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDRED_CaveSpider,1); 
		   }
		   if (event.entityLiving instanceof EntityCaveSpider && cavespidersKilled == 150) 
		   {
			   EntityCaveSpider cavespider = (EntityCaveSpider) event.entityLiving; 
		        EntityPlayer player = (EntityPlayer) event.source.getEntity();

		       
		        player.addStat(AchievExtrem.Slay_HOUNDREDANDFIFTY_CaveSpider,1); 
		   }
		  } 
	
	
	
	
	
	
	
	
	//PAGE=== TWO!!! =======================================================================
	
	
	
	
	//Silverfish
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySilverfish) 
		   { 
			   EntitySilverfish creeper = (EntitySilverfish) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	
	
	//GiantZombie
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntityGiantZombie) 
		   { 
			   EntityGiantZombie creeper = (EntityGiantZombie) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Magmacube
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntityGiantZombie) 
		   { 
			   EntityGiantZombie creeper = (EntityGiantZombie) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  }
	
	
	//============================PASSIVE==============================
	
	//Bat
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	
	//Chicken
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Cow
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Pig
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Sheep
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;
   
		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Squid
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Snowman
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//==== PAGE THREE!!! ===================================================================================

	//Wolf
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Ocelot
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	
	
	
	
	//Villager
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Mooshroom
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	
	//Horse
	if (event.source.getEntity() instanceof EntityPlayer) 
	{ 
		   if (event.entityLiving instanceof EntitySlime) 
		   { 
			   EntitySlime creeper = (EntitySlime) event.entityLiving;
		        EntityPlayer player = (EntityPlayer) event.source.getEntity(); 

		        mobsKilled = mobsKilled + 1;

		        player.addStat(AchievExtrem.Slay_ONE_Creeper,1); 
		   }
		  } 
	}
}
		

			

		
	
	
	


