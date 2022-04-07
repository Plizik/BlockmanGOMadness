
package plizik.bgm.item;

import plizik.bgm.init.BgmModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BookItem extends Item {
	public BookItem() {
		super(new Item.Properties().tab(BgmModTabs.TAB_BGM_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
