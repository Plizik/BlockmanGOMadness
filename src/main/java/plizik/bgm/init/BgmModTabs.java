
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package plizik.bgm.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BgmModTabs {
	public static CreativeModeTab TAB_BGMPLANTS;
	public static CreativeModeTab TAB_BGM_BLOCKS;
	public static CreativeModeTab TAB_BGM_ITEMS;
	public static CreativeModeTab TAB_BGM_SKYBLOCK;
	public static CreativeModeTab TAB_BGM_GUNS;
	public static CreativeModeTab TAB_BG_MNOTADDED;
	public static CreativeModeTab TAB_BGM_BEDWARS;

	public static void load() {
		TAB_BGMPLANTS = new CreativeModeTab("tabbgmplants") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BgmModBlocks.SUGARCANE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BGM_BLOCKS = new CreativeModeTab("tabbgm_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BgmModBlocks.OAKPLANKS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BGM_ITEMS = new CreativeModeTab("tabbgm_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BgmModItems.AMETHYSTPICKAXE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BGM_SKYBLOCK = new CreativeModeTab("tabbgm_skyblock") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BgmModBlocks.SKYBLOCKGRASS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BGM_GUNS = new CreativeModeTab("tabbgm_guns") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.CROSSBOW);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BG_MNOTADDED = new CreativeModeTab("tabbg_mnotadded") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BARRIER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_BGM_BEDWARS = new CreativeModeTab("tabbgm_bedwars") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BgmModBlocks.GREENGIFT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
