package com.delitra.ihnn.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import com.delitra.ihnn.handler.ConfigurationHandler;
import com.delitra.ihnn.reference.Reference;

import cpw.mods.fml.client.config.GuiConfig;

public class IHNNGuiConfig extends GuiConfig {
	public IHNNGuiConfig(GuiScreen guiScreen)
	{
		super(guiScreen,
				new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
	}
}
