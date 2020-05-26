package com.purr.pixelator.view

import com.purr.pixelator.util.ClasspathResourceLoaderIMPL
import com.sun.jndi.toolkit.url.Uri
import ij.ImagePlus
import spock.lang.Ignore
import spock.lang.Specification

import javax.swing.JFrame
import java.awt.event.WindowEvent

class MainWindowSpec extends Specification {

    private MainWindow window

    def setup() {
        window = new MainWindow()
    }

    def "Displayed Window Title matches stored Title"() {
        final String storedTitle = "Pixelator by Judit Tovissy @ tovissy.com"

        expect:
        window.getTitle() == storedTitle
    }

    def "Window not visible by default"() {
        expect:
        !window.isVisible()
    }

    def "Default Close Operation is Exit"() {
        expect:
        window.getDefaultCloseOperation() == JFrame.EXIT_ON_CLOSE
    }

    /**
     * TODO See if this event should be sent differently
     * or that it's just not possible to close a JFrame during a test
     */
    @Ignore
    def "Window can be closed"() {
        when:
        try {
            window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING))
        }
        catch(Exception e) {
            e.printStackTrace()
        }

        then:
        noExceptionThrown()
    }

    @Ignore //This was just hacking it together until it worked
    def "show image"() {
        try {
            String demoImagePath = "assets/wip/catzilla.jpg"
            ClasspathResourceLoaderIMPL loader = new ClasspathResourceLoaderIMPL()
            String path = loader.getPathOfResource(demoImagePath)
            ImagePlus img = new ImagePlus(path)
            img.show()
        }
        catch (Exception e) {
            println(e.class)
            println(e.message)
            println(e.cause)
            e.properties.each {println(it)}
        }

        expect: true

    }
}
