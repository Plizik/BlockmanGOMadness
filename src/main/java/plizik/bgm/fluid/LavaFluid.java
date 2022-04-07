
package plizik.bgm.fluid;

import plizik.bgm.init.BgmModItems;
import plizik.bgm.init.BgmModFluids;
import plizik.bgm.init.BgmModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

public abstract class LavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(BgmModFluids.LAVA, BgmModFluids.FLOWING_LAVA,
			FluidAttributes.builder(new ResourceLocation("bgm:blocks/lava_still"), new ResourceLocation("bgm:blocks/lava_flow"))

	).explosionResistance(100f)

			.bucket(BgmModItems.LAVA_BUCKET).block(() -> (LiquidBlock) BgmModBlocks.LAVA.get());

	private LavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LavaFluid {
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

	public static class Flowing extends LavaFluid {
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
