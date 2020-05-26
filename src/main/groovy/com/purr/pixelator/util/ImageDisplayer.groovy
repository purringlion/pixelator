package com.purr.pixelator.util

import com.purr.pixelator.model.PurrImage

interface ImageDisplayer {

    void displayImageInNewWindow(PurrImage image)

    void displayImageInNewWindow(String filepath)

}