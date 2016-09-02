package io.trydent.kiwi.tuple;

import io.trydent.kiwi.method.func.Function3;
import io.trydent.kiwi.method.pred.Predicate3;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Objects;

import static lombok.AccessLevel.PACKAGE;

@Value
@Accessors(fluent = true)
@AllArgsConstructor(access = PACKAGE)
public final class Tuple3<T1, T2, T3> implements Tuple {
	private static final Tuple3<?, ?, ?> EMPTY = new Tuple3<>(null, null, null);
	
	private final T1 value1;
	private final T2 value2;
	private final T3 value3;

	@SuppressWarnings("unchecked")
	public static<U1, U2, U3> Tuple3<U1, U2, U3> empty() {
		return (Tuple3<U1, U2, U3>) EMPTY;
	}

	public Tuple3<T1, T2, T3> filter(Predicate3<? super T1, ? super T2, ? super T3> filter) {
		Objects.requireNonNull(filter);
		return filter.satisfy(this.value1, this.value2, this.value3)
			? this
			: empty();
	}

	public <U> Tuple1<U> map(Function3<? super T1, ? super T2, ? super T3, ? extends U> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1) && Objects.isNull(this.value2) && Objects.isNull(this.value3)
			? Tuple1.empty()
			: new Tuple1<>(mapper.apply(this.value1, this.value2, this.value3));
	}

	public <U> Tuple1<U> flatMap(Function3<? super T1, ? super T2, ? super T3, Tuple1<U>> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1) && Objects.isNull(this.value2) && Objects.isNull(this.value3)
			? Tuple1.empty()
			: mapper.apply(this.value1, this.value2, this.value3);
	}
}
