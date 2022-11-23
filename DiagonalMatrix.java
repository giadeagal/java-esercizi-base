public class DiagonalMatrix {
    public static void main(String[] args) {
        diagonalMatrixChar(10, '|');
    }

    public static char[][] diagonalMatrixChar(int sideLength, char letter) {
        char[][] matrix = new char[sideLength][sideLength];

        //Scorro le righe
        for (int x = 0; x < sideLength; x++ ) {
            
            //Ad ogni riga scorro le colonne e scrivo
            for (int y = 0; y < sideLength; y++) {
                if (x == y || x + y == sideLength-1) {
                        System.out.print(" " + letter + " ");
                    } else  {
                        System.out.print(" O ");
                    }
            }
            System.out.println("");
            
        }
        return matrix;
    }
}
