package com.purr.pixelator.util

import com.purr.pixelator.model.PurrImage
import ij.ImagePlus

final class MyImageDisplayer implements ImageDisplayer{

    @Override
    void displayImageInNewWindow(PurrImage image) {
        ImagePlus imageDisplay = new ImagePlus(image.getBufferedImage())
        imageDisplay.show()
    }

    @Override
    void displayImageInNewWindow(String filePath) {
        ImagePlus imageDisplay = new ImagePlus(filePath)
        imageDisplay.show()
    }
}
