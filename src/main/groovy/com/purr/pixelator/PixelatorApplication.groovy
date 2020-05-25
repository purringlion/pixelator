package com.purr.pixelator

import com.purr.pixelator.view.MainWindow
import groovy.util.logging.Slf4j
import org.slf4j.IMarkerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ConfigurableApplicationContext
import java.awt.EventQueue

@Slf4j
@SpringBootApplication
class PixelatorApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(MainWindow)
				.headless(false).run(args)

		log.trace("MEOW :: Pixelator:main running")

		EventQueue.invokeLater({ ->
			MainWindow mainWindow = ctx.getBean(MainWindow);
			mainWindow.setVisible(true);
		})
	}
}
