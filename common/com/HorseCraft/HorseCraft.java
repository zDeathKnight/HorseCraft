package com.HorseCraft;



import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

import com.HorseCraft.core.*;
import com.HorseCraft.side.CommonProxy;


@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=false,serverSideRequired=false)

public class HorseCraft 
{

	@Instance
	public static HorseCraft instance = new HorseCraft();
	
	@SidedProxy(clientSide = Reference.clientSide, serverSide = Reference.serverSide)
	public static CommonProxy porxy;
	
	
	@EventHandler
	public void load(FMLInitializationEvent event) 
    {
		Registry.addRecipe(new ItemStack(Item.field_111215_ce), new Object[]{"  #","#c#","###",'#',Item.ingotIron,'c',new ItemStack(Block.cloth,1,Registry.WILDCARD_VALUE)});
		Registry.addRecipe(new ItemStack(Item.field_111216_cf), new Object[]{"  #","#c#","###",'#',Item.ingotGold,'c',new ItemStack(Block.cloth,1,Registry.WILDCARD_VALUE)});
		Registry.addRecipe(new ItemStack(Item.field_111213_cg), new Object[]{"  #","#c#","###",'#',Item.diamond,'c',new ItemStack(Block.cloth,1,Registry.WILDCARD_VALUE)});
		Registry.addRecipe(new ItemStack(Item.field_111212_ci), new Object[]{" s","p ",'s',Item.silk,'p',Item.paper});
		Registry.addRecipe(new ItemStack(Item.saddle), new Object[]{"###","#i#","i i",'#',Item.leather,'c',Item.ingotIron});
    }
	
	
}
