package com.example.greverbal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AnswerView extends RelativeLayout {
	
	private TextView yourAnswer;
	private TextView rightAnswer;
	private Button addtoNoteBook;
	public AnswerView(Context context) {  
        this(context, null);  
    }  
	
	public AnswerView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// 导入布局  
        LayoutInflater.from(context).inflate(R.layout.answerview, this, true);
		yourAnswer = (TextView) this.findViewById(R.id.YourAnswer);
		rightAnswer = (TextView) this.findViewById(R.id.RightAnswer);
		addtoNoteBook = (Button) this.findViewById(R.id.AddtoNoteBook);
	}
	
	public void setYourAnswerContent(String text){
		yourAnswer.setText("Your Answer: " + text);
	}
	
	public void setRightAnswerContent(String text){
		rightAnswer.setText("Right Answer: " + text);
	}
}
