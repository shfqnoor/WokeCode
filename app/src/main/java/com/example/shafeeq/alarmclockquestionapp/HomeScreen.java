package com.example.shafeeq.alarmclockquestionapp;

import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class HomeScreen extends AppCompatActivity {
    public static Alarm alarmOne=dataStorage.getAlarmOne();//initialisimg alarms in disabled state
    public static Alarm alarmTwo=dataStorage.getAlarmTwo();
    public static Alarm alarmThree=dataStorage.getAlarmThree();

    //public boolean answeringQuestions=false; //boolean state for when user is in MCQuestionInterface

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //looped codez
        /*
        final Handler mHandler= new Handler();
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // do your stuff here, called every second
                Alarm alarmOne=dataStorage.getAlarmOne();//initialisimg alarms in disabled state
                Alarm alarmTwo=dataStorage.getAlarmTwo();
                Alarm alarmThree=dataStorage.getAlarmThree();

                Date currentTime=new Date();

                //initializing components
                TextView clock=(TextView) findViewById(R.id.clock);

                Switch switchOne = (Switch) findViewById(R.id.switch1);//making on/off toggle
                Switch switchTwo = (Switch) findViewById(R.id.switch2);
                Switch switchThree = (Switch) findViewById(R.id.switch3);

                switchOne.setText("Alarm 1   " + alarmOne.toString());//setting labels on toggles
                switchTwo.setText("Alarm 2 " + alarmTwo.toString());
                switchThree.setText("Alarm 3 " + alarmThree.toString());

                alarmOne.changeState(switchOne.isChecked());
                alarmTwo.changeState(switchTwo.isChecked());
                alarmThree.changeState(switchThree.isChecked());

                //updating clock
                clock.setText(currentTime.getHours() + " : " + currentTime.getMinutes() + " : " + currentTime.getSeconds() );

                //checking alarms
                alarmOne.checkAlarm(currentTime.getHours(), currentTime.getMinutes(), currentTime.getSeconds(),switchOne.isChecked());
                alarmTwo.checkAlarm(currentTime.getHours(), currentTime.getMinutes(), currentTime.getSeconds(),switchTwo.isChecked());
                alarmThree.checkAlarm(currentTime.getHours(), currentTime.getMinutes(), currentTime.getSeconds(),switchThree.isChecked());


                //checking if alarm is triggered
                if(alarmOne.getIsRinging() || alarmTwo.getIsRinging() || alarmThree.getIsRinging()) {  //start ringing if triggered

                    // problems start here
                    openMCQuestionInterface();

                    Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                    Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);

                    while(!MCQuestionInterface.getState())
                    {
                        r.play();
                    }

                    alarmOne.turnOff();
                    alarmTwo.turnOff();
                    alarmThree.turnOff();

                    r.stop();

                }
                //this is where we check number of solutions to deterine when to stop alarm
                // if(!answeringQuestions)
                MCQuestionInterface.reset();

                mHandler.postDelayed(this, 1000);
            }
        };

        mHandler.post(runnable);
        */
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                Alarm alarmOne=dataStorage.getAlarmOne();//initialisimg alarms in disabled state
                Alarm alarmTwo=dataStorage.getAlarmTwo();
                Alarm alarmThree=dataStorage.getAlarmThree();

                Date currentTime=new Date();

                //initializing components
                TextView clock=(TextView) findViewById(R.id.clock);

                Switch switchOne = (Switch) findViewById(R.id.switch1);//making on/off toggle
                Switch switchTwo = (Switch) findViewById(R.id.switch2);
                Switch switchThree = (Switch) findViewById(R.id.switch3);

                switchOne.setText("Alarm 1   " + alarmOne.toString());//setting labels on toggles
                switchTwo.setText("Alarm 2 " + alarmTwo.toString());
                switchThree.setText("Alarm 3 " + alarmThree.toString());

                alarmOne.changeState(switchOne.isChecked());
                alarmTwo.changeState(switchTwo.isChecked());
                alarmThree.changeState(switchThree.isChecked());

                //updating clock
                clock.setText(currentTime.getHours() + " : " + currentTime.getMinutes() + " : " + currentTime.getSeconds() );

                //checking alarms
                alarmOne.checkAlarm(currentTime.getHours(), currentTime.getMinutes(), currentTime.getSeconds(),switchOne.isChecked());
                alarmTwo.checkAlarm(currentTime.getHours(), currentTime.getMinutes(), currentTime.getSeconds(),switchTwo.isChecked());
                alarmThree.checkAlarm(currentTime.getHours(), currentTime.getMinutes(), currentTime.getSeconds(),switchThree.isChecked());


                //checking if alarm is triggered
                if(alarmOne.getIsRinging() || alarmTwo.getIsRinging() || alarmThree.getIsRinging()) {  //start ringing if triggered

                    // problems start here
                    openMCQuestionInterface();

                    Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                    Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);

                    while(!MCQuestionInterface.getState())
                    {
                        r.play();
                    }

                    alarmOne.turnOff();
                    alarmTwo.turnOff();
                    alarmThree.turnOff();

                    r.stop();

                }
                //this is where we check number of solutions to deterine when to stop alarm
              // if(!answeringQuestions)
              MCQuestionInterface.reset();
            };
        };
        t.scheduleAtFixedRate(tt,500,1000); //end of loop

        //add alarm action listener

        //setting action listener
        ImageButton settings=(ImageButton) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });


        //editbutton1 action listener
        Button editButton1=(Button) findViewById(R.id.editButton1);
        editButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlarmCreator.setEditing("alarmOne");
                openAlarmCreator();
            }
        });

        //editbutton2 action listener
        Button editButton2=(Button) findViewById(R.id.editButton2);
        editButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlarmCreator.setEditing("alarmTwo");
                openAlarmCreator();
            }
        });

        //editbutton3 action listener
        Button editButton3=(Button) findViewById(R.id.editButton3);
        editButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlarmCreator.setEditing("alarmThree");
                openAlarmCreator();
            }
        });

    }

    public void openAlarmCreator(){
            Intent intent = new Intent(this, AlarmCreator.class);
            startActivity(intent);
    }
    public void openSettings(){
        Intent intent=new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void openMCQuestionInterface(){
            Intent intent = new Intent(this, MCQuestionInterface.class);
            startActivity(intent);
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
