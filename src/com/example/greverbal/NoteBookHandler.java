package com.example.greverbal;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class NoteBookHandler {
	private SharedPreferences userHistory;
	private String wrongQuestions;
	
	private List<Integer[]> questionList;//用于搜索错题本题型
	
	public NoteBookHandler(Context context){
		
		userHistory= context.getSharedPreferences("test",
				Activity.MODE_PRIVATE);
		wrongQuestions = userHistory.getString("wrongQuestions", "");
		
		questionList = new ArrayList<Integer[]>();
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
	
	public List<Integer[]> findCategory(int category){ //$$$$$$$$$$$$$
		questionList.clear();
		String[] questionArray = wrongQuestions.split(",");
		for (int i = 0; i < questionArray.length - 1; i += 3){
			if (questionArray[i + 2].equals(String.valueOf(category))){
				Integer[] info=new Integer[2];
				info[0]=Integer.parseInt(questionArray[i]);//exerciseIndex
				info[1]=Integer.parseInt(questionArray[i+1]);//questionIndex
				questionList.add(info);
			}
		}
		return questionList;
	}
	
	public int find(int exerciseIndex, int questionIndex, int category){
		
		String[] questionArray = wrongQuestions.split(",");
		for (int i = 0; i < questionArray.length - 1; i += 3){
			if (questionArray[i].equals(String.valueOf(exerciseIndex)) && 
					questionArray[i + 1].equals(String.valueOf(questionIndex)) &&
					questionArray[i + 2].equals(String.valueOf(category))){
				return i/3;
			}
		}
		return -1;
	}

	public NoteBook getNoteBook(){
		
		String[] questionArray = wrongQuestions.split(",");

		return new NoteBook(questionArray);
		
	}
	
}
