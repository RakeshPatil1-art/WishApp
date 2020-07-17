package com.nt.wish;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WishMessageAppApplication {

	public static Logger log = Logger.getLogger(WishMessageAppApplication.class.getName());

	@GetMapping("/wish")
	public String wishApp() {
		log.info("Application statrted...");
		return "Good Morning";
	}

	public static void main(String[] args) {
		SpringApplication.run(WishMessageAppApplication.class, args);
	}

}
