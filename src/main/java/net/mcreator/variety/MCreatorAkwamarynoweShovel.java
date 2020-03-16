package net.mcreator.variety;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@Elementsvariety.ModElement.Tag
public class MCreatorAkwamarynoweShovel extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:akwamarynoweshovel")
	public static final Item block = null;

	public MCreatorAkwamarynoweShovel(Elementsvariety instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("AKWAMARYNOWESHOVEL", 9, 1000, 10.5f, 2.5f, 50)) {
			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 9);
				return ret.keySet();
			}
		}.setUnlocalizedName("akwamarynoweshovel").setRegistryName("akwamarynoweshovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("variety:akwamarynoweshovel", "inventory"));
	}
}
