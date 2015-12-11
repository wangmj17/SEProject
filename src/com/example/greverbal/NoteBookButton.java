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
	private ImageView optionImage;
	private int questionType;
	public Button button;
	
	public NoteBookButton(Context context){
		this(context, null);  
	}
	
	public NoteBookButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// 导入布局  
        LayoutInflater.from(context).inflate(R.layout.notebookbutton, this, true);
		optionImage = (ImageView) this.findViewById(R.id.OptionImage);
		button=(Button) this.findViewById(R.id.bt);
		
	}
  
	 
	public void setButtonText(String text){
		button.setText(text);
	}
	 
	public void setOptionImage(int questionType){
		this.questionType = questionType;
		if(questionType == 1){
			optionImage.setBackgroundResource(R.drawable.mainidea);
		}  
		else if(questionType == 2){
			optionImage.setBackgroundResource(R.drawable.detail);
		}
		else if(questionType == 3){
			optionImage.setBackgroundResource(R.drawable.duoxuan);
		}
		else if(questionType == 4){
			optionImage.setBackgroundResource(R.drawable.sentence_selection);
		}
		else if(questionType == 5){
			optionImage.setBackgroundResource(R.drawable.wuxuanyi);
		}
		else if(questionType == 6){
			optionImage.setBackgroundResource(R.drawable.liuxuaner1);
		}
		else if(questionType == 7){
			optionImage.setBackgroundResource(R.drawable.liuxuaner2);
		}
		else {
			optionImage.setBackgroundResource(R.drawable.jiuxuansan);
		}
		
	}
	

}
