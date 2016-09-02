package io.trydent.kiwi.tuple;

import io.trydent.kiwi.method.func.Function2;
import io.trydent.kiwi.method.pred.Predicate2;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Objects;

import static lombok.AccessLevel.PACKAGE;

@Value
@Accessors(fluent = true)
@AllArgsConstructor(access = PACKAGE)
public final class Tuple2<T1, T2> implements Tuple {
	private static final Tuple2<?, ?> EMPTY = new Tuple2<>(null, null);

	private final T1 value1;
	private final T2 value2;

	@SuppressWarnings("unchecked")
	public static<T, R> Tuple2<T, R> empty() {
		return (Tuple2<T, R>) EMPTY;
	}

	public Tuple2<T1, T2> filter(Predicate2<? super T1, ? super T2> filter) {
		Objects.requireNonNull(filter);
		return filter.satisfy(this.value1, this.value2)
			? this
			: empty();
	}

	public <U> Tuple1<U> map(Function2<? super T1, ? super T2, ? extends U> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1) && Objects.isNull(this.value2)
			? Tuple1.empty()
			: new Tuple1<>(mapper.apply(this.value1, this.value2));
	}

	public <U> Tuple1<U> flatMap1(Function2<? super T1, ? super T2, Tuple1<U>> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1) && Objects.isNull(this.value2)
			? Tuple1.empty()
			: mapper.apply(this.value1, this.value2);
	}

	public <U1, U2> Tuple2<U1, U2> flatMap2(Function2<? super T1, ? super T2, Tuple2<U1, U2>> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1) && Objects.isNull(this.value2)
			? Tuple2.empty()
			: mapper.apply(this.value1, this.value2);
	}
}
