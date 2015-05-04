package com.trimc.blogger.gngrams.scripts;

import static org.junit.Assert.assertNotNull;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class GngramParserTest {

	private GngramParser getGngramsParser() {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		assertNotNull(ctx);

		GngramParser gngramParser = (GngramParser) ctx.getBean("gngramParser");
		assertNotNull(gngramParser);

		return gngramParser;
	}

//	@Test
	public void faith() throws Throwable {
		getGngramsParser().process("faith", NgramType.TRIGRAM);
	}
}
