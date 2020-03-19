package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorSpinelOreSmelting extends Elementsvariety.ModElement {
	public MCreatorSpinelOreSmelting(Elementsvariety instance) {
		super(instance, 318);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSpinelOre.block, (int) (1)), new ItemStack(MCreatorSpinelGem.block, (int) (1)), 5F);
	}
}
