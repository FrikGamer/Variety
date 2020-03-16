package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorPlatynar extends Elementsvariety.ModElement {
	public MCreatorPlatynar(Elementsvariety instance) {
		super(instance, 214);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorPlatynaOre.block, (int) (1)), new ItemStack(MCreatorPlatynaIngot.block, (int) (1)), 8F);
	}
}
