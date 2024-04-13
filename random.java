import java.util.Random;

public class random {
    public static void main(String [] args){
        Random random = new Random();

        int x = random.nextInt(0,7);
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}
