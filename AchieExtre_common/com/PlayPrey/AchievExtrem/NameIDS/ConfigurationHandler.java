package com.PlayPrey.AchievExtrem.NameIDS;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;

import com.PlayPrey.AchievExtrem.NameIDS.AchievementIds;
import com.PlayPrey.AchievExtrem.NameIDS.AchievementName;
import com.PlayPrey.AchievExtrem.NameIDS.AchievementDescription;


import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler 
{

	static Configuration config = new Configuration();

	public static void init(File file)
	{

		config = new Configuration(file);
		
		try
		{
			config.load();
			//Mine Once ==========================================================================================================================================================================
			AchievementIds.GetWoodID = config.get(config.CATEGORY_GENERAL, "GetWood", AchievementIds.GetWoodID_Default).getInt(AchievementIds.GetWoodID_Default);
			AchievementIds.GetDirtID = config.get(config.CATEGORY_GENERAL, "GetDirt", AchievementIds.GetDirtID_Default).getInt(AchievementIds.GetDirtID_Default);
			AchievementIds.GetCobblestoneID = config.get(config.CATEGORY_GENERAL, "GetCobblestone", AchievementIds.GetCobblestoneID_Default).getInt(AchievementIds.GetCobblestoneID_Default);
			AchievementIds.GetCoalOreID = config.get(config.CATEGORY_GENERAL, "GetCoalOre", AchievementIds.GetCoalOreID_Default).getInt(AchievementIds.GetCoalOreID_Default);
			AchievementIds.GetIronOreID = config.get(config.CATEGORY_GENERAL, "GetIronOre", AchievementIds.GetIronOreID_Default).getInt(AchievementIds.GetIronOreID_Default);
			AchievementIds.GetGoldOreID = config.get(config.CATEGORY_GENERAL, "GetGoldOre", AchievementIds.GetGoldOreID_Default).getInt(AchievementIds.GetGoldOreID_Default);
			AchievementIds.GetDiamondOreID = config.get(config.CATEGORY_GENERAL, "GetDiamondOre", AchievementIds.GetDiamondOreID_Default).getInt(AchievementIds.GetDiamondOreID_Default);
			AchievementIds.GetObsidianID = config.get(config.CATEGORY_GENERAL, "GetObsidian", AchievementIds.GetObsidianID_Default).getInt(AchievementIds.GetObsidianID_Default);
			AchievementIds.GetGravelID= config.get(config.CATEGORY_GENERAL, "GetGravel", AchievementIds.GetGravelID_Default).getInt(AchievementIds.GetGravelID_Default);
			AchievementIds.GetNetherrackID = config.get(config.CATEGORY_GENERAL, "GetNetherrack", AchievementIds.GetNetherrackID_Default).getInt(AchievementIds.GetNetherrackID_Default);
			AchievementIds.GetNetherquartID = config.get(config.CATEGORY_GENERAL, "GetNetherquart", AchievementIds.GetNetherquartID_Default).getInt(AchievementIds.GetNetherquartID_Default);
			AchievementIds.GetNetherbrickID = config.get(config.CATEGORY_GENERAL, "GetNetherbrick", AchievementIds.GetNetherbrickID_Default).getInt(AchievementIds.GetNetherbrickID_Default);
			AchievementIds.GetNetherfenceID = config.get(config.CATEGORY_GENERAL, "GetNetherfence", AchievementIds.GetNetherfenceID_Default).getInt(AchievementIds.GetNetherfenceID_Default);
			AchievementIds.GetNetherstairID = config.get(config.CATEGORY_GENERAL, "GetNetherstair", AchievementIds.GetNetherstairID_Default).getInt(AchievementIds.GetNetherstairID_Default);
			AchievementIds.GetNetherwartID = config.get(config.CATEGORY_GENERAL, "GetNetherwart", AchievementIds.GetNetherwartID_Default).getInt(AchievementIds.GetNetherwartID_Default);
			//Craft Once ==========================================================================================================================================================================
			AchievementIds.CraftWoodenPlanksID = config.get(config.CATEGORY_GENERAL, "CraftWoodenPlanks", AchievementIds.CraftWoodenPlanksID_Default).getInt(AchievementIds.CraftWoodenPlanksID_Default);
			AchievementIds.CraftSticksID = config.get(config.CATEGORY_GENERAL, "CraftSticks", AchievementIds.CraftSticksID_Default).getInt(AchievementIds.CraftSticksID_Default);
			AchievementIds.CraftWoodenPickaxeID = config.get(config.CATEGORY_GENERAL, "CraftWoodenPickaxe", AchievementIds.CraftWoodenPickaxeID_Default).getInt(AchievementIds.CraftWoodenPickaxeID_Default);
			AchievementIds.CraftWoodenAxeID = config.get(config.CATEGORY_GENERAL, "CraftWoodenAxe", AchievementIds.CraftWoodenAxeID_Default).getInt(AchievementIds.CraftWoodenAxeID_Default);
			AchievementIds.CraftWoodenShovelID = config.get(config.CATEGORY_GENERAL, "CraftWoodenShovel", AchievementIds.CraftWoodenShovelID_Default).getInt(AchievementIds.CraftWoodenShovelID_Default);
			AchievementIds.CraftWoodenHoeID = config.get(config.CATEGORY_GENERAL, "CraftWoodenHoe", AchievementIds.CraftWoodenHoeID_Default).getInt(AchievementIds.CraftWoodenHoeID_Default);
			AchievementIds.CraftWoodenSwordID = config.get(config.CATEGORY_GENERAL, "CraftWoodenSword", AchievementIds.CraftWoodenSwordID_Default).getInt(AchievementIds.CraftWoodenSwordID_Default);
			AchievementIds.CraftTorchID = config.get(config.CATEGORY_GENERAL, "CraftTorch", AchievementIds.CraftTorchID_Default).getInt(AchievementIds.CraftTorchID_Default);
			//Slayer==================================================================================================================================================================================
			AchievementIds.Slay_One_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Creeper", AchievementIds.Slay_One_CreeperDefault).getInt(AchievementIds.Slay_One_CreeperDefault);
			AchievementIds.Slay_Five_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Creeper", AchievementIds.Slay_Five_CreeperDefault).getInt(AchievementIds.Slay_Five_CreeperDefault);
			AchievementIds.Slay_Ten_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Creeper", AchievementIds.Slay_Ten_CreeperDefault).getInt(AchievementIds.Slay_Ten_CreeperDefault);
			AchievementIds.Slay_Twentyfive_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Creeper", AchievementIds.Slay_Twentyfive_CreeperDefault).getInt(AchievementIds.Slay_Twentyfive_CreeperDefault);
			AchievementIds.Slay_Fifty_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Creeper", AchievementIds.Slay_Fifty_CreeperDefault).getInt(AchievementIds.Slay_Fifty_CreeperDefault);
			AchievementIds.Slay_Seventyfive_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Creeper", AchievementIds.Slay_Seventyfive_CreeperDefault).getInt(AchievementIds.Slay_Seventyfive_CreeperDefault);
			AchievementIds.Slay_Houndred_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Creeper", AchievementIds.Slay_Houndred_CreeperDefault).getInt(AchievementIds.Slay_Houndred_CreeperDefault);
			AchievementIds.Slay_HoundredandFifty_CreeperID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Creeper", AchievementIds.Slay_HoundredandFifty_CreeperDefault).getInt(AchievementIds.Slay_HoundredandFifty_CreeperDefault);
			AchievementIds.Slay_One_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Skeleton", AchievementIds.Slay_One_SkeletonDefault).getInt(AchievementIds.Slay_One_SkeletonDefault);
			AchievementIds.Slay_Five_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Skeleton", AchievementIds.Slay_Five_SkeletonDefault).getInt(AchievementIds.Slay_Five_SkeletonDefault);
			AchievementIds.Slay_Ten_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Skeleton", AchievementIds.Slay_Ten_SkeletonDefault).getInt(AchievementIds.Slay_Ten_SkeletonDefault);
			AchievementIds.Slay_Twentyfive_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Skeleton", AchievementIds.Slay_Twentyfive_SkeletonDefault).getInt(AchievementIds.Slay_Twentyfive_SkeletonDefault);
			AchievementIds.Slay_Fifty_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Skeleton", AchievementIds.Slay_Fifty_SkeletonDefault).getInt(AchievementIds.Slay_Fifty_SkeletonDefault);
			AchievementIds.Slay_Seventyfive_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Skeleton", AchievementIds.Slay_Seventyfive_SkeletonDefault).getInt(AchievementIds.Slay_Seventyfive_SkeletonDefault);
			AchievementIds.Slay_Houndred_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Skeleton", AchievementIds.Slay_Houndred_SkeletonDefault).getInt(AchievementIds.Slay_Houndred_SkeletonDefault);
			AchievementIds.Slay_HoundredandFifty_SkeletonID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Skeleton", AchievementIds.Slay_HoundredandFifty_SkeletonDefault).getInt(AchievementIds.Slay_HoundredandFifty_SkeletonDefault);
			AchievementIds.Slay_One_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Zombie", AchievementIds.Slay_One_ZombieDefault).getInt(AchievementIds.Slay_One_ZombieDefault);
			AchievementIds.Slay_Five_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Zombie", AchievementIds.Slay_Five_ZombieDefault).getInt(AchievementIds.Slay_Five_ZombieDefault);
			AchievementIds.Slay_Ten_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Zombie", AchievementIds.Slay_Ten_ZombieDefault).getInt(AchievementIds.Slay_Ten_ZombieDefault);
			AchievementIds.Slay_Twentyfive_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Zombie", AchievementIds.Slay_Twentyfive_ZombieDefault).getInt(AchievementIds.Slay_Twentyfive_ZombieDefault);
			AchievementIds.Slay_Fifty_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Zombie", AchievementIds.Slay_Fifty_ZombieDefault).getInt(AchievementIds.Slay_Fifty_ZombieDefault);
			AchievementIds.Slay_Seventyfive_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Zombie", AchievementIds.Slay_Seventyfive_ZombieDefault).getInt(AchievementIds.Slay_Seventyfive_ZombieDefault);
			AchievementIds.Slay_Houndred_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Zombie", AchievementIds.Slay_Houndred_ZombieDefault).getInt(AchievementIds.Slay_Houndred_ZombieDefault);
			AchievementIds.Slay_HoundredandFifty_ZombieID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Zombie", AchievementIds.Slay_HoundredandFifty_ZombieDefault).getInt(AchievementIds.Slay_HoundredandFifty_ZombieDefault);
			AchievementIds.Slay_One_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Spider", AchievementIds.Slay_One_SpiderDefault).getInt(AchievementIds.Slay_One_SpiderDefault);
			AchievementIds.Slay_Five_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Spider", AchievementIds.Slay_Five_SpiderDefault).getInt(AchievementIds.Slay_Five_SpiderDefault);
			AchievementIds.Slay_Ten_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Spider", AchievementIds.Slay_Ten_SpiderDefault).getInt(AchievementIds.Slay_Ten_SpiderDefault);
			AchievementIds.Slay_Twentyfive_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Spider", AchievementIds.Slay_Twentyfive_SpiderDefault).getInt(AchievementIds.Slay_Twentyfive_SpiderDefault);
			AchievementIds.Slay_Fifty_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Spider", AchievementIds.Slay_Fifty_SpiderDefault).getInt(AchievementIds.Slay_Fifty_SpiderDefault);
			AchievementIds.Slay_Seventyfive_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Spider", AchievementIds.Slay_Seventyfive_SpiderDefault).getInt(AchievementIds.Slay_Seventyfive_SpiderDefault);
			AchievementIds.Slay_Houndred_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Spider", AchievementIds.Slay_Houndred_SpiderDefault).getInt(AchievementIds.Slay_Houndred_SpiderDefault);
			AchievementIds.Slay_HoundredandFifty_SpiderID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Spider", AchievementIds.Slay_HoundredandFifty_SpiderDefault).getInt(AchievementIds.Slay_HoundredandFifty_SpiderDefault);
			AchievementIds.Slay_One_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Enderman", AchievementIds.Slay_One_EndermanDefault).getInt(AchievementIds.Slay_One_EndermanDefault);
			AchievementIds.Slay_Five_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Enderman", AchievementIds.Slay_Five_EndermanDefault).getInt(AchievementIds.Slay_Five_EndermanDefault);
			AchievementIds.Slay_Ten_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Enderman", AchievementIds.Slay_Ten_EndermanDefault).getInt(AchievementIds.Slay_Ten_EndermanDefault);
			AchievementIds.Slay_Twentyfive_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Enderman", AchievementIds.Slay_Twentyfive_EndermanDefault).getInt(AchievementIds.Slay_Twentyfive_EndermanDefault);
			AchievementIds.Slay_Fifty_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Enderman", AchievementIds.Slay_Fifty_EndermanDefault).getInt(AchievementIds.Slay_Fifty_EndermanDefault);
			AchievementIds.Slay_Seventyfive_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Enderman", AchievementIds.Slay_Seventyfive_EndermanDefault).getInt(AchievementIds.Slay_Seventyfive_EndermanDefault);
			AchievementIds.Slay_Houndred_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Enderman", AchievementIds.Slay_Houndred_EndermanDefault).getInt(AchievementIds.Slay_Houndred_EndermanDefault);
			AchievementIds.Slay_HoundredandFifty_EndermanID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Enderman", AchievementIds.Slay_HoundredandFifty_EndermanDefault).getInt(AchievementIds.Slay_HoundredandFifty_EndermanDefault);
			AchievementIds.Slay_One_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_PlayerMP", AchievementIds.Slay_One_PlayerMPDefault).getInt(AchievementIds.Slay_One_PlayerMPDefault);
			AchievementIds.Slay_Five_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_PlayerMP", AchievementIds.Slay_Five_PlayerMPDefault).getInt(AchievementIds.Slay_Five_PlayerMPDefault);
			AchievementIds.Slay_Ten_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_PlayerMP", AchievementIds.Slay_Ten_PlayerMPDefault).getInt(AchievementIds.Slay_Ten_PlayerMPDefault);
			AchievementIds.Slay_Twentyfive_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_PlayerMP", AchievementIds.Slay_Twentyfive_PlayerMPDefault).getInt(AchievementIds.Slay_Twentyfive_PlayerMPDefault);
			AchievementIds.Slay_Fifty_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_PlayerMP", AchievementIds.Slay_Fifty_PlayerMPDefault).getInt(AchievementIds.Slay_Fifty_PlayerMPDefault);
			AchievementIds.Slay_Seventyfive_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_PlayerMP", AchievementIds.Slay_Seventyfive_PlayerMPDefault).getInt(AchievementIds.Slay_Seventyfive_PlayerMPDefault);
			AchievementIds.Slay_Houndred_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_PlayerMP", AchievementIds.Slay_Houndred_PlayerMPDefault).getInt(AchievementIds.Slay_Houndred_PlayerMPDefault);
			AchievementIds.Slay_HoundredandFifty_PlayerMPID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_PlayerMP", AchievementIds.Slay_HoundredandFifty_PlayerMPDefault).getInt(AchievementIds.Slay_HoundredandFifty_PlayerMPDefault);
			AchievementIds.Slay_One_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Slime", AchievementIds.Slay_One_SlimeDefault).getInt(AchievementIds.Slay_One_SlimeDefault);
			AchievementIds.Slay_Five_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Slime", AchievementIds.Slay_Five_SlimeDefault).getInt(AchievementIds.Slay_Five_SlimeDefault);
			AchievementIds.Slay_Ten_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Slime", AchievementIds.Slay_Ten_SlimeDefault).getInt(AchievementIds.Slay_Ten_SlimeDefault);
			AchievementIds.Slay_Twentyfive_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Slime", AchievementIds.Slay_Twentyfive_SlimeDefault).getInt(AchievementIds.Slay_Twentyfive_SlimeDefault);
			AchievementIds.Slay_Fifty_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Slime", AchievementIds.Slay_Fifty_SlimeDefault).getInt(AchievementIds.Slay_Fifty_SlimeDefault);
			AchievementIds.Slay_Seventyfive_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Slime", AchievementIds.Slay_Seventyfive_SlimeDefault).getInt(AchievementIds.Slay_Seventyfive_SlimeDefault);
			AchievementIds.Slay_Houndred_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Slime", AchievementIds.Slay_Houndred_SlimeDefault).getInt(AchievementIds.Slay_Houndred_SlimeDefault);
			AchievementIds.Slay_HoundredandFifty_SlimeID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Slime", AchievementIds.Slay_HoundredandFifty_SlimeDefault).getInt(AchievementIds.Slay_HoundredandFifty_SlimeDefault);
			AchievementIds.Slay_One_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Blaze", AchievementIds.Slay_One_BlazeDefault).getInt(AchievementIds.Slay_One_BlazeDefault);
			AchievementIds.Slay_Five_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Blaze", AchievementIds.Slay_Five_BlazeDefault).getInt(AchievementIds.Slay_Five_BlazeDefault);
			AchievementIds.Slay_Ten_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Blaze", AchievementIds.Slay_Ten_BlazeDefault).getInt(AchievementIds.Slay_Ten_BlazeDefault);
			AchievementIds.Slay_Twentyfive_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Blaze", AchievementIds.Slay_Twentyfive_BlazeDefault).getInt(AchievementIds.Slay_Twentyfive_BlazeDefault);
			AchievementIds.Slay_Fifty_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Blaze", AchievementIds.Slay_Fifty_BlazeDefault).getInt(AchievementIds.Slay_Fifty_BlazeDefault);
			AchievementIds.Slay_Seventyfive_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Blaze", AchievementIds.Slay_Seventyfive_BlazeDefault).getInt(AchievementIds.Slay_Seventyfive_BlazeDefault);
			AchievementIds.Slay_Houndred_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Blaze", AchievementIds.Slay_Houndred_BlazeDefault).getInt(AchievementIds.Slay_Houndred_BlazeDefault);
			AchievementIds.Slay_HoundredandFifty_BlazeID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Blaze", AchievementIds.Slay_HoundredandFifty_BlazeDefault).getInt(AchievementIds.Slay_HoundredandFifty_BlazeDefault);
			AchievementIds.Slay_One_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_Ghast", AchievementIds.Slay_One_GhastDefault).getInt(AchievementIds.Slay_One_GhastDefault);
			AchievementIds.Slay_Five_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_Ghast", AchievementIds.Slay_Five_GhastDefault).getInt(AchievementIds.Slay_Five_GhastDefault);
			AchievementIds.Slay_Ten_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_Ghast", AchievementIds.Slay_Ten_GhastDefault).getInt(AchievementIds.Slay_Ten_GhastDefault);
			AchievementIds.Slay_Twentyfive_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_Ghast", AchievementIds.Slay_Twentyfive_GhastDefault).getInt(AchievementIds.Slay_Twentyfive_GhastDefault);
			AchievementIds.Slay_Fifty_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_Ghast", AchievementIds.Slay_Fifty_GhastDefault).getInt(AchievementIds.Slay_Fifty_GhastDefault);
			AchievementIds.Slay_Seventyfive_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_Ghast", AchievementIds.Slay_Seventyfive_GhastDefault).getInt(AchievementIds.Slay_Seventyfive_GhastDefault);
			AchievementIds.Slay_Houndred_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_Ghast", AchievementIds.Slay_Houndred_GhastDefault).getInt(AchievementIds.Slay_Houndred_GhastDefault);
			AchievementIds.Slay_HoundredandFifty_GhastID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_Ghast", AchievementIds.Slay_HoundredandFifty_GhastDefault).getInt(AchievementIds.Slay_HoundredandFifty_GhastDefault);
			AchievementIds.Slay_One_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_ONE_CaveSpider", AchievementIds.Slay_One_CaveSpiderDefault).getInt(AchievementIds.Slay_One_CaveSpiderDefault);
			AchievementIds.Slay_Five_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_FIVE_CaveSpider", AchievementIds.Slay_Five_CaveSpiderDefault).getInt(AchievementIds.Slay_Five_CaveSpiderDefault);
			AchievementIds.Slay_Ten_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_TEN_CaveSpider", AchievementIds.Slay_Ten_CaveSpiderDefault).getInt(AchievementIds.Slay_Ten_CaveSpiderDefault);
			AchievementIds.Slay_Twentyfive_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_TWENTYFIVE_CaveSpider", AchievementIds.Slay_Twentyfive_CaveSpiderDefault).getInt(AchievementIds.Slay_Twentyfive_CaveSpiderDefault);
			AchievementIds.Slay_Fifty_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_FIFTY_CaveSpider", AchievementIds.Slay_Fifty_CaveSpiderDefault).getInt(AchievementIds.Slay_Fifty_CaveSpiderDefault);
			AchievementIds.Slay_Seventyfive_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_SEVENTYFIVE_CaveSpider", AchievementIds.Slay_Seventyfive_CaveSpiderDefault).getInt(AchievementIds.Slay_Seventyfive_CaveSpiderDefault);
			AchievementIds.Slay_Houndred_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDRED_CaveSpider", AchievementIds.Slay_Houndred_CaveSpiderDefault).getInt(AchievementIds.Slay_Houndred_CaveSpiderDefault);
			AchievementIds.Slay_HoundredandFifty_CaveSpiderID = config.get(config.CATEGORY_GENERAL, "Slay_HOUNDREDANDFIFTY_CaveSpider", AchievementIds.Slay_HoundredandFifty_CaveSpiderDefault).getInt(AchievementIds.Slay_HoundredandFifty_CaveSpiderDefault);
			//SLAY MISC===================================================================================================================================================================================================================================================
			AchievementIds.SlayMisc_MeatAnimalID = config.get(config.CATEGORY_GENERAL, "SlayMisc_MeatAnimal", AchievementIds.SlayMisc_MeatAnimalDefault).getInt(AchievementIds.SlayMisc_MeatAnimalDefault);
			AchievementIds.SlayMisc_AllKindsOfMobsDownID = config.get(config.CATEGORY_GENERAL, "SlayMisc_AllKindsOfMobsDown", AchievementIds.SlayMisc_AllKindsOfMobsDownDefault).getInt(AchievementIds.SlayMisc_AllKindsOfMobsDownDefault);
			

		}

		catch(Exception e)
		{

			FMLLog.log(Level.SEVERE, e, ModInformation.MODID + ModInformation.VERSION + " has trouble loading the config, please don't modify the config unless you know what you are doing.");
		}

		finally
		{

			config.save();
		}
	}
}