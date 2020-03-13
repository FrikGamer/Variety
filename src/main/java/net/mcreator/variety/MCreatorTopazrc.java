package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorTopazrc extends Elementsvariety.ModElement {
	public MCreatorTopazrc(Elementsvariety instance) {
		super(instance, 260);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorTopazzDust.block, (int) (1)), new ItemStack(MCreatorTopazGem.block, (int) (1)), 3F);
	}
}
