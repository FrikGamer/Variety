package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorMorganiteOreSmelting extends Elementsvariety.ModElement {
	public MCreatorMorganiteOreSmelting(Elementsvariety instance) {
		super(instance, 274);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMorganiteOre.block, (int) (1)), new ItemStack(MCreatorMorganiteGem.block, (int) (1)), 4F);
	}
}
