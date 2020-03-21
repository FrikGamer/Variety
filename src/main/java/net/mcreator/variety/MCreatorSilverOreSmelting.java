package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorSilverOreSmelting extends Elementsvariety.ModElement {
	public MCreatorSilverOreSmelting(Elementsvariety instance) {
		super(instance, 331);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSilverOre.block, (int) (1)), new ItemStack(MCreatorSilverIngot.block, (int) (1)), 3F);
	}
}
