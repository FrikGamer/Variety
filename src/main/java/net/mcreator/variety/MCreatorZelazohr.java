package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@Elementsvariety.ModElement.Tag
public class MCreatorZelazohr extends Elementsvariety.ModElement {
	public MCreatorZelazohr(Elementsvariety instance) {
		super(instance, 189);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorHematytIngot.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (2)), 3F);
	}
}
