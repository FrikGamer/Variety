package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorAmetystOreSmelting extends Elementsvariety.ModElement {
	public MCreatorAmetystOreSmelting(Elementsvariety instance) {
		super(instance, 217);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorAmetystOre.block, (int) (1)), new ItemStack(MCreatorAmetystGem.block, (int) (1)), 4F);
	}
}
