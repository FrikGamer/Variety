package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorNickelOreSmelting extends Elementsvariety.ModElement {
	public MCreatorNickelOreSmelting(Elementsvariety instance) {
		super(instance, 184);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorNickelOre.block, (int) (1)), new ItemStack(MCreatorNickelIngot.block, (int) (1)), 4F);
	}
}
