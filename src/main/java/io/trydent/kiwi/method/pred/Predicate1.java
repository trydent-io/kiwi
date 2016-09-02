package io.trydent.kiwi.method.pred;

import java.io.Serializable;

@FunctionalInterface
public interface Predicate1<T> extends Serializable {
	boolean satisfy(T t);
}
