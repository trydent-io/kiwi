package io.trydent.kiwi.method.pred;

import java.io.Serializable;

@FunctionalInterface
public interface Predicate8<T1, T2, T3, T4, T5, T6, T7, T8> extends Serializable {
	boolean satisfy(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8);
}
