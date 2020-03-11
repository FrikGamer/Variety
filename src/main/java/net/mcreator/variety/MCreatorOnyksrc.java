package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorOnyksrc extends Elementsvariety.ModElement {
	public MCreatorOnyksrc(Elementsvariety instance) {
		super(instance, 223);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorOnyxDust.block, (int) (1)), new ItemStack(MCreatorOnyxGem.block, (int) (1)), 5F);
	}
}
