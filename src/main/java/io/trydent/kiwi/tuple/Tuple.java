package io.trydent.kiwi.tuple;

public interface Tuple {
	enum Type {Single, Pair, Triple, Quadruple, Quintuple, Sestuple}

	static <T1> Tuple1<T1> of(final T1 value) {
		return new Tuple1<>(value);
	}

	static <T1, T2> Tuple2<T1, T2> of(final T1 value1, final T2 value2) {
		return new Tuple2<>(value1, value2);
	}

	static <T1, T2, T3> Tuple3<T1, T2, T3> of(final T1 value1, final T2 value2, final T3 value3) {
		return new Tuple3<>(value1, value2, value3);
	}

	static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(final T1 value1, final T2 value2, final T3 value3, final T4 value4) {
		return new Tuple4<>(value1, value2, value3, value4);
	}

	static <T1> Tuple1<T1> tuple(final T1 value) {
		return of(value);
	}

	static <T1, T2> Tuple2<T1, T2> tuple(final T1 value1, final T2 value2) {
		return of(value1, value2);
	}

	static <T1, T2, T3> Tuple3<T1, T2, T3> tuple(final T1 value1, final T2 value2, final T3 value3) {
		return of(value1, value2, value3);
	}

	static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> tuple(final T1 value1, final T2 value2, final T3 value3, final T4 value4) {
		return of(value1, value2, value3, value4);
	}
}
