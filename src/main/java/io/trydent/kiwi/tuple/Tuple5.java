package io.trydent.kiwi.tuple;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public final class Tuple5<T1, T2, T3, T4, T5> implements Tuple {
	private final T1 value1;
	private final T2 value2;
	private final T3 value3;
	private final T4 value4;
	private final T5 value5;
}
