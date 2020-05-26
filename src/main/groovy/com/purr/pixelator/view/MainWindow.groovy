package com.purr.pixelator.view

import com.purr.pixelator.model.PurrImage
import com.purr.pixelator.util.ClasspathResourceLoader
import com.purr.pixelator.util.ClasspathResourceLoaderIMPL
import com.purr.pixelator.util.ImageDisplayer
import com.purr.pixelator.util.MyImageDisplayer
import groovy.util.logging.Slf4j

import javax.swing.JButton
import javax.swing.JFrame
import java.awt.GridLayout
import java.awt.HeadlessException
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

@Slf4j
final class MainWindow extends JFrame {

	//TODO get these from properties
	/**
	 * Display Window Properties
	 */
	private final static String windowTitle = "Pixelator by Judit Tovissy @ tovissy.com"
	private final static int windowSizeX = 500
	private final static int windowSizeY = 525
	private final static int gridRows = 2
	private final static int gridCols = 1
	private final static String demoImagePath = "assets/wip/catzilla.jpg"

	/**
	 * Window Components
	 */
	private JButton showDemoImageButton

	/**
	 * Controllers //todo find a better name
	 */
	ImageDisplayer imageDisplayer
	ClasspathResourceLoader classpathResourceLoader


    MainWindow() throws HeadlessException {
        log.trace("MEOW :: MainWindow Init")
		//TODO Beanify & Autowire this
		classpathResourceLoader = new ClasspathResourceLoaderIMPL()
		imageDisplayer = new MyImageDisplayer()
		setupWindow()
    }

	private void setupWindow() {
		setLayout(new GridLayout(gridRows,gridCols))
		this.setTitle(windowTitle)
		setSize(windowSizeX, windowSizeY)
		setDefaultCloseOperation(EXIT_ON_CLOSE)
		initComponents()
	}

	private void initComponents(){
		showDemoImageButton = new JButton()
		showDemoImageButton.setText("Show Demo Image")
		add(showDemoImageButton)
		addComponentActions()
	}

	private void addComponentActions() {
		showDemoImageButton.addActionListener(new ActionListener() {
			@Override
			void actionPerformed(ActionEvent actionEvent) {
				try { //todo better error handling
					String resourcePath = classpathResourceLoader.getPathOfResource(demoImagePath)
					imageDisplayer.displayImageInNewWindow(resourcePath)
				}
				catch (Exception e) {
					e.printStackTrace()
				}
			}
		})
	}

	private void showPurrImage(PurrImage image) {
		imageDisplayer.displayImageInNewWindow(image)
	}
}
