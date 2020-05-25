package com.purr.pixelator

import com.purr.pixelator.view.MainWindow
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ConfigurableApplicationContext

import java.awt.EventQueue

@SpringBootApplication
class PixelatorApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(MainWindow)
				.headless(false).run(args);

		EventQueue.invokeLater({ ->
			MainWindow mainWindow = ctx.getBean(MainWindow);
			mainWindow.setVisible(true);
		});
	}
}
