//Write a program to check whether a character is alphabet or not
import java.util.Scanner;

public class Check_Alphabet{
    public static void main(String[] args){
        System.out.println("Enter the charachter");
        Scanner input = new Scanner(System.in);
        
        char ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("charachter");
        }
        
        else{
            System.out.println("not charachter");
        }
    }
}