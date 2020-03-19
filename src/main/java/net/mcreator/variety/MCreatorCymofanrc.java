package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorCymofanrc extends Elementsvariety.ModElement {
	public MCreatorCymofanrc(Elementsvariety instance) {
		super(instance, 323);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorSpinellDust.block, (int) (1)), new ItemStack(MCreatorSpinelGem.block, (int) (1)), 3F);
	}
}
