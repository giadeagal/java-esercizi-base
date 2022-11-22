import java.util.Random;

public class MatrixAvg {
    public static void main(String[] args) {
        System.out.println(getRandomInt(10));
    }

    public static int getRandomInt(int max) {
        Random rand = new Random();
        int upperbound = max+1;
        int randoNum = rand.nextInt(upperbound);
        return randoNum;
    }
}
