package com.example.greverbal;

import android.content.Context;  
import android.util.AttributeSet;  
import android.view.LayoutInflater;  
import android.widget.Button;  
import android.widget.RelativeLayout;  
import android.widget.TextView;  
import com.example.greverbal.R;

public class QuestionTabBar1 extends RelativeLayout {
	private Button backButton;
	private TextView tabBarTitle;
	public QuestionTabBar1(Context context) {  
        this(context, null);  
    }  
  
    public QuestionTabBar1(Context context, AttributeSet attrs) {  
        super(context, attrs);  
        // 瀵煎叆甯冨眬  
        LayoutInflater.from(context).inflate(R.layout.questiontabbar1, this, true);  
        backButton = (Button) this.findViewById(R.id.BackButton);  
        tabBarTitle = (TextView) this.findViewById(R.id.TabBarTitle);  
  
    }
    
    public void setTextViewText(String text) {  
        tabBarTitle.setText(text);  
    }  
    
	public Button getBackButton() {
		return backButton;
	}

	public void setBackButton(Button backButton) {
		this.backButton = backButton;
	}

	public TextView getTabBarTitle() {
		return tabBarTitle;
	}

	public void setTabBarTitle(TextView tabBarTitle) {
		this.tabBarTitle = tabBarTitle;
	}
}
