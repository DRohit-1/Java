//Write a program to count total number of notes in given amount
import java.util.Scanner;
public class Count_Total_Number {
    public static void main(String [] args){
        int n500 , n100 , n50 , n20 , n10 ,n5 ,n2 ,n1;
        n500 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0 ;
        
        System.out.println("Enter the amount : ");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        
        if(amount >= 500){
            n500 = amount/500;
            amount = amount%500;
            System.out.println("Note of 500 : " + n500);
        }
        
        if(amount >= 100){
            n100 = amount/100;
            amount = amount % 100;
            System.out.println("Note of 100 :"+ n100);
        }
        
        if(amount >= 50){
            n50 = amount/50;
            amount = amount % 50;
            System.out.println("Note of 50 :"+ n50);
        }
        
        if(amount >= 20){
            n20 = amount/20;
            amount = amount % 20;
            System.out.println("Note of 20 :"+ n20);
        }
        
        if(amount >= 10){
            n10 = amount/10;
            amount = amount % 10;
            System.out.println("Note of 10 :"+ n10);
        }
        
        if(amount >= 5){
            n5 = amount/5;
            amount = amount % 5;
            System.out.println("Note of 5 :"+ n5);
        }
        
        if(amount >= 2){
            n2 = amount/2;
            amount = amount % 2;
            System.out.println("Note of 2 :"+ n2);
        }
        if(amount >= 1){
            n1 = amount/1;
            amount = amount % 1;
            System.out.println("Note of 1 :"+ n1);
        }
        
        
        
        
    }
}