package dev.skyzer.skyflipper

import net.minecraftforge.fml.common.Mod

@Mod(
    name = HyFlipper.MOD_NAME,
    modid = HyFlipper.MOD_ID,
    version = HyFlipper.MOD_VERSION,

    acceptedMinecraftVersions = "[1.8.9]",
    clientSideOnly = true
)
class HyFlipper {

    companion object {
        const val MOD_NAME = "%MOD_NAME"
        const val MOD_ID = "%MOD_ID%"
        const val MOD_VERSION = "%MOD_VERSION%"
    }
}