package io.trydent.lambada.tuple;

import java.util.Objects;

public final class Tuple1<T1> implements Tuple {
	private final T1 first;

	@java.beans.ConstructorProperties({"first"})
	public Tuple1(T1 first) {
		this.first = first;
	}

	public T1 first() {
		return this.first;
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Tuple1)) return false;
		final Tuple1 other = (Tuple1) o;
		final Object this$first = this.first;
		final Object other$first = other.first;
		if (this$first == null ? other$first != null : !this$first.equals(other$first)) return false;
		return true;
	}

	public int hashCode() {
		return Objects.hashCode(this.first);
	}

	public String toString() {
		return "io.trydent.lambada.tuple.Tuple1(first=" + this.first + ")";
	}
}
