import java.util.Scanner;

public class MaxIntK {
    public static void main(String[] args) {
        getMaxIntK(getNum());
    }

    public static int getNum() {
        //Inizializza lo scanner
        Scanner r = new Scanner(System.in);

        //Chiede un numero
        System.out.println("Inserisci un numero");

        //Salva il numero
        int num = r.nextInt();

        //Chiude lo scanner
        r.close();

        //Restiruisce il numero
        return num;
    }

    public static void getMaxIntK(int n) {
        int k = 0;
        for(int i = 1; i <= n; i++) {            
            System.out.println("K= " + k);
            System.out.println("i= " + i);
            System.out.println();
        } 
    }
}
