package io.trydent.kiwi.tuple;

import io.trydent.kiwi.method.func.Function1;
import io.trydent.kiwi.method.pred.Predicate1;
import io.trydent.kiwi.method.proc.Procedure1_1;
import io.trydent.kiwi.method.proc.Procedure1_2;
import io.trydent.kiwi.method.proc.Procedure1_3;
import io.trydent.kiwi.method.proc.Procedure1_4;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import java.util.Objects;
import java.util.function.Supplier;

import static lombok.AccessLevel.PACKAGE;

@Value
@Accessors(fluent = true)
@AllArgsConstructor(access = PACKAGE)
public final class Tuple1<T1> implements Tuple {
	private static final Tuple1<?> EMPTY = new Tuple1<>(null);

	private final T1 value1;

	@SuppressWarnings("unchecked")
	public static<T> Tuple1<T> empty() {
		return (Tuple1<T>) EMPTY;
	}

	public Tuple1<T1> filter(Predicate1<? super T1> filter) {
		Objects.requireNonNull(filter);
		return filter.satisfy(this.value1)
			? this
			: empty();
	}

	public <U> Tuple1<U> map(Function1<? super T1, ? extends U> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1)
			? empty()
			: new Tuple1<>(mapper.apply(this.value1));
	}

	public <U> Tuple1<U> flatMap1(Procedure1_1<? super T1, U> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1)
			? empty()
			: mapper.accept(this.value1);
	}

	public <U1, U2> Tuple2<U1, U2> flatMap2(Procedure1_2<? super T1, U1, U2> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1)
			? Tuple2.empty()
			: mapper.accept(this.value1);
	}

	public <U1, U2, U3> Tuple3<U1, U2, U3> flatMap3(Procedure1_3<? super T1, U1, U2, U3> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1)
			? Tuple3.empty()
			: mapper.accept(this.value1);
	}

	public <U1, U2, U3, U4> Tuple4<U1, U2, U3, U4> flatMap4(Procedure1_4<? super T1, U1, U2, U3, U4> mapper) {
		Objects.requireNonNull(mapper);
		return Objects.isNull(this.value1)
			? Tuple4.empty()
			: mapper.accept(this.value1);
	}

	public T1 orElse(T1 other) {
		return Objects.isNull(this.value1) ? other : this.value1;
	}

	public T1 orElseGet(Supplier<? extends T1> other) {
		return Objects.isNull(this.value1) ? other.get() : this.value1;
	}

	public <X extends Throwable> T1 orElseThrow(Supplier<? extends X> exceptionSupplier) throws X {
		if (Objects.isNull(this.value1)) throw exceptionSupplier.get();

		return this.value1;
	}
}
