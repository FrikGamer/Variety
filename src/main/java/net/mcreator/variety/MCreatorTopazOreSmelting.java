package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorTopazOreSmelting extends Elementsvariety.ModElement {
	public MCreatorTopazOreSmelting(Elementsvariety instance) {
		super(instance, 256);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorTopazOre.block, (int) (1)), new ItemStack(MCreatorTopazGem.block, (int) (1)), 0.7F);
	}
}
