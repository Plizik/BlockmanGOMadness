
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package plizik.bgm.init;

import plizik.bgm.enchantment.VenomEnchantment;
import plizik.bgm.BgmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class BgmModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BgmMod.MODID);
	public static final RegistryObject<Enchantment> VENOM = REGISTRY.register("venom", () -> new VenomEnchantment());
}
