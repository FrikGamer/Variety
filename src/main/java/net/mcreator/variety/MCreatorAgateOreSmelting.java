package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorAgateOreSmelting extends Elementsvariety.ModElement {
	public MCreatorAgateOreSmelting(Elementsvariety instance) {
		super(instance, 237);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorAgateOre.block, (int) (1)), new ItemStack(MCreatorAgateGem.block, (int) (1)), 4F);
	}
}
