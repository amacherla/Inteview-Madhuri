package com.converter.wordConverter.util;

import java.util.HashMap;
import java.util.Map;

public class TestDataUtil {
	
	public static Map<Integer, String> getSingleDigitMap() {
		
		Map<Integer, String> numberWordMap = new HashMap<Integer, String>();
		
		numberWordMap.put(1, "one");
		numberWordMap.put(2, "two");
		numberWordMap.put(3, "three");
		numberWordMap.put(4, "four");
		numberWordMap.put(5, "five");
		numberWordMap.put(6, "six");
		numberWordMap.put(7, "seven");
		numberWordMap.put(8, "eight");
		numberWordMap.put(9, "nine");
		
		return numberWordMap;
		
	}
	
	public static Map<Integer, String> getTwoDigitMap(){
		
		Map<Integer, String> numberWordMap = new HashMap<Integer, String>();
		
		numberWordMap.put(00, "");
		numberWordMap.put(10, "ten");
		numberWordMap.put(11, "eleven");
		numberWordMap.put(12, "twelve");
		numberWordMap.put(13, "thirteen");
		numberWordMap.put(14, "fourteen");
		numberWordMap.put(15, "fifteen");
		numberWordMap.put(16, "sixteen");
		numberWordMap.put(17, "seventeen");
		numberWordMap.put(18, "eighteen");
		numberWordMap.put(19, "nineteen");
		numberWordMap.put(20, "twenty");
		numberWordMap.put(30, "thirty");
		numberWordMap.put(40, "fourty");
		numberWordMap.put(50, "fifty");
		numberWordMap.put(60, "sixty");
		numberWordMap.put(70, "seventy");
		numberWordMap.put(80, "eighty");
		numberWordMap.put(90, "ninety");
		
		return numberWordMap;
	}
	

}
