package com.example.shafeeq.alarmclockquestionapp;

public class dataStorage {
    public static int diffLevel=1;
    public static int numQuestions=3;

    public static Alarm alarmOne=new Alarm(-1,-1);//initialisimg alarms in disabled state
    public static Alarm alarmTwo=new Alarm(-1,-1);
    public static Alarm alarmThree=new Alarm(-1,-1);

    public static void setAlarmOne(Alarm newAlarm){
        alarmOne=newAlarm;
    }
    public static void setAlarmTwo(Alarm newAlarm){
        alarmTwo=newAlarm;
    }
    public static void setAlarmThree(Alarm newAlarm){
        alarmThree=newAlarm;
    }
    public static void setDiffLevel(int newDif){
        diffLevel=newDif;
    }
    public static void setNumQuestions(int numQs){
        numQuestions=numQs;
    }
    public static int getDiffLevel(){
        return diffLevel;
    }
    public static int getNumQuestions(){
        return numQuestions;
    }
    public static Alarm getAlarmOne(){
        return alarmOne;
    }
    public static Alarm getAlarmTwo(){
        return alarmTwo;
    }
    public static Alarm getAlarmThree(){
        return alarmThree;
    }

}
