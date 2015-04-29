package com.trimc.blogger.gngrams.scripts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public final class GngramAdapterTest {

	@Test
	public void line1() throws Throwable {
		String line = "Facilities_NOUN by_ADP Type_NOUN	1970	2	2";

		Gngram gngram = GngramAdapter.transform(line);
		assertNotNull(gngram);

		assertNotNull(gngram.getTerm());
		assertEquals("facilities by type", gngram.getTerm());

		assertNotNull(gngram.getGram1());
		assertEquals("facilities", gngram.getGram1());

		assertNotNull(gngram.getGram2());
		assertEquals("by", gngram.getGram2());

		assertNotNull(gngram.getGram3());
		assertEquals("type", gngram.getGram3());

		assertNotNull(gngram.getMatchCount());
		assertEquals((Double) 2d, (Double) gngram.getMatchCount());

		assertNotNull(gngram.getVolumeCount());
		assertEquals((Double) 2d, (Double) gngram.getVolumeCount());

		assertNotNull(gngram.getNgramType());
		assertEquals(NgramType.TRIGRAM, gngram.getNgramType());
	}
}
