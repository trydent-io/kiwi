package io.trydent.lambada.tuple;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

import static lombok.AccessLevel.PACKAGE;

@Value
@Accessors(fluent = true)
@AllArgsConstructor(access = PACKAGE)
public final class Tuple4<T1, T2, T3, T4> implements Tuple {
	private final T1 first;
	private final T2 second;
	private final T3 third;
	private final T4 forth;
}
