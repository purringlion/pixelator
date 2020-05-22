package com.purr.pixelator

import spock.lang.Specification

class HelloTests extends Specification {

    def "Should print Hello Meow"() {
        println("Hello Meow!")

        expect:
        true
    }

}
