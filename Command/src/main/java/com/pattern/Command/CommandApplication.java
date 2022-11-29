package com.pattern.Command;

import com.pattern.Command.editor.Editor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandApplication.class, args);

		Editor editor = new Editor();
		editor.init();

	}

}
