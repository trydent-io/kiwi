package io.trydent.kiwi.maybe;

import io.trydent.kiwi.method.cons.Consumer2;
import io.trydent.kiwi.method.func.Function2;
import io.trydent.kiwi.method.pred.Predicate2;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.Objects;
import java.util.Optional;

import static lombok.AccessLevel.PACKAGE;

@Value
@AllArgsConstructor(access = PACKAGE)
public final class Maybe2<T1, T2> implements Maybe {
	private static final Maybe2<?, ?> EMPTY = new Maybe2<>(null, null);

	private final T1 value1;
	private final T2 value2;

	@SuppressWarnings("unchecked")
	public static <T, R> Maybe2<T, R> empty() {
		return (Maybe2<T, R>) EMPTY;
	}

	public boolean exists1() {
		return !Objects.isNull(this.value1);
	}

	public boolean exists2() {
		return !Objects.isNull(this.value2);
	}

	public boolean existsAll() {
		return exists1() && exists2();
	}

	public Maybe2<T1, T2> existsAll(Consumer2<? super T1, ? super T2> consumer2) {
		if (existsAll()) {
			consumer2.accept(this.value1, this.value2);
			return this;
		} else {
			return empty();
		}
	}

	public Maybe2<T1, T2> exists() {
		return existsAll()
			? this
			: empty();
	}

	public Maybe2<T1, T2> filter(Predicate2<? super T1, ? super T2> predicate2) {
		Objects.requireNonNull(predicate2);
		if (existsAll() && predicate2.satisfy(this.value1, this.value2)) {
			return this;
		} else {
			return empty();
		}
	}

	public <R> Optional<R> map(Function2<? super T1, ? super T2, ? extends R> mapper) {
		Objects.requireNonNull(mapper);
		if (existsAll()) {
			return Optional.ofNullable(mapper.apply(this.value1, this.value2));
		} else {
			return Optional.empty();
		}
	}

	public <R> Optional<R> flatMap(Function2<? super T1, ? super T2, Optional<R>> mapper) {
		Objects.requireNonNull(mapper);
		if (existsAll()) {
			return mapper.apply(this.value1, this.value2);
		} else {
			return Optional.empty();
		}
	}
}
