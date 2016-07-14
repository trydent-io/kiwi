package io.trydent.lambada;

import com.google.common.collect.ImmutableSet;
import io.trydent.lambada.tuple.Tuple;
import io.trydent.lambada.tuple.Tuple2;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public final class Match<T> {
	private final T value;
	private final Set<Tuple2<Predicate<T>, Function<T, Any>>> patterns;
	private final Any otherwise;

	private Match(final T value, final Set<Tuple2<Predicate<T>, Function<T, Any>>> patterns, final Any otherwise) {
		this.value = value;
		this.patterns = patterns;
		this.otherwise = otherwise;
	}

	public static <T> Match<T> of(final T value) {
		return new Match<>(value, ImmutableSet.of(), null);
	}

	public <V, R> Match<T> with(final V value, final Function<T, R> then) {
		final Predicate<T> pattern = t -> Objects.equals(t, value) || Objects.equals(t, value.getClass());

		return this.with(pattern, then);
	}

	public <R> Match<T> with(final Predicate<T> pattern, final Function<T, R> then) {
		final Function<T, Any> thenAny = t -> Any.of(then.apply(t)).orElse(Any.UNDEFINED);
		final Tuple2<Predicate<T>, Function<T, Any>> tuple = Tuple.of(pattern, thenAny);

		return new Match<>(this.value, ImmutableSet.<Tuple2<Predicate<T>, Function<T, Any>>>builder()
			.addAll(this.patterns)
			.add(tuple)
			.build(), otherwise);
	}

	public <R> Optional<Any> otherwise(final R value) {
		final Match<T> match = this.with(t -> true, t -> value);

		return match.patterns.stream()
			.filter(pattern -> pattern.first().test(this.value))
			.map(pattern -> pattern.second().apply(this.value))
			.findFirst();
	}

	public Optional<Any> any() {
		return this.otherwise(null);
	}
}
