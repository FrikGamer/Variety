package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvariety.ModElement.Tag
public class MCreatorAkwamatynr extends Elementsvariety.ModElement {
	public MCreatorAkwamatynr(Elementsvariety instance) {
		super(instance, 239);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorRudaakwamarynu.block, (int) (1)), new ItemStack(MCreatorAkwamaryn.block, (int) (1)), 2F);
	}
}
