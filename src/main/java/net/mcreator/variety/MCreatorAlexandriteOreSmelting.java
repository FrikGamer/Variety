package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorAlexandriteOreSmelting extends Elementsvariety.ModElement {
	public MCreatorAlexandriteOreSmelting(Elementsvariety instance) {
		super(instance, 268);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorAlexandriteOre.block, (int) (1)), new ItemStack(MCreatorAlexandriteGem.block, (int) (1)), 5F);
	}
}
