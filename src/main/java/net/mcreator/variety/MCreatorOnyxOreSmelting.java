package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorOnyxOreSmelting extends Elementsvariety.ModElement {
	public MCreatorOnyxOreSmelting(Elementsvariety instance) {
		super(instance, 217);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorOnyxOre.block, (int) (1)), new ItemStack(MCreatorOnyxGem.block, (int) (1)), 7F);
	}
}
