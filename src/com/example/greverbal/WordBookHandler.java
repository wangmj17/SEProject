package com.example.greverbal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class WordBookHandler {
	
	private SharedPreferences userHistory;
	private String words;
	
	public WordBookHandler(Context context){
		
		userHistory= context.getSharedPreferences("test",
				Activity.MODE_PRIVATE);
		words = userHistory.getString("words", "");
	}
	
	public void addWord(String word, String explanation){
		
		words = word + "," + explanation + "," + words;
		
		SharedPreferences.Editor editor = userHistory.edit();
		editor.putString("words", words);
		//editor.putString("words", "");
		editor.commit(); 
		
	}
	
	public void deleteWord(String word, String explanation){
		
		String[] wordArray = words.split(",");
		for (int i = 0; i < wordArray.length - 1; i += 2){
			if (wordArray[i].equals(word) && wordArray[i+1].equals(explanation)){
				wordArray[i] = "";
				wordArray[i+1] = "";
				break;
			}
		}
		words = "";
		for (int i = 0; i < wordArray.length - 1; i ++){
				if(wordArray[i].length() > 0)
				words = words + wordArray[i] + ",";
		}
		
		SharedPreferences.Editor editor = userHistory.edit();
		editor.putString("words", words);
		editor.commit(); 
	}
	
	public WordBook getWordBook(){
		
		String[] wordArray = words.split(",");

		return new WordBook(wordArray);
		
	}
	
	public int find(String word, String explanation){
		
		String[] wordArray = words.split(",");
		for (int i = 0; i < wordArray.length - 1; i += 2){
			if (wordArray[i].equals(word) && wordArray[i+1].equals(explanation)){
				return i/2;
			}
		}
		return -1;
	}
}
