package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorSpinelrc extends Elementsvariety.ModElement {
	public MCreatorSpinelrc(Elementsvariety instance) {
		super(instance, 324);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSkapolittDust.block, (int) (1)), new ItemStack(MCreatorSkapolitGem.block, (int) (1)), 3F);
	}
}
