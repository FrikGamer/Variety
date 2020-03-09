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
public class MCreatorRubinowazbroja extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:rubinowazbrojahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:rubinowazbrojabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:rubinowazbrojalegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:rubinowazbrojaboots")
	public static final Item boots = null;

	public MCreatorRubinowazbroja(Elementsvariety instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RUBINOWAZBROJA", "variety:zbroja rubinowa", 25, new int[]{4, 7, 9, 4}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rubinowazbrojahelmet")
				.setRegistryName("rubinowazbrojahelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("rubinowazbrojabody")
				.setRegistryName("rubinowazbrojabody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("rubinowazbrojalegs")
				.setRegistryName("rubinowazbrojalegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("rubinowazbrojaboots")
				.setRegistryName("rubinowazbrojaboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:rubinowazbrojahelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:rubinowazbrojabody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("variety:rubinowazbrojalegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("variety:rubinowazbrojaboots", "inventory"));
	}
}
