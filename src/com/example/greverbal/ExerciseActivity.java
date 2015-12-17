package com.example.greverbal;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.TabHost;

public class ExerciseActivity extends TabActivity {

	private QuestionTabBar qtb1=null;
	private QuestionTabBar qtb2=null;
	private TabButton qtb11=null;
	private TabButton qtb12=null;
	private TabButton qtb13=null;
	private TabButton qtb14=null;
	private TabButton qtb15=null;
	private TabButton qtb16=null;
	private TabButton qtb17=null;
	private TabButton qtb18=null;
	private TabButton qtb19=null;
	private TabButton qtb110=null;
	private TabButton qtb21=null;
	private TabButton qtb22=null;
	private TabButton qtb23=null;
	private TabButton qtb24=null;
	private TabButton qtb25=null;
	private TabButton qtb26=null;
	private TabButton qtb27=null;
	private TabButton qtb28=null;
	private TabButton qtb29=null;
	private TabButton qtb210=null;
	private ExerciseActivity exerciseActivity;
	
	 TabHost mTabHost;
	 int mMenuTag=0; 
	 Menu mMenu;
	 static final int mMenuResources[] = 
	 	{    
	       R.layout.tab1_reading,   
	       R.layout.tab2_discrete  
	     };   
	    
	 /** Called when the activity is first created. */  
	 @Override  
	 protected void onCreate(Bundle savedInstanceState)
	 {   
		 
		
     // TODO Auto-generated method stub   
     super.onCreate(savedInstanceState);  
     this.requestWindowFeature(Window.FEATURE_NO_TITLE);
     this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
     exerciseActivity = this;
     final Intent intent = getIntent();
     //获取TabHost   
     mTabHost=this.getTabHost();   
     //过滤出TabHost布局   
     LayoutInflater.from(this).inflate(R.layout.activity_exerciseview, mTabHost.getTabContentView(), true);   
     //为TabHost设置背景颜色   
     //mTabHost.setBackgroundColor(Color.argb(100, 30, 80, 160));   
        
     //增加2个选型卡 绘制布局   
     mTabHost.addTab(mTabHost.newTabSpec("One")   
              .setIndicator("阅读")   
              .setContent(R.id.frist_tab_tablelayout));   
        
     mTabHost.addTab(mTabHost.newTabSpec("Two")   
             .setIndicator("填空")   
             .setContent(R.id.second_tab_tablelayout));   
        
    
        
     //添加监听事件   
     mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() 
     {   
            
         @Override  
         public void onTabChanged(String tabId) 
         {   
             if (tabId.equals("One")) 
             {   
                 mMenuTag = 1;   
             }   
             if (tabId.equals("Two"))
             {   
                 mMenuTag = 2;   
             }   
               
             if (mMenu != null)
             {   
                 onCreateOptionsMenu(mMenu);   
             }   
         }   
     }); 
     
