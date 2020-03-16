package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorGoshenittOreSmelting extends Elementsvariety.ModElement {
	public MCreatorGoshenittOreSmelting(Elementsvariety instance) {
		super(instance, 291);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorGoshenittOre.block, (int) (1)), new ItemStack(MCreatorGoshenittGem.block, (int) (1)), 0.7F);
	}
}
