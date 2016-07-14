package io.trydent.lambada.tuple;

public interface Tuple {
	static <T1> Tuple1<T1> of(final T1 value) { return new Tuple1<>(value); }
	static <T1, T2> Tuple2<T1, T2> of(final T1 first, final T2 second) { return new Tuple2<>(first, second); }
}
