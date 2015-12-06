package com.example.greverbal;

import org.xmlpull.v1.XmlPullParser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class WholeTextActivity extends Activity {
	
	private Button hideButton;
	private TextView wholeTextView;
	private String text;
	private static WholeTextActivity wholeTextActivity;
	private static Intent intent;
	private GestureDetector mDetector;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_wholetext);
        mDetector = new GestureDetector(this, new WholeTextReturnGestureListener()); 
        
        intent = getIntent();
        text = intent.getStringExtra("text");
        
        hideButton = (Button)this.findViewById(R.id.HideButton);
        wholeTextView = (TextView)this.findViewById(R.id.WholeText);
        wholeTextActivity = this;
        
        init();
    }

	private void init(){
		wholeTextView.setText(text);
		hideButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				wholeTextActivity.setResult(RESULT_OK, intent);
				wholeTextActivity.finish();
			}
		});
	}
	
	public static void hidePage(){
		wholeTextActivity.setResult(RESULT_OK, intent);
		wholeTextActivity.finish();
	}
	
	@Override  
    public boolean onTouchEvent(MotionEvent event) {  
        mDetector.onTouchEvent(event);  
        return true;
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
