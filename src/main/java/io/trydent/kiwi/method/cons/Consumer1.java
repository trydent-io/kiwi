package io.trydent.kiwi.method.cons;

import java.io.Serializable;

@FunctionalInterface
public interface Consumer1<T> extends Serializable {
	void accept(T t);
}
