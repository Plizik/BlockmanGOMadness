
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package plizik.bgm.init;

import plizik.bgm.client.model.Modelsteve;
import plizik.bgm.client.model.Modelbgm_leggingsver2;
import plizik.bgm.client.model.Modelbgm_leggings;
import plizik.bgm.client.model.Modelbgm_helmetver2;
import plizik.bgm.client.model.Modelbgm_helmet;
import plizik.bgm.client.model.Modelbgm_helmerver2;
import plizik.bgm.client.model.Modelbgm_chestplatever2;
import plizik.bgm.client.model.Modelbgm_chestplate;
import plizik.bgm.client.model.Modelbgm_bootsver2;
import plizik.bgm.client.model.Modelbgm_boots;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BgmModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelbgm_bootsver2.LAYER_LOCATION, Modelbgm_bootsver2::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_helmetver2.LAYER_LOCATION, Modelbgm_helmetver2::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_chestplate.LAYER_LOCATION, Modelbgm_chestplate::createBodyLayer);
		event.registerLayerDefinition(Modelsteve.LAYER_LOCATION, Modelsteve::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_leggingsver2.LAYER_LOCATION, Modelbgm_leggingsver2::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_boots.LAYER_LOCATION, Modelbgm_boots::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_leggings.LAYER_LOCATION, Modelbgm_leggings::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_chestplatever2.LAYER_LOCATION, Modelbgm_chestplatever2::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_helmerver2.LAYER_LOCATION, Modelbgm_helmerver2::createBodyLayer);
		event.registerLayerDefinition(Modelbgm_helmet.LAYER_LOCATION, Modelbgm_helmet::createBodyLayer);
	}
}
