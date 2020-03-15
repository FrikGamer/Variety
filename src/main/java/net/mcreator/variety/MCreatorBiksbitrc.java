package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorBiksbitrc extends Elementsvariety.ModElement {
	public MCreatorBiksbitrc(Elementsvariety instance) {
		super(instance, 327);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorBiksbittDust.block, (int) (1)), new ItemStack(MCreatorBiksbitGem.block, (int) (1)), 3F);
	}
}
