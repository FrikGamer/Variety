package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorSapphireOreSmelting extends Elementsvariety.ModElement {
	public MCreatorSapphireOreSmelting(Elementsvariety instance) {
		super(instance, 260);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSapphireOre.block, (int) (1)), new ItemStack(MCreatorSapphireGem.block, (int) (1)), 5F);
	}
}
