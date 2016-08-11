package com.example;

import static java.lang.String.format;
import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.testng.annotations.Test;

public final class MultipleViaTestNg {
	@SuppressWarnings("static-method")
	@Test(invocationCount = 10)
	public void test() {
		final Random random = new Random();
		final int upper = 10;
		assertTrue(upper % 2 == 0);
		final int i = random.nextInt(upper);
		assertTrue(i >= upper / 2, format("Should be i \u2209 [%d, %d)", upper / 2, upper));
	}
}
