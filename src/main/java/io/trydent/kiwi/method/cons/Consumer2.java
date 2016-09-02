package io.trydent.kiwi.method.cons;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer2<T1, T2> extends Serializable {
	void accept(T1 t1, T2 t2);
}
