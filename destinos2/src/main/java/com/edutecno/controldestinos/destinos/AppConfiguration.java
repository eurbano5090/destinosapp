package com.edutecno.controldestinos.destinos;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.edutecno.controldestinos.destinos")
@PropertySource("classpath:database.properties")
public class AppConfiguration {

	@Autowired
	Environment environment;
	
	@Bean
	DataSource dataSource() {
	DriverManagerDataSource dmds=new DriverManagerDataSource();
	dmds.setUrl(environment.getProperty("url"));
	dmds.setUsername(environment.getProperty("dbuser"));
	dmds.setPassword(environment.getProperty("dbpassword"));
	dmds.setDriverClassName(environment.getProperty("driver"));
	return dmds;
}
	}
