package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@Elementsvariety.ModElement.Tag
public class MCreatorZelazorm extends Elementsvariety.ModElement {
	public MCreatorZelazorm(Elementsvariety instance) {
		super(instance, 131);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMagnetytGem.block, (int) (1)), new ItemStack(Items.IRON_INGOT, (int) (1)), 5F);
	}
}
