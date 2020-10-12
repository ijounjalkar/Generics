package com.capg.Generics;

import java.util.Arrays;

public class Generics<T extends Comparable<T>> {
	
	T a;
	T b;
	T c;
	T[] args;
	@SafeVarargs
	public Generics(T...args) {
		this.args = args;
	}
	
	public T maxNum() {
		T test = maxNum(args);
		return test;
		
	}
	public T maxNum(T...args) {
		T max;
		Arrays.sort(args);
		max = args[args.length - 1];
		return max;
	}
	
	
	
	/*public Integer maxNum (Integer first, Integer second, Integer third) {
		
		if(first.compareTo(second) >= 0 && first.compareTo(third) >= 0)
			return first;
		else if(second.compareTo(first) >= 0 && second.compareTo(third) >= 0)
			return second;
		else return third;
	}
	
	public Float maxNum (Float first, Float second, Float third) {
		
		if(first.compareTo(second) >= 0 && first.compareTo(third) >= 0)
			return first;
		else if(second.compareTo(first) >= 0 && second.compareTo(third) >= 0)
			return second;
		else return third;
	}
	
	public String maxNum (String first, String second, String third) {
		
			if(first.compareTo(second) >= 0 && first.compareTo(third) >= 0)
				return first;
			else if(second.compareTo(first) >= 0 && second.compareTo(third) >= 0)
				return second;
			else return third;
		}*/
	
	

}
	

