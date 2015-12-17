package com.example.greverbal;

import java.util.ArrayList;
import java.util.List;
 
import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;  
import android.widget.Button;

public class WordBookActivity extends ExpandableListActivity{
	private ContactsInfoAdapter adapter=new ContactsInfoAdapter(this);
	List<String>group;
	List<List<String>> child;
	private WordBookHandler wbh;
	private WordBook wb;
	private WordBookActivity wordBookActivity;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.word_list_tool);
		
		wordBookActivity = this;
		final Intent intent = getIntent();
		QuestionTabBar titleBar = (QuestionTabBar) findViewById(R.id.WordBookTabBar);
		titleBar.setTextViewText("单词本");
		
		 Button backButton = titleBar.getBackButton();
	    	backButton.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					wordBookActivity.setResult(RESULT_OK, intent);
					wordBookActivity.finish();
				}
			});
	    	
		WordBookHandler wbh = new WordBookHandler(this);

				wb = wbh.getWordBook();  

		        initializeData();  
		        getExpandableListView().setAdapter(adapter);  
		        getExpandableListView().setCacheColorHint(0);  
	}
	
	private void initializeData(){  
		        group = new ArrayList<String>();  
		        child = new ArrayList<List<String>>();  	
		        int i=wb.wordList.size();
		        for (int j=0;j<i;j++){
		        	addInfo(wb.wordList.get(j),new String[]{wb.explanationList.get(j)});
		        }

		            }		      
	
	private void addInfo(String g,String[] c){  
		        group.add(g);  
		        List<String> childitem = new ArrayList<String>();  
		        for(int i=0;i<c.length;i++){  
		            childitem.add(c[i]);  
		        }  
		        child.add(childitem);  
		    } 

		      }  
