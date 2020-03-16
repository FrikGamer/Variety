package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorMagnetytr extends Elementsvariety.ModElement {
	public MCreatorMagnetytr(Elementsvariety instance) {
		super(instance, 201);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMagnetytOre.block, (int) (1)), new ItemStack(MCreatorMagnetytGem.block, (int) (1)), 3F);
	}
}
