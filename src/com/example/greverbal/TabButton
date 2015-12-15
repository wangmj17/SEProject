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

public class TabButton extends RelativeLayout{
	private TextView optionText;//Words
	//private ImageView optionImage;//Pictures
	private int questionType;
	public Button button;
	
	public TabButton(Context context){
		this(context, null);  
	}
	
	public TabButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// 导入布局 
        LayoutInflater.from(context).inflate(R.layout.tabbutton, this, true);
		//optionImage = (ImageView) this.findViewById(R.id.OptionImage);
		button=(Button) this.findViewById(R.id.bt);
		
	}
	
	
	
	public void setButtonText(String text){
		button.setText(text);
	}

}
