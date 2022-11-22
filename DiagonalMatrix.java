public class DiagonalMatrix {
    public static void main(String[] args) {
        diagonalMatrixChar(3, 'A');
    }

    public static void diagonalMatrixChar(int sideLength, char letter) {
        char[][] matrix = new char[sideLength][sideLength];

        //Scorro le righe
        for (int i = 0; i < sideLength; i++ ) {

            //Ad ogni riga scorro le colonne
            for (int j = 0; j < sideLength; j++) {
                matrix[i][j] = '0';
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }

    }
}
