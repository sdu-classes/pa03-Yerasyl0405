import java.util.Scanner;
public class Main {    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        while (true) {            try {
                int a = in.nextInt();
                int b = in.nextInt();
                Calculator obj1 = new Calculator(a, b);                System.out.println(a + " + " + b + " = " + obj1.Add());
                Calculator obj2 = new Calculator(a, b);
                System.out.println(a + " - " + b + " = "  + obj2.Subtract());
                Calculator obj3 = new Calculator(a, b);                System.out.println(a + " * " + b + " = " + obj3.Multiplication());
                Calculator obj4 = new Calculator(a, b);
                System.out.println(a + " / " + b + " = " + obj4.Division());
            } catch (ArithmeticException e) {                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please provide integers only.");            }
        }    }
} class Calculator {    private int num1;
    private int num2;    public Calculator (int num1, int num2) {
        this.num1 = num1;        this.num2 = num2;
    }
    public int Add() throws ArithmeticException {        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticException("Both numbers should be positive for addition and subtraction");        }
        return num1 + num2;    }
    public int Subtract() throws ArithmeticException {
        if (num1 < 0 || num2 < 0) {            throw new ArithmeticException("Both numbers should be positive for subtraction");
        }        return num1 - num2;
    }
    public int Multiplication() throws ArithmeticException {        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Both numbers should not be zero for multiplication and division");        }
        return num1 * num2;
    }
    public int Division() throws ArithmeticException {        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticException("Both numbers should not be zero for division");        }
        return num1 / num2;    }
}
