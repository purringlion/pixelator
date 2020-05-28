package com.purr.pixelator.model

import com.purr.pixelator.PurrTestHarness

class RGBPixelSpec extends PurrTestHarness {
    //TODO write unit tests

    /**
     * Since RGBPixel's underlying representation is XRGB
     * the first 8 bits are "don't care"
     * Some of these TCs explore that RGBPixel should be
     * tolerant of having bits in the first 8 turned "on".
     */

    /**
     * [128,150,50,200]
     */
    private final RGBPixel pixelWithXBits = new RGBPixel(144061128)

    /**
     * [0,150,50,200]
     */
    private final RGBPixel pixel = new RGBPixel(9843400)

    private final int expectedRED = 150
    private final int expectedGREEN = 50
    private final int expectedBLUE = 200


    def "Get the right value for the Red channel"(){
        expect:
        pixel.getRed() == expectedRED
    }

    def "Get the right value for the Green channel"(){
        expect:
        pixel.getGreen() == expectedGREEN
    }

    def "Get the right value for the Blue channel"(){
        expect:
        pixel.getBlue() == expectedBLUE
    }

    def "Get the same R value for both pixels"(){
        expect:
        pixel.getRed() == pixelWithXBits.getRed()
    }

    def "Get the same G value for both pixels"(){
        expect:
        pixel.getGreen() == pixelWithXBits.getGreen()
    }

    def "Get the same B value for both pixels"(){
        expect:
        pixel.getBlue() == pixelWithXBits.getBlue()
    }
}
