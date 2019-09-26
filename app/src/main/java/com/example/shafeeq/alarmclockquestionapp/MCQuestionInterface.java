package com.example.shafeeq.alarmclockquestionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MCQuestionInterface extends AppCompatActivity {
    public static boolean finished=false;
    public int numQuestions=dataStorage.getNumQuestions();
    public int diffLevel=dataStorage.getDiffLevel();

    //getting questions from question bank

    public static ArrayList<MCQuestion>mcQuestions;

    public static int answered=0;
    public static int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcquestion_interface);

        String difficultyString="";

        if(diffLevel==1){
            mcQuestions=questionBank.getMCQuestions();
            difficultyString="Easy";
        }
        else if(diffLevel==2){
            mcQuestions=questionBank.getMCQuestions2();
            difficultyString="Medium";
        }
        else if(diffLevel==3){
            mcQuestions=questionBank.getMCQuestions3();
            difficultyString="Hard";
        }
        TextView title=(TextView) findViewById(R.id.header);

        title.setText("Difficulty: " + difficultyString );

        //shuffling questions
        Collections.shuffle(mcQuestions);

        TextView questionField=(TextView) findViewById(R.id.questionField);

        CheckBox choiceA=(CheckBox) findViewById(R.id.choiceA);
        CheckBox choiceB=(CheckBox) findViewById(R.id.choiceB);
        CheckBox choiceC=(CheckBox) findViewById(R.id.choiceC);
        CheckBox choiceD=(CheckBox) findViewById(R.id.choiceD);

        questionField.setText(mcQuestions.get(index).getQuestion());
        choiceA.setText(mcQuestions.get(index).getChoiceA());
        choiceB.setText(mcQuestions.get(index).getChoiceB());
        choiceC.setText(mcQuestions.get(index).getChoiceC());
        choiceD.setText(mcQuestions.get(index).getChoiceD());


            choiceA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ansChecker("A");
                }
            });

            choiceB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ansChecker("B");

                }
            });

            choiceC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ansChecker("C");

                }
            });

            choiceD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ansChecker("D");
                }
            });

    }

    public static boolean getState(){
        return finished;
    }

    public void ansChecker(String choice){
        if(finished){
            return;
        }

        boolean check=false;

        TextView questionField=(TextView) findViewById(R.id.questionField);
        TextView feedback=(TextView) findViewById(R.id.feedback);

        CheckBox choiceA=(CheckBox) findViewById(R.id.choiceA);
        CheckBox choiceB=(CheckBox) findViewById(R.id.choiceB);
        CheckBox choiceC=(CheckBox) findViewById(R.id.choiceC);
        CheckBox choiceD=(CheckBox) findViewById(R.id.choiceD);


        if(choice=="A") {
            check=mcQuestions.get(index).checkAnswer(mcQuestions.get(index).getChoiceA());
            choiceA.toggle();
        }
        if(choice=="B") {
            check=mcQuestions.get(index).checkAnswer(mcQuestions.get(index).getChoiceB());
            choiceB.toggle();
        }
        if(choice=="C") {
            check=mcQuestions.get(index).checkAnswer(mcQuestions.get(index).getChoiceC());
            choiceC.toggle();
        }
        if(choice=="D") {
            check=mcQuestions.get(index).checkAnswer(mcQuestions.get(index).getChoiceD());
            choiceD.toggle();
        }
        if(check){
            index++;
            answered++;
            feedback.setText("That answer is correct! You answered " + Integer.toString(answered) + " Questions." );

            if(answered==numQuestions){
                finished=true;
                Intent intent = new Intent(this, HomeScreen.class);
                startActivity(intent);
                return;
            }

            questionField.setText(mcQuestions.get(index).getQuestion());
            choiceA.setText(mcQuestions.get(index).getChoiceA());
            choiceB.setText(mcQuestions.get(index).getChoiceB());
            choiceC.setText(mcQuestions.get(index).getChoiceC());
            choiceD.setText(mcQuestions.get(index).getChoiceD());
        }
        else{
            feedback.setText("That answer is incorrect!");
        }
    }

    public static void reset(){
        finished=false;
        answered=0;
        index=0;
        mcQuestions=null;
    }
}
