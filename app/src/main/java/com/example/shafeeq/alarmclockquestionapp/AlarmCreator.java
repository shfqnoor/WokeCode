package com.example.shafeeq.alarmclockquestionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class AlarmCreator extends AppCompatActivity {
    public static String editing="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_creator);

        final Spinner hourDropper = findViewById(R.id.hourspinner);
        final Spinner minuteDropper = findViewById(R.id.minutespinner);

        String[] mins = new String[60];
        for(int i=0; i<60; i++){
            mins[i]=Integer.toString(i);
        }
        String[] hrs = new String[24];
        for(int i=0; i<24; i++) {
            hrs[i] = Integer.toString(i);
        }

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, mins);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, hrs);

        minuteDropper.setAdapter(adapter1);
        hourDropper.setAdapter(adapter2);

        Button addAlarm=(Button) findViewById(R.id.setAlarm);
        addAlarm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int min=Integer.parseInt(minuteDropper.getSelectedItem().toString());
                int hr=Integer.parseInt(hourDropper.getSelectedItem().toString());
                if(editing.equals("alarmOne")){
                    dataStorage.getAlarmOne().setAlarm(hr, min);
                }
                else if(editing.equals("alarmTwo")){
                    dataStorage.getAlarmTwo().setAlarm(hr, min);
                }
                else if(editing.equals("alarmThree")) {
                    dataStorage.getAlarmThree().setAlarm(hr, min);
                }
                openHome();
            }
        });

        Button exit=(Button) findViewById(R.id.exitButton);
        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openHome();

            }
        });

    }
    public void openHome(){
        Intent intent=new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
    public static void setEditing(String edit){
        editing=edit;
    }

}
