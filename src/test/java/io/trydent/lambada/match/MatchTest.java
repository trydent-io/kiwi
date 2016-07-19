package io.trydent.lambada.match;

import org.junit.Assert;
import org.junit.Test;

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

}