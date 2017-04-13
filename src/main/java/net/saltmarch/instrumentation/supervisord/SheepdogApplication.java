package net.saltmarch.instrumentation.supervisord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SheepdogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SheepdogApplication.class, args);
	}
}
