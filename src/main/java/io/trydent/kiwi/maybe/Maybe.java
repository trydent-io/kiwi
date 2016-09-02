package io.trydent.kiwi.maybe;

import java.util.Optional;

public interface Maybe {
	static <T1, T2> Maybe2<T1, T2>of(final T1 t1, final T2 t2) {
		return new Maybe2<>(t1, t2);
	}

	static <T1, T2> Maybe2<T1, T2>flatten(final Optional<T1> t1, final Optional<T2> t2) {
		return of(t1.get(), t2.get());
	}
}
