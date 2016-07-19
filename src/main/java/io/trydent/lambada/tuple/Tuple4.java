package io.trydent.lambada.tuple;

import lombok.experimental.Accessors;

@Accessors(fluent = true)
public final class Tuple4<T1, T2, T3, T4> implements Tuple {
	private final T1 first;
	private final T2 second;
	private final T3 third;
	private final T4 forth;

	@java.beans.ConstructorProperties({"first", "second", "third", "forth"})
	public Tuple4(T1 first, T2 second, T3 third, T4 forth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.forth = forth;
	}

	public T1 first() {
		return this.first;
	}

	public T2 second() {
		return this.second;
	}

	public T3 third() {
		return this.third;
	}

	public T4 forth() {
		return this.forth;
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Tuple4)) return false;
		final Tuple4 other = (Tuple4) o;
		final Object this$first = this.first;
		final Object other$first = other.first;
		if (this$first == null ? other$first != null : !this$first.equals(other$first)) return false;
		final Object this$second = this.second;
		final Object other$second = other.second;
		if (this$second == null ? other$second != null : !this$second.equals(other$second)) return false;
		final Object this$third = this.third;
		final Object other$third = other.third;
		if (this$third == null ? other$third != null : !this$third.equals(other$third)) return false;
		final Object this$forth = this.forth;
		final Object other$forth = other.forth;
		if (this$forth == null ? other$forth != null : !this$forth.equals(other$forth)) return false;
		return true;
	}

	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final Object $first = this.first;
		result = result * PRIME + ($first == null ? 0 : $first.hashCode());
		final Object $second = this.second;
		result = result * PRIME + ($second == null ? 0 : $second.hashCode());
		final Object $third = this.third;
		result = result * PRIME + ($third == null ? 0 : $third.hashCode());
		final Object $forth = this.forth;
		result = result * PRIME + ($forth == null ? 0 : $forth.hashCode());
		return result;
	}

	public String toString() {
		return "io.trydent.lambada.tuple.Tuple4(first=" + this.first + ", second=" + this.second + ", third=" + this.third + ", forth=" + this.forth + ")";
	}
}
