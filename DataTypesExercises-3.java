import java.util.Scanner;
public class Exercise2 {

    public static void main(String[] Strings) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = scanner.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }
}