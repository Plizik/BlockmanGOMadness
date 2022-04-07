
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package plizik.bgm.init;

import plizik.bgm.block.entity.StickypistonBlockEntity;
import plizik.bgm.block.entity.PistonBlockEntity;
import plizik.bgm.block.entity.ObsidianbedwarsBlockEntity;
import plizik.bgm.BgmMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class BgmModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, BgmMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PISTON = register("piston", BgmModBlocks.PISTON, PistonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STICKYPISTON = register("stickypiston", BgmModBlocks.STICKYPISTON,
			StickypistonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OBSIDIANBEDWARS = register("obsidianbedwars", BgmModBlocks.OBSIDIANBEDWARS,
			ObsidianbedwarsBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
