package com.purr.pixelator.util

import com.purr.pixelator.PurrTestHarness
import com.purr.pixelator.model.PurrImage
import spock.lang.Ignore

import java.awt.image.BufferedImage

class MyImageDisplayerSpec extends PurrTestHarness {

    private MyImageDisplayer imageDisplayer

    private static ClasspathResourceLoader classpathResourceLoader

    private static PurrImage existingImage
    private static final String nonexistingImagePath = "nofile.jpg"
    private static final String existingImagePath = "assets/wip/catzilla.jpg"
    private static String fQImagePath

    def setupSpec(){
        classpathResourceLoader = new ClasspathResourceLoaderIMPL()
        fQImagePath = classpathResourceLoader.getPathOfResource(existingImagePath)
        existingImage = generateDemoImage()
    }

    def setup() {
        imageDisplayer = new MyImageDisplayer()
    }

    private PurrImage generateDemoImage(){
        final int width = 512
        final int height = 512
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
        return new PurrImage(bufferedImage)
    }


    def "Display existing PurrImage"(){
        when:

        try {
            imageDisplayer.displayImageInNewWindow(existingImage)
        } catch(Exception e) {
            tellMeEverything(e)
            throw e
        }

        then:
        noExceptionThrown()
    }

    //TODO how do I make an invalid image?
    @Ignore
    def "Display non-existing PurrImage"(){
        when:

        try {
            imageDisplayer.displayImageInNewWindow(null)
        } catch(Exception e) {
            tellMeEverything(e)
            throw e
        }

        then:
        noExceptionThrown()
    }

    def "Display image from existing filepath"(){
        when:

        try {
            imageDisplayer.displayImageInNewWindow(fQImagePath)
        } catch(Exception e) {
            tellMeEverything(e)
            throw e
        }

        then:
        noExceptionThrown()
    }

    //TODO all exceptions are encapsulated & I only get printouts...what to do with this?
    @Ignore
    def "Display image from non-existing filepath"(){
        when:

        try {
            imageDisplayer.displayImageInNewWindow(nonexistingImagePath)
        } catch(Exception e) {
            tellMeEverything(e)
            throw e
        }

        then:
        noExceptionThrown()
    }

}
