package com.example.greverbal;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

class ContactsInfoAdapter extends BaseExpandableListAdapter{  
	private WordBookActivity wlt;
    public ContactsInfoAdapter(WordBookActivity wlt){
    	this.wlt=wlt;
    }
    //-----------------Child----------------//  
    @Override  
    public Object getChild(int groupPosition, int childPosition) {  
        return wlt.child.get(groupPosition).get(childPosition);  
    }  
      
    @Override  
    public long getChildId(int groupPosition, int childPosition) {  
        return childPosition;  
    }  
      
    @Override  
    public int getChildrenCount(int groupPosition) {  
        return wlt.child.get(groupPosition).size();  
    }  
      
    @Override  
    public View getChildView(int groupPosition, int childPosition,  
            boolean isLastChild, View convertView, ViewGroup parent) {  
        String string = wlt.child.get(groupPosition).get(childPosition);   
       return getGenericView(string);  
   }  
      
    //----------------Group----------------//  
   @Override  
    public Object getGroup(int groupPosition) {  
        return wlt.group.get(groupPosition);  
    }                 

    @Override  
    public long getGroupId(int groupPosition) {  
       return groupPosition;  
    }     
      
    @Override  
    public int getGroupCount() {  
        return wlt.group.size();  
}     
      
   @Override  
    public View getGroupView(int groupPosition, boolean isExpanded,  
           View convertView, ViewGroup parent) {  
       String string = wlt.group.get(groupPosition);    
        return getGenericView(string);  
   }  

    //������/����ͼ    
    public TextView getGenericView(String s) {    
        // Layout parameters for the ExpandableListView    
        AbsListView.LayoutParams lp = new AbsListView.LayoutParams(    
            ViewGroup.LayoutParams.FILL_PARENT, 40);  

        TextView text = new TextView(wlt);    
        text.setLayoutParams(lp);    
       // Center the text vertically    
        text.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);    
        // Set the text starting position    
       text.setPadding(36, 0, 0, 0);    
            
        text.setText(s);    
        return text;    
    }    
    @Override  
           public boolean hasStableIds() {  
             // TODO Auto-generated method stub  
            return false;  
          }         
  
           @Override  
         public boolean isChildSelectable(int groupPosition, int childPosition) {  
                // TODO Auto-generated method stub  
              return true;  
          }  
             
       }  
