import java.util.Scanner;

public class MaAlpha_Num_Spl{
    public static void main(String[] args){
        
        System.out.println("Enter charachter or digit or any special sign");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("this "+ch+ " Is charachter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("this "+ch+ " Is Number");
        }
        else{
             System.out.println("this "+ch+ " Is special charachter");
        }
        
        
            
        }
    }