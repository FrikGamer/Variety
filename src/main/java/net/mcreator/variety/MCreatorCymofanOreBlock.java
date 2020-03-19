package net.mcreator.variety;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@Elementsvariety.ModElement.Tag
public class MCreatorCymofanOreBlock extends Elementsvariety.ModElement {
	@GameRegistry.ObjectHolder("variety:cymofanoreblock")
	public static final Block block = null;

	public MCreatorCymofanOreBlock(Elementsvariety instance) {
		super(instance, 294);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader
				.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("variety:cymofanoreblock", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setRegistryName("cymofanoreblock");
			setUnlocalizedName("cymofanoreblock");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 2);
			setHardness(5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}
	}
}