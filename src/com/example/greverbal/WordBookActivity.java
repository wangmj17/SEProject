package com.example.greverbal;

import java.util.ArrayList;
import java.util.List;
 
import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;  
import android.widget.Button;

public class WordBookActivity extends ExpandableListActivity{
	private ContactsInfoAdapter adapter=new ContactsInfoAdapter(this);
	List<String>group;
	List<List<String>> child;
	Button back;
	Button delete;
	private WordBookHandler wbh;
	private WordBook wb;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.word_list_tool); 
		WordBookHandler wbh = new WordBookHandler(this);
		Log.v("asf", "sucess");
				wb = wbh.getWordBook();  

		        initializeData();  
		        getExpandableListView().setAdapter(adapter);  
		        getExpandableListView().setCacheColorHint(0); 
		    }  
	private void initializeData(){  
		        group = new ArrayList<String>();  
		        child = new ArrayList<List<String>>();  
		        back=(Button) this.findViewById(R.id.WordListBack);
		        delete=(Button)this.findViewById(R.id.WordListDelete);	
		        int i=wb.wordList.size();
		        for (int j=0;j<i;j++){
		        	addInfo(wb.wordList.get(j),new String[]{wb.explanationList.get(j)});
		        }

		            }		      
	public Button getBackButton() {
		return back;
	}

	public void setBackButton(Button backButton) {
		this.back = backButton;
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
