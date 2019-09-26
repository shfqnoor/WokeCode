package com.example.shafeeq.alarmclockquestionapp;

import java.util.ArrayList;

public class questionBank {
    public static ArrayList<MCQuestion> listOfMCQuestions=new ArrayList<>();
    public static ArrayList<MCQuestion> listOfMCQuestionsLevel2=new ArrayList<>();
    public static ArrayList<MCQuestion> listOfMCQuestionsLevel3=new ArrayList<>();

    public questionBank(){

    }

    //Difficulty 1
    public static ArrayList<MCQuestion> getMCQuestions(){
        listOfMCQuestions.clear();

        listOfMCQuestions.add(new MCQuestion("What is the output of the following code?\n" +
                "\n" +
                "lst=[1,2,3,2,3]\n" +
                "\n" +
                "print(lst[1])", "2", "1", "[1,2]", "4"));

        listOfMCQuestions.add(new MCQuestion("What is the output of the following code?\n" +
                "for i in range(4):\n" +
                "  print(i,end=\"\")", "0123","1234","12345","012345"));

        listOfMCQuestions.add(new MCQuestion("What is the output of the following code?\n" +
                "print(\"Hello {name1} and {name2}\".format(name1='foo', name2='bin'))", "Hello foo and bin","Hello {name1} and {name2}","Syntax Error","Hello and"));

        listOfMCQuestions.add(new MCQuestion("What is the output of the following code?\n" + "x = 123\n" +
                "for i in x: \n" +
                "    print(i)", "Error","123","012","0123"));


        listOfMCQuestions.add(new MCQuestion("doors = ['hello', 'I', 'love', 'you']\n"
                + "remix = doors[-1] + doors[1] + doors[-2]\n"
                + "print(remix)\n", "youIlove","youhellolove","lovehelloI","Index Error: list index out of range"));


        listOfMCQuestions.add(new MCQuestion("polonius = 'This above all'\n" +
                "print(polonius[1:2])\n", "none of the above","T","above all","This"));


        listOfMCQuestions.add(new MCQuestion("import turtle\n" +
                "s = turtle.Screen()\n" +
                "t = turtle.Turtle()\n" +
                "for i in range(4):\n" +
                "t.forward(100)\n" +
                "t.right(90)\n" +
                "t.forward(100)\n", "a square","three sides of a square","None of the above","two adjacent sides of a square"));


        listOfMCQuestions.add(new MCQuestion("doors = ['hello', 'I', 'love', 'you']\n"
                + "remix = doors[-1] + doors[1] + doors[-2]\n"
                + "print(remix)\n", "youIlove","youhellolove","lovehelloI","Index Error: list index out of range"));


        listOfMCQuestions.add(new MCQuestion("polonius = 'This above all'\n" +
                "print(polonius[1:2])\n", "none of the above","T","above all","This"));


        listOfMCQuestions.add(new MCQuestion("import turtle\n" +
                "s = turtle.Screen()\n" +
                "t = turtle.Turtle()\n" +
                "for i in range(4):\n" +
                "t.forward(100)\n" +
                "t.right(90)\n" +
                "t.forward(100)\n", "a square","three sides of a square","None of the above","two adjacent sides of a square"));

        listOfMCQuestions.add(new MCQuestion("warming = True\r\n" +
                "highground = True\n" +
                "if or if not warming:\n" +
                "print('sun will rise')\n" +
                "if warming:\n" +
                "print(\"many cat5's\")\n" +
                "elif not warming and highground:\n" +
                "print('no flooding')\n", "b) sun will rise\n" +
                "many cat5's","sun will rise","sun will rise\n" +
                "no flooding","none of the above"));

        listOfMCQuestions.add(new MCQuestion("test = 'common'\n" +
                "repeats = 0\n" +
                "for letter in test:\n" +
                "if test.count(letter) > 1:\n" +
                "repeats += test.count(letter)", "4","8","0","2"));

        listOfMCQuestions.add(new MCQuestion("true_count = 0\r\n" +
                "false_count = 0\n" +
                "if true_count < 0:\n" +
                "true_count -= 1\n" +
                "false_count += 1\n" +
                "else:\n" +
                "true_count -= 2\n" +
                "false_count += 2\n" +
                "if true_count > false_count:\n" +
                "true_count -= 4\n" +
                "false_count += 4\n" +
                "elif true_count == false_count:\n" +
                "true_count -= 8\n" +
                "false_count += 8\n" +
                "else:\n" +
                "true_count -= 16\n" +
                "false_count += 16\n" +
                "print(true_count, false_count)\n", "-18 18","-16 16","none of the above","-1 1"));


        return listOfMCQuestions;
    }

