import java.util.Scanner;

public class ValAssoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println(num * -1);
        } else {
            System.out.println(num);
        }

        sc.close();
    }
}
