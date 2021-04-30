package de.kleinelamas.klara.lernt.code

import de.kleinelamas.klara.lernt.helfer.modelle.Tier

class Objekte {
    companion object {
        fun warnung(tier: Tier): String {
            return "EIN HAI!"
        }

        fun futterZeit(tier: Tier): Tier {
            return tier
        }
    }
}