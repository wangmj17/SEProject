package com.example.greverbal;//$$$$$$$

import java.util.ArrayList;   
import java.util.HashMap;   
import java.util.List;   
import java.util.Map;   
 
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;   
 
public class NoteBookChooseActivity extends Activity{
	private int QuestionType;
	private ListView listView=null; 
	private QuestionTabBar qtb=null;
	private NoteBookChooseActivity noteBookChooseActivity=this;
	private NoteBookHandler noteBookHandler;
    private List<Map<String, Object>> list; 
    
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState); 
        
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        Intent intent = getIntent();
        QuestionType=intent.getIntExtra("type", -1);
        
        list=new ArrayList<Map<String,Object>>(); 
        noteBookHandler = new NoteBookHandler(this);
        
        setContentView(R.layout.activity_notebookquestionschoose);  
        listView=(ListView)findViewById(R.id.list);  
        List<Map<String, Object>> list=getData();  
        listView.setAdapter(new NoteBookListItem(this, list,noteBookChooseActivity,noteBookHandler)); 
        qtb= (QuestionTabBar) this.findViewById(R.id.QuestionTabBar);//$$$$$$
        qtb.getBackButton().setOnClickListener(new View.OnClickListener() {   //$$$$$$
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookChooseActivity.this,NoteBookActivity.class);
            	startActivityForResult(intent,0);
            }   
        }); 
        
        switch(QuestionType){
        case 0: qtb.setTextViewText("主旨题");break;
        case 1: qtb.setTextViewText("细节题");break;
        case 2: qtb.setTextViewText("多选题");break;
        case 3: qtb.setTextViewText("句子选择题");break;
        case 4: qtb.setTextViewText("五选一填空");break;
        case 5: qtb.setTextViewText("六选二（单空）填空");break;
        case 6: qtb.setTextViewText("六选二（双空）填空");break;
        case 7: qtb.setTextViewText("九选三填空");break;
        default:break;
        }
    }  
    /*
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
        getMenuInflater().inflate(R.menu.main, menu);  
        return true;  
    }  
 
    public List<Map<String, Object>> getData(){  
        List<Map<String, Object>> list=new ArrayList<Map<String,Object>>();  
        for (int i = 0; i < 5; i++) {  
            Map<String, Object> map=new HashMap<String, Object>();  
            map.put("questiontext", "题目asdasdadasdasdasdasdasdasdasdasd"+i);  
            map.put("qusetionnum", "☆");  
            list.add(map);  
        }  
        return list;  
    } 
     */ 
    public List<Map<String, Object>> getData(){  
        list=new ArrayList<Map<String,Object>>(); 
        List<Integer[]> questionList=new ArrayList<Integer[]>();
        String questiontext=new String();
        questionList=noteBookHandler.findCategory(QuestionType);
        for(int i=0;i<questionList.size();i++){
        	 Map<String, Object> map=new HashMap<String, Object>();
        	 AssetManager assetManager = this.getAssets();
        	 QuestionGetter questionGetter = new QuestionGetter(assetManager);
        	 DiscreteExercise exercise = questionGetter.getDiscreteExercise(questionList.get(i)[0]);
        	 questiontext=exercise.discreteQuestions[(questionList.get(i)[1])].text;
             map.put("questiontext",questiontext);  
             map.put("qusetionIndex",String.valueOf(QuestionType)+","+String.valueOf(questionList.get(i)[0])+","+String.valueOf(questionList.get(i)[1]));  
             list.add(map);   
        } 
        return list;  
    }
   
}
