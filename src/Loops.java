import java.util.Scanner;

public class Loops {

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public static String repeat(int count) {
        return repeat(count, "*");
    }

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //print numbers 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        //print numbers 1-10 backwards
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        //print odd numbers 1-20
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        //print even numbers 1-20
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        //print numbers from input value to 1
        System.out.println("Please enter a number from 1 to 30: ");
        int answer = key.nextInt();
        for (int i = answer; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        //print sum of numbers 1-10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();


        //print sum of numbers from input value to 1
        int sum2 = 0;
        System.out.println("Please enter a number from 1 to 100: ");
        int answer2 = key.nextInt();
        for (int i = answer2; i >= 1; i--) {
            sum2 += i;
        }
        System.out.println(sum2);
        System.out.println();

        //print 4 rows of 10 asterisks each
        for (int i = 1; i <= 4; i++) {
            System.out.println(repeat(10));
        }
        System.out.println();

        //print 5 rows of asterisks, with one asterisk in 1st row, 2 in 2nd row, etc, left aligned
        for (int n = 1; n <= 5; n++) {
            System.out.println(repeat(n));
        }
        System.out.println();

        //print 5 rows of asterisks as per above but with decreasing padding before (4 spaces in 1st row, 3 in 2nd row, etc)
        String space = "";
        for (int n = 1; n <= 5; n++) {
            if(n == 1){
                space = "    ";
            }else if (n == 2){
                space = "   ";
            }else if (n == 3){
                space = "  ";
            }else if (n == 4){
                space = " ";
            }else{
                space = "";
            }
            System.out.println(space + repeat(n));
        }
        System.out.println();

        //print the factorial of an input number
        System.out.println("Please enter a number greater than zero: ");
        int answer3 = key.nextInt();
        int product = 1;
        for (int i = answer3; i >= 1; i--){
            product = product * i;
        }
        System.out.println("The factorial of " + answer3 + " is " + product);
    }
}
