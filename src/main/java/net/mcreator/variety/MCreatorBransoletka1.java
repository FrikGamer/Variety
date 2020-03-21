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
public class MCreatorBransoletka1 extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:bransoletka1helmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("variety:bransoletka1body")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("variety:bransoletka1legs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("variety:bransoletka1boots")
	public static final Item boots = null;

	public MCreatorBransoletka1(Elementsvariety instance) {
		super(instance, 325);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BRANSOLETKA1", "variety:bransoletka", 0, new int[]{0, 0, 0, 0}, 0,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("bransoletka1helmet")
				.setRegistryName("bransoletka1helmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("bransoletka1body")
				.setRegistryName("bransoletka1body").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("variety:bransoletka1helmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("variety:bransoletka1body", "inventory"));
	}
}
