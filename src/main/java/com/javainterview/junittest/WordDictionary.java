package com.javainterview.junittest;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary implements Dictionary {

    private Map<String, String> wordMap;

    public WordDictionary() {
        wordMap = new HashMap<>();
    }

    @Override
    public void add(String word, String meaning) {
        wordMap.put(word, meaning);
    }

    @Override
    public String getMeaning(String word) {
        return wordMap.get(word);
    }
}
