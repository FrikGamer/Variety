package net.mcreator.variety;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;

@Elementsvariety.ModElement.Tag
public class MCreatorEmeralddustrc extends Elementsvariety.ModElement {
	public MCreatorEmeralddustrc(Elementsvariety instance) {
		super(instance, 231);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorEmeraldDust.block, (int) (1)), new ItemStack(Items.EMERALD, (int) (1)), 3F);
	}
}
