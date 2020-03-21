package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorSilverrc extends Elementsvariety.ModElement {
	public MCreatorSilverrc(Elementsvariety instance) {
		super(instance, 337);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSilverrDust.block, (int) (1)), new ItemStack(MCreatorSilverIngot.block, (int) (1)), 3F);
	}
}
