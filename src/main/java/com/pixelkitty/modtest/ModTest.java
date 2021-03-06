package com.pixelkitty.modtest;

import com.pixelkitty.modtest.handlers.ConfigurationHandler;
import com.pixelkitty.modtest.init.ModItems;
import com.pixelkitty.modtest.proxy.IProxy;
import com.pixelkitty.modtest.reference.Reference;
import com.pixelkitty.modtest.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Alex on 4/23/2016.
 */
@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ModTest {

    //creates a virgin instance of your mod for referring back
    @Mod.Instance(Reference.MOD_ID)
    public static ModTest instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;



    //Subscribes to the Event Handler and runs in that event. Receives the event as an object
    //Registers items and blocks, configs (config file defaults are handled by Forge)
    //Pre/Init/Post is kind of like GameMaker Pre/Step/LateStep events
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        //Register the configuration handler class with the event bus so it can hear events
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        //Item registration
        ModItems.init();


        LogHelper.info("Preinitialization complete");

    }

    //Initializes recipes and other things.
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){


    }

    //Wrap up.
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){


    }


}
