import java.util.Scanner;
public class Exercise6 {

    public static void main(String[] Strings) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = scanner.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}