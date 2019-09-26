package com.example.shafeeq.alarmclockquestionapp;

import java.util.ArrayList;
import java.util.Collections;

public class MCQuestion {
    String question;
    String answer;

    String choiceA;
    String choiceB;
    String choiceC;
    String choiceD;

    ArrayList<String> choices;



    public MCQuestion(String questionPrompt, String answer, String choice1, String choice2, String choice3) {
        question=questionPrompt;
        this.answer=answer;
        String[] answers={answer,choice1,choice2,choice3};
        choices = new ArrayList<String>();
        choices.add(answer);
        choices.add(choice1);
        choices.add(choice2);
        choices.add(choice3);
        Collections.shuffle(choices);
    }

    public boolean checkAnswer(String test){
        if(test.equals(answer)){
            return true;
        }
        return false;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }

    public String getChoiceA(){
        return choices.get(0);
    }

    public String getChoiceB(){
        return choices.get(1);
    }
    public String getChoiceC(){
        return choices.get(2);
    }

    public String getChoiceD(){
        return choices.get(3);
    }


}
