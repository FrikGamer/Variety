package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorSkapolitOreSmelting extends Elementsvariety.ModElement {
	public MCreatorSkapolitOreSmelting(Elementsvariety instance) {
		super(instance, 308);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSkapolitOre.block, (int) (1)), new ItemStack(MCreatorSkapolitGem.block, (int) (1)), 5F);
	}
}
