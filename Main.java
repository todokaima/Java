import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;
        double z = Math.round(Math.sqrt(Math.abs(y)));
        System.out.println(z);

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x:");
        x = scanner.nextDouble();

        System.out.println("enter y:");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("the hypotenuse is "+z);
        scanner.close();
    }
}