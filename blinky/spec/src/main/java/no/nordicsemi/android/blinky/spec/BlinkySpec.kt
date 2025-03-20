package no.nordicsemi.android.blinky.spec

import java.util.UUID

class BlinkySpec {

    companion object {
        val BLINKY_SERVICE_UUID: UUID = UUID.fromString("00001523-1212-efde-1523-785feabcd123")
        val BLINKY_BUTTON_CHARACTERISTIC_UUID: UUID = UUID.fromString("00001524-1212-efde-1523-785feabcd123")
        val BLINKY_LED_CHARACTERISTIC_UUID: UUID = UUID.fromString("00001525-1212-efde-1523-785feabcd123")

        val CARKEY_SERVICE_UUID: UUID = UUID.fromString("fc001000-3532-4818-9feb-43adb8f99a27")
        val CARKEY_BUTTON_GROUP_CHARACTERISTIC_UUID: UUID = UUID.fromString("fc001001-3532-4818-9feb-43adb8f99a27")
    }

}