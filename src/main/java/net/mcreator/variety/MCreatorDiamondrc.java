package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@Elementsvariety.ModElement.Tag
public class MCreatorDiamondrc extends Elementsvariety.ModElement {
	public MCreatorDiamondrc(Elementsvariety instance) {
		super(instance, 209);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorProszekdiamentu.block, (int) (1)), new ItemStack(Items.DIAMOND, (int) (1)), 2F);
	}
}
