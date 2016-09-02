package io.trydent.kiwi.method.func;

import java.io.Serializable;

@FunctionalInterface
public interface Function6<T1, T2, T3, T4, T5, T6, R> extends Serializable {
	R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6);
}