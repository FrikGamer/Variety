package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorRubydustrc extends Elementsvariety.ModElement {
	public MCreatorRubydustrc(Elementsvariety instance) {
		super(instance, 230);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorRubyDust.block, (int) (1)), new ItemStack(MCreatorRubin.block, (int) (1)), 3F);
	}
}
