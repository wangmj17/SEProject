package com.example.greverbal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class CategoryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_category);
findViewById(R.id.Category1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, ReadingQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 0);
                startActivityForResult(intent, 0);
            }
        });
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,ReadingQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 1);
                startActivityForResult(intent, 0);
            }
        });
        findViewById(R.id.Category3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,ReadingQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 2);
                startActivityForResult(intent, 0);
            }
        });
        findViewById(R.id.Category4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,ReadingQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 3);
                startActivityForResult(intent, 0);
            }
        });
        findViewById(R.id.Category5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DiscreteQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 0);
                startActivityForResult(intent, 0);
            }
        });
        findViewById(R.id.Category6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DiscreteQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 1);
                startActivityForResult(intent, 0);
            }
        });
        findViewById(R.id.Category7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DiscreteQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 2);
                startActivityForResult(intent, 0);
            }
        });
        findViewById(R.id.Category8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DiscreteQuestionsActivity.class);
                intent.putExtra("type", 1);
                intent.putExtra("category", 3);
                startActivityForResult(intent, 0);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
