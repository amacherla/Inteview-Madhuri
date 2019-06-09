package com.converter.wordConverter.service;

import com.converter.wordConverter.exception.NumberNotFoundException;

public interface NumberToWordConverter {
	
	String convertNumberToWord(Integer n) throws NumberNotFoundException;
	
}
