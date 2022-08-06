package homeworkweek_8;

import java.util.Scanner;

/*-Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user entersthe number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number.*/
public class Question_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int min = 0;
        int max = 50;

        System.out.println("The initial minimum value is: " + min);
        System.out.println("The initial maximum value is: " + max);

        while (true){
            System.out.println("Enter an integer. Depending on what it is the minimum or maximum value may change: ");
            boolean isanumeber = sc.hasNextInt();

        if (isanumeber){
            int value = sc.nextInt();

            if(value > max){
                System.out.println("Was entered : " + value);
                max = value;
            }
            if(value < min){
                System.out.println("Was entered : " + value);
                min = value;
            } else if (value == min || value == min) {
                continue;
            }
            else {
                break;
            }
        }
            System.out.println("The current minimum value is : " + min);
            System.out.println("The current maximum value : " + max);

            sc.close();
        }
    }
}




