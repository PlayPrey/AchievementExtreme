package com.PlayPrey.AchievExtrem;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.MinecraftForge;

import com.PlayPrey.AchievExtrem.Command.CommandResetMod;
import com.PlayPrey.AchievExtrem.Handler.CraftingHandler;
import com.PlayPrey.AchievExtrem.Handler.EntityLivingHandler;
import com.PlayPrey.AchievExtrem.Handler.EntityLivingHandlerMobSlayerMisc;
import com.PlayPrey.AchievExtrem.Handler.PickupHandler;
import com.PlayPrey.AchievExtrem.NameIDS.AchievementDescription;
import com.PlayPrey.AchievExtrem.NameIDS.AchievementIds;
import com.PlayPrey.AchievExtrem.NameIDS.AchievementName;
import com.PlayPrey.AchievExtrem.NameIDS.ConfigurationHandler;
import com.PlayPrey.AchievExtrem.NameIDS.ModInformation;
import com.PlayPrey.AchievExtrem.Proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( name = ModInformation.MODNAME, modid = ModInformation.MODID , version = ModInformation.VERSION)
@NetworkMod( clientSideRequired = true, serverSideRequired = false)
public class AchievExtrem 
{
	
	//Mine Once
	public static Achievement DigWood;
	public static Achievement DigDirt;
	public static Achievement DigStone;
	public static Achievement DigCoalOre;
	public static Achievement DigIronOre;
	public static Achievement DigGoldOre;
	public static Achievement DigDiamondOre;
	public static Achievement DigObsidian;
	public static Achievement DigGravel;
	public static Achievement DigNetherrack;
	public static Achievement DigQuartOre;
	public static Achievement DigNetherBrick;
	public static Achievement DigNetherFence;
	public static Achievement DigNetherStair;
	public static Achievement DigNetherWart;
	
	//Craft Once
	public static Achievement CraftWoodenPlanks;
	public static Achievement CraftSticks;
	public static Achievement CraftWoodenPickaxe;
	public static Achievement CraftWoodenAxe;
	public static Achievement CraftWoodenShovel;
	public static Achievement CraftWoodenHoe;
	public static Achievement CraftWoodenSword;
	public static Achievement CraftTorch;
	//Slayer
	public static Achievement Slay_ONE_Creeper;
	public static Achievement Slay_FIVE_Creeper;
	public static Achievement Slay_TEN_Creeper;
	public static Achievement Slay_TWENTYFIVE_Creeper;
	public static Achievement Slay_FIFTY_Creeper;
	public static Achievement Slay_SEVENTYFIVE_Creeper;
	public static Achievement Slay_HOUNDRED_Creeper;
	public static Achievement Slay_HOUNDREDANDFIFTY_Creeper;
	
	public static Achievement Slay_ONE_Skeleton;
	public static Achievement Slay_FIVE_Skeleton;
	public static Achievement Slay_TEN_Skeleton;
	public static Achievement Slay_TWENTYFIVE_Skeleton;
	public static Achievement Slay_FIFTY_Skeleton;
	public static Achievement Slay_SEVENTYFIVE_Skeleton;
	public static Achievement Slay_HOUNDRED_Skeleton;
	public static Achievement Slay_HOUNDREDANDFIFTY_Skeleton;
	
	public static Achievement Slay_ONE_Zombie;
	public static Achievement Slay_FIVE_Zombie;
	public static Achievement Slay_TEN_Zombie;
	public static Achievement Slay_TWENTYFIVE_Zombie;
	public static Achievement Slay_FIFTY_Zombie;
	public static Achievement Slay_SEVENTYFIVE_Zombie;
	public static Achievement Slay_HOUNDRED_Zombie;
	public static Achievement Slay_HOUNDREDANDFIFTY_Zombie;
	
	public static Achievement Slay_ONE_Spider;
	public static Achievement Slay_FIVE_Spider;
	public static Achievement Slay_TEN_Spider;
	public static Achievement Slay_TWENTYFIVE_Spider;
	public static Achievement Slay_FIFTY_Spider;
	public static Achievement Slay_SEVENTYFIVE_Spider;
	public static Achievement Slay_HOUNDRED_Spider;
	public static Achievement Slay_HOUNDREDANDFIFTY_Spider;
	
	public static Achievement Slay_ONE_Enderman;
	public static Achievement Slay_FIVE_Enderman;
	public static Achievement Slay_TEN_Enderman;
	public static Achievement Slay_TWENTYFIVE_Enderman;
	public static Achievement Slay_FIFTY_Enderman;
	public static Achievement Slay_SEVENTYFIVE_Enderman;
	public static Achievement Slay_HOUNDRED_Enderman;
	public static Achievement Slay_HOUNDREDANDFIFTY_Enderman;
	
	public static Achievement Slay_ONE_PlayerMP;
	public static Achievement Slay_FIVE_PlayerMP;
	public static Achievement Slay_TEN_PlayerMP;
	public static Achievement Slay_TWENTYFIVE_PlayerMP;
	public static Achievement Slay_FIFTY_PlayerMP;
	public static Achievement Slay_SEVENTYFIVE_PlayerMP;
	public static Achievement Slay_HOUNDRED_PlayerMP;
	public static Achievement Slay_HOUNDREDANDFIFTY_PlayerMP;
	
	public static Achievement Slay_ONE_Slime;
	public static Achievement Slay_FIVE_Slime;
	public static Achievement Slay_TEN_Slime;
	public static Achievement Slay_TWENTYFIVE_Slime;
	public static Achievement Slay_FIFTY_Slime;
	public static Achievement Slay_SEVENTYFIVE_Slime;
	public static Achievement Slay_HOUNDRED_Slime;
	public static Achievement Slay_HOUNDREDANDFIFTY_Slime;
	
	public static Achievement Slay_ONE_Blaze;
	public static Achievement Slay_FIVE_Blaze;
	public static Achievement Slay_TEN_Blaze;
	public static Achievement Slay_TWENTYFIVE_Blaze;
	public static Achievement Slay_FIFTY_Blaze;
	public static Achievement Slay_SEVENTYFIVE_Blaze;
	public static Achievement Slay_HOUNDRED_Blaze;
	public static Achievement Slay_HOUNDREDANDFIFTY_Blaze;
	
	public static Achievement Slay_ONE_Ghast;
	public static Achievement Slay_FIVE_Ghast;
	public static Achievement Slay_TEN_Ghast;
	public static Achievement Slay_TWENTYFIVE_Ghast;
	public static Achievement Slay_FIFTY_Ghast;
	public static Achievement Slay_SEVENTYFIVE_Ghast;
	public static Achievement Slay_HOUNDRED_Ghast;
	public static Achievement Slay_HOUNDREDANDFIFTY_Ghast;
	
	public static Achievement Slay_ONE_CaveSpider;
	public static Achievement Slay_FIVE_CaveSpider;
	public static Achievement Slay_TEN_CaveSpider;
	public static Achievement Slay_TWENTYFIVE_CaveSpider;
	public static Achievement Slay_FIFTY_CaveSpider;
	public static Achievement Slay_SEVENTYFIVE_CaveSpider;
	public static Achievement Slay_HOUNDRED_CaveSpider;
	public static Achievement Slay_HOUNDREDANDFIFTY_CaveSpider;
	
