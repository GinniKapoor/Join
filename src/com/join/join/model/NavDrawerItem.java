package com.join.join.model;

public class NavDrawerItem {
    private boolean showNotify;
    private String title;
    private int icon;
    private String count = "0";
    // boolean to set visiblity of the counter
    private boolean isCounterVisible = false;
 
    public NavDrawerItem() {
 
    }
 
    public NavDrawerItem(boolean showNotify, String title, int icon, boolean isCounterVisible, String count) {
        this.showNotify = showNotify;
        this.title = title;
        this.icon = icon;
        this.isCounterVisible = isCounterVisible;
        this.count = count;
    }
 
    public boolean isShowNotify() {
        return showNotify;
    }
 
    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getIcon(){
        return icon;
    }  
    
    public void setIcon(){
    	 this.icon=icon;
    }
    
    public String getCount(){
        return count;
    }
    
    public void setCount(String count){
        this.count = count;
    }
    
    public boolean getCounterVisibility(){
    	return this.isCounterVisible;
    }
     
    
    public void setCounterVisibility(boolean isCounterVisible){
        this.isCounterVisible = isCounterVisible;
    
    
}

}





