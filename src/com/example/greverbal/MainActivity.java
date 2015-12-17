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

	 View bcat = findViewById(R.id.btnCategorybutton);//找到你要设透明背景的layout 的id
        bcat.getBackground().setAlpha(100);//0~255透明度值 ，0为完全透明，255为不透明
        View bexe = findViewById(R.id.btnExercisebutton);//找到你要设透明背景的layout 的id
        bexe.getBackground().setAlpha(100);//0~255透明度值 ，0为完全透明，255为不透明
        View bword = findViewById(R.id.btnWordBookbutton);//找到你要设透明背景的layout 的id
        bword.getBackground().setAlpha(100);//0~255透明度值 ，0为完全透明，255为不透明
        View bnot = findViewById(R.id.btnNoteBookChoosebutton);//找到你要设透明背景的layout 的id
        bnot.getBackground().setAlpha(100);//0~255透明度值 ，0为完全透明，255为不透明
<<<<<<< Updated upstream
        

=======
        
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> origin/master
        View bcat = findViewById(R.id.btnCategorybutton);//脮脪碌陆脛茫脪陋脡猫脥赂脙梅卤鲁戮掳碌脛layout 碌脛id
        bcat.getBackground().setAlpha(150);//0~255脥赂脙梅露脠脰碌 拢卢0脦陋脥锚脠芦脥赂脙梅拢卢255脦陋虏禄脥赂脙梅
        View bexe = findViewById(R.id.btnExercisebutton);//脮脪碌陆脛茫脪陋脡猫脥赂脙梅卤鲁戮掳碌脛layout 碌脛id
        bexe.getBackground().setAlpha(150);//0~255脥赂脙梅露脠脰碌 拢卢0脦陋脥锚脠芦脥赂脙梅拢卢255脦陋虏禄脥赂脙梅
        View bword = findViewById(R.id.btnWordBookbutton);//脮脪碌陆脛茫脪陋脡猫脥赂脙梅卤鲁戮掳碌脛layout 碌脛id
        bword.getBackground().setAlpha(150);//0~255脥赂脙梅露脠脰碌 拢卢0脦陋脥锚脠芦脥赂脙梅拢卢255脦陋虏禄脥赂脙梅
        View bnot = findViewById(R.id.btnNoteBookChoosebutton);//脮脪碌陆脛茫脪陋脡猫脥赂脙梅卤鲁戮掳碌脛layout 碌脛id
        bnot.getBackground().setAlpha(150);//0~255脥赂脙梅露脠脰碌 拢卢0脦陋脥锚脠芦脥赂脙梅拢卢255脦陋虏禄脥赂脙梅
        
<<<<<<< HEAD
=======
=======

>>>>>>> origin/master
>>>>>>> Stashed changes
>>>>>>> origin/master
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