	public static Achievement SlayMisc_MeatAnimal;
	public static Achievement SlayMisc_AllKindsOfMobsDown;
	
	
	public static AchievementPage MineOncePage;
	public static AchievementPage CraftOncePage;
	public static AchievementPage SlayerPage;
	public static AchievementPage FrostPage;
	public static AchievementPage SlayerMiscPage;



@SidedProxy( clientSide = ModInformation.CLIENT_PROXY_LOCATION, serverSide = ModInformation.COMMON_PROXY_LOCATION)

public static CommonProxy proxy;

@EventHandler
public void preInit(FMLPreInitializationEvent event)
{
ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath()+ File.separator + ModInformation.MODID + File.separator + ModInformation.MODID + ".cfg"));


}
@EventHandler
public void init(FMLInitializationEvent event)
{

	MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
	MinecraftForge.EVENT_BUS.register(new EntityLivingHandlerMobSlayerMisc());

}
@EventHandler
public void postInit(FMLPostInitializationEvent event)
{

}



@EventHandler
public void load(FMLInitializationEvent event)
{
	//Mine Once
	DigWood = new Achievement(AchievementIds.GetWoodID, "GetWood", -5, -5, new ItemStack (Block.wood,1,1) , null).registerAchievement();
	this.addAchievementName("GetWood", AchievementName.Wood);
	this.addAchievementDesc("GetWood", AchievementDescription.Wood);
	DigDirt = new Achievement(AchievementIds.GetDirtID, "DigDirt", -4, -5, Block.dirt, DigWood).registerAchievement();
	this.addAchievementName("DigDirt", AchievementName.GetDirt);
	this.addAchievementDesc("DigDirt", AchievementDescription.GetDirt);
	DigStone = new Achievement(AchievementIds.GetCobblestoneID, "DigStone", -3, -5, Block.cobblestone, DigDirt).registerAchievement();
	this.addAchievementName("DigStone", AchievementName.GetCobblestone);
	this.addAchievementDesc("DigStone", AchievementDescription.GetCobblestone);
	DigCoalOre = new Achievement(AchievementIds.GetCoalOreID, "DigCoalOre", -2, -5, Block.oreCoal, DigStone).registerAchievement();
	this.addAchievementName("DigCoalOre", AchievementName.GetCoalOre);
	this.addAchievementDesc("DigCoalOre", AchievementDescription.GetCoalOre);
	DigIronOre = new Achievement(AchievementIds.GetIronOreID, "DigIronOre", -1, -5, Block.oreIron, DigCoalOre).registerAchievement();
	this.addAchievementName("DigIronOre", AchievementName.GetIronOre);
	this.addAchievementDesc("DigIronOre", AchievementDescription.GetIronOre);
	DigGoldOre = new Achievement(AchievementIds.GetGoldOreID, "DigGoldOre", 0, -5, Block.oreGold, DigIronOre).registerAchievement();
	this.addAchievementName("DigGoldOre", AchievementName.GetGoldOre);
	this.addAchievementDesc("DigGoldOre", AchievementDescription.GetGoldOre);
	DigDiamondOre = new Achievement(AchievementIds.GetDiamondOreID, "DigDiamondOre", 1, -5, Block.oreDiamond, DigGoldOre).registerAchievement();
	this.addAchievementName("DigDiamondOre", AchievementName.GetDiamondOre);
	this.addAchievementDesc("DigDiamondOre", AchievementDescription.GetDiamondOre);
	DigObsidian = new Achievement(AchievementIds.GetObsidianID, "DigObsidian", 2, -5, Block.obsidian, DigDiamondOre).registerAchievement();
	this.addAchievementName("DigObsidian", AchievementName.GetObsidian);
	this.addAchievementDesc("DigObsidian", AchievementDescription.GetObsidian);
	DigGravel = new Achievement(AchievementIds.GetGravelID, "DigGravel", 3, -5, Block.gravel, DigObsidian).registerAchievement();
	this.addAchievementName("DigGravel", AchievementName.GetGravel);
	this.addAchievementDesc("DigGravel", AchievementDescription.GetGravel);
	DigNetherrack = new Achievement(AchievementIds.GetNetherrackID, "DigNetherrack", 4, -5, Block.netherrack, DigGravel).registerAchievement();
	this.addAchievementName("DigNetherrack", AchievementName.GetNetherrack);
	this.addAchievementDesc("DigNetherrack", AchievementDescription.GetNetherrack);
	DigQuartOre = new Achievement(AchievementIds.GetNetherquartID, "DigQuartOre", 5, -5, Block.oreNetherQuartz, DigNetherrack).registerAchievement();
	this.addAchievementName("DigQuartOre", AchievementName.GetNetherQuartz);
	this.addAchievementDesc("DigQuartOre", AchievementDescription.GetNetherQuartz);
	DigNetherBrick = new Achievement(AchievementIds.GetNetherbrickID, "DigNetherBrick", 6, -5, Block.netherBrick, DigQuartOre).registerAchievement();
	this.addAchievementName("DigNetherBrick", AchievementName.GetNetherBrick);
	this.addAchievementDesc("DigNetherBrick", AchievementDescription.GetNetherBrick);
	DigNetherFence = new Achievement(AchievementIds.GetNetherfenceID, "DigNetherFence", 7, -5, Block.netherFence, DigNetherBrick).registerAchievement();
	this.addAchievementName("DigNetherFence", AchievementName.GetNetherFence);
	this.addAchievementDesc("DigNetherFence", AchievementDescription.GetNetherFence);
	DigNetherStair = new Achievement(AchievementIds.GetNetherstairID, "DigNetherStair", 8, -5, Block.stairsNetherBrick, DigNetherFence).registerAchievement();
	this.addAchievementName("DigNetherStair", AchievementName.GetNetherStair);
	this.addAchievementDesc("DigNetherStair", AchievementDescription.GetNetherStair);
	DigNetherWart = new Achievement(AchievementIds.GetNetherwartID, "DigNetherWart", 9, -5, Block.netherStalk, DigNetherStair).registerAchievement();
	this.addAchievementName("DigNetherWart", AchievementName.GetNetherWarts);
	this.addAchievementDesc("DigNetherWart", AchievementDescription.GetNetherWarts);
	
	
	
	
	
	
	
	//Craft Once
	CraftWoodenPlanks = new Achievement(AchievementIds.CraftWoodenPlanksID, "CraftWoodenPlanks", -5, -5, Block.planks, null).registerAchievement();
	this.addAchievementName("CraftWoodenPlanks", AchievementName.CraftWoodenPlanks);
	this.addAchievementDesc("CraftWoodenPlanks", AchievementDescription.CraftWoodenPlanks);
	CraftSticks = new Achievement(AchievementIds.CraftSticksID, "CraftSticks", -4, -5, Item.stick, CraftWoodenPlanks).registerAchievement();
	this.addAchievementName("CraftSticks", AchievementName.CraftSticks);
	this.addAchievementDesc("CraftSticks", AchievementDescription.CraftSticks);
	CraftWoodenPickaxe = new Achievement(AchievementIds.CraftWoodenPickaxeID, "CraftWoodenPickaxe", -3, -5, Item.pickaxeWood, CraftSticks).registerAchievement();
	this.addAchievementName("CraftWoodenPickaxe", AchievementName.CraftWoodenPickaxe);
	this.addAchievementDesc("CraftWoodenPickaxe", AchievementDescription.CraftWoodenPickaxe);
	CraftWoodenAxe = new Achievement(AchievementIds.CraftWoodenAxeID, "CraftWoodenAxe", -2, -5, Item.axeWood, CraftWoodenPickaxe).registerAchievement();
	this.addAchievementName("CraftWoodenAxe", AchievementName.CraftWoodenAxe);
	this.addAchievementDesc("CraftWoodenAxe", AchievementDescription.CraftWoodenAxe);
	CraftWoodenShovel = new Achievement(AchievementIds.CraftWoodenShovelID, "CraftWoodenShovel", -1, -5, Item.shovelWood, CraftWoodenAxe).registerAchievement();
	this.addAchievementName("CraftWoodenShovel", AchievementName.CraftWoodenShovel);
	this.addAchievementDesc("CraftWoodenShovel", AchievementDescription.CraftWoodenShovel);
	CraftWoodenHoe = new Achievement(AchievementIds.CraftWoodenHoeID, "CraftWoodenHoe", 0, -5, Item.hoeWood, CraftWoodenShovel).registerAchievement();
	this.addAchievementName("CraftWoodenHoe", AchievementName.CraftWoodenHoe);
	this.addAchievementDesc("CraftWoodenHoe", AchievementDescription.CraftWoodenHoe);
	CraftWoodenSword = new Achievement(AchievementIds.CraftWoodenSwordID, "CraftWoodenSword", 1, -5, Item.swordWood, CraftWoodenHoe).registerAchievement();
	this.addAchievementName("CraftWoodenSword", AchievementName.CraftWoodenSword);
	this.addAchievementDesc("CraftWoodenSword", AchievementDescription.CraftWoodenSword);
	CraftTorch = new Achievement(AchievementIds.CraftTorchID, "CraftTorch", 1, -5, Block.torchWood, CraftWoodenSword).registerAchievement();
	this.addAchievementName("CraftTorch", AchievementName.CraftTorch);
	this.addAchievementDesc("CraftTorch", AchievementDescription.CraftTorch);

	
	
	
	
	
	
	
	
	
	
	//Slayer
	Slay_ONE_Creeper = new Achievement(AchievementIds.Slay_One_CreeperID, "Slay_ONE_Creeper", -5, -5,new ItemStack(Item.skull,1,4), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Creeper", AchievementName.Slay_ONE_Creeper);
	this.addAchievementDesc("Slay_ONE_Creeper", AchievementDescription.Slay_ONE_Creeper);
	Slay_FIVE_Creeper = new Achievement(AchievementIds.Slay_Five_CreeperID, "Slay_FIVE_Creeper", -4, -5,new ItemStack(Item.skull,1,4), Slay_ONE_Creeper).registerAchievement();
	this.addAchievementName("Slay_FIVE_Creeper", AchievementName.Slay_FIVE_Creeper);
	this.addAchievementDesc("Slay_FIVE_Creeper", AchievementDescription.Slay_FIVE_Creeper);
	Slay_TEN_Creeper = new Achievement(AchievementIds.Slay_Ten_CreeperID, "Slay_TEN_Creeper", -3, -5,new ItemStack(Item.skull,1,4), Slay_FIVE_Creeper).registerAchievement();
	this.addAchievementName("Slay_TEN_Creeper", AchievementName.Slay_TEN_Creeper);
	this.addAchievementDesc("Slay_TEN_Creeper", AchievementDescription.Slay_TEN_Creeper);
	Slay_TWENTYFIVE_Creeper = new Achievement(AchievementIds.Slay_Twentyfive_CreeperID, "Slay_TWENTYFIVE_Creeper", -2, -5,new ItemStack(Item.skull,1,4), Slay_TEN_Creeper).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Creeper", AchievementName.Slay_TWENTYFIVE_Creeper);
	this.addAchievementDesc("Slay_TWENTYFIVE_Creeper", AchievementDescription.Slay_TWENTYFIVE_Creeper);
	Slay_FIFTY_Creeper = new Achievement(AchievementIds.Slay_Fifty_CreeperID, "Slay_FIFTY_Creeper", -1, -5,new ItemStack(Item.skull,1,4), Slay_TWENTYFIVE_Creeper).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Creeper", AchievementName.Slay_FIFTY_Creeper);
	this.addAchievementDesc("Slay_FIFTY_Creeper", AchievementDescription.Slay_FIFTY_Creeper);
	Slay_SEVENTYFIVE_Creeper = new Achievement(AchievementIds.Slay_Seventyfive_CreeperID, "Slay_SEVENTYFIVE_Creeper", 0, -5,new ItemStack(Item.skull,1,4), Slay_FIFTY_Creeper).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Creeper", AchievementName.Slay_SEVENTYFIVE_Creeper);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Creeper", AchievementDescription.Slay_SEVENTYFIVE_Creeper);
	Slay_HOUNDRED_Creeper = new Achievement(AchievementIds.Slay_Houndred_CreeperID, "Slay_HOUNDRED_Creeper", 1, -5,new ItemStack(Item.skull,1,4), Slay_SEVENTYFIVE_Creeper).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Creeper", AchievementName.Slay_HOUNDRED_Creeper);
	this.addAchievementDesc("Slay_HOUNDRED_Creeper", AchievementDescription.Slay_HOUNDRED_Creeper);
	Slay_HOUNDREDANDFIFTY_Creeper = new Achievement(AchievementIds.Slay_HoundredandFifty_CreeperID, "Slay_HOUNDREDANDFIFTY_Creeper", 2, -5,new ItemStack(Item.skull,1,4), Slay_HOUNDRED_Creeper).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Creeper", AchievementName.Slay_HOUNDREDANDFIFTY_Creeper);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Creeper", AchievementDescription.Slay_HOUNDREDANDFIFTY_Creeper);
	Slay_ONE_Skeleton = new Achievement(AchievementIds.Slay_One_SkeletonID, "Slay_ONE_Skeleton", -5, -4,new ItemStack(Item.skull,1,0), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Skeleton", AchievementName.Slay_ONE_Skeleton);
	this.addAchievementDesc("Slay_ONE_Skeleton", AchievementDescription.Slay_ONE_Skeleton);
	Slay_FIVE_Skeleton = new Achievement(AchievementIds.Slay_Five_SkeletonID, "Slay_FIVE_Skeleton", -4, -4,new ItemStack(Item.skull,1,0), Slay_ONE_Skeleton).registerAchievement();
	this.addAchievementName("Slay_FIVE_Skeleton", AchievementName.Slay_FIVE_Skeleton);
	this.addAchievementDesc("Slay_FIVE_Skeleton", AchievementDescription.Slay_FIVE_Skeleton);
	Slay_TEN_Skeleton = new Achievement(AchievementIds.Slay_Ten_SkeletonID, "Slay_TEN_Skeleton", -3, -4,new ItemStack(Item.skull,1,0), Slay_FIVE_Skeleton).registerAchievement();
	this.addAchievementName("Slay_TEN_Skeleton", AchievementName.Slay_TEN_Skeleton);
	this.addAchievementDesc("Slay_TEN_Skeleton", AchievementDescription.Slay_TEN_Skeleton);
	Slay_TWENTYFIVE_Skeleton = new Achievement(AchievementIds.Slay_Twentyfive_SkeletonID, "Slay_TWENTYFIVE_Skeleton", -2, -4,new ItemStack(Item.skull,1,0), Slay_TEN_Skeleton).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Skeleton", AchievementName.Slay_TWENTYFIVE_Skeleton);
	this.addAchievementDesc("Slay_TWENTYFIVE_Skeleton", AchievementDescription.Slay_TWENTYFIVE_Skeleton);
	Slay_FIFTY_Skeleton = new Achievement(AchievementIds.Slay_Fifty_SkeletonID, "Slay_FIFTY_Skeleton", -1, -4,new ItemStack(Item.skull,1,0), Slay_TWENTYFIVE_Skeleton).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Skeleton", AchievementName.Slay_FIFTY_Skeleton);
	this.addAchievementDesc("Slay_FIFTY_Skeleton", AchievementDescription.Slay_FIFTY_Skeleton);
	Slay_SEVENTYFIVE_Skeleton = new Achievement(AchievementIds.Slay_Seventyfive_SkeletonID, "Slay_SEVENTYFIVE_Skeleton", 0, -4,new ItemStack(Item.skull,1,0), Slay_FIFTY_Skeleton).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Skeleton", AchievementName.Slay_SEVENTYFIVE_Skeleton);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Skeleton", AchievementDescription.Slay_SEVENTYFIVE_Skeleton);
	Slay_HOUNDRED_Skeleton = new Achievement(AchievementIds.Slay_Houndred_SkeletonID, "Slay_HOUNDRED_Skeleton", 1, -4,new ItemStack(Item.skull,1,0), Slay_SEVENTYFIVE_Skeleton).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Skeleton", AchievementName.Slay_HOUNDRED_Skeleton);
	this.addAchievementDesc("Slay_HOUNDRED_Skeleton", AchievementDescription.Slay_HOUNDRED_Skeleton);
	Slay_HOUNDREDANDFIFTY_Skeleton = new Achievement(AchievementIds.Slay_HoundredandFifty_SkeletonID, "Slay_HOUNDREDANDFIFTY_Skeleton", 2, -4,new ItemStack(Item.skull,1,0), Slay_HOUNDRED_Skeleton).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Skeleton", AchievementName.Slay_HOUNDREDANDFIFTY_Skeleton);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Skeleton", AchievementDescription.Slay_HOUNDREDANDFIFTY_Skeleton);
	Slay_ONE_Zombie = new Achievement(AchievementIds.Slay_One_ZombieID, "Slay_ONE_Zombie", -5, -3,new ItemStack(Item.skull,1,2), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Zombie", AchievementName.Slay_ONE_Zombie);
	this.addAchievementDesc("Slay_ONE_Zombie", AchievementDescription.Slay_ONE_Zombie);
	Slay_FIVE_Zombie = new Achievement(AchievementIds.Slay_Five_ZombieID, "Slay_FIVE_Zombie", -4, -3,new ItemStack(Item.skull,1,2), Slay_ONE_Zombie).registerAchievement();
	this.addAchievementName("Slay_FIVE_Zombie", AchievementName.Slay_FIVE_Zombie);
	this.addAchievementDesc("Slay_FIVE_Zombie", AchievementDescription.Slay_FIVE_Zombie);
	Slay_TEN_Zombie = new Achievement(AchievementIds.Slay_Ten_ZombieID, "Slay_TEN_Zombie", -3, -3,new ItemStack(Item.skull,1,2), Slay_FIVE_Zombie).registerAchievement();
	this.addAchievementName("Slay_TEN_Zombie", AchievementName.Slay_TEN_Zombie);
	this.addAchievementDesc("Slay_TEN_Zombie", AchievementDescription.Slay_TEN_Zombie);
	Slay_TWENTYFIVE_Zombie = new Achievement(AchievementIds.Slay_Twentyfive_ZombieID, "Slay_TWENTYFIVE_Zombie", -2, -3,new ItemStack(Item.skull,1,2), Slay_TEN_Zombie).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Zombie", AchievementName.Slay_TWENTYFIVE_Zombie);
	this.addAchievementDesc("Slay_TWENTYFIVE_Zombie", AchievementDescription.Slay_TWENTYFIVE_Zombie);
	Slay_FIFTY_Zombie = new Achievement(AchievementIds.Slay_Fifty_ZombieID, "Slay_FIFTY_Zombie", -1, -3,new ItemStack(Item.skull,1,2), Slay_TWENTYFIVE_Zombie).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Zombie", AchievementName.Slay_FIFTY_Zombie);
	this.addAchievementDesc("Slay_FIFTY_Zombie", AchievementDescription.Slay_FIFTY_Zombie);
	Slay_SEVENTYFIVE_Zombie = new Achievement(AchievementIds.Slay_Seventyfive_ZombieID, "Slay_SEVENTYFIVE_Zombie", 0, -3,new ItemStack(Item.skull,1,2), Slay_FIFTY_Zombie).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Zombie", AchievementName.Slay_SEVENTYFIVE_Zombie);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Zombie", AchievementDescription.Slay_SEVENTYFIVE_Zombie);
	Slay_HOUNDRED_Zombie = new Achievement(AchievementIds.Slay_Houndred_ZombieID, "Slay_HOUNDRED_Zombie", 1, -3,new ItemStack(Item.skull,1,2), Slay_SEVENTYFIVE_Zombie).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Zombie", AchievementName.Slay_HOUNDRED_Zombie);
	this.addAchievementDesc("Slay_HOUNDRED_Zombie", AchievementDescription.Slay_HOUNDRED_Zombie);
	Slay_HOUNDREDANDFIFTY_Zombie = new Achievement(AchievementIds.Slay_HoundredandFifty_ZombieID, "Slay_HOUNDREDANDFIFTY_Zombie", 2, -3,new ItemStack(Item.skull,1,2), Slay_HOUNDRED_Zombie).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Zombie", AchievementName.Slay_HOUNDREDANDFIFTY_Zombie);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Zombie", AchievementDescription.Slay_HOUNDREDANDFIFTY_Zombie);
	Slay_ONE_Spider = new Achievement(AchievementIds.Slay_One_SpiderID, "Slay_ONE_Spider", -5, -2,new ItemStack(Item.silk), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Spider", AchievementName.Slay_ONE_Spider);
	this.addAchievementDesc("Slay_ONE_Spider", AchievementDescription.Slay_ONE_Spider);
	Slay_FIVE_Spider = new Achievement(AchievementIds.Slay_Five_SpiderID, "Slay_FIVE_Spider", -4, -2,new ItemStack(Item.silk), Slay_ONE_Spider).registerAchievement();
	this.addAchievementName("Slay_FIVE_Spider", AchievementName.Slay_FIVE_Spider);
	this.addAchievementDesc("Slay_FIVE_Spider", AchievementDescription.Slay_FIVE_Spider);
	Slay_TEN_Spider = new Achievement(AchievementIds.Slay_Ten_SpiderID, "Slay_TEN_Spider", -3, -2,new ItemStack(Item.silk), Slay_FIVE_Spider).registerAchievement();
	this.addAchievementName("Slay_TEN_Spider", AchievementName.Slay_TEN_Spider);
	this.addAchievementDesc("Slay_TEN_Spider", AchievementDescription.Slay_TEN_Spider);
	Slay_TWENTYFIVE_Spider = new Achievement(AchievementIds.Slay_Twentyfive_SpiderID, "Slay_TWENTYFIVE_Spider", -2, -2,new ItemStack(Item.silk), Slay_TEN_Spider).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Spider", AchievementName.Slay_TWENTYFIVE_Spider);
	this.addAchievementDesc("Slay_TWENTYFIVE_Spider", AchievementDescription.Slay_TWENTYFIVE_Spider);
	Slay_FIFTY_Spider = new Achievement(AchievementIds.Slay_Fifty_SpiderID, "Slay_FIFTY_Spider", -1, -2,new ItemStack(Item.silk), Slay_TWENTYFIVE_Spider).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Spider", AchievementName.Slay_FIFTY_Spider);
	this.addAchievementDesc("Slay_FIFTY_Spider", AchievementDescription.Slay_FIFTY_Spider);
	Slay_SEVENTYFIVE_Spider = new Achievement(AchievementIds.Slay_Seventyfive_SpiderID, "Slay_SEVENTYFIVE_Spider", 0, -2,new ItemStack(Item.silk), Slay_FIFTY_Spider).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Spider", AchievementName.Slay_SEVENTYFIVE_Spider);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Spider", AchievementDescription.Slay_SEVENTYFIVE_Spider);
	Slay_HOUNDRED_Spider = new Achievement(AchievementIds.Slay_Houndred_SpiderID, "Slay_HOUNDRED_Spider", 1, -2,new ItemStack(Item.silk), Slay_SEVENTYFIVE_Spider).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Spider", AchievementName.Slay_HOUNDRED_Spider);
	this.addAchievementDesc("Slay_HOUNDRED_Spider", AchievementDescription.Slay_HOUNDRED_Spider);
	Slay_HOUNDREDANDFIFTY_Spider = new Achievement(AchievementIds.Slay_HoundredandFifty_SpiderID, "Slay_HOUNDREDANDFIFTY_Spider", 2, -2,new ItemStack(Item.silk), Slay_HOUNDRED_Spider).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Spider", AchievementName.Slay_HOUNDREDANDFIFTY_Spider);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Spider", AchievementDescription.Slay_HOUNDREDANDFIFTY_Spider);
	Slay_ONE_Enderman = new Achievement(AchievementIds.Slay_One_EndermanID, "Slay_ONE_Enderman", -5, -1,new ItemStack(Item.enderPearl), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Enderman", AchievementName.Slay_ONE_Enderman);
	this.addAchievementDesc("Slay_ONE_Enderman", AchievementDescription.Slay_ONE_Enderman);
	Slay_FIVE_Enderman = new Achievement(AchievementIds.Slay_Five_EndermanID, "Slay_FIVE_Enderman", -4, -1,new ItemStack(Item.enderPearl), Slay_ONE_Enderman).registerAchievement();
	this.addAchievementName("Slay_FIVE_Enderman", AchievementName.Slay_FIVE_Enderman);
	this.addAchievementDesc("Slay_FIVE_Enderman", AchievementDescription.Slay_FIVE_Enderman);
	Slay_TEN_Enderman = new Achievement(AchievementIds.Slay_Ten_EndermanID, "Slay_TEN_Enderman", -3, -1,new ItemStack(Item.enderPearl), Slay_FIVE_Enderman).registerAchievement();
	this.addAchievementName("Slay_TEN_Enderman", AchievementName.Slay_TEN_Enderman);
	this.addAchievementDesc("Slay_TEN_Enderman", AchievementDescription.Slay_TEN_Enderman);
	Slay_TWENTYFIVE_Enderman = new Achievement(AchievementIds.Slay_Twentyfive_EndermanID, "Slay_TWENTYFIVE_Enderman", -2, -1,new ItemStack(Item.enderPearl), Slay_TEN_Enderman).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Enderman", AchievementName.Slay_TWENTYFIVE_Enderman);
	this.addAchievementDesc("Slay_TWENTYFIVE_Enderman", AchievementDescription.Slay_TWENTYFIVE_Enderman);
	Slay_FIFTY_Enderman = new Achievement(AchievementIds.Slay_Fifty_EndermanID, "Slay_FIFTY_Enderman", -1, -1,new ItemStack(Item.enderPearl), Slay_TWENTYFIVE_Enderman).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Enderman", AchievementName.Slay_FIFTY_Enderman);
	this.addAchievementDesc("Slay_FIFTY_Enderman", AchievementDescription.Slay_FIFTY_Enderman);
	Slay_SEVENTYFIVE_Enderman = new Achievement(AchievementIds.Slay_Seventyfive_EndermanID, "Slay_SEVENTYFIVE_Enderman", 0, -1,new ItemStack(Item.enderPearl), Slay_FIFTY_Enderman).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Enderman", AchievementName.Slay_SEVENTYFIVE_Enderman);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Enderman", AchievementDescription.Slay_SEVENTYFIVE_Enderman);
	Slay_HOUNDRED_Enderman = new Achievement(AchievementIds.Slay_Houndred_EndermanID, "Slay_HOUNDRED_Enderman", 1, -1,new ItemStack(Item.enderPearl), Slay_SEVENTYFIVE_Enderman).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Enderman", AchievementName.Slay_HOUNDRED_Enderman);
	this.addAchievementDesc("Slay_HOUNDRED_Enderman", AchievementDescription.Slay_HOUNDRED_Enderman);
	Slay_HOUNDREDANDFIFTY_Enderman = new Achievement(AchievementIds.Slay_HoundredandFifty_EndermanID, "Slay_HOUNDREDANDFIFTY_Enderman", 2, -1,new ItemStack(Item.enderPearl), Slay_HOUNDRED_Enderman).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Enderman", AchievementName.Slay_HOUNDREDANDFIFTY_Enderman);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Enderman", AchievementDescription.Slay_HOUNDREDANDFIFTY_Enderman);
	Slay_ONE_PlayerMP = new Achievement(AchievementIds.Slay_One_PlayerMPID, "Slay_ONE_PlayerMP", -5, 0,new ItemStack(Item.skull,1,3), null).registerAchievement();
	this.addAchievementName("Slay_ONE_PlayerMP", AchievementName.Slay_ONE_PlayerMP);
	this.addAchievementDesc("Slay_ONE_PlayerMP", AchievementDescription.Slay_ONE_PlayerMP);
	Slay_FIVE_PlayerMP = new Achievement(AchievementIds.Slay_Five_PlayerMPID, "Slay_FIVE_PlayerMP", -4, 0,new ItemStack(Item.skull,1,3), Slay_ONE_PlayerMP).registerAchievement();
	this.addAchievementName("Slay_FIVE_PlayerMP", AchievementName.Slay_FIVE_PlayerMP);
	this.addAchievementDesc("Slay_FIVE_PlayerMP", AchievementDescription.Slay_FIVE_PlayerMP);
	Slay_TEN_PlayerMP = new Achievement(AchievementIds.Slay_Ten_PlayerMPID, "Slay_TEN_PlayerMP", -3, 0,new ItemStack(Item.skull,1,3), Slay_FIVE_PlayerMP).registerAchievement();
	this.addAchievementName("Slay_TEN_PlayerMP", AchievementName.Slay_TEN_PlayerMP);
	this.addAchievementDesc("Slay_TEN_PlayerMP", AchievementDescription.Slay_TEN_PlayerMP);
	Slay_TWENTYFIVE_PlayerMP = new Achievement(AchievementIds.Slay_Twentyfive_PlayerMPID, "Slay_TWENTYFIVE_PlayerMP", -2, 0,new ItemStack(Item.skull,1,3), Slay_TEN_PlayerMP).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_PlayerMP", AchievementName.Slay_TWENTYFIVE_PlayerMP);
	this.addAchievementDesc("Slay_TWENTYFIVE_PlayerMP", AchievementDescription.Slay_TWENTYFIVE_PlayerMP);
	Slay_FIFTY_PlayerMP = new Achievement(AchievementIds.Slay_Fifty_PlayerMPID, "Slay_FIFTY_PlayerMP", -1, 0,new ItemStack(Item.skull,1,3), Slay_TWENTYFIVE_PlayerMP).registerAchievement();
	this.addAchievementName("Slay_FIFTY_PlayerMP", AchievementName.Slay_FIFTY_PlayerMP);
	this.addAchievementDesc("Slay_FIFTY_PlayerMP", AchievementDescription.Slay_FIFTY_PlayerMP);
	Slay_SEVENTYFIVE_PlayerMP = new Achievement(AchievementIds.Slay_Seventyfive_PlayerMPID, "Slay_SEVENTYFIVE_PlayerMP", 0, 0,new ItemStack(Item.skull,1,3), Slay_FIFTY_PlayerMP).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_PlayerMP", AchievementName.Slay_SEVENTYFIVE_PlayerMP);
	this.addAchievementDesc("Slay_SEVENTYFIVE_PlayerMP", AchievementDescription.Slay_SEVENTYFIVE_PlayerMP);
	Slay_HOUNDRED_PlayerMP = new Achievement(AchievementIds.Slay_Houndred_PlayerMPID, "Slay_HOUNDRED_PlayerMP", 1, 0,new ItemStack(Item.skull,1,3), Slay_SEVENTYFIVE_PlayerMP).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_PlayerMP", AchievementName.Slay_HOUNDRED_PlayerMP);
	this.addAchievementDesc("Slay_HOUNDRED_PlayerMP", AchievementDescription.Slay_HOUNDRED_PlayerMP);
	Slay_HOUNDREDANDFIFTY_PlayerMP = new Achievement(AchievementIds.Slay_HoundredandFifty_PlayerMPID, "Slay_HOUNDREDANDFIFTY_PlayerMP", 2, 0,new ItemStack(Item.skull,1,3), Slay_HOUNDRED_PlayerMP).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_PlayerMP", AchievementName.Slay_HOUNDREDANDFIFTY_PlayerMP);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_PlayerMP", AchievementDescription.Slay_HOUNDREDANDFIFTY_PlayerMP);
	Slay_ONE_Slime = new Achievement(AchievementIds.Slay_One_SlimeID, "Slay_ONE_Slime", -5, 1,new ItemStack(Item.slimeBall), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Slime", AchievementName.Slay_ONE_Slime);
	this.addAchievementDesc("Slay_ONE_Slime", AchievementDescription.Slay_ONE_Slime);
	Slay_FIVE_Slime = new Achievement(AchievementIds.Slay_Five_SlimeID, "Slay_FIVE_Slime", -4, 1,new ItemStack(Item.slimeBall), Slay_ONE_Slime).registerAchievement();
	this.addAchievementName("Slay_FIVE_Slime", AchievementName.Slay_FIVE_Slime);
	this.addAchievementDesc("Slay_FIVE_Slime", AchievementDescription.Slay_FIVE_Slime);
	Slay_TEN_Slime = new Achievement(AchievementIds.Slay_Ten_SlimeID, "Slay_TEN_Slime", -3, 1,new ItemStack(Item.slimeBall), Slay_FIVE_Slime).registerAchievement();
	this.addAchievementName("Slay_TEN_Slime", AchievementName.Slay_TEN_Slime);
	this.addAchievementDesc("Slay_TEN_Slime", AchievementDescription.Slay_TEN_Slime);
	Slay_TWENTYFIVE_Slime = new Achievement(AchievementIds.Slay_Twentyfive_SlimeID, "Slay_TWENTYFIVE_Slime", -2, 1,new ItemStack(Item.slimeBall), Slay_TEN_Slime).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Slime", AchievementName.Slay_TWENTYFIVE_Slime);
	this.addAchievementDesc("Slay_TWENTYFIVE_Slime", AchievementDescription.Slay_TWENTYFIVE_Slime);
	Slay_FIFTY_Slime = new Achievement(AchievementIds.Slay_Fifty_SlimeID, "Slay_FIFTY_Slime", -1, 1,new ItemStack(Item.slimeBall), Slay_TWENTYFIVE_Slime).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Slime", AchievementName.Slay_FIFTY_Slime);
	this.addAchievementDesc("Slay_FIFTY_Slime", AchievementDescription.Slay_FIFTY_Slime);
	Slay_SEVENTYFIVE_Slime = new Achievement(AchievementIds.Slay_Seventyfive_SlimeID, "Slay_SEVENTYFIVE_Slime", 0, 1,new ItemStack(Item.slimeBall), Slay_FIFTY_Slime).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Slime", AchievementName.Slay_SEVENTYFIVE_Slime);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Slime", AchievementDescription.Slay_SEVENTYFIVE_Slime);
	Slay_HOUNDRED_Slime = new Achievement(AchievementIds.Slay_Houndred_SlimeID, "Slay_HOUNDRED_Slime", 1, 1,new ItemStack(Item.slimeBall), Slay_SEVENTYFIVE_Slime).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Slime", AchievementName.Slay_HOUNDRED_Slime);
	this.addAchievementDesc("Slay_HOUNDRED_Slime", AchievementDescription.Slay_HOUNDRED_Slime);
	Slay_HOUNDREDANDFIFTY_Slime = new Achievement(AchievementIds.Slay_HoundredandFifty_SlimeID, "Slay_HOUNDREDANDFIFTY_Slime", 2, 1,new ItemStack(Item.skull,1,2), Slay_HOUNDRED_Slime).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Slime", AchievementName.Slay_HOUNDREDANDFIFTY_Slime);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Slime", AchievementDescription.Slay_HOUNDREDANDFIFTY_Slime);
	Slay_ONE_Blaze = new Achievement(AchievementIds.Slay_One_BlazeID, "Slay_ONE_Blaze", -5, 2,new ItemStack(Item.blazeRod), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Blaze", AchievementName.Slay_ONE_Blaze);
	this.addAchievementDesc("Slay_ONE_Blaze", AchievementDescription.Slay_ONE_Blaze);
	Slay_FIVE_Blaze = new Achievement(AchievementIds.Slay_Five_BlazeID, "Slay_FIVE_Blaze", -4, 2,new ItemStack(Item.blazeRod), Slay_ONE_Blaze).registerAchievement();
	this.addAchievementName("Slay_FIVE_Blaze", AchievementName.Slay_FIVE_Blaze);
	this.addAchievementDesc("Slay_FIVE_Blaze", AchievementDescription.Slay_FIVE_Blaze);
	Slay_TEN_Blaze = new Achievement(AchievementIds.Slay_Ten_BlazeID, "Slay_TEN_Blaze", -3, 2,new ItemStack(Item.blazeRod), Slay_FIVE_Blaze).registerAchievement();
	this.addAchievementName("Slay_TEN_Blaze", AchievementName.Slay_TEN_Blaze);
	this.addAchievementDesc("Slay_TEN_Blaze", AchievementDescription.Slay_TEN_Blaze);
	Slay_TWENTYFIVE_Blaze = new Achievement(AchievementIds.Slay_Twentyfive_BlazeID, "Slay_TWENTYFIVE_Blaze", -2, 2,new ItemStack(Item.blazeRod), Slay_TEN_Blaze).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Blaze", AchievementName.Slay_TWENTYFIVE_Blaze);
	this.addAchievementDesc("Slay_TWENTYFIVE_Blaze", AchievementDescription.Slay_TWENTYFIVE_Blaze);
	Slay_FIFTY_Blaze = new Achievement(AchievementIds.Slay_Fifty_BlazeID, "Slay_FIFTY_Blaze", -1, 2,new ItemStack(Item.blazeRod), Slay_TWENTYFIVE_Blaze).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Blaze", AchievementName.Slay_FIFTY_Blaze);
	this.addAchievementDesc("Slay_FIFTY_Blaze", AchievementDescription.Slay_FIFTY_Blaze);
	Slay_SEVENTYFIVE_Blaze = new Achievement(AchievementIds.Slay_Seventyfive_BlazeID, "Slay_SEVENTYFIVE_Blaze", 0, 2,new ItemStack(Item.blazeRod), Slay_FIFTY_Blaze).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Blaze", AchievementName.Slay_SEVENTYFIVE_Blaze);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Blaze", AchievementDescription.Slay_SEVENTYFIVE_Blaze);
	Slay_HOUNDRED_Blaze = new Achievement(AchievementIds.Slay_Houndred_BlazeID, "Slay_HOUNDRED_Blaze", 1, 2,new ItemStack(Item.blazeRod), Slay_SEVENTYFIVE_Blaze).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Blaze", AchievementName.Slay_HOUNDRED_Blaze);
	this.addAchievementDesc("Slay_HOUNDRED_Blaze", AchievementDescription.Slay_HOUNDRED_Blaze);
	Slay_HOUNDREDANDFIFTY_Blaze = new Achievement(AchievementIds.Slay_HoundredandFifty_BlazeID, "Slay_HOUNDREDANDFIFTY_Blaze", 2, 2,new ItemStack(Item.blazeRod), Slay_HOUNDRED_Blaze).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Blaze", AchievementName.Slay_HOUNDREDANDFIFTY_Blaze);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Blaze", AchievementDescription.Slay_HOUNDREDANDFIFTY_Blaze);
	Slay_ONE_Ghast = new Achievement(AchievementIds.Slay_One_GhastID, "Slay_ONE_Ghast", -5, 3,new ItemStack(Item.ghastTear), null).registerAchievement();
	this.addAchievementName("Slay_ONE_Ghast", AchievementName.Slay_ONE_Ghast);
	this.addAchievementDesc("Slay_ONE_Ghast", AchievementDescription.Slay_ONE_Ghast);
	Slay_FIVE_Ghast = new Achievement(AchievementIds.Slay_Five_GhastID, "Slay_FIVE_Ghast", -4, 3,new ItemStack(Item.ghastTear), Slay_ONE_Ghast).registerAchievement();
	this.addAchievementName("Slay_FIVE_Ghast", AchievementName.Slay_FIVE_Ghast);
	this.addAchievementDesc("Slay_FIVE_Ghast", AchievementDescription.Slay_FIVE_Ghast);
	Slay_TEN_Ghast = new Achievement(AchievementIds.Slay_Ten_GhastID, "Slay_TEN_Ghast", -3, 3,new ItemStack(Item.ghastTear), Slay_FIVE_Ghast).registerAchievement();
	this.addAchievementName("Slay_TEN_Ghast", AchievementName.Slay_TEN_Ghast);
	this.addAchievementDesc("Slay_TEN_Ghast", AchievementDescription.Slay_TEN_Ghast);
	Slay_TWENTYFIVE_Ghast = new Achievement(AchievementIds.Slay_Twentyfive_GhastID, "Slay_TWENTYFIVE_Ghast", -2, 3,new ItemStack(Item.ghastTear), Slay_TEN_Ghast).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_Ghast", AchievementName.Slay_TWENTYFIVE_Ghast);
	this.addAchievementDesc("Slay_TWENTYFIVE_Ghast", AchievementDescription.Slay_TWENTYFIVE_Ghast);
	Slay_FIFTY_Ghast = new Achievement(AchievementIds.Slay_Fifty_GhastID, "Slay_FIFTY_Ghast", -1, 3,new ItemStack(Item.ghastTear), Slay_TWENTYFIVE_Ghast).registerAchievement();
	this.addAchievementName("Slay_FIFTY_Ghast", AchievementName.Slay_FIFTY_Ghast);
	this.addAchievementDesc("Slay_FIFTY_Ghast", AchievementDescription.Slay_FIFTY_Ghast);
	Slay_SEVENTYFIVE_Ghast = new Achievement(AchievementIds.Slay_Seventyfive_GhastID, "Slay_SEVENTYFIVE_Ghast", 0, 3,new ItemStack(Item.ghastTear), Slay_FIFTY_Ghast).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_Ghast", AchievementName.Slay_SEVENTYFIVE_Ghast);
	this.addAchievementDesc("Slay_SEVENTYFIVE_Ghast", AchievementDescription.Slay_SEVENTYFIVE_Ghast);
	Slay_HOUNDRED_Ghast = new Achievement(AchievementIds.Slay_Houndred_GhastID, "Slay_HOUNDRED_Ghast", 1, 3,new ItemStack(Item.ghastTear), Slay_SEVENTYFIVE_Ghast).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_Ghast", AchievementName.Slay_HOUNDRED_Ghast);
	this.addAchievementDesc("Slay_HOUNDRED_Ghast", AchievementDescription.Slay_HOUNDRED_Ghast);
	Slay_HOUNDREDANDFIFTY_Ghast = new Achievement(AchievementIds.Slay_HoundredandFifty_GhastID, "Slay_HOUNDREDANDFIFTY_Ghast", 2, 3,new ItemStack(Item.ghastTear), Slay_HOUNDRED_Ghast).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_Ghast", AchievementName.Slay_HOUNDREDANDFIFTY_Ghast);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_Ghast", AchievementDescription.Slay_HOUNDREDANDFIFTY_Ghast);
	Slay_ONE_CaveSpider = new Achievement(AchievementIds.Slay_One_CaveSpiderID, "Slay_ONE_CaveSpider", -5, 4,new ItemStack(Item.spiderEye), null).registerAchievement();
	this.addAchievementName("Slay_ONE_CaveSpider", AchievementName.Slay_ONE_CaveSpider);
	this.addAchievementDesc("Slay_ONE_CaveSpider", AchievementDescription.Slay_ONE_CaveSpider);
	Slay_FIVE_CaveSpider = new Achievement(AchievementIds.Slay_Five_CaveSpiderID, "Slay_FIVE_CaveSpider", -4, 4,new ItemStack(Item.spiderEye), Slay_ONE_CaveSpider).registerAchievement();
	this.addAchievementName("Slay_FIVE_CaveSpider", AchievementName.Slay_FIVE_CaveSpider);
	this.addAchievementDesc("Slay_FIVE_CaveSpider", AchievementDescription.Slay_FIVE_CaveSpider);
	Slay_TEN_CaveSpider = new Achievement(AchievementIds.Slay_Ten_CaveSpiderID, "Slay_TEN_CaveSpider", -3, 4,new ItemStack(Item.spiderEye), Slay_FIVE_CaveSpider).registerAchievement();
	this.addAchievementName("Slay_TEN_CaveSpider", AchievementName.Slay_TEN_CaveSpider);
	this.addAchievementDesc("Slay_TEN_CaveSpider", AchievementDescription.Slay_TEN_CaveSpider);
	Slay_TWENTYFIVE_CaveSpider = new Achievement(AchievementIds.Slay_Twentyfive_CaveSpiderID, "Slay_TWENTYFIVE_CaveSpider", -2, 4,new ItemStack(Item.spiderEye), Slay_TEN_CaveSpider).registerAchievement();
	this.addAchievementName("Slay_TWENTYFIVE_CaveSpider", AchievementName.Slay_TWENTYFIVE_CaveSpider);
	this.addAchievementDesc("Slay_TWENTYFIVE_CaveSpider", AchievementDescription.Slay_TWENTYFIVE_CaveSpider);
	Slay_FIFTY_CaveSpider = new Achievement(AchievementIds.Slay_Fifty_CaveSpiderID, "Slay_FIFTY_CaveSpider", -1, 4,new ItemStack(Item.spiderEye), Slay_TWENTYFIVE_CaveSpider).registerAchievement();
	this.addAchievementName("Slay_FIFTY_CaveSpider", AchievementName.Slay_FIFTY_CaveSpider);
	this.addAchievementDesc("Slay_FIFTY_CaveSpider", AchievementDescription.Slay_FIFTY_CaveSpider);
	Slay_SEVENTYFIVE_CaveSpider = new Achievement(AchievementIds.Slay_Seventyfive_CaveSpiderID, "Slay_SEVENTYFIVE_CaveSpider", 0, 4,new ItemStack(Item.spiderEye), Slay_FIFTY_CaveSpider).registerAchievement();
	this.addAchievementName("Slay_SEVENTYFIVE_CaveSpider", AchievementName.Slay_SEVENTYFIVE_CaveSpider);
	this.addAchievementDesc("Slay_SEVENTYFIVE_CaveSpider", AchievementDescription.Slay_SEVENTYFIVE_CaveSpider);
	Slay_HOUNDRED_CaveSpider = new Achievement(AchievementIds.Slay_Houndred_CaveSpiderID, "Slay_HOUNDRED_CaveSpider", 1, 4,new ItemStack(Item.spiderEye), Slay_SEVENTYFIVE_CaveSpider).registerAchievement();
	this.addAchievementName("Slay_HOUNDRED_CaveSpider", AchievementName.Slay_HOUNDRED_CaveSpider);
	this.addAchievementDesc("Slay_HOUNDRED_CaveSpider", AchievementDescription.Slay_HOUNDRED_CaveSpider);
	Slay_HOUNDREDANDFIFTY_CaveSpider = new Achievement(AchievementIds.Slay_HoundredandFifty_CaveSpiderID, "Slay_HOUNDREDANDFIFTY_CaveSpider", 2, 4,new ItemStack(Item.spiderEye), Slay_HOUNDRED_CaveSpider).registerAchievement();
	this.addAchievementName("Slay_HOUNDREDANDFIFTY_CaveSpider", AchievementName.Slay_HOUNDREDANDFIFTY_CaveSpider);
	this.addAchievementDesc("Slay_HOUNDREDANDFIFTY_CaveSpider", AchievementDescription.Slay_HOUNDREDANDFIFTY_CaveSpider);
	//SLAY MISC!!!!!!!======================================================================
	SlayMisc_MeatAnimal = new Achievement(AchievementIds.SlayMisc_MeatAnimalID, "SlayMisc_MeatAnimal", 0, 0,new ItemStack(Item.porkRaw), null).registerAchievement();
	this.addAchievementName("SlayMisc_MeatAnimal", AchievementName.SlayMisc_MeatAnimal);
	this.addAchievementDesc("SlayMisc_MeatAnimal", AchievementDescription.SlayMisc_MeatAnimal);
	SlayMisc_AllKindsOfMobsDown = new Achievement(AchievementIds.SlayMisc_AllKindsOfMobsDownID, "SlayMisc_AllKindsOfMobsDown", 2, -1,new ItemStack(Item.rottenFlesh), SlayMisc_MeatAnimal).registerAchievement();
	this.addAchievementName("SlayMisc_AllKindsOfMobsDown", AchievementName.SlayMisc_AllKindsOfMobsDown);
	this.addAchievementDesc("SlayMisc_AllKindsOfMobsDown", AchievementDescription.SlayMisc_AllKindsOfMobsDown);
	
	
	
	
	
	
	
	
	MineOncePage = new AchievementPage("Mine Once", DigWood, DigDirt, DigStone, DigCoalOre, DigIronOre, DigGoldOre, DigDiamondOre, DigObsidian, DigGravel, DigNetherrack, DigQuartOre, DigNetherBrick, DigNetherFence, DigNetherStair, DigNetherWart);
	CraftOncePage = new AchievementPage("Craft Once", CraftWoodenPlanks, CraftSticks, CraftWoodenPickaxe, CraftWoodenAxe, CraftWoodenShovel, CraftWoodenHoe, CraftWoodenSword, CraftTorch);
	SlayerPage = new AchievementPage("Slayer", 
			Slay_ONE_Creeper, Slay_FIVE_Creeper, Slay_TEN_Creeper, Slay_TWENTYFIVE_Creeper, Slay_FIFTY_Creeper, Slay_SEVENTYFIVE_Creeper, Slay_HOUNDRED_Creeper, Slay_HOUNDREDANDFIFTY_Creeper, 
			Slay_ONE_Skeleton, Slay_FIVE_Skeleton, Slay_TEN_Skeleton, Slay_TWENTYFIVE_Skeleton, Slay_FIFTY_Skeleton, Slay_SEVENTYFIVE_Skeleton, Slay_HOUNDRED_Skeleton, Slay_HOUNDREDANDFIFTY_Skeleton,
			Slay_ONE_Zombie, Slay_FIVE_Zombie, Slay_TEN_Zombie, Slay_TWENTYFIVE_Zombie, Slay_FIFTY_Zombie, Slay_SEVENTYFIVE_Zombie, Slay_HOUNDRED_Zombie, Slay_HOUNDREDANDFIFTY_Zombie,
			Slay_ONE_Spider, Slay_FIVE_Spider, Slay_TEN_Spider, Slay_TWENTYFIVE_Spider, Slay_FIFTY_Spider, Slay_SEVENTYFIVE_Spider, Slay_HOUNDRED_Spider, Slay_HOUNDREDANDFIFTY_Spider,
			Slay_ONE_Enderman, Slay_FIVE_Enderman, Slay_TEN_Enderman, Slay_TWENTYFIVE_Enderman, Slay_FIFTY_Enderman, Slay_SEVENTYFIVE_Enderman, Slay_HOUNDRED_Enderman, Slay_HOUNDREDANDFIFTY_Enderman,
			Slay_ONE_PlayerMP, Slay_FIVE_PlayerMP, Slay_TEN_PlayerMP, Slay_TWENTYFIVE_PlayerMP, Slay_FIFTY_PlayerMP, Slay_SEVENTYFIVE_PlayerMP, Slay_HOUNDRED_PlayerMP, Slay_HOUNDREDANDFIFTY_PlayerMP,
			Slay_ONE_Slime, Slay_FIVE_Slime, Slay_TEN_Slime, Slay_TWENTYFIVE_Slime, Slay_FIFTY_Slime, Slay_SEVENTYFIVE_Slime, Slay_HOUNDRED_Slime, Slay_HOUNDREDANDFIFTY_Slime,
			Slay_ONE_Blaze, Slay_FIVE_Blaze, Slay_TEN_Blaze, Slay_TWENTYFIVE_Blaze, Slay_FIFTY_Blaze, Slay_SEVENTYFIVE_Blaze, Slay_HOUNDRED_Blaze, Slay_HOUNDREDANDFIFTY_Blaze,
			Slay_ONE_Ghast, Slay_FIVE_Ghast, Slay_TEN_Ghast, Slay_TWENTYFIVE_Ghast, Slay_FIFTY_Ghast, Slay_SEVENTYFIVE_Ghast, Slay_HOUNDRED_Ghast, Slay_HOUNDREDANDFIFTY_Ghast,
			Slay_ONE_CaveSpider, Slay_FIVE_CaveSpider, Slay_TEN_CaveSpider, Slay_TWENTYFIVE_CaveSpider, Slay_FIFTY_CaveSpider, Slay_SEVENTYFIVE_CaveSpider, Slay_HOUNDRED_CaveSpider, Slay_HOUNDREDANDFIFTY_CaveSpider);
	//FoodPage = new AchievementPage("Food", DigDirt, CrackedStone, StonePickaxe);
	SlayerMiscPage = new AchievementPage("Slayer Miscellaneous", SlayMisc_MeatAnimal, SlayMisc_AllKindsOfMobsDown);
	AchievementPage.registerAchievementPage(MineOncePage);
	AchievementPage.registerAchievementPage(CraftOncePage);
	AchievementPage.registerAchievementPage(SlayerPage);
	AchievementPage.registerAchievementPage(SlayerMiscPage);
	//AchievementPage.registerAchievementPage(FrostPage);
	
	GameRegistry.registerCraftingHandler(new CraftingHandler());
	GameRegistry.registerPickupHandler(new PickupHandler());
}
private void addAchievementName(String ach, String name)
{
LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
}

private void addAchievementDesc(String ach, String desc)
{
LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
}

@EventHandler
public void serverStart(FMLServerStartingEvent event)
{
	MinecraftServer server = MinecraftServer.getServer(); //Gets current server
	ICommandManager command = server.getCommandManager(); //Gets the command manager to use for server
	ServerCommandManager serverCommand = ((ServerCommandManager) command); //Turns it into another form to use
	serverCommand.registerCommand(new CommandResetMod());
}
}
