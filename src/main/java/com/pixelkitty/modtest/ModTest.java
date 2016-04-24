package com.pixelkitty.modtest;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Alex on 4/23/2016.
 */
@Mod(modid="ModTest", name="Mod Test", version = "1.0")
public class ModTest {

    //creates a virgin instance of your mod for referring back
    @Mod.Instance("ModTest")
    public static ModTest instance;

    //Subscribes to the Event Handler and runs in that event. Receives the event as an object
    //Registers items and blocks
    //Pre/Init/Post is kind of like GameMaker Pre/Step/LateStep events
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){


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
