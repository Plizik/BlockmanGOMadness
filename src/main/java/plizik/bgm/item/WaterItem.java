
package plizik.bgm.item;

import plizik.bgm.init.BgmModTabs;
import plizik.bgm.init.BgmModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class WaterItem extends BucketItem {
	public WaterItem() {
		super(BgmModFluids.WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BgmModTabs.TAB_BGM_ITEMS));
	}
}