     qtb1= (QuestionTabBar) this.findViewById(R.id.QuestionTabBar1);//$$$$$$
     qtb1.getBackButton().setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
        	 exerciseActivity.setResult(RESULT_OK, intent);
			 exerciseActivity.finish();
         }
     });
     qtb1.setTextViewText("阅读");
     qtb2= (QuestionTabBar) this.findViewById(R.id.QuestionTabBar2);//$$$$$$
     qtb2.getBackButton().setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
        	 exerciseActivity.setResult(RESULT_OK, intent);
			 exerciseActivity.finish();
         }   
     });
     qtb2.setTextViewText("填空");
     
     qtb11=  (TabButton)this.findViewById(R.id.mybutton11);//$$$$$$
     qtb11.button.setText("阅读 01");
     qtb11.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb12= (TabButton) this.findViewById(R.id.mybutton12);//$$$$$$
     qtb12.button.setText("阅读 02");
     qtb12.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb13=  (TabButton)this.findViewById(R.id.mybutton13);//$$$$$$
     qtb13.button.setText("阅读 03");
     qtb13.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb14= (TabButton) this.findViewById(R.id.mybutton14);//$$$$$$
     qtb14.button.setText("阅读 04");
     qtb14.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb15=  (TabButton)this.findViewById(R.id.mybutton15);//$$$$$$
     qtb15.button.setText("阅读 05");
     qtb15.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb16= (TabButton) this.findViewById(R.id.mybutton16);//$$$$$$
     qtb16.button.setText("阅读 06");
     qtb16.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb17=  (TabButton)this.findViewById(R.id.mybutton17);//$$$$$$
     qtb17.button.setText("阅读 07");
     qtb17.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb18= (TabButton) this.findViewById(R.id.mybutton18);//$$$$$$
     qtb18.button.setText("阅读 08");
     qtb18.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb19=  (TabButton)this.findViewById(R.id.mybutton19);//$$$$$$
     qtb19.button.setText("阅读 09");
     qtb19.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb110= (TabButton) this.findViewById(R.id.mybutton110);//$$$$$$
     qtb110.button.setText("阅读 10");
     qtb110.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,ReadingQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     
     
     qtb21=  (TabButton)this.findViewById(R.id.mybutton21);//$$$$$$
     qtb21.button.setText("填空 01");
     qtb21.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb22= (TabButton) this.findViewById(R.id.mybutton22);//$$$$$$
     qtb22.button.setText("填空 02");
     qtb22.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 1);
         	startActivityForResult(intent,0);
         }   
     });
     qtb23=  (TabButton)this.findViewById(R.id.mybutton23);//$$$$$$
     qtb23.button.setText("填空 03");
     qtb23.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb24= (TabButton) this.findViewById(R.id.mybutton24);//$$$$$$
     qtb24.button.setText("填空 04");
     qtb24.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 1);
         	startActivityForResult(intent,0);
         }   
     });
     qtb25=  (TabButton)this.findViewById(R.id.mybutton25);//$$$$$$
     qtb25.button.setText("填空 05");
     qtb25.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb26= (TabButton) this.findViewById(R.id.mybutton26);//$$$$$$
     qtb26.button.setText("填空 06");
     qtb26.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 1);
         	startActivityForResult(intent,0);
         }   
     });
     qtb27=  (TabButton)this.findViewById(R.id.mybutton27);//$$$$$$
     qtb27.button.setText("填空 07");
     qtb27.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb28= (TabButton) this.findViewById(R.id.mybutton28);//$$$$$$
     qtb28.button.setText("填空 08");
     qtb28.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 1);
         	startActivityForResult(intent,0);
         }   
     });
     qtb29=  (TabButton)this.findViewById(R.id.mybutton29);//$$$$$$
     qtb29.button.setText("填空 09");
     qtb29.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 0);
         	startActivityForResult(intent,0);
         }   
     });
     qtb210= (TabButton) this.findViewById(R.id.mybutton210);//$$$$$$
     qtb210.button.setText("填空 10");
     qtb210.button.setOnClickListener(new View.OnClickListener() {   //$$$$$$
         public void onClick(View v) { 
         	Intent intent = new Intent();
         	intent.setClass(ExerciseActivity.this,DiscreteQuestionsActivity.class);
         	intent.putExtra("type", 0);
            intent.putExtra("exerciseIndex", 1);
         	startActivityForResult(intent,0);
         }   
     });
     
 } 
 
	 





//创建对应的菜单项   
@Override  
public boolean onCreateOptionsMenu(Menu menu) 
{   
    mMenu = menu;   
    mMenu.clear();   
       
    //获取菜单过滤器   
    MenuInflater inflater = getMenuInflater();           
      
    switch (mMenuTag)
    {   
    case 1:   
        //动态加入数组中对应的menu.xml   
        inflater.inflate(mMenuResources[0], menu);   
        break;   
    case 2:   
        inflater.inflate(mMenuResources[1], menu);   
        break;
   
     
    default:   
        inflater.inflate(mMenuResources[0], menu);   
        break;   
    }   
    return super.onCreateOptionsMenu(menu);   
}   
} 
