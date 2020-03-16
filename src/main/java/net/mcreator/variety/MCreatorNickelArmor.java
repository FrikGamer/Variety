package net.mcreator.variety;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsvariety.ModElement.Tag
public class MCreatorNickelArmor extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:nickelarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:nickelarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:nickelarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:nickelarmorboots")
	public static final Item boots = null;

	public MCreatorNickelArmor(Elementsvariety instance) {
		super(instance, 100);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("NICKELARMOR", "variety:nickel", 50, new int[]{2, 5, 7, 2}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("nickelarmorhelmet")
				.setRegistryName("nickelarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("nickelarmorbody")
				.setRegistryName("nickelarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("nickelarmorlegs")
				.setRegistryName("nickelarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("nickelarmorboots")
				.setRegistryName("nickelarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:nickelarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:nickelarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("variety:nickelarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("variety:nickelarmorboots", "inventory"));
	}
}
