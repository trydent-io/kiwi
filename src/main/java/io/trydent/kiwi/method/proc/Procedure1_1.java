package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple1;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_1<T, R> extends Serializable {
	Tuple1<R> accept(T t);
}