    //Difficulty 2
    public static ArrayList<MCQuestion> getMCQuestions2(){
        listOfMCQuestionsLevel2.clear();
        listOfMCQuestionsLevel2.add(new MCQuestion("What is the output of the following code?\n" +
                "\n" +
                "lst=[1,2,3,2,3]\n" +
                "\n" +
                "print(lst[1])", "2", "1", "[1,2]", "4"));

        listOfMCQuestionsLevel2.add(new MCQuestion("What is the output of the following code?\n" +
                "for i in range(4):\n" +
                "  print(i,end=\"\")", "0123","1234","12345","012345"));

        listOfMCQuestionsLevel2.add(new MCQuestion("What is the output of the following code?\n" +
                "print(\"Hello {name1} and {name2}\".format(name1='foo', name2='bin'))", "Hello foo and bin","Hello {name1} and {name2}","Syntax Error","Hello and"));

        listOfMCQuestionsLevel2.add(new MCQuestion("What is the output of the following code?\n" + "x = 123\n" +
                "for i in x: \n" +
                "    print(i)", "Error","123","012","0123"));


        listOfMCQuestionsLevel2.add(new MCQuestion("doors = ['hello', 'I', 'love', 'you']\n"
                + "remix = doors[-1] + doors[1] + doors[-2]\n"
                + "print(remix)\n", "youIlove","youhellolove","lovehelloI","Index Error: list index out of range"));


        listOfMCQuestionsLevel2.add(new MCQuestion("polonius = 'This above all'\n" +
                "print(polonius[1:2])\n", "none of the above","T","above all","This"));


        listOfMCQuestionsLevel2.add(new MCQuestion("import turtle\n" +
                "s = turtle.Screen()\n" +
                "t = turtle.Turtle()\n" +
                "for i in range(4):\n" +
                "t.forward(100)\n" +
                "t.right(90)\n" +
                "t.forward(100)\n", "a square","three sides of a square","None of the above","two adjacent sides of a square"));


        listOfMCQuestionsLevel2.add(new MCQuestion("doors = ['hello', 'I', 'love', 'you']\n"
                + "remix = doors[-1] + doors[1] + doors[-2]\n"
                + "print(remix)\n", "youIlove","youhellolove","lovehelloI","Index Error: list index out of range"));


        listOfMCQuestionsLevel2.add(new MCQuestion("polonius = 'This above all'\n" +
                "print(polonius[1:2])\n", "none of the above","T","above all","This"));


        listOfMCQuestionsLevel2.add(new MCQuestion("import turtle\n" +
                "s = turtle.Screen()\n" +
                "t = turtle.Turtle()\n" +
                "for i in range(4):\n" +
                "t.forward(100)\n" +
                "t.right(90)\n" +
                "t.forward(100)\n", "a square","three sides of a square","None of the above","two adjacent sides of a square"));

        listOfMCQuestionsLevel2.add(new MCQuestion("warming = True\r\n" +
                "highground = True\n" +
                "if or if not warming:\n" +
                "print('sun will rise')\n" +
                "if warming:\n" +
                "print(\"many cat5's\")\n" +
                "elif not warming and highground:\n" +
                "print('no flooding')\n", "sun will rise\n" +
                "many cat5's","sun will rise","sun will rise\n" +
                "no flooding","none of the above"));

        listOfMCQuestionsLevel2.add(new MCQuestion("test = 'common'\n" +
                "repeats = 0\n" +
                "for letter in test:\n" +
                "if test.count(letter) > 1:\n" +
                "repeats += test.count(letter)", "4","8","0","2"));

        listOfMCQuestionsLevel2.add(new MCQuestion("true_count = 0\r\n" +
                "false_count = 0\n" +
                "if true_count < 0:\n" +
                "true_count -= 1\n" +
                "false_count += 1\n" +
                "else:\n" +
                "true_count -= 2\n" +
                "false_count += 2\n" +
                "if true_count > false_count:\n" +
                "true_count -= 4\n" +
                "false_count += 4\n" +
                "elif true_count == false_count:\n" +
                "true_count -= 8\n" +
                "false_count += 8\n" +
                "else:\n" +
                "true_count -= 16\n" +
                "false_count += 16\n" +
                "print(true_count, false_count)\n", "-18 18","-16 16","none of the above","-1 1"));


        return listOfMCQuestionsLevel2;
    }

    //Difficulty 3
    public static ArrayList<MCQuestion> getMCQuestions3(){
        listOfMCQuestionsLevel3.clear();
        listOfMCQuestions.add(new MCQuestion("warming = True\r\n" +
                "highground = True\n" +
                "if or if not warming:\n" +
                "print('sun will rise')\n" +
                "if warming:\n" +
                "print(\"many cat5's\")\n" +
                "elif not warming and highground:\n" +
                "print('no flooding')\n", "b) sun will rise\n" +
                "many cat5's","sun will rise","sun will rise\n" +
                "no flooding","none of the above"));

        listOfMCQuestions.add(new MCQuestion("test = 'common'\n" +
                "repeats = 0\n" +
                "for letter in test:\n" +
                "if test.count(letter) > 1:\n" +
                "repeats += test.count(letter)", "4","8","0","2"));

        listOfMCQuestions.add(new MCQuestion("true_count = 0\r\n" +
                "false_count = 0\n" +
                "if true_count < 0:\n" +
                "true_count -= 1\n" +
                "false_count += 1\n" +
                "else:\n" +
                "true_count -= 2\n" +
                "false_count += 2\n" +
                "if true_count > false_count:\n" +
                "true_count -= 4\n" +
                "false_count += 4\n" +
                "elif true_count == false_count:\n" +
                "true_count -= 8\n" +
                "false_count += 8\n" +
                "else:\n" +
                "true_count -= 16\n" +
                "false_count += 16\n" +
                "print(true_count, false_count)\n", "0123","1234","12345","012345"));
        listOfMCQuestionsLevel3.add(new MCQuestion("chars = {'odd prime':3, 0:'unsigned', 3:'loneliest','additive identity':0}\n" +
                "print((chars[3][0]))\n" +
                "o","s","a","IndexError: index out of range","none of the above"));

        listOfMCQuestionsLevel3.add(new MCQuestion("aDict = {1:'zero', 'zero':0}\n" +
                "print(aDict[0])\n" +
                "'zero'", "1", "(1:'zero')", "KeyError: 0", "none of the above"));

        listOfMCQuestionsLevel3.add(new MCQuestion("chars = {1:'Dumbledore', 'profs':['Snape','McGonagall'], 'sides':['Ron',\n" +
                "'Hermione']}\n" +
                "print((chars[1][0]))" +
                "D","Snape","'p'","KeyError: 0","none of the above"));
        return listOfMCQuestionsLevel3;
    }
}
