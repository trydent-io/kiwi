package io.trydent.kiwi.method.cons;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer3<T1, T2, T3> extends Serializable {
	void accept(T1 t1, T2 t2, T3 t3);
}
