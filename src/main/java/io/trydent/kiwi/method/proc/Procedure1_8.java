package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple8;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_8<T, R1, R2, R3, R4, R5, R6, R7, R8> extends Serializable {
	Tuple8<R1, R2, R3, R4, R5, R6, R7, R8> accept(T t);
}
