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

    public static void soluzione() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero composto da 5 cifre");
        int num = sc.nextInt();
        boolean numLengthOK = String.valueOf(num).length() == 4;
        if (!numLengthOK) {
            System.out.println("il numero deve essere composto da 5 cifre");
        } else {
            System.out.println("numero OK");
        }
    }
}
