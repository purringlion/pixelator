package com.purr.pixelator

import spock.lang.Specification

class PurrTestHarness extends Specification {

    //TODO catch & rethrow exceptions automatically with AOP
    //AFTER advice on Exception, call tellMeEverything
    //This will reduce boilerplate

    void tellMeEverything(Exception e) {
        println("Exception!")
        println("    class: " + e.class)
        println("    cause: " + e.cause)
        println("    msg: " + e.message)
        println("    localized msg: " + e.localizedMessage)
        println("    suppressed: " + e.suppressed)
        println("    properties: ")
        e.properties.each {println("        " + it.toString())}
        println("End of Exception")
    }
}
