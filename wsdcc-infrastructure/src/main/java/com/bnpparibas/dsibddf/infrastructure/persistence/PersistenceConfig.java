package com.bnpparibas.dsibddf.infrastructure.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author b25327
 * 
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
@EntityScan(basePackages = { "com.bnpparibas", "com.bnpparibas.dsibddf.infrastructuree",
		// java.time JPA support
		"org.springframework.data.jpa.convert.threeten" })
@ComponentScan(basePackages = { "com.bnpparibas.dsibddf.infrastructure.persistence" })
public class PersistenceConfig {

}