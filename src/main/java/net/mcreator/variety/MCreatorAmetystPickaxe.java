package net.mcreator.variety;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@Elementsvariety.ModElement.Tag
public class MCreatorAmetystPickaxe extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:ametystpickaxe")
	public static final Item block = null;

	public MCreatorAmetystPickaxe(Elementsvariety instance) {
		super(instance, 126);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("AMETYSTPICKAXE", 12, 1500, 12f, 4f, 50)) {
			{
				this.attackSpeed = -2.7999999999999998f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 12);
				return ret.keySet();
			}
		}.setUnlocalizedName("ametystpickaxe").setRegistryName("ametystpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("variety:ametystpickaxe", "inventory"));
	}
}
