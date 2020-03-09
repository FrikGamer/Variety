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
public class MCreatorMagnetytArmor extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:magnetytarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:magnetytarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:magnetytarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:magnetytarmorboots")
	public static final Item boots = null;

	public MCreatorMagnetytArmor(Elementsvariety instance) {
		super(instance, 125);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MAGNETYTARMOR", "variety:magnetyt", 30, new int[]{4, 5, 6, 3}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("magnetytarmorhelmet")
				.setRegistryName("magnetytarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("magnetytarmorbody")
				.setRegistryName("magnetytarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("magnetytarmorlegs")
				.setRegistryName("magnetytarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("magnetytarmorboots")
				.setRegistryName("magnetytarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:magnetytarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:magnetytarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("variety:magnetytarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("variety:magnetytarmorboots", "inventory"));
	}
}
