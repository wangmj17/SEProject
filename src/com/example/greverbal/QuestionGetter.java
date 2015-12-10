package com.example.greverbal;

import java.io.IOException;
import java.util.ArrayList;

import android.content.res.AssetManager;

import com.longevitysoft.android.xml.plist.PListXMLHandler;
import com.longevitysoft.android.xml.plist.PListXMLParser;
import com.longevitysoft.android.xml.plist.domain.Array;
import com.longevitysoft.android.xml.plist.domain.PList;

public class QuestionGetter {
	
	private PList discretePList;
	private PList readingPList;
	
	public QuestionGetter(AssetManager assetManager){
		PListXMLParser parser = new PListXMLParser();                // 基于SAX的实现
	    PListXMLHandler handler = new PListXMLHandler();
	    parser.setHandler(handler);
	    
	    try {
	        parser.parse(assetManager.open("discrete.plist"));        // xxx.plist是你要解析的文件，该文件需放在assets文件夹下
	      } catch (IllegalStateException e) {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    discretePList = ((PListXMLHandler) parser.getHandler()).getPlist();
	    
	    try {
	        parser.parse(assetManager.open("reading.plist"));        // xxx.plist是你要解析的文件，该文件需放在assets文件夹下
	      } catch (IllegalStateException e) {
	        e.printStackTrace();
	      } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	   readingPList = ((PListXMLHandler) parser.getHandler()).getPlist();
	}
	
	public int getDiscreteExerciseCount(){
		Array exercises = (Array) discretePList.getRootElement();
		return exercises.size();
	}
	
	public DiscreteExercise getDiscreteExercise(int exerciseIndex){
		Array exercises = (Array) discretePList.getRootElement();
		return new DiscreteExercise((Array) exercises.get(exerciseIndex));
	}
	
	public DiscreteExercise getDiscreteCategory(int type){
		Array exercises = (Array) discretePList.getRootElement();
		
		ArrayList<DiscreteQuestion> list = new ArrayList<DiscreteQuestion>();
		for (int i = 0; i < exercises.size(); i++){
			DiscreteExercise exercise = new DiscreteExercise((Array) exercises.get(i));
			for (int j = 0;j < exercise.questionCount; j++){
				DiscreteQuestion question = exercise.discreteQuestions[j];
				if (question.type == type){
					list.add(question);
				}
			}
		}
		
		return new DiscreteExercise(list);
	}
	
	public ReadingExercise getReadingExercise(int exerciseIndex){
		Array exercises = (Array) readingPList.getRootElement();
		return new ReadingExercise((Array) exercises.get(exerciseIndex));
	}
	
	public ReadingExercise getReadingCategory(int type){
		Array exercises = (Array) readingPList.getRootElement();
		
		ArrayList<ReadingQuestion> list = new ArrayList<ReadingQuestion>();
		for (int i = 0; i < exercises.size(); i++){
			ReadingExercise exercise = new ReadingExercise((Array) exercises.get(i));
			for (int j = 0;j < exercise.questionCount; j++){
				ReadingQuestion question = exercise.readingQuestions[j];
				if (question.type == type){
					list.add(question);
				}
			}
		}
		
		return new ReadingExercise(list);
	}
}
