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
}
