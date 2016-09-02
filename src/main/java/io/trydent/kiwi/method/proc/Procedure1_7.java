package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple7;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_7<T, R1, R2, R3, R4, R5, R6, R7> extends Serializable {
	Tuple7<R1, R2, R3, R4, R5, R6, R7> accept(T t);
}
