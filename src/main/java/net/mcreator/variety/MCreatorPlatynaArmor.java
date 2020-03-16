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
public class MCreatorPlatynaArmor extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:platynaarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:platynaarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:platynaarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:platynaarmorboots")
	public static final Item boots = null;

	public MCreatorPlatynaArmor(Elementsvariety instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PLATYNAARMOR", "variety:platyna", 25, new int[]{2, 7, 9, 4}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("platynaarmorhelmet")
				.setRegistryName("platynaarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("platynaarmorbody")
				.setRegistryName("platynaarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("platynaarmorlegs")
				.setRegistryName("platynaarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("platynaarmorboots")
				.setRegistryName("platynaarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:platynaarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:platynaarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("variety:platynaarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("variety:platynaarmorboots", "inventory"));
	}
}
