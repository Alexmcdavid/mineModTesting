package com.pixelkitty.modtest.handlers;

import com.pixelkitty.modtest.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Alex on 4/23/2016.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

        public static void init(File configFile){

            //create configuration object from the File reference
            if (configuration == null){
                configuration = new Configuration(configFile);
            }

            configuration.load();
        }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            //Resync configs


        }
    }

    public void loadConfiguration(){
        try{
            //try to load
            configuration.load();

            //read in properties
            testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example");

        }
        catch (Exception e){

            //log the exception
        }
        finally{
            //save the config file
            if (configuration.hasChanged()){
                configuration.save();
            }
        }
    }




}
