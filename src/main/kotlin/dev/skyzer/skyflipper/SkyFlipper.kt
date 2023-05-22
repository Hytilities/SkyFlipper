package dev.skyzer.skyflipper

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import net.minecraftforge.client.event.GuiOpenEvent
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

@Mod(
    name = SkyFlipper.MOD_NAME,
    modid = SkyFlipper.MOD_ID,
    version = SkyFlipper.MOD_VERSION,

    acceptedMinecraftVersions = "[1.8.9]",
    clientSideOnly = true
)
class SkyFlipper {

    companion object {
        const val MOD_NAME = "%MOD_NAME"
        const val MOD_ID = "%MOD_ID%"
        const val MOD_VERSION = "%MOD_VERSION%"

        val httpClient = HttpClient(CIO)


        fun registerEvent(handler: Any) = MinecraftForge.EVENT_BUS.register(handler)


    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        registerEvent(this)
    }

    @SubscribeEvent
    fun onContainerOpen(event: GuiOpenEvent) {

    }
}