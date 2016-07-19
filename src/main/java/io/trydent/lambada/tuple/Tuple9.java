package io.trydent.lambada.tuple;

import lombok.experimental.Accessors;

@Accessors(fluent = true)
public final class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> implements Tuple {
	private final T1 first;
	private final T2 second;
	private final T3 third;
	private final T4 forth;
	private final T5 fifth;
	private final T6 sixth;
	private final T7 seventh;
	private final T8 eighth;
	private final T9 ninth;

	@java.beans.ConstructorProperties({"first", "second", "third", "forth", "fifth", "sixth", "seventh", "eighth", "ninth"})
	public Tuple9(T1 first, T2 second, T3 third, T4 forth, T5 fifth, T6 sixth, T7 seventh, T8 eighth, T9 ninth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.forth = forth;
		this.fifth = fifth;
		this.sixth = sixth;
		this.seventh = seventh;
		this.eighth = eighth;
		this.ninth = ninth;
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

	public T8 eighth() {
		return this.eighth;
	}

	public T9 ninth() {
		return this.ninth;
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Tuple9)) return false;
		final Tuple9 other = (Tuple9) o;
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
		final Object this$eighth = this.eighth;
		final Object other$eighth = other.eighth;
		if (this$eighth == null ? other$eighth != null : !this$eighth.equals(other$eighth)) return false;
		final Object this$ninth = this.ninth;
		final Object other$ninth = other.ninth;
		if (this$ninth == null ? other$ninth != null : !this$ninth.equals(other$ninth)) return false;
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
		final Object $eighth = this.eighth;
		result = result * PRIME + ($eighth == null ? 0 : $eighth.hashCode());
		final Object $ninth = this.ninth;
		result = result * PRIME + ($ninth == null ? 0 : $ninth.hashCode());
		return result;
	}

	public String toString() {
		return "io.trydent.lambada.tuple.Tuple9(first=" + this.first + ", second=" + this.second + ", third=" + this.third + ", forth=" + this.forth + ", fifth=" + this.fifth + ", sixth=" + this.sixth + ", seventh=" + this.seventh + ", eighth=" + this.eighth + ", ninth=" + this.ninth + ")";
	}
}
