package com.example.greverbal;

import android.app.ActionBar.LayoutParams;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class WordBookDialog extends Dialog {

	private EditText wordEditText, explanationEditText;
	private Button confirmButton, cancelButton;


	public WordBookDialog(Context context, String word, String explanation) {
		super(context);
		// TODO Auto-generated constructor stub

		requestWindowFeature(Window.FEATURE_NO_TITLE); 

		View view = LayoutInflater.from(context).inflate(R.layout.wordbookdialog_view, null);
		setContentView(view);

		this.setTitle("fasfsaf");
		wordEditText = (EditText) view.findViewById(R.id.WordEditText);
		explanationEditText = (EditText) view.findViewById(R.id.ExplanationEditText);
		confirmButton = (Button) view.findViewById(R.id.WordBookConfirmButton);
		cancelButton = (Button) view.findViewById(R.id.WordBookCancelButton);

		wordEditText.setText(word);
		explanationEditText.setText(explanation);

		Window dialogWindow = getWindow();
		WindowManager.LayoutParams lp = dialogWindow.getAttributes();
		lp.width = dip2px(context,240);
		dialogWindow.setAttributes(lp);
	}

	public int dip2px(Context context, float dipValue){
		float m=context.getResources().getDisplayMetrics().density ;
		return (int)(dipValue * m + 0.5f) ;
	}

	public void setOnConfirmListener(View.OnClickListener listener){
		confirmButton.setOnClickListener(listener);
	}

	public void setOnCancelListener(View.OnClickListener listener){
		cancelButton.setOnClickListener(listener);
	}

	public String getWordText(){
		return wordEditText.getText().toString();
	}

	public String getExplanationText(){
		return explanationEditText.getText().toString();
	}
}
