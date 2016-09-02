package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple4;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_4<T, R1, R2, R3, R4> extends Serializable {
	Tuple4<R1, R2, R3, R4> accept(T t);
}
