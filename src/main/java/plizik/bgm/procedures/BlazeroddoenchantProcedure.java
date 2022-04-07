package plizik.bgm.procedures;

import plizik.bgm.init.BgmModItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlazeroddoenchantProcedure {
	@SubscribeEvent
	public static void onPickup(EntityItemPickupEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		(new ItemStack(BgmModItems.BLAZEROD.get())).enchant(Enchantments.KNOCKBACK, 3);
	}
}
