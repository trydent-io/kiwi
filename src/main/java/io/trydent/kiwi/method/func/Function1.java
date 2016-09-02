package io.trydent.kiwi.method.func;

import java.io.Serializable;

@FunctionalInterface
public interface Function1<T, R> extends Serializable {
	R apply(T t);
}
