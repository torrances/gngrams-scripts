package com.trimc.blogger.gngrams.scripts;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class GngramsLocationTest {

	@Test
	public void bigrams() throws Throwable {
		assertTrue(new File(getGngramsLocation().getBigrams()).exists());
	}

	private GngramsLocation getGngramsLocation() {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		assertNotNull(ctx);

		GngramsLocation gngramsLocation = (GngramsLocation) ctx.getBean("gngramsLocation");
		assertNotNull(gngramsLocation);

		return gngramsLocation;
	}

	@Test
	public void trigrams() throws Throwable {
		assertTrue(new File(getGngramsLocation().getTrigrams()).exists());
	}

	@Test
	public void unigrams() throws Throwable {
		assertTrue(new File(getGngramsLocation().getUnigrams()).exists());
	}
}
