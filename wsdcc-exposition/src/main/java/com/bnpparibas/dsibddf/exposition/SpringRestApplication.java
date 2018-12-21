/**
 * 
 */
package com.bnpparibas.dsibddf.exposition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author B30653
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.bnpparibas.dsibddf")
public class SpringRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestApplication.class, args);
	}

	protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
		return application.sources(SpringRestApplication.class);
	}
}
