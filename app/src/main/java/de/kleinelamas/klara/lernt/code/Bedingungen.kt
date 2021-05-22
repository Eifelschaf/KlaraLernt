package de.kleinelamas.klara.lernt.code

class Bedingungen {

    companion object {
        fun istEinPanda(baer: String): String {
            if (baer.contains("Panda")) {
                return "ist ein Panda!"
            }
            return "ist kein Panda"
        }

        fun istEinBaer(dingsi: String): Boolean {
            if (dingsi == "Gummibär") {
                return false
            } else if (dingsi.contains("bär")) {
                return true
            }
            return false
        }
    }
}