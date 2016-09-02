package io.trydent.kiwi.match;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by guada on 15/07/16.
 */
public class MatchTest {
	@Test
	public void of() throws Exception {
		final String value = "test";

		final Match<String> match = Match.of(value);

		Assert.assertNotNull(match);
	}

	@Test
	public void patternWithClass() throws Exception {
		final String value = "test";

		final Match<String> match = Match.of(value)
			.with(String.class, $ -> true);

		Assert.assertNotNull(match);
	}

	@Test
	public void patternWithValue() throws Exception {
		final String value = "test";

		final Match<String> match = Match.of(value)
			.with(12, $ -> true);

		Assert.assertNotNull(match);
	}

	@Test
	public void patternWithPredicate() throws Exception {
		final String value = "test";

		final Match<String> match = Match.of(value)
			.with($ -> $.length() > 3, $ -> true);

		Assert.assertNotNull(match);
	}

	@Test
	public void otherwiseWithValue() throws Exception {
		final String value = "test";

		final Optional<Any> any = Match.of(value)
			.with("fake", String::toUpperCase)
			.with(12, $ -> UUID.randomUUID())
			.with(Void.TYPE, $ -> 123.543f)
			.otherwise("TEST");

		final String result = any
			.flatMap(Any::asString)
			.orElse(StringUtils.EMPTY);

		Assert.assertEquals(value.toUpperCase(), result);
	}

	@Test
	public void emptyWithValue() throws Exception {
		final String value = "test";

		final Optional<Any> any = Match.of(value)
			.with("fake", String::toUpperCase)
			.with(12, $ -> UUID.randomUUID())
			.with(Void.TYPE, $ -> 123.543f)
			.empty();

		final Object result = any
			.flatMap($ -> $.as(Object.class))
			.orElse(null);

		Assert.assertEquals(Any.OBJECT, result);
	}
}