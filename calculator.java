import java.util.*;

class Main {

    // methods
    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int multi(int a, int b) {
        return a * b;
    }

    static int division(int a, int b) {
        try {
            return a / b;
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Enter a:");
        a = sc.nextInt();

        System.out.println("Enter b:");
        b = sc.nextInt();

        System.out.println("Enter operator (+, -, *, /):");
        char ch = sc.next().charAt(0);

        switch (ch) {

            case '+':
                System.out.println("Sum = " + sum(a, b));
                break;

            case '-':
                System.out.println("Subtraction = " + sub(a, b));
                break;

            case '*':
                System.out.println("Multiplication = " + multi(a, b));
                break;

            case '/':
                System.out.println("Division = " + division(a, b));
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
