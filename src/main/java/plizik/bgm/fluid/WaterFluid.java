
package plizik.bgm.fluid;

import plizik.bgm.init.BgmModItems;
import plizik.bgm.init.BgmModFluids;
import plizik.bgm.init.BgmModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

public abstract class WaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BgmModFluids.WATER, BgmModFluids.FLOWING_WATER,
			FluidAttributes.builder(new ResourceLocation("bgm:blocks/water_still"), new ResourceLocation("bgm:blocks/water_flow"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty")))).explosionResistance(100f).canMultiply()

							.bucket(BgmModItems.WATER_BUCKET).block(() -> (LiquidBlock) BgmModBlocks.WATER.get());

	private WaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WaterFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WaterFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
