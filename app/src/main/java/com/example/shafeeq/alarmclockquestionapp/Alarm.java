package com.example.shafeeq.alarmclockquestionapp;

public class Alarm {
    int hour;
    int min;

    boolean alarmState=false;
    boolean isRinging=false;

    public Alarm(int hour, int min){
        this.hour=hour;
        this.min=min;
    }
    public void changeState(boolean n){
       alarmState = n;
    }

    public void checkAlarm(int alarmHour, int alarmMin, int alarmSec, boolean conditionState){
        if(hour==alarmHour && min==alarmMin && alarmSec==0 && conditionState){
            isRinging=true;
        }
    }

    public void turnOff(){
        isRinging=false;
    }

    public boolean getIsRinging(){
        return isRinging;
    }

    public void setAlarm(int newHour, int newMin){
        hour=newHour;
        min=newMin;
    }
    public String toString(){
        String ret=Integer.toString(hour)+ ":" + Integer.toString(min);
        if(min==-1){
            ret="";
            return ret;
        }
        return ret;
    }

}

