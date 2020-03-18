package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorCymofanOreSmelting extends Elementsvariety.ModElement {
	public MCreatorCymofanOreSmelting(Elementsvariety instance) {
		super(instance, 298);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorCymofanOre.block, (int) (1)), new ItemStack(MCreatorCymofanGem.block, (int) (1)), 4F);
	}
}
