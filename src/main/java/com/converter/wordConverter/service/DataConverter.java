package com.converter.wordConverter.service;

import com.converter.wordConverter.exception.NumberNotFoundException;

public class DataConverter {
	
	public static void main(String[] args) throws NumberFormatException, NumberNotFoundException {
		
		int n = 999;
		
		for(int i = 1; i<= n; i++) {
			
			String word = getConvertedWordForNumber(i);
			
			System.out.println(word);
			
		}
		
	}
	
	public static String getConvertedWordForNumber(Integer number) throws NumberFormatException, NumberNotFoundException {
		
		String convertedStr = null;
		
		String numberStr = String.valueOf(number);
		
		int length = numberStr.length();
		
		NumberToWordConverterService numberToWordConverterService = new NumberToWordConverterService();
		
		switch(length) {
			case 1 : 
				convertedStr = numberToWordConverterService.getSingleDigitWord(number);
				break;
			case 2 :
				convertedStr = numberToWordConverterService.getTwoDigitWord(number);
				break;
			case 3 :
				String singleDigitWord = numberToWordConverterService.getSingleDigitWord(Integer.parseInt(String.valueOf(numberStr.charAt(0))));
				Integer subNumber = Integer.parseInt(String.valueOf(numberStr.substring(1, 3)));
				if(!numberStr.substring(1, 3).equals("00")) {
					if(String.valueOf(subNumber).length() == 1 && !String.valueOf(subNumber).equals("0")) {
						String twoDigitWord = numberToWordConverterService.getSingleDigitWord(subNumber);
						convertedStr = singleDigitWord+" hundred and "+twoDigitWord;
					}else {
						String twoDigitWord = numberToWordConverterService.getTwoDigitWord(Integer.parseInt(String.valueOf(numberStr.substring(1, 3))));
						convertedStr = singleDigitWord+" hundred and "+twoDigitWord;
					}
				}
				
				else
					convertedStr = singleDigitWord+" hundred";
				break;
			default:
				throw new NumberNotFoundException();
		
		}
		
		return convertedStr;
	}

	/*private static NumberToWordConverter getNumberToWordConverter(Integer number) {
		
		NumberToWordConverter numberToWordConverter = null;
		
		String numberStr = String.valueOf(number);
		
		switch(numberStr.length()) {
			case 1 : 
				numberToWordConverter = new SingleNumberConverter();
				break;
			case 2 :
				numberToWordConverter = new TwoMultipleConverter();
				break;
		}
		
		return numberToWordConverter;
		
	}*/


}
