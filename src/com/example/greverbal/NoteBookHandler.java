package com.example.greverbal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class NoteBookHandler {
	private SharedPreferences userHistory;
	private String wrongQuestions;
	
	public NoteBookHandler(Context context){
		
		userHistory= context.getSharedPreferences("test",
				Activity.MODE_PRIVATE);
		wrongQuestions = userHistory.getString("wrongQuestions", "");
	}
		
	public void addQuestion(int exerciseIndex, int questionIndex, int category){
		
		wrongQuestions = exerciseIndex + "," + questionIndex + "," + category + "," + wrongQuestions;
		
		SharedPreferences.Editor editor = userHistory.edit();
		editor.putString("wrongQuestions", wrongQuestions);
		//editor.putString("wrongQuestions", "");
		editor.commit(); 
		
	}	
	
	public void deleteQuestion(int exerciseIndex, int questionIndex, int category){
		
		String[] questionArray = wrongQuestions.split(",");
		for (int i = 0; i < questionArray.length - 1; i += 3){
			if (questionArray[i].equals(String.valueOf(exerciseIndex)) && 
					questionArray[i + 1].equals(String.valueOf(questionIndex)) &&
					questionArray[i + 2].equals(String.valueOf(category))){
				questionArray[i] = "";
				questionArray[i + 1] = "";
				questionArray[i + 2] = "";
				break;
			}
		}
		wrongQuestions = "";
		for (int i = 0; i < questionArray.length - 1; i ++){
			wrongQuestions = wrongQuestions + questionArray[i] + ",";
		}
		
		SharedPreferences.Editor editor = userHistory.edit();
		editor.putString("wrongQuestions", wrongQuestions);
		editor.commit(); 
	}

	public NoteBook getNoteBook(){
		
		String[] questionArray = wrongQuestions.split(",");

		return new NoteBook(questionArray);
		
	}
}
