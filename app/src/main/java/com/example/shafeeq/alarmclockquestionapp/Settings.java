package com.example.shafeeq.alarmclockquestionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class Settings extends AppCompatActivity {
    public static int diffLevel=1;
    public static int numQuestions=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        final Spinner questions = findViewById(R.id.numQuestionSpinner);

        String[] questionOps ={"1","2","3","4","5"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, questionOps);

        questions.setAdapter(adapter1);

        CheckBox diff1 = (CheckBox) findViewById(R.id.diff1);
        CheckBox diff2 = (CheckBox) findViewById(R.id.diff2);
        CheckBox diff3 = (CheckBox) findViewById(R.id.diff3);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                CheckBox diff1 = (CheckBox) findViewById(R.id.diff1);
                CheckBox diff2 = (CheckBox) findViewById(R.id.diff2);
                CheckBox diff3 = (CheckBox) findViewById(R.id.diff3);

                if(dataStorage.getDiffLevel()==1) {
                    diff1.setChecked(true);
                }
                else if(dataStorage.getDiffLevel()==2){
                    diff2.setChecked(true);
                }
                else if(dataStorage.getDiffLevel()==3){
                    diff3.setChecked(true);
                }
            }
        };t.scheduleAtFixedRate(tt,500,1000);

        diff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                CheckBox diff1=(CheckBox) findViewById(R.id.diff1);
                CheckBox diff2=(CheckBox) findViewById(R.id.diff2);
                CheckBox diff3=(CheckBox) findViewById(R.id.diff3);

                diff2.setChecked(false);
                diff3.setChecked(false);
                diff1.setChecked(true);
                dataStorage.setDiffLevel(1);
            }
        });
        diff2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                CheckBox diff1=(CheckBox) findViewById(R.id.diff1);
                CheckBox diff2=(CheckBox) findViewById(R.id.diff2);
                CheckBox diff3=(CheckBox) findViewById(R.id.diff3);

                diff1.setChecked(false);
                diff3.setChecked(false);
                diff2.setChecked(true);
                dataStorage.setDiffLevel(2);
            }
        });
        diff3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                CheckBox diff1=(CheckBox) findViewById(R.id.diff1);
                CheckBox diff2=(CheckBox) findViewById(R.id.diff2);
                CheckBox diff3=(CheckBox) findViewById(R.id.diff3);

                diff1.setChecked(false);
                diff2.setChecked(false);
                diff3.setChecked(true);
                dataStorage.setDiffLevel(3);
            }
        });



        Button done=(Button) findViewById(R.id.doneButton);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataStorage.setNumQuestions(Integer.parseInt(questions.getSelectedItem().toString()));
                openHome();
            }
        });

    }
    public void openHome(){
        Intent intent=new Intent(this, HomeScreen.class);
        startActivity(intent);

    }

    public static int getDifficulty(){
        return diffLevel;
    }
    public static int getNumQuestions(){
        return numQuestions;
    }
}
