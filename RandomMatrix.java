import java.util.Random;

public class RandomMatrix {
    public static void main(String[] args) {
        getRandomMatrix(4, 3);
    }

    public static int[][] getRandomMatrix(int rowNum, int colNum) {
        int rows = rowNum;
        int cols = colNum;
        int[][] matrix = new int[rows][cols];
        Random randomize = new Random();
        int upperbound = 10;
        
        //Popolo la matrice
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int randoNum = randomize.nextInt(upperbound);
                System.out.print(" " + randoNum + " ");
            }
            System.out.println();
        }

        return matrix;
    }
}
