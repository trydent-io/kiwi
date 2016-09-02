package io.trydent.kiwi.match;

import java.util.Optional;

public final class Any {
	final static Object OBJECT = new Object();
	final static Any EMPTY = new Any(OBJECT);

	private final Object value;

	private Any(final Object value) {
		this.value = value;
	}

	public static <T> Optional<Any> of(final T value) {
		return Optional.ofNullable(value).map(Any::new);
	}

	public <T> Optional<T> as(final Class<T> classT) {
		return Optional.ofNullable(classT)
			.filter(this::is)
			.map(c -> c.cast(this.value));
	}

	public <T> boolean is(final Class<T> asClass) {
		return Optional.ofNullable(asClass)
			.filter(as -> as.equals(this.value.getClass()))
			.isPresent();
	}

	public Optional<String> asString() {
		return this.as(String.class);
	}

	public Optional<Integer> asInteger() {
		return this.as(Integer.class);
	}

	public Optional<Float> asFloat() {
		return this.as(Float.class);
	}

	public Optional<Double> asDouble() {
		return this.as(Double.class);
	}

	public Optional<Boolean> asBoolean() {
		return this.as(Boolean.class);
	}

	public Optional<Long> asLong() {
		return this.as(Long.class);
	}
}
