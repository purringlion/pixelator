package com.purr.pixelator.view

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
}
