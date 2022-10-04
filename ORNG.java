import java.util.Random;

public class ORNG {
    public static void main(String[] args){
        Random r = new Random();
        int randint = r.nextInt(100);
        System.out.print(randint);
    }
}
