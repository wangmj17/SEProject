package com.example.greverbal;

import java.util.ArrayList;

import com.longevitysoft.android.xml.plist.domain.Array;
import com.longevitysoft.android.xml.plist.domain.Dict;

public class ReadingExercise {
	public ReadingQuestion[] readingQuestions;
	public int questionCount;

	public ReadingExercise(){
	}

	public ReadingExercise(ArrayList<ReadingQuestion> list){
		questionCount = list.size();
		readingQuestions = new ReadingQuestion[questionCount];
		for(int i = 0; i < questionCount; i++){
			readingQuestions[i] = (ReadingQuestion) list.get(i);
		}
	}

	public ReadingExercise(Array exercise){
		questionCount = exercise.size();
		readingQuestions = new ReadingQuestion[questionCount];
		for (int i = 0; i < questionCount; i++){
			ReadingQuestion question = new ReadingQuestion((Dict)exercise.get(i));
			readingQuestions[i] = question;
		}
	}
}
