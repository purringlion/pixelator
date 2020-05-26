package com.purr.pixelator.view

import groovy.util.logging.Slf4j
import javax.swing.JFrame
import java.awt.GridLayout
import java.awt.HeadlessException

@Slf4j
class MainWindow extends JFrame {

	//TODO get these from properties
	private final static String windowTitle = "Pixelator by Judit Tovissy @ tovissy.com"
	private final static int windowSizeX = 500
	private final static int windowSizeY = 525
	private final static int gridRows = 2
	private final static int gridCols = 1


    MainWindow() throws HeadlessException {
        log.trace("MEOW :: MainWindow Init")
		setupWindow()
    }

	private setupWindow() {
		setLayout(new GridLayout(gridRows,gridCols))
		this.setTitle(windowTitle)
		setSize(windowSizeX, windowSizeY)
		setDefaultCloseOperation(EXIT_ON_CLOSE)
	}
}
