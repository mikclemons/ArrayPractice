package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        double[] dailyAverageTemp = new double[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter average temperature for Sunday");

        double userInput = sc.nextDouble();
        dailyAverageTemp[0] = userInput;

        System.out.println("Enter average temperature for Monday");
        double userInput1 = sc.nextDouble();
        dailyAverageTemp[1] = userInput1;

        System.out.println("Enter average temperature for Tuesday");
        double userInput2 = sc.nextDouble();
        dailyAverageTemp[2] = userInput2;

        System.out.println("Enter average temperature for Wednesday");
        double userInput3 = sc.nextDouble();
        dailyAverageTemp[3] = userInput3;

        System.out.println("Enter average temperature for Thursday");
        double userInput4 = sc.nextDouble();
        dailyAverageTemp[4] = userInput4;

        System.out.println("Enter average temperature for Friday");
        double userInput5 = sc.nextDouble();
        dailyAverageTemp[5] = userInput5;

        System.out.println("Enter average temperature for Saturday");
        double userInput6 = sc.nextDouble();
        dailyAverageTemp[6] = userInput6;

        System.out.println("The average daily temperatures in fahrenheit for this week are:");
        for(int i = 0; i < dailyAverageTemp.length; i++){
            System.out.println(dailyAverageTemp[i]);
        }
        double totalTemps = 0;
        for(int i = 0; i < dailyAverageTemp.length; i++) {
            totalTemps += dailyAverageTemp[i];
        }
        double averageWeeklyTemp = totalTemps / 7;
            System.out.println("The weekly average temperature is " + averageWeeklyTemp + " degrees fahrenheit.");

        System.out.println("This week's average temperatures in celsius are:");

        double[] dailyAverageTempCelsius = new double[7];

        for(int i = 0; i < dailyAverageTemp.length; i++){
            double celsiusTemp = (dailyAverageTemp[i] - 32) / 1.8;
            dailyAverageTempCelsius[i] = celsiusTemp;
        }
        for(double temp : dailyAverageTempCelsius) {
            System.out.println(temp);
        }
    }
}










