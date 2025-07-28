// Write a program to input all sides of a triangle and check whether triangle is valid or not
import java.util.Scanner;

public class All_Side_Triangle {
    public static void main(String[] args){
        System.out.println("give the sides of Triangle");
        Scanner input = new Scanner(System.in);
        System.out.println("side 1");
        int side_1 = input.nextInt();
        System.out.println("side 2");
        int side_2 = input.nextInt();
        System.out.println("side 3");
        int side_3 = input.nextInt();
        
        if((side_1 + side_2 ) > side_3){
            if((side_2 + side_3)>side_1){
                if((side_3 + side_1)>side_2){
                    System.out.println("Triangle");
                }
                else {
                    System.out.println("Not Triangle");
                }
            }
            else{
                System.out.println("Not Triangle");
            }
        }
        else{
            System.out.println("Not Triangle");
        }
        
    }
}