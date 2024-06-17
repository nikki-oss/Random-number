import java.util.Random;
import java.util.*;
public class RandomNumber{
    public static void main(String agrs[]){
        int numbermin=1;
        int numbermax=100;
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int number =random.nextInt();
        int inputInt = sc.nextInt();
        System.out.println("Generated number is:"+(number+1));

    }
}