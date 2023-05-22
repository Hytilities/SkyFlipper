package dev.skyzer.skyflipper.api

class ItemRecipeResponse(
    A1: String?,
    A2: String?,
    A3: String?,
    B1: String?,
    B2: String?,
    B3: String?,
    C1: String?,
    C2: String?,
    C3: String?,
    val count: Int
) {
    private val a1Split = A1?.split(":")
    private val a2Split = A2?.split(":")
    private val a3Split = A3?.split(":")
    private val b1Split = B1?.split(":")
    private val b2Split = B2?.split(":")
    private val b3Split = B3?.split(":")
    private val c1Split = C1?.split(":")
    private val c2Split = C2?.split(":")
    private val c3Split = C3?.split(":")

    

}

