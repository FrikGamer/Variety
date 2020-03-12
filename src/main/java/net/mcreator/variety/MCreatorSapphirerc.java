package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorSapphirerc extends Elementsvariety.ModElement {
	public MCreatorSapphirerc(Elementsvariety instance) {
		super(instance, 250);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSapphireDust.block, (int) (1)), new ItemStack(MCreatorSapphireGem.block, (int) (1)), 3F);
	}
}
