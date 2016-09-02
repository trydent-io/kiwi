package io.trydent.kiwi.match;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class AnyTest {
	private final static String test = "test";
	private final static String undefined = "undefined";

	@Test
	public void of() throws Exception {
		final Optional<Any> any = Any.of(test);

		Assert.assertNotNull(any);
		Assert.assertTrue(any.isPresent());

		final Any value = any.orElse(Any.EMPTY);

		Assert.assertTrue(any
			.flatMap(Any::asString)
			.filter($ -> $.equals(test))
			.isPresent());
	}

	@Test
	public void is() throws Exception {
		final Optional<Any> any = Any.of(test);

		Assert.assertTrue(any.filter($ -> $.is(String.class)).isPresent());
	}

	@Test
	public void as() throws Exception {
		final Optional<Any> any = Any.of(test);

		Assert.assertTrue(any.map($ -> $.as(String.class)).isPresent());
	}

	@Test
	public void asString() throws Exception {
		final Optional<Any> any = Any.of(12);

		Assert.assertFalse(any.flatMap(Any::asString).isPresent());
	}

	@Test
	public void asInteger() throws Exception {
		final Optional<Any> any = Any.of(12);

		Assert.assertTrue(any.flatMap(Any::asInteger).isPresent());
	}

	@Test
	public void asFloat() throws Exception {
		final Optional<Any> any = Any.of(12.12f);

		Assert.assertTrue(any.flatMap(Any::asFloat).isPresent());
	}

	@Test
	public void asDouble() throws Exception {
		final Optional<Any> any = Any.of(12.12d);

		Assert.assertTrue(any.flatMap(Any::asDouble).isPresent());
	}

	@Test
	public void asBoolean() throws Exception {
		final Optional<Any> any = Any.of(true);

		Assert.assertTrue(any.flatMap(Any::asBoolean).isPresent());
	}

	@Test
	public void asLong() throws Exception {
		final Optional<Any> any = Any.of(12L);

		Assert.assertTrue(any.flatMap(Any::asLong).isPresent());
	}

}