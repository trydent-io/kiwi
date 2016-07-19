package io.trydent.lambada.tuple;

import lombok.experimental.Accessors;

@Accessors(fluent = true)
public final class Tuple7<T1, T2, T3, T4, T5, T6, T7> implements Tuple {
	private final T1 first;
	private final T2 second;
	private final T3 third;
	private final T4 forth;
	private final T5 fifth;
	private final T6 sixth;
	private final T7 seventh;

	@java.beans.ConstructorProperties({"first", "second", "third", "forth", "fifth", "sixth", "seventh"})
	public Tuple7(T1 first, T2 second, T3 third, T4 forth, T5 fifth, T6 sixth, T7 seventh) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.forth = forth;
		this.fifth = fifth;
		this.sixth = sixth;
		this.seventh = seventh;
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

	public T5 fifth() {
		return this.fifth;
	}

	public T6 sixth() {
		return this.sixth;
	}

	public T7 seventh() {
		return this.seventh;
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Tuple7)) return false;
		final Tuple7 other = (Tuple7) o;
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
		final Object this$fifth = this.fifth;
		final Object other$fifth = other.fifth;
		if (this$fifth == null ? other$fifth != null : !this$fifth.equals(other$fifth)) return false;
		final Object this$sixth = this.sixth;
		final Object other$sixth = other.sixth;
		if (this$sixth == null ? other$sixth != null : !this$sixth.equals(other$sixth)) return false;
		final Object this$seventh = this.seventh;
		final Object other$seventh = other.seventh;
		if (this$seventh == null ? other$seventh != null : !this$seventh.equals(other$seventh)) return false;
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
		final Object $fifth = this.fifth;
		result = result * PRIME + ($fifth == null ? 0 : $fifth.hashCode());
		final Object $sixth = this.sixth;
		result = result * PRIME + ($sixth == null ? 0 : $sixth.hashCode());
		final Object $seventh = this.seventh;
		result = result * PRIME + ($seventh == null ? 0 : $seventh.hashCode());
		return result;
	}

	public String toString() {
		return "io.trydent.lambada.tuple.Tuple7(first=" + this.first + ", second=" + this.second + ", third=" + this.third + ", forth=" + this.forth + ", fifth=" + this.fifth + ", sixth=" + this.sixth + ", seventh=" + this.seventh + ")";
	}
}
