import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        int year = myScan.nextInt();

        int firstDigit = year / 1000; //Splits the first digit
        int secondDigit = (year / 100) % 10; //Splits the second digit
        int thirdDigit = (year / 10) % 10; //Splits the third digit
        int fourthDigit = year % 10; //Splits the fourth digit

        System.out.println(firstDigit); //Prints all four digits in their own line
        System.out.println(secondDigit);
        System.out.println(thirdDigit);
        System.out.println(fourthDigit);

        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran
//