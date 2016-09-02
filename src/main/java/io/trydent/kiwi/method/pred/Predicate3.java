package io.trydent.kiwi.method.pred;

import java.io.Serializable;

@FunctionalInterface
public interface Predicate3<T1, T2, T3> extends Serializable {
	boolean satisfy(T1 t1, T2 t2, T3 t3);
}
