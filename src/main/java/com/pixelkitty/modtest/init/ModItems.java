package com.pixelkitty.modtest.init;

import com.pixelkitty.modtest.items.ItemMapleLeaf;
import com.pixelkitty.modtest.items.ItemModTest;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Alex on 4/24/2016.
 */
public class ModItems {

    public static final ItemModTest mapleLeaf = new ItemMapleLeaf();

    public static void init(){

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");

    }

}
