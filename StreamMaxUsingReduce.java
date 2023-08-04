package com.order;

import java.util.Arrays;
import java.util.List;

public class StreamMaxUsingReduce {

	public static int findMaxValue(List<Integer> integerList) {
	return	integerList.stream().reduce(0,(x,y)->x>y? x: y);
	}
	public static void main (String [] args) {
		List<Integer> integerList=Arrays.asList(6,7,8,9,10,6);
		System.out.println(findMaxValue(integerList));
	}
}
