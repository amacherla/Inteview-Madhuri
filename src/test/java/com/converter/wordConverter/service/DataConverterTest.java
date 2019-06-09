package com.converter.wordConverter.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.converter.wordConverter.exception.NumberNotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class DataConverterTest{

	public DataConverterTest() {
	}
	
	@InjectMocks
	private DataConverter dataConverter;
	
	@Test
	public void getConvertedWordForNumberTest() throws NumberFormatException, NumberNotFoundException {
		
		assertEquals("one", DataConverter.getConvertedWordForNumber(1));
		
		assertEquals("eleven", DataConverter.getConvertedWordForNumber(11));
		
		assertEquals("twenty", DataConverter.getConvertedWordForNumber(20));
		
		assertEquals("eighty eight", DataConverter.getConvertedWordForNumber(88));
		
	}

}
