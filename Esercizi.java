public class Esercizi {
    public static void main(String[] args) {
        int numGiri = 5;
        int numPartenza = 0;
        int risultato = 0;

        for(int i = numPartenza; i > numGiri; i++ ) {
            System.out.println(risultato+i);
            risultato += i;
        }
    }
}