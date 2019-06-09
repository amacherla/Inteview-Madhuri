package com.converter.wordConverter.service;

import java.util.Map;

import com.converter.wordConverter.exception.NumberNotFoundException;
import com.converter.wordConverter.util.DataUtil;

public class TwoMultipleConverter implements NumberToWordConverter{
	
	public String convertNumberToWord(Integer number) throws NumberNotFoundException {

		String word = null;

		String inputStr = String.valueOf(number);

		if (number != null) {

			Map<Integer, String> singleDigitMap = DataUtil.getSingleDigitMap();
			Map<Integer, String> twoDigitMap = DataUtil.getTwoDigitMap();

			if (twoDigitMap.containsKey(number)) {
				word = twoDigitMap.get(number);
			} else {
				String twoDigitWord = twoDigitMap.get(Integer.parseInt(inputStr.charAt(0) + "0"));
				String oneDigitWord = singleDigitMap.get(Integer.parseInt(String.valueOf(inputStr.charAt(1))));
				word = twoDigitWord + " " + oneDigitWord;
			}

			if (word == null)
				throw new NumberNotFoundException();

		}

		return word;
	}

}
