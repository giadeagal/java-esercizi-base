import java.util.Scanner;
public class PariDispari {
    public static void main(String[] args) {
        isPari();
    }

    public static void isPari() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " è un numero pari");
        } else {
            System.out.println(num + " è un numero dispari");
        }
    }
}