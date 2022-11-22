import java.util.Random;

public class MatrixAvg {
    public static void main(String[] args) {
        int matrixSide = getRandomInt(10);
        while (matrixSide == 0 || matrixSide == 1) {
            matrixSide = getRandomInt(10);
        }
        int[][] matrix1 = getRandomMatrix(matrixSide, matrixSide);

    }

    public static int getRandomInt(int max) {
        Random randomize = new Random();
        int upperbound = max+1;
        int randoNum = randomize.nextInt(upperbound);
        return randoNum;
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
