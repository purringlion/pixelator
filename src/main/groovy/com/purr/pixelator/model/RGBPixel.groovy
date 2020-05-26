package com.purr.pixelator.model

/**
 * This class uses a 32 bit XRGB representation
 */
final class RGBPixel {

    private final static int BITMASK_RED = 16711680;   // 00000000111111110000000000000000
    private final static int BITMASK_GREEN = 65280;    // 00000000000000001111111100000000
    private final static int BITMASK_BLUE = 255;       // 00000000000000000000000011111111

    private int pixelValue

    int getRed(){
        return  (pixelValue & BITMASK_RED) >>16
    }

    int getGreen(){
        return (pixelValue & BITMASK_GREEN)>>8
    }

    int getBlue(){
        return pixelValue & BITMASK_BLUE
    }

    int getPixelValue() {
        return pixelValue
    }

    void setPixelValue(int pixelValue) {
        this.pixelValue = pixelValue
    }

    RGBPixel() {
        this(0)
    }

    RGBPixel(int pixelValue) {
        this.pixelValue = pixelValue
    }

    RGBPixel(int r, int g, int b) {
        pixelValue = ((r << 16) | (g << 8) | (b))
    }

}
