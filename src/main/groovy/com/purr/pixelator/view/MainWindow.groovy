package com.purr.pixelator.view

import groovy.util.logging.Slf4j

import javax.swing.JFrame
import java.awt.GridLayout
import java.awt.HeadlessException

@Slf4j
class MainWindow extends JFrame {

    MainWindow() throws HeadlessException {
        log.trace("MEOW :: MainWindow Init")
		setupWindow()
    }

	private setupWindow() {
		setLayout(new GridLayout(2,1))
		this.setTitle("Pixelator by Judit Tovissy @ tovissy.com")
		setSize(500,525)
		setDefaultCloseOperation(EXIT_ON_CLOSE)
//		setVisible(true) // I'll set this on App level
	}
}
