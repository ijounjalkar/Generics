package com.capg.Generics;

public class Generics {
	public Float maxNum (Float first, Float second, Float third) {
		
			if(first.compareTo(second) >= 0 && first.compareTo(third) >= 0)
				return first;
			else if(second.compareTo(first) >= 0 && second.compareTo(third) >= 0)
				return second;
			else return third;
		}

}
	

