package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorRubinr extends Elementsvariety.ModElement {
	public MCreatorRubinr(Elementsvariety instance) {
		super(instance, 56);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorBlokrubinu.block, (int) (1)), new ItemStack(MCreatorRubin.block, (int) (1)), 6F);
	}
}
