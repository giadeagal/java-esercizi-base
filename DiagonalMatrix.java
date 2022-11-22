public class DiagonalMatrix {
    public static void main(String[] args) {
        diagonalMatrixChar(5, 'X');
    }

    public static char[][] diagonalMatrixChar(int sideLength, char letter) {
        char[][] matrix = new char[sideLength][sideLength];

        //Scorro le righe
        for (int x = 0; x < sideLength; x++ ) {
            
            //Ad ogni riga scorro le colonne e scrivo
            for (int y = 0; y < sideLength; y++) {
                if (y == 0 && x == 0 ||
                    y == 0 && x == 4 ||
                    y == 1 && x == 1 ||
                    y == 1 && x == 3 ||
                    y == 2 && x == 2 ||
                    y == 3 && x == 1 ||
                    y == 3 && x == 3 ||
                    y == 4 && x == 0 ||
                    y == 4 && x == 4) {
                        System.out.print(" " + letter + " ");
                    } else  {
                        System.out.print(" 0 ");
                    }
            }
            System.out.println("");
            
        }
        return matrix;
    }
}
