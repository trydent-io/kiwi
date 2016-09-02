package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple3;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_3<T, R1, R2, R3> extends Serializable {
	Tuple3<R1, R2, R3> accept(T t);
}
