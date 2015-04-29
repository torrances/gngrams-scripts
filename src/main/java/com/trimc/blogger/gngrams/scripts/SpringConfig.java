package com.trimc.blogger.gngrams.scripts;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.trimc.blogger.commons.LogManager;

@Configuration
@ComponentScan("com.trimc.blogger.gngrams.scripts")
public class SpringConfig {

	public static LogManager logger = new LogManager(SpringConfig.class);

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	@Qualifier("gngramsLocation")
	public GngramsLocation getGngramsLocation() {
		return new GngramsLocation();
	}
}
