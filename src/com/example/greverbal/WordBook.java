package com.example.greverbal;

import java.util.ArrayList;

import android.util.Log;

public class WordBook {

	ArrayList<String> wordList, explanationList;

	public WordBook(String[] wordArray){

		wordList = new ArrayList<String>();
		explanationList = new ArrayList<String>();
		for(int i = 0; i < wordArray.length - 1; i += 2){
			wordList.add(wordArray[i]);
			explanationList.add(wordArray[i + 1]);
		}
	}

	public void add(String word, String explanation){
		wordList.add(0, word);
		explanationList.add(0, explanation);
	}

	public void delete(String word){
		int index = wordList.indexOf(word);
		wordList.remove(index);
		explanationList.remove(index);
	}

}
