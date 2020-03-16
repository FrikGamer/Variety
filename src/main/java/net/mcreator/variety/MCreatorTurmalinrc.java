package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorTurmalinrc extends Elementsvariety.ModElement {
	public MCreatorTurmalinrc(Elementsvariety instance) {
		super(instance, 287);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorTourmalineeDust.block, (int) (1)), new ItemStack(MCreatorTourmalineGem.block, (int) (1)), 3F);
	}
}
