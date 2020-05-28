package com.purr.pixelator.model

import java.awt.image.BufferedImage

final class PurrImage {

    private BufferedImage img

    PurrImage(BufferedImage img) {
        this.img = img
    }

    BufferedImage getBufferedImage() {
        return img
    }

    RGBPixel getPixel(int x, int y) {
        return img.getRGB(x,y)
    }
}
