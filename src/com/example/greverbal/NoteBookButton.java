package com.example.greverbal;

import java.util.logging.Logger;

import com.example.greverbal.R;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
 
public class NoteBookButton extends RelativeLayout{
	private TextView optionText;
	public Button button;
	private int questionType;
	
	public NoteBookButton(Context context){
		this(context, null);  
	}
	
	public NoteBookButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// 导入布局  
        LayoutInflater.from(context).inflate(R.layout.notebookbutton, this, true);
		button = (Button) this.findViewById(R.id.bt);
		
	}
  
	 
	public void setButtonBackground(int questionType){
		this.questionType = questionType;
		if(questionType == 1){
			button.setBackgroundResource(R.drawable.mainidea);
		}  
		else if(questionType == 2){
			button.setBackgroundResource(R.drawable.detail);
		}
		else if(questionType == 3){
			button.setBackgroundResource(R.drawable.duoxuan);
		}
		else if(questionType == 4){
			button.setBackgroundResource(R.drawable.xuanze);
		}
		else if(questionType == 5){
			button.setBackgroundResource(R.drawable.wuxuanyi);
		}
		else if(questionType == 6){
			button.setBackgroundResource(R.drawable.liuxuaner1);
		}
		else if(questionType == 7){
			button.setBackgroundResource(R.drawable.liuxuaner2);
		}
		else {
			button.setBackgroundResource(R.drawable.jiuxuansan);
		}
		
	}
	

}
