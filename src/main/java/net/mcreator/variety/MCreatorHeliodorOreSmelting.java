package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorHeliodorOreSmelting extends Elementsvariety.ModElement {
	public MCreatorHeliodorOreSmelting(Elementsvariety instance) {
		super(instance, 271);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorHeliodorOre.block, (int) (1)), new ItemStack(MCreatorHeliodorGem.block, (int) (1)), 5F);
	}
}
