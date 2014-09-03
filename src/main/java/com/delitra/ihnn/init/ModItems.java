package com.delitra.ihnn.init;

import com.delitra.ihnn.item.ItemIHNN;
import com.delitra.ihnn.item.ItemOWlyIngot;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemIHNN owlyIngot = new ItemOWlyIngot();
	
	public static void init()
	{
		GameRegistry.registerItem(owlyIngot, "owlyIngot");
	}
}
