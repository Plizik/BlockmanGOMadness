
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package plizik.bgm.init;

import plizik.bgm.fluid.WaterFluid;
import plizik.bgm.fluid.LavaFluid;
import plizik.bgm.BgmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class BgmModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, BgmMod.MODID);
	public static final RegistryObject<Fluid> WATER = REGISTRY.register("water", () -> new WaterFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_WATER = REGISTRY.register("flowing_water", () -> new WaterFluid.Flowing());
	public static final RegistryObject<Fluid> LAVA = REGISTRY.register("lava", () -> new LavaFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_LAVA = REGISTRY.register("flowing_lava", () -> new LavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_WATER.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(LAVA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LAVA.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
