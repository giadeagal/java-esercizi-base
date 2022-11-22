import java.util.Scanner;

/*Scrivere un algoritmo che preso in input un numero
X a 5 cifre, visualizza in ordine decrescente i
numeri naturali da X a 150 a step di 2. Stampare
“ERRORE” in caso il numero inserito non rispetta i
requisiti e ripetere l’inserimento */

public class Decrescente {
    public static void main(String[] args) {
        
        soluzione();
    }

    public static int chiediNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero composto da 5 cifre");
        int num = sc.nextInt();
        sc.close();
        return num;
    }

    public static void soluzione() {
        int num = chiediNumero();
        boolean numLengthOK = String.valueOf(num).length() == 5;
        if (!numLengthOK) {
            System.out.println("ERRORE: il numero deve essere composto da 5 cifre");
            num = chiediNumero();
        } else {
            for (int i = num; i >= 150; i-=2) {
                System.out.println(i);
            }
        }
    }
}
