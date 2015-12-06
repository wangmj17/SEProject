package com.example.greverbal;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class QuestionBottomBar extends RelativeLayout {
	
	private Button showExplanationButton;
	private Button checkAnswerButton;
	private Button lastButton;
	private Button nextButton;
	public QuestionBottomBar(Context context) {  
        this(context, null);  
    }  
  
    public QuestionBottomBar(Context context, AttributeSet attrs) {  
        super(context, attrs);  
        // 导入布局  
        LayoutInflater.from(context).inflate(R.layout.questionbottombar, this, true);  
        lastButton = (Button)this.findViewById(R.id.LastButton);
        nextButton = (Button)this.findViewById(R.id.NextButton);
        showExplanationButton = (Button) findViewById(R.id.ShowExplanation);  
        checkAnswerButton = (Button) this.findViewById(R.id.CheckAnswer); 
        
    }
    
    public void setButtonWidth(int margin){
    	WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);
        @SuppressWarnings("deprecation")
		int screenWidth = wm.getDefaultDisplay().getWidth();
        RelativeLayout.LayoutParams lp=(RelativeLayout.LayoutParams)showExplanationButton.getLayoutParams();
    	lp.width = screenWidth/2 - margin;
    	showExplanationButton.setLayoutParams(lp);
    	lp=(RelativeLayout.LayoutParams)checkAnswerButton.getLayoutParams();
    	lp.width = screenWidth/2 - margin;
    	checkAnswerButton.setLayoutParams(lp);
    }
	
	public Button getShowExplanationButton() {
		return showExplanationButton;
	}
	
	public Button getCheckAnswerButton() {
		return checkAnswerButton;
	}

	public Button getLastButton() {
		return lastButton;
	}

	public Button getNextButton() {
		return nextButton;
	}
    
    
}
