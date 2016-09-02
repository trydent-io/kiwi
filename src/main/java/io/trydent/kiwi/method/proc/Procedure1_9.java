package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple9;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_9<T, R1, R2, R3, R4, R5, R6, R7, R8, R9> extends Serializable {
	Tuple9<R1, R2, R3, R4, R5, R6, R7, R8, R9> accept(T t);
}
