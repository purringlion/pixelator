package com.purr.pixelator.util

import com.purr.pixelator.model.PurrImage
import ij.ImagePlus

import java.awt.image.BufferedImage

class MyImageDisplayer implements ImageDisplayer{

    private ClasspathResourceLoader classpathResourceLoader

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
