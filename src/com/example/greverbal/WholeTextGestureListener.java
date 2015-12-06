package com.example.greverbal;

import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.TextView;

public class WholeTextGestureListener extends SimpleOnGestureListener {
	
	public WholeTextGestureListener(){
		super();
	}
	
	@Override  
    public boolean onDoubleTap(MotionEvent e) {  
		DiscreteQuestionsActivity.showWholeText();
        return super.onDoubleTap(e);  
    } 
}
