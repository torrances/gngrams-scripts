package com.trimc.blogger.gngrams.scripts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:config/gngrams.properties")
public class GngramsLocation {

	@Value("${gngrams.bigrams}")
	private String	bigrams;

	@Value("${gngrams.trigrams}")
	private String	trigrams;

	@Value("${gngrams.unigrams}")
	private String	unigrams;

	public String getBigrams() {
		return bigrams;
	}

	public String getTrigrams() {
		return trigrams;
	}

	public String getUnigrams() {
		return unigrams;
	}

	public void setBigrams(String bigrams) {
		this.bigrams = bigrams;
	}

	public void setTrigrams(String trigrams) {
		this.trigrams = trigrams;
	}

	public void setUnigrams(String unigrams) {
		this.unigrams = unigrams;
	}
}
