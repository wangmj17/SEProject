package com.example.greverbal;

import android.util.Log;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.widget.TextView;


public class WholeTextGestureListener extends SimpleOnGestureListener {
	
	private int type;
	public WholeTextGestureListener(int type){
		super();
		this.type = type;
	}
	
	@Override  
    public boolean onDoubleTap(MotionEvent e) {  
		if (this.type == 0)
		DiscreteQuestionsActivity.showWholeText();
		else
		ReadingQuestionsActivity.showWholeText();
        return super.onDoubleTap(e);  
    } 
}
