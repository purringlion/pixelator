package com.purr.pixelator.view

import javax.swing.JFrame
import java.awt.GridLayout
import java.awt.HeadlessException

class MainWindow extends JFrame {

    MainWindow() throws HeadlessException {
        println("MEOW :: MainWindow Init")
		setLayout(new GridLayout(2,1))
		this.setTitle("Pixelator by Judit Tovissy @ tovissy.com")
		setSize(500,525)
		setDefaultCloseOperation(EXIT_ON_CLOSE)
//		setVisible(true) // I'll set this on App level
    }
}
