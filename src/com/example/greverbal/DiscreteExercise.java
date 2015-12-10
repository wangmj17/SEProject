package com.example.greverbal;

import java.util.ArrayList;

import com.longevitysoft.android.xml.plist.domain.Array;
import com.longevitysoft.android.xml.plist.domain.Dict;

public class DiscreteExercise {
	
	public DiscreteQuestion[] discreteQuestions;
	public int questionCount;
	
	public DiscreteExercise(){
	}
	
	public DiscreteExercise(ArrayList<DiscreteQuestion> list){
		questionCount = list.size();
		discreteQuestions = new DiscreteQuestion[questionCount];
		for(int i = 0; i < questionCount; i++){
			discreteQuestions[i] = (DiscreteQuestion) list.get(i);
		}
	}
	
	public DiscreteExercise(Array exercise){
		questionCount = exercise.size();
		discreteQuestions = new DiscreteQuestion[questionCount];
		for (int i = 0; i < questionCount; i++){
			DiscreteQuestion question = new DiscreteQuestion((Dict)exercise.get(i));
			discreteQuestions[i] = question;
		}
	}
}
