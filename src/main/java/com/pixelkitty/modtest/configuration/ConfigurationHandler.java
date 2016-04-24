package com.pixelkitty.modtest.configuration;

import java.io.File;

/**
 * Created by Alex on 4/23/2016.
 */
public class ConfigurationHandler {

        public static void init(File configFile){

            //create configuration object from the File reference
            net.minecraftforge.common.config.Configuration configuration =
                    new net.minecraftforge.common.config.Configuration(configFile);
            boolean configValue = false;

            try{
                //try to load
                configuration.load();

                //read in properties
                configValue = configuration.get(net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL,
                        "configValue", true, "This is an example").getBoolean(true);

            }
            catch (Exception e){

                //log the exception
            }
            finally{
                //save the config file
                configuration.save();
            }


        }

}
