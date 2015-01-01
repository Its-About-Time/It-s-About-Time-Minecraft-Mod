package itsabouttime.common.blocks;

import itsabouttime.iat;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockOldPlanks extends Block{
	@SideOnly(Side.CLIENT)
private IIcon[] texture;
	final static String[] subBlocks = new String[] {"Progymnosperm", "Lepidodendron", "Prototaxites", "TreeFern"};
	public BlockOldPlanks() {
		super(Material.wood);
		this.setStepSound(soundTypeWood);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconregister){
		
		texture = new IIcon[subBlocks.length];
		for(int i = 0; i < subBlocks.length; i++){
			texture[i]=iconregister.registerIcon("iat:" + "Planks_" + subBlocks[i] );
		}
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block,CreativeTabs creativetabs, List list){
		
		for (int i = 0; i<subBlocks.length; i++){
			list.add(new ItemStack(block, 1, i));
		}
	}
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return texture[meta];
	}
	public int damageDropped(int meta){
		return meta;
	}
	
}