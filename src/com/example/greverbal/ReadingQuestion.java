package com.example.greverbal;

import com.longevitysoft.android.xml.plist.domain.Array;
import com.longevitysoft.android.xml.plist.domain.Dict;

public class ReadingQuestion {
	public int exerciseIndex;
	public int questionIndex;
	public java.lang.String[] options;
	public java.lang.String answer;
	public java.lang.String questiontext;
	public int type;
	public java.lang.String text;
	public int numOfOptions;

	public ReadingQuestion(){
	}

	public ReadingQuestion(Dict question){
		exerciseIndex = question.getConfigurationInteger("exerciseIndex").getValue();
		questionIndex = question.getConfigurationInteger("questionIndex").getValue();
		Array optionsArray = question.getConfigurationArray("options");
		answer = question.getConfiguration("answer").getValue();
		type = question.getConfigurationInteger("type").getValue();
		text = question.getConfiguration("text").getValue();
		questiontext = question.getConfiguration("question").getValue();
		numOfOptions = optionsArray.size();
		options = new java.lang.String[numOfOptions];

		for(int i = 0; i < numOfOptions; i++){
			options[i] = ((com.longevitysoft.android.xml.plist.domain.String) optionsArray.get(i)).getValue();
		}
	}
}
