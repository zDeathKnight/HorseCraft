package com.HorseCraft.core;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry 
{
    public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static void registerBlock(Block block)
	{
		 GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(block.getUnlocalizedName().indexOf(".")+1));
	}
	
	public static void addOreRecipes(ItemStack output, Object... params)
    {
		addRecipe(new ShapedOreRecipe(output, params));
    }
	
	public static void addShapelessRecipe(ItemStack output, Object... params)
    {
        CraftingManager.getInstance().addShapelessRecipe(output, params);
    }
	
	@SuppressWarnings("unchecked")
	public static void addRecipe(IRecipe recipe)
    {
        CraftingManager.getInstance().getRecipeList().add(recipe);
    }
	
	public static void addRecipe(ItemStack output, Object... params)
    {
        addShapedRecipe(output, params);
    }
	
	public static void addSmelting(int input, ItemStack output, float xp)
    {
        FurnaceRecipes.smelting().addSmelting(input, output, xp);
    }
	
	public static IRecipe addShapedRecipe(ItemStack output, Object... params)
    {
        return CraftingManager.getInstance().addRecipe(output, params);
    }
	
	public static void oreRegistry(String name , ItemStack ore)
	{
		OreDictionary.registerOre(name,ore);
	}
	
	public static void oreRegistry(String name , Block ore)
	{
		OreDictionary.registerOre(name,ore);	
	}

	public static void oreRegistry(String name , Item ore)
	{
	OreDictionary.registerOre(name,ore);
	}

	public static void registerBlock(Block block,Class<ItemBlock> class1) 
	{
		 GameRegistry.registerBlock(block,class1,block.getUnlocalizedName().substring(block.getUnlocalizedName().indexOf(".")+1));	
	}

}
