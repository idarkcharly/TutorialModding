package com.charly1307.decorock.objects.items;

import com.charly1307.decorock.DecoRockMain;
import com.charly1307.decorock.init.ItemInit;
import com.charly1307.decorock.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		DecoRockMain.proxy.registerItemRenderer(this, 0, "inventory");
	}

}