package io.trydent.kiwi.tuple;

import io.trydent.kiwi.misc.Strings;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static io.trydent.kiwi.tuple.Tuple.tuple;

/**
 * Created by guada on 01/09/16.
 */
public class Tuple1Test {
	@Test
	public void filter() throws Exception {
		final String res = tuple(Optional.of("val1"))
			.filter(Optional::isPresent)
			.flatMap2(s1 -> tuple(s1.get(), Strings.EMPTY))
			.map((s1, s2) -> "hadoken")
			.orElse(Strings.EMPTY);

		Assert.assertEquals(Strings.EMPTY, res);
	}

}