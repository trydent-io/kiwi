package io.trydent.lambada.tuple;

import lombok.experimental.Accessors;

@Accessors(fluent = true)
public final class Tuple2<T1, T2> implements Tuple {
	private final T1 first;
	private final T2 second;

	@java.beans.ConstructorProperties({"first", "second"})
	public Tuple2(T1 first, T2 second) {
		this.first = first;
		this.second = second;
	}

	public T1 first() {
		return this.first;
	}

	public T2 second() {
		return this.second;
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Tuple2)) return false;
		final Tuple2 other = (Tuple2) o;
		final Object this$first = this.first;
		final Object other$first = other.first;
		if (this$first == null ? other$first != null : !this$first.equals(other$first)) return false;
		final Object this$second = this.second;
		final Object other$second = other.second;
		if (this$second == null ? other$second != null : !this$second.equals(other$second)) return false;
		return true;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $first = this.first;
		result = result * PRIME + ($first == null ? 0 : $first.hashCode());
		final Object $second = this.second;
		result = result * PRIME + ($second == null ? 0 : $second.hashCode());
		return result;
	}

	public String toString() {
		return "io.trydent.lambada.tuple.Tuple2(first=" + this.first + ", second=" + this.second + ")";
	}
}
