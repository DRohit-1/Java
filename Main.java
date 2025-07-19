//Write a program to check whether a year is leap year or not

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("please enter the Year");
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int Year = input.nextInt();
        
        if(Year % 400 == 0)
            flag = true;
        else if (Year % 100 == 0)
            flag = false;
        else if (Year % 4 == 0)
            flag = true;
        else 
            flag = false ;
        
        if(flag){
            System.out.println("The " +Year+ " is leap year");
        }
        else {
            System.out.println("The " +Year+ " is not leap year");
        }
    }
}