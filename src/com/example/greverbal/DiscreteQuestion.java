package com.example.greverbal;

import com.longevitysoft.android.xml.plist.domain.Array;
import com.longevitysoft.android.xml.plist.domain.Dict;
import com.longevitysoft.android.xml.plist.domain.String;

public class DiscreteQuestion {

	public int exerciseIndex;
	public int questionIndex;
	public java.lang.String[] explanations;
	public java.lang.String[] options;
	public java.lang.String answer;
	public int type;
	public java.lang.String text;
	public int numOfOptions;
	
	public DiscreteQuestion(){
	}
	
	public DiscreteQuestion(Dict question){
		exerciseIndex = question.getConfigurationInteger("exerciseIndex").getValue();
		questionIndex = question.getConfigurationInteger("questionIndex").getValue();
		Array explanationsArray = question.getConfigurationArray("explanations");
		Array optionsArray = question.getConfigurationArray("options");
		answer = question.getConfiguration("answer").getValue();
		type = question.getConfigurationInteger("type").getValue();
		text = question.getConfiguration("text").getValue();
		
		numOfOptions = explanationsArray.size();
		explanations = new java.lang.String[numOfOptions];
		options = new java.lang.String[numOfOptions];
		
		for(int i = 0; i < numOfOptions; i++){
			explanations[i] = ((com.longevitysoft.android.xml.plist.domain.String) explanationsArray.get(i)).getValue();
			options[i] = ((com.longevitysoft.android.xml.plist.domain.String) optionsArray.get(i)).getValue();
		}
	}
	
}
