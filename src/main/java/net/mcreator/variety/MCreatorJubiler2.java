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
public class MCreatorJubiler2 extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:jubiler2helmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:jubiler2body")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:jubiler2legs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:jubiler2boots")
	public static final Item boots = null;

	public MCreatorJubiler2(Elementsvariety instance) {
		super(instance, 339);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("JUBILER2", "variety:jubiler", 0, new int[]{0, 0, 0, 0}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("jubiler2helmet")
				.setRegistryName("jubiler2helmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("jubiler2body")
				.setRegistryName("jubiler2body").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:jubiler2helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:jubiler2body", "inventory"));
	}
}
