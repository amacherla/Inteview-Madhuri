package com.converter.wordConverter.service;

import java.util.Map;

import com.converter.wordConverter.exception.NumberNotFoundException;
import com.converter.wordConverter.util.DataUtil;

public class SingleNumberConverter implements NumberToWordConverter{
	
	public String convertNumberToWord(Integer number) throws NumberNotFoundException {

		String word = null;

		if (number != null) {
			Map<Integer, String> dataMap = DataUtil.getSingleDigitMap();

			if (dataMap.containsKey(number)) {
				return dataMap.get(number);
			} else {
				throw new NumberNotFoundException();
			}

		}

		return word;
	}


}
