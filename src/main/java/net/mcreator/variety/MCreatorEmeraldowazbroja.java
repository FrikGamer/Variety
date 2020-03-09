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
public class MCreatorEmeraldowazbroja extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:emeraldowazbrojahelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:emeraldowazbrojabody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:emeraldowazbrojalegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:emeraldowazbrojaboots")
	public static final Item boots = null;

	public MCreatorEmeraldowazbroja(Elementsvariety instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALDOWAZBROJA", "variety:emeraldowazbroja", 24, new int[]{3, 6, 8, 4}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.3000000000000003f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emeraldowazbrojahelmet")
				.setRegistryName("emeraldowazbrojahelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emeraldowazbrojabody")
				.setRegistryName("emeraldowazbrojabody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emeraldowazbrojalegs")
				.setRegistryName("emeraldowazbrojalegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emeraldowazbrojaboots")
				.setRegistryName("emeraldowazbrojaboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:emeraldowazbrojahelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:emeraldowazbrojabody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("variety:emeraldowazbrojalegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("variety:emeraldowazbrojaboots", "inventory"));
	}
}
