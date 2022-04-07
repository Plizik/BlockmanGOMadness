
package plizik.bgm.item;

import plizik.bgm.init.BgmModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BeefItem extends Item {
	public BeefItem() {
		super(new Item.Properties().tab(BgmModTabs.TAB_BGM_ITEMS).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f)

						.build()));
	}
}
