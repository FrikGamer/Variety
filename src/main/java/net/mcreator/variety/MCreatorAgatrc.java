package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorAgatrc extends Elementsvariety.ModElement {
	public MCreatorAgatrc(Elementsvariety instance) {
		super(instance, 242);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorAgatetDust.block, (int) (1)), new ItemStack(MCreatorAgateGem.block, (int) (1)), 3F);
	}
}
