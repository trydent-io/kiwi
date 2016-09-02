package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple5;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_5<T, R1, R2, R3, R4, R5> extends Serializable {
	Tuple5<R1, R2, R3, R4, R5> accept(T t);
}
