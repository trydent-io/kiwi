package io.trydent.kiwi.match;

import com.google.common.collect.ImmutableSet;
import io.trydent.kiwi.method.func.Function1;
import io.trydent.kiwi.method.pred.Predicate1;
import io.trydent.kiwi.tuple.Tuple;
import io.trydent.kiwi.tuple.Tuple2;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public final class Match<T> {
	private final T value;
	private final Set<Tuple2<Predicate1<T>, Function1<T, Any>>> patterns;
	private final Any otherwise;

	private Match(final T value, final Set<Tuple2<Predicate1<T>, Function1<T, Any>>> patterns, final Any otherwise) {
		this.value = value;
		this.patterns = patterns;
		this.otherwise = otherwise;
	}

	public static <T> Match<T> of(final T value) {
		return new Match<>(value, ImmutableSet.of(), null);
	}

	public <V, R> Match<T> with(final V value, final Function1<T, R> then) {
		final Predicate1<T> pattern = t -> Objects.equals(t, value) || Objects.equals(t, value.getClass());

		return this.with(pattern, then);
	}

	public <R> Match<T> with(final Predicate1<T> pattern, final Function1<T, R> then) {
		final Function1<T, Any> thenAny = t -> Any.of(then.apply(t)).orElse(Any.EMPTY);
		final Tuple2<Predicate1<T>, Function1<T, Any>> tuple = Tuple.of(pattern, thenAny);

		return new Match<>(this.value, ImmutableSet.<Tuple2<Predicate1<T>, Function1<T, Any>>>builder()
			.addAll(this.patterns)
			.add(tuple)
			.build(), otherwise);
	}

	public <R> Optional<Any> otherwise(final R wanted) {
		final Match<T> match = this.with(t -> true, t -> wanted);

		return match.patterns.stream()
			.filter(pattern -> pattern.value1().satisfy(match.value))
			.map(pattern -> pattern.value2().apply(match.value))
			.findFirst();
	}

	public Optional<Any> empty() {
		return this.otherwise(Any.OBJECT);
	}
}
