package com.trimc.blogger.gngrams.scripts;

import static org.junit.Assert.*;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public final class JedisTest {

	@Test
	public void run() throws Throwable {
		Jedis jedis = new Jedis("localhost");
		jedis.connect();
		
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		assertEquals("bar", value);
		
		assertTrue(jedis.keys("no").isEmpty());
		assertFalse(jedis.keys("*").isEmpty());
		
		assertTrue(jedis.keys("fo").isEmpty());
		assertFalse(jedis.keys("fo*").isEmpty());
		
		jedis.close();
	}
}
