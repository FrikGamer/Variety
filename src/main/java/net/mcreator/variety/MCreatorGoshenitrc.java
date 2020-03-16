package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorGoshenitrc extends Elementsvariety.ModElement {
	public MCreatorGoshenitrc(Elementsvariety instance) {
		super(instance, 292);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorGoshenitttDust.block, (int) (1)), new ItemStack(MCreatorGoshenittGem.block, (int) (1)), 3F);
	}
}
