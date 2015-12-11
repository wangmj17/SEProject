package com.example.greverbal;

import java.util.List;
import java.util.Map;

import com.example.greverbal.R;

import android.widget.BaseAdapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class NoteBookListItem extends BaseAdapter{
	private List<Map<String, Object>> data;  
	private LayoutInflater layoutInflater;  
	private NoteBookListItem th=this; 
	private NoteBookChooseActivity notebookchooseactivity;
	private NoteBookHandler noteBookHandler;
	private Integer exerciseIndex;
	private Integer questionIndex;
	private Integer category;
	
	public NoteBookListItem(Context context,List<Map<String, Object>> data,
			NoteBookChooseActivity notebookchooseactivity,NoteBookHandler noteBookHandler){  
		this.data=data;  
		this.layoutInflater=LayoutInflater.from(context);
		this.notebookchooseactivity=notebookchooseactivity;
		this.noteBookHandler=noteBookHandler;
		exerciseIndex=0;
		questionIndex=0;
		category=0;
	}  
	   
    public final class ListItem{  
        public TextView questionnum; 
        public TextView questiontext;  
        public Button delete;
        public Button test;     
    }  
	    @Override  
    public int getCount() {  
        return data.size();  
    }  
	    /** 
	     * 获得某一位置的数据 
	     */  
	    @Override  
    public Object getItem(int position) {  
        return data.get(position);  
    }  
	    /** 
	     * 获得唯一标识 
	     */  
	    @Override  
	public long getItemId(int position) {  
	    return position;  
	}  
	  
	    @Override  
    public View getView(final int position, View convertView, ViewGroup parent) {  
        ListItem listitem=null;  
        if(convertView==null){  
        	listitem=new ListItem();  
            //获得组件，实例化组件  
            convertView=layoutInflater.inflate(R.layout.notebooklistitem, null);  
            listitem.questionnum=(TextView)convertView.findViewById(R.id.NO);  
            listitem.questiontext=(TextView)convertView.findViewById(R.id.Question);  
            listitem.delete=(Button)convertView.findViewById(R.id.delete);  
            listitem.test=(Button)convertView.findViewById(R.id.test);
            convertView.setTag(listitem);  
        }else{  
        	listitem=(ListItem)convertView.getTag();  
        }  
        //绑定数据  
        
        listitem.questionnum.setText("☆");
        String index[]=((String)data.get(position).get("qusetionIndex")).split(",");
        exerciseIndex=Integer.parseInt(index[1]);
        questionIndex=Integer.parseInt(index[2]);
        category=Integer.parseInt(index[0]);
        listitem.questiontext.setText((String)data.get(position).get("qusetionIndex")); //(String)data.get(position).get("questiontext")
        listitem.delete.setOnClickListener(new View.OnClickListener() {   
            @Override  
            public void onClick(View v) {   
                data.remove(position);
                noteBookHandler.deleteQuestion(exerciseIndex, questionIndex, category);
                th.notifyDataSetChanged();
            }   
        });  
        listitem.test.setOnClickListener(new View.OnClickListener() {   
            @Override  
            public void onClick(View v) {   
            	Intent intent = new Intent();
            	if(category<4){
	            	intent.setClass(notebookchooseactivity,DiscreteQuestionsActivity.class);
	            	intent.putExtra("type",2);
	            	intent.putExtra("exerciseIndex",exerciseIndex);
	            	intent.putExtra("questionIndex",questionIndex);}
            	else{
                	intent.setClass(notebookchooseactivity,ReadingQuestionsActivity.class);
                	intent.putExtra("type",2);
                	intent.putExtra("exerciseIndex",exerciseIndex);
                	intent.putExtra("questionIndex",questionIndex);
                	}
            	notebookchooseactivity.startActivityForResult(intent,0);
            }   
        });   
        return convertView;  
    }  
	  
	
	
}
