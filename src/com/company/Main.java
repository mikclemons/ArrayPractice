package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        double[] dailyAverageTemp = new double[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature");

        double userInput = sc.nextDouble();
        dailyAverageTemp[0] = userInput;

        System.out.println("Enter temperature");
        double userInput1 = sc.nextDouble();
        dailyAverageTemp[1] = userInput1;

        System.out.println("Enter temperature");
        double userInput2 = sc.nextDouble();
        dailyAverageTemp[2] = userInput2;

        System.out.println("Enter temperature");
        double userInput3 = sc.nextDouble();
        dailyAverageTemp[3] = userInput3;

        System.out.println("Enter temperature");
        double userInput4 = sc.nextDouble();
        dailyAverageTemp[4] = userInput4;

        System.out.println("Enter temperature");
        double userInput5 = sc.nextDouble();
        dailyAverageTemp[5] = userInput5;

        System.out.println("Enter temperature");
        double userInput6 = sc.nextDouble();
        dailyAverageTemp[6] = userInput6;

        for(int i = 0; i <dailyAverageTemp.length; i++){
            System.out.println(dailyAverageTemp[i]);
        }





    }
}
