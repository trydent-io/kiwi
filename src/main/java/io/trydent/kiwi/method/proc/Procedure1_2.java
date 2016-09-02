package io.trydent.kiwi.method.proc;

import io.trydent.kiwi.tuple.Tuple2;

import java.io.Serializable;

@FunctionalInterface
public interface Procedure1_2<T, R1, R2> extends Serializable {
	Tuple2<R1, R2> accept(T t);
}
