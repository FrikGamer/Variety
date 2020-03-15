package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorBiksbitOreSmelting extends Elementsvariety.ModElement {
	public MCreatorBiksbitOreSmelting(Elementsvariety instance) {
		super(instance, 322);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorBiksbitOre.block, (int) (1)), new ItemStack(MCreatorBiksbitGem.block, (int) (1)), 5F);
	}
}
