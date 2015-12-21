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
	private NoteBookActivity noteBookActivity;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_notebook);
		noteBookActivity = this;
		setOptions();
	}
	public void setOptions(){

		final Intent intent = getIntent();
		QuestionTabBar qtb= (QuestionTabBar) this.findViewById(R.id.QuestionTabBar);//$$$$$$
		qtb.getBackButton().setOnClickListener(new View.OnClickListener() {   //$$$$$$
			public void onClick(View v) { 
				noteBookActivity.setResult(RESULT_OK, intent);
				noteBookActivity.finish();
			}   
		}); 

		NoteBookButton button1=(NoteBookButton) this.findViewById(R.id.mybutton1);
		button1.setButtonBackground(1);
		button1.button.setOnClickListener(new View.OnClickListener() {   
			public void onClick(View v) { 
				Intent intent = new Intent();
				intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
				intent.putExtra("type",4);
				startActivityForResult(intent,0);
			}   
		}); 
		NoteBookButton button2=(NoteBookButton) this.findViewById(R.id.mybutton2);
		button2.setButtonBackground(2);
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
		button3.setButtonBackground(3);
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
		button4.setButtonBackground(4);
		button4.button.setOnClickListener(new View.OnClickListener() {   
			public void onClick(View v) { 
				Intent intent = new Intent();
				intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
				intent.putExtra("type",7);
				startActivityForResult(intent,0);
			}   
		}); 
		NoteBookButton button5=(NoteBookButton) this.findViewById(R.id.mybutton5);
		button5.setButtonBackground(5);
		button5.button.setOnClickListener(new View.OnClickListener() {   
			public void onClick(View v) { 
				Intent intent = new Intent();
				intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
				intent.putExtra("type",0);
				startActivityForResult(intent,0);
			}   
		}); 
		NoteBookButton button6=(NoteBookButton) this.findViewById(R.id.mybutton6);
		button6.setButtonBackground(6);
		button6.button.setOnClickListener(new View.OnClickListener() {   
			public void onClick(View v) { 
				Intent intent = new Intent();
				intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
				intent.putExtra("type",1);
				startActivityForResult(intent,0);
			}   
		}); 
		NoteBookButton button7=(NoteBookButton) this.findViewById(R.id.mybutton7);
		button7.setButtonBackground(7);
		button7.button.setOnClickListener(new View.OnClickListener() {   
			public void onClick(View v) { 
				Intent intent = new Intent();
				intent.setClass(NoteBookActivity.this,NoteBookChooseActivity.class);
				intent.putExtra("type",2);
				startActivityForResult(intent,0);
			}   
		}); 
		NoteBookButton button8=(NoteBookButton) this.findViewById(R.id.mybutton8);
		button8.setButtonBackground(8);
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
