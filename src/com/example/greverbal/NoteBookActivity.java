package com.example.greverbal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class NoteBookActivity extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_notebook);
		setOptions();
    }
	public void setOptions(){
		QuestionTabBar qtb= (QuestionTabBar) this.findViewById(R.id.QuestionTabBar);//$$$$$$
        qtb.getBackButton().setOnClickListener(new View.OnClickListener() {   //$$$$$$
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,MainActivity.class);
            	startActivityForResult(intent,0);
            }   
        }); 
        
		NoteBookButton button1=(NoteBookButton) this.findViewById(R.id.mybutton1);
    	button1.setOptionImage(1);
    	button1.setButtonText("主旨题");
    	button1.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",4);
            	startActivityForResult(intent,0);
            }   
        }); 
    	NoteBookButton button2=(NoteBookButton) this.findViewById(R.id.mybutton2);
    	button2.setOptionImage(2);
    	button2.setButtonText("细节题");
    	Log.v("asd", "asdaasd");
    	button2.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) {
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",5);
            	startActivityForResult(intent,0);
            }   
        }); 
    	NoteBookButton button3=(NoteBookButton) this.findViewById(R.id.mybutton3);
    	button3.setOptionImage(3);
    	button3.setButtonText("多选题");
    	button3.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",6);
            	startActivityForResult(intent,0);
            }   
        }); 
    	NoteBookButton button4=(NoteBookButton) this.findViewById(R.
    			id.mybutton4);
    	button4.setOptionImage(4);
    	button4.setButtonText("句子选择题");
    	button4.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",7);
            	startActivityForResult(intent,0);
            }   
        }); 
    	NoteBookButton button5=(NoteBookButton) this.findViewById(R.id.mybutton5);
    	button5.setOptionImage(5);
    	button5.setButtonText("五选一(单空)");
    	button5.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",0);
            	startActivityForResult(intent,0);
            }   
        }); 
    	NoteBookButton button6=(NoteBookButton) this.findViewById(R.id.mybutton6);
    	button6.setOptionImage(6);
    	button6.setButtonText("六选二(单空)");
    	button6.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",1);
            	startActivityForResult(intent,0);
            }   
        }); 
    	NoteBookButton button7=(NoteBookButton) this.findViewById(R.id.mybutton7);
    	button7.setOptionImage(7);
    	button7.setButtonText("六选二(双空)");
    	button7.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",2);
            	startActivityForResult(intent,0);
            }   
        }); 
    	NoteBookButton button8=(NoteBookButton) this.findViewById(R.id.mybutton8);
    	button8.setOptionImage(8);
    	button8.setButtonText("九选三(三空)");
    	button8.button.setOnClickListener(new View.OnClickListener() {   
            public void onClick(View v) { 
            	Intent intent = new Intent();
            	intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
            	intent.putExtra("type",3);
            	startActivityForResult(intent,0);
            }   
        }); 
 
    }
	
   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
