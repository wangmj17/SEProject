package com.example.greverbal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        
        View bcat = findViewById(R.id.btnCategorybutton);//ÕÒµ½ÄãÒªÉèÍ¸Ã÷±³¾°µÄlayout µÄid
        bcat.getBackground().setAlpha(150);//0~255Í¸Ã÷¶ÈÖµ £¬0ÎªÍêÈ«Í¸Ã÷£¬255Îª²»Í¸Ã÷
        View bexe = findViewById(R.id.btnExercisebutton);//ÕÒµ½ÄãÒªÉèÍ¸Ã÷±³¾°µÄlayout µÄid
        bexe.getBackground().setAlpha(150);//0~255Í¸Ã÷¶ÈÖµ £¬0ÎªÍêÈ«Í¸Ã÷£¬255Îª²»Í¸Ã÷
        View bword = findViewById(R.id.btnWordBookbutton);//ÕÒµ½ÄãÒªÉèÍ¸Ã÷±³¾°µÄlayout µÄid
        bword.getBackground().setAlpha(150);//0~255Í¸Ã÷¶ÈÖµ £¬0ÎªÍêÈ«Í¸Ã÷£¬255Îª²»Í¸Ã÷
        View bnot = findViewById(R.id.btnNoteBookChoosebutton);//ÕÒµ½ÄãÒªÉèÍ¸Ã÷±³¾°µÄlayout µÄid
        bnot.getBackground().setAlpha(150);//0~255Í¸Ã÷¶ÈÖµ £¬0ÎªÍêÈ«Í¸Ã÷£¬255Îª²»Í¸Ã÷
        
        findViewById(R.id.btnCategorybutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this,CategoryActivity.class),0);
            }
        });
        findViewById(R.id.btnWordBookbutton).setOnClickListener(new View.OnClickListener() {//by yym
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,WordBookActivity.class));
            }
        });
        findViewById(R.id.btnNoteBookChoosebutton).setOnClickListener(new View.OnClickListener() {//by yym
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NoteBookActivity.class));
            }
        });
        findViewById(R.id.btnExercisebutton).setOnClickListener(new View.OnClickListener() {//by liulg
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ExerciseActivity.class));       
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
