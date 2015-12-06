package com.example.greverbal;

import android.view.MotionEvent;
import android.view.GestureDetector.SimpleOnGestureListener;

public class WholeTextReturnGestureListener extends SimpleOnGestureListener {
	
	public WholeTextReturnGestureListener(){
		super();
	}
	
	@Override  
    public boolean onDoubleTap(MotionEvent e) {  
		WholeTextActivity.hidePage();
        return super.onDoubleTap(e);  
    } 
}
