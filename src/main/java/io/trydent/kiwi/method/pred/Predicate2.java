package io.trydent.kiwi.method.pred;

import java.io.Serializable;

@FunctionalInterface
public interface Predicate2<T1, T2> extends Serializable {
	boolean satisfy(T1 t1, T2 t2);
}
