
package plizik.bgm.item;

import plizik.bgm.init.BgmModTabs;
import plizik.bgm.init.BgmModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class LavaItem extends BucketItem {
	public LavaItem() {
		super(BgmModFluids.LAVA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(BgmModTabs.TAB_BGM_ITEMS));
	}
}
