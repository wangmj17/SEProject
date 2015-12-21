package com.example.greverbal;

import android.annotation.SuppressLint;
import android.content.Context;  
import android.text.Layout;
import android.util.AttributeSet;  
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;   
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;  
import android.widget.ScrollView;
import android.widget.TextView;  

@SuppressLint("ClickableViewAccessibility") public class QuestionTextScrollView extends RelativeLayout {
	private TextView questionText;
	private TextView doubleClickText;
	private ScrollView textScrollView;

	public QuestionTextScrollView(Context context) {  
		this(context, null);  
	}  

	public QuestionTextScrollView(Context context, AttributeSet attrs) {  
		super(context, attrs);  
		// 导入布局  
		LayoutInflater.from(context).inflate(R.layout.questiontextscrollview, this, true);  
		questionText = (TextView) this.findViewById(R.id.QuestionText);  
		textScrollView = (ScrollView) this.findViewById(R.id.TextScrollView);
		doubleClickText = (TextView) this.findViewById(R.id.DoubleClickText);  

	}

	public void setText(String text){
		questionText.setText(text);
	}

	public void setTextHeight(int height){
		ScrollView.LayoutParams lp=(ScrollView.LayoutParams)questionText.getLayoutParams();
		lp.height = height;
		questionText.setLayoutParams(lp);
	}

	public TextView getQuestionText() {
		return questionText;
	}

	public void setQuestionText(TextView questionText) {
		this.questionText = questionText;
	}

	public TextView getDoubleClickText() {
		return doubleClickText;
	}

	public void setDoubleClickText(TextView doubleClickText) {
		this.doubleClickText = doubleClickText;
	}

	public ScrollView getTextScrollView() {
		return textScrollView;
	}

	public void setTextScrollView(ScrollView textScrollView) {
		this.textScrollView = textScrollView;
	}

}
