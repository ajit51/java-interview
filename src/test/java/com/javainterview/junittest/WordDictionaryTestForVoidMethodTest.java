package com.javainterview.junittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import static org.mockito.Mockito.*;

public class WordDictionaryTestForVoidMethodTest {

    @Test
    public void whenAddCalledWithVerify(){

        //Not call actual method
        WordDictionary wordDictionary = mock(WordDictionary.class);
        doNothing().when(wordDictionary).add(anyString(), anyString());
        wordDictionary.add("awesome", "Very Good");

        verify(wordDictionary, times(1)).add("awesome", "Very Good");
        System.out.println(wordDictionary.getMeaning("awesome"));
    }

    @Test
    public void whenAddCalledRealMethodUsingSpy(){

        //call actual method
        WordDictionary wordDictionary = spy(WordDictionary.class);
        doCallRealMethod().when(wordDictionary).add(anyString(), anyString());
        wordDictionary.add("awesome", "Very Good");

        verify(wordDictionary, times(1)).add("awesome", "Very Good");
        System.out.println(wordDictionary.getMeaning("awesome"));
    }

    @Test
    public void whenAddCalledValueCaptured(){
        WordDictionary wordDictionary = mock(WordDictionary.class);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        doNothing().when(wordDictionary).add(anyString(), argumentCaptor.capture());
        wordDictionary.add("awesome", "Very Good");

        Assertions.assertEquals("Very Good", argumentCaptor.getValue());

        System.out.println(argumentCaptor.getValue());
    }

    @Test
    public void voidMethodThrowingExceptionMockitoTest(){
        WordDictionary wordDictionary = mock(WordDictionary.class);
        doThrow(new IllegalStateException("Error occurred!!")).when(wordDictionary).add(anyString(), anyString());

        Assertions.assertThrows(IllegalStateException.class, () -> wordDictionary.add("awesome", "Very Good"));
    }
}
