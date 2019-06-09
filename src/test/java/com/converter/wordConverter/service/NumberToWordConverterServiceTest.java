package com.converter.wordConverter.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.converter.wordConverter.exception.NumberNotFoundException;

@RunWith(MockitoJUnitRunner.class)
public class NumberToWordConverterServiceTest {
	
	public NumberToWordConverterServiceTest(){
		
	}
	
	@InjectMocks
	private NumberToWordConverterService numberToWordConverterService;
	
	@Test
	public void getSingleDigitWordTest() throws NumberNotFoundException {
		
		assertEquals("one", numberToWordConverterService.getSingleDigitWord(1));
		
		assertEquals("nine", numberToWordConverterService.getSingleDigitWord(9));
		
	}
	
	@Test
	public void getTwoDigitWordTest() throws NumberNotFoundException {
		
		assertEquals("twenty", numberToWordConverterService.getTwoDigitWord(20));
		
		assertEquals("twenty one", numberToWordConverterService.getTwoDigitWord(21));
		
	}
}
