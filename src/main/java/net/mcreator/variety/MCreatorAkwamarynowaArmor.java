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
public class MCreatorAkwamarynowaArmor extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:akwamarynowaarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:akwamarynowaarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:akwamarynowaarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:akwamarynowaarmorboots")
	public static final Item boots = null;

	public MCreatorAkwamarynowaArmor(Elementsvariety instance) {
		super(instance, 79);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AKWAMARYNOWAARMOR", "variety:akwamarynowa", 26, new int[]{3, 6, 8, 4}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("akwamarynowaarmorhelmet")
				.setRegistryName("akwamarynowaarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("akwamarynowaarmorbody")
				.setRegistryName("akwamarynowaarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("akwamarynowaarmorlegs")
				.setRegistryName("akwamarynowaarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("akwamarynowaarmorboots")
				.setRegistryName("akwamarynowaarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:akwamarynowaarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:akwamarynowaarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("variety:akwamarynowaarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("variety:akwamarynowaarmorboots", "inventory"));
	}
}
