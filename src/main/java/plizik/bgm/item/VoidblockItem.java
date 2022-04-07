
package plizik.bgm.item;

import plizik.bgm.procedures.VoidblockItemInVoidProcedure;
import plizik.bgm.init.BgmModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class VoidblockItem extends Item {
	public VoidblockItem() {
		super(new Item.Properties().tab(BgmModTabs.TAB_BGM_ITEMS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Saves from death from the void. Of course"));
		list.add(new TextComponent("if you don't have a roof above you :)"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		VoidblockItemInVoidProcedure.execute(world, entity);
	}
}
