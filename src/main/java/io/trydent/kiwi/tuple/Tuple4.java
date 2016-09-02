package io.trydent.kiwi.tuple;

import io.trydent.kiwi.method.func.Function4;
import io.trydent.kiwi.method.pred.Predicate4;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Objects;

import static lombok.AccessLevel.PACKAGE;

@Value
@Accessors(fluent = true)
@AllArgsConstructor(access = PACKAGE)
public final class Tuple4<T1, T2, T3, T4> implements Tuple {
	private static final Tuple4<?, ?, ?, ?> EMPTY = new Tuple4<>(null, null, null, null);

	private final T1 value1;
	private final T2 value2;
	private final T3 value3;
	private final T4 value4;

	@SuppressWarnings("unchecked")
	public static<U1, U2, U3, U4> Tuple4<U1, U2, U3, U4> empty() {
		return (Tuple4<U1, U2, U3, U4>) EMPTY;
	}

	public Tuple4<T1, T2, T3, T4> filter(Predicate4<? super T1, ? super T2, ? super T3, ? super T4> filter) {
		Objects.requireNonNull(filter);
		return filter.satisfy(this.value1, this.value2, this.value3, this.value4)
			? this
			: empty();
	}

	public <U> Tuple1<U> map(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends U> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1)
			&& Objects.isNull(this.value2)
			&& Objects.isNull(this.value3)
			&& Objects.isNull(this.value4)
			? Tuple1.empty()
			: new Tuple1<>(mapper.apply(this.value1, this.value2, this.value3, this.value4));
	}

	public <U> Tuple1<U> flatMap(Function4<? super T1, ? super T2, ? super T3, ? super T4, Tuple1<U>> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1) && Objects.isNull(this.value2) && Objects.isNull(this.value3)
			? Tuple1.empty()
			: mapper.apply(this.value1, this.value2, this.value3, this.value4);
	}
}
