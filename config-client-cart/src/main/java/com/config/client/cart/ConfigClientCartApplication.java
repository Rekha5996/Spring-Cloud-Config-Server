package com.config.client.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Vuntla Rekhasree
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientCartApplication.class, args);
	}

}
