package com.example.greverbal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AnswerView extends RelativeLayout {
	
	private TextView yourAnswer;
	private TextView rightAnswer;
	private Button addtoNoteBook;
	private Context context;
	
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
		this.context = context;
	}
	
	public void setYourAnswerContent(String text){
		yourAnswer.setText("Your Answer: " + text);
	}
	
	public void setRightAnswerContent(String text){
		rightAnswer.setText("Right Answer: " + text);
	}
	
	public void setAddtoNoteBookAction(final int exerciseIndex, final int questionIndex, final int category, final NoteBookHandler noteBookHandler){
		addtoNoteBook.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				noteBookHandler.addQuestion(exerciseIndex, questionIndex, category);
				addtoNoteBook.setBackgroundResource(R.drawable.added);
				addtoNoteBook.setEnabled(false);
				addtoNoteBook.setAlpha(0.5f);
				RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) addtoNoteBook.getLayoutParams();
				lp.width = dip2px(context, 40);
				addtoNoteBook.setLayoutParams(lp);
			}
			
		});
		
	}
	
	public void setAddtoNoteBookImage(Context context,int exerciseIndex, int questionIndex, int category, NoteBookHandler noteBookHandler){
		
		if (noteBookHandler.find(exerciseIndex, questionIndex, category) != -1){
			addtoNoteBook.setBackgroundResource(R.drawable.added);
			addtoNoteBook.setEnabled(false);
			addtoNoteBook.setAlpha(0.5f);
			RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) addtoNoteBook.getLayoutParams();
			lp.width = dip2px(context, 40);
			addtoNoteBook.setLayoutParams(lp);
		}
		else{
			addtoNoteBook.setBackgroundResource(R.drawable.add_to_notebook);
			addtoNoteBook.setEnabled(true);
			addtoNoteBook.setAlpha(1.0f);
			RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) addtoNoteBook.getLayoutParams();
			lp.width = dip2px(context, 80);
			addtoNoteBook.setLayoutParams(lp);
		}
	}
	
	public int dip2px(Context context, float dipValue){
    	float m=context.getResources().getDisplayMetrics().density ;
    	return (int)(dipValue * m + 0.5f) ;
    }
}
