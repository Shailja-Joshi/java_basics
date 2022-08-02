package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
/*
    //finding percentage from given marks of different subjects
        System.out.println("Taking user input");
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter no. 1");
        float a = s.nextInt();
        // System.out.println(a);
        float b = s.nextInt();
        //  System.out.println(a);
        float c = s.nextInt();
        //  System.out.println(a);
        float d = s.nextInt();
        //  System.out.println(a);
        float e = s.nextInt();
        //  System.out.println(a);
        //88 int tM = s.nextInt();
        //System.out.println(a);
        float p = ((a + b + c + d + e) / 500)*100;
        System.out.println(p);
*/

    //String Functions

        String str1="Hi there girl          ";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1);   //above methods dont change original string
        System.out.println(str1.trim());
        System.out.println(str1.substring(0,8));
        System.out.println(str1.replace('e','i'));
        System.out.println(str1.charAt(5));
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.indexOf('e',6));
        System.out.println(str1.indexOf('z'));
        System.out.println(str1.lastIndexOf('e'));
        System.out.println(str1.equals("Hi THERE girl          "));
        System.out.println(str1.equalsIgnoreCase("Hi THERE girl          "));
        System.out.println("Hi there\ngirl          ");   //escape characters


        System.out.println("\n");
    //if-else statements
        int age=18;
        char gender='F';
        if(age>18)
            System.out.println("You are mature");
        else if(age==18 && gender=='F')
            System.out.println("you are just 18!");
        else
            System.out.println("you are just a kid");

        System.out.println("\n");

   //switch statements
        int marks=80;
        switch(marks)
        {
            case 34:
                System.out.println("You just passed");
                break;   //if break is not used all cases after matching the case are executed including default
            case 80:
                System.out.println("You got good marks");
                break;
            case 99:
                System.out.println("Hello topper");
                break;

            default:
                System.out.println("this is your marks");
        }
        System.out.println("\n");


    //while loop
        int itr=3;
        while(itr<10){
           System.out.println(itr*2);
            itr++;
        }
        System.out.println("\n");
//         infinite loops--------------
//        while(itr<10){
//            System.out.println(itr);
//        }

//        while(true){
//           System.out.println(itr);
//        }

//       invalid loop---will give error bcz in java it can't be int but can only be boolean unlike c++------
//        while(1){
//           System.out.println(itr);
//        }

    //do-while loop
        int itr2=1;
        do{    //atleast one time loop runs without checking condition for first time
            System.out.println(itr2*2);
            itr2++;
        }while(itr2<3);
        System.out.println("\n");

    //for loop
        for(int itr3=0;itr3<8;itr3++)
        {
            System.out.println(itr3*3);
        }
        System.out.println("\n");















    }
}