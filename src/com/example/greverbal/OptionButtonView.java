package com.example.greverbal;

import java.util.logging.Logger;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class OptionButtonView extends RelativeLayout {
	private TextView optionText;
	private ImageView optionImage;
	private Button addtoWordBook;
	private WordBookHandler wordBookHandler;
	private boolean isRadio;
	public boolean selected;
	public String option_text;
	private String option_explanation;
	private boolean explanationShowed = false;  
	private Context context;
	
	public OptionButtonView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// 导入布局  
        LayoutInflater.from(context).inflate(R.layout.optionbuttonview, this, true);
		optionText = (TextView) this.findViewById(R.id.OptionText);
		optionImage = (ImageView) this.findViewById(R.id.OptionImage);
		addtoWordBook = (Button) this.findViewById(R.id.AddtoWordBook);
		addtoWordBook.setVisibility(View.GONE);
		this.context = context;
		selected = false;

	}
	
	public void setAddtoWordBookButton(final WordBookHandler wordBookHandler){
		
		this.wordBookHandler = wordBookHandler;
		
		addtoWordBook.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final WordBookDialog wordBookDialog = new WordBookDialog(context,option_text.substring(3),option_explanation);
				wordBookDialog.setOnConfirmListener(new OnClickListener(){

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						addtoWordBook.setBackgroundResource(R.drawable.added);
						addtoWordBook.setEnabled(false);
						addtoWordBook.setAlpha(0.5f);
						RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) addtoWordBook.getLayoutParams();
						lp.width = dip2px(context, 32);
						addtoWordBook.setLayoutParams(lp);
						String word = wordBookDialog.getWordText();
						String explanation = wordBookDialog.getExplanationText();
						wordBookHandler.addWord(word, explanation);
						wordBookDialog.dismiss();
					}
					
				});
				
				wordBookDialog.setOnCancelListener(new OnClickListener(){

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						wordBookDialog.dismiss();
					}
					
				});
				
				wordBookDialog.show();
			}
			
		});
	}
	
	public void setOptionText(String text){
		option_text = text;
		optionText.setText(text);
	}
	
	public void setOptionExplanation(String explanation){
		option_explanation = explanation;
	}
	
	public void showOrHideExplanation(){
		explanationShowed = !explanationShowed;
		if (explanationShowed){
			optionText.setText(option_text + " " + option_explanation);
			addtoWordBook.setVisibility(View.VISIBLE);
		}
		else{
			optionText.setText(option_text);
			addtoWordBook.setVisibility(View.GONE);
		}
	}
	
	public void showExplanation(){
		explanationShowed = true;
		optionText.setText(option_text + " " + option_explanation);
		addtoWordBook.setVisibility(View.VISIBLE);
	}
	
	public void setTextSize(int textSize){
		optionText.setTextSize(textSize);
	}
	
	public void setOptionImage(boolean isRadio){
		this.isRadio = isRadio;
		if(isRadio){
			optionImage.setBackgroundResource(R.drawable.radio_button);
		}
		else{
			optionImage.setBackgroundResource(R.drawable.check_button);
		}
	}
	
	public void changeSelectedStatus(){
		selected = !selected;	
		if (isRadio){
			if (selected){
				optionImage.setBackgroundResource(R.drawable.radio_button_selected);
			}
			else{
				optionImage.setBackgroundResource(R.drawable.radio_button);
			}
		}
		else{
			if (selected){
				optionImage.setBackgroundResource(R.drawable.check_button_selected);
			}
			else{
				optionImage.setBackgroundResource(R.drawable.check_button);
			}
		}
	}
	
	public void setAddtoWordBookImage(Context context){
		
		if (wordBookHandler.find(option_text.substring(3), option_explanation) != -1){
			addtoWordBook.setBackgroundResource(R.drawable.added);
			addtoWordBook.setEnabled(false);
			addtoWordBook.setAlpha(0.5f);
			RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) addtoWordBook.getLayoutParams();
			lp.width = dip2px(context, 32);
			addtoWordBook.setLayoutParams(lp);
		}
	}
	
	public int dip2px(Context context, float dipValue){
    	float m=context.getResources().getDisplayMetrics().density ;
    	return (int)(dipValue * m + 0.5f) ;
    }

}
