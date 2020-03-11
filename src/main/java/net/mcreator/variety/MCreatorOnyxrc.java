package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorOnyxrc extends Elementsvariety.ModElement {
	public MCreatorOnyxrc(Elementsvariety instance) {
		super(instance, 221);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorOnyxxDust.block, (int) (1)), new ItemStack(MCreatorOnyxGem.block, (int) (1)), 3F);
	}
}
