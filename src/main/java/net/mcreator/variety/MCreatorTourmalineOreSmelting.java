package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorTourmalineOreSmelting extends Elementsvariety.ModElement {
	public MCreatorTourmalineOreSmelting(Elementsvariety instance) {
		super(instance, 281);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorTourmalineOre.block, (int) (1)), new ItemStack(MCreatorTourmalineGem.block, (int) (1)), 5F);
	}
}
