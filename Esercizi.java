public class Esercizi {
    public static void main(String[] args) {
        int numGiri = 5;
        int numPartenza = 0;

        for(int i = numPartenza; i < numGiri; i++ ) {
            if(i == 0) {
                System.out.println(0);
                for (int j = 0; j < 2; j++) {
                    System.out.println(1);
                }
            }
        }
    }
}