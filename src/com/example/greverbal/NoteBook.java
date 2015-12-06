package com.example.greverbal;

import java.util.ArrayList;

public class NoteBook {

	ArrayList<Integer> exerciseIndexList, questionIndexList, categoryList;
	
	public NoteBook(String[] questionsArray){
		
		exerciseIndexList = new ArrayList<Integer>();
		questionIndexList = new ArrayList<Integer>();
		categoryList = new ArrayList<Integer>();
		
		for(int i = 0; i < questionsArray.length - 1; i += 3){
			exerciseIndexList.add(Integer.valueOf(questionsArray[i]));
			questionIndexList.add(Integer.valueOf(questionsArray[i + 1]));
			categoryList.add(Integer.valueOf(questionsArray[i + 2]));
		}
	}
	
	public void add(int exerciseIndex, int questionIndex, int category){
		exerciseIndexList.add(0, exerciseIndex);
		questionIndexList.add(0, questionIndex);
		categoryList.add(0, category);
	}
	
	public void delete(int exerciseIndex, int questionIndex, int category){
		for(int i = 0; i < exerciseIndexList.size(); i++){
			if (exerciseIndexList.get(i) == exerciseIndex && 
					questionIndexList.get(i) == questionIndex &&
					categoryList.get(i) == category){
				exerciseIndexList.remove(i);
				questionIndexList.remove(i);
				categoryList.remove(i);
			}
		}
	}
	
}
