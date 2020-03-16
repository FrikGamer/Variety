package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorHematytr extends Elementsvariety.ModElement {
	public MCreatorHematytr(Elementsvariety instance) {
		super(instance, 188);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorHematytOre.block, (int) (1)), new ItemStack(MCreatorHematytIngot.block, (int) (1)), 4F);
	}
}
