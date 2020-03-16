package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorMorganitrc extends Elementsvariety.ModElement {
	public MCreatorMorganitrc(Elementsvariety instance) {
		super(instance, 275);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMorganiteeDust.block, (int) (1)), new ItemStack(MCreatorMorganiteGem.block, (int) (1)), 3F);
	}
}
