package homeworkweek_8;

/*5. Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
Itshould return true ifthe number is a palindrome number otherwise itshould return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
Tip:What is a Palindrome number? A palindrome numberis a number which when reversed is equal
to the original number. For example: 121, 12321, and 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store itin some variable,say reverse. Compare the number
with the reverse.
If both are the same then the number is a palindrome otherwise it is not.*/

public class Question_5 {

    public static void main(String[] args) {

        System.out.println(isPalindrom(-1221));
        System.out.println(isPalindrom(707));
        System.out.println(isPalindrom(11212));
    }

    public static boolean isPalindrom(int num) {

        int reverse = 0;
        int originalNumber = num;

        while(num != 0){
          int lastDigit = num %10;
          reverse = (reverse * 10) + lastDigit;
          num /= 10;
        }
        return originalNumber == reverse;
    }
    public static boolean isPalidrome(int num){
        int reverse = 0;
        int originalNumber = num;
        while (num != 0){
            int lastDigit = num % 10;
            reverse = (reverse *10) + lastDigit;
            num /= 10;
        }
        return originalNumber ==reverse;
    }
}
