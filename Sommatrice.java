import java.util.Scanner;

public class Sommatrice {

   public static void main(String[] args) {
        boolean continua = true;
        int num;
        int tot = 0; 
        while(continua) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserisci un numero");
            num = sc.nextInt();
            if (num == 0) {
                continua = false;
                System.out.println("totale = " + tot);
            } else {
                tot += num;
            }
        }
   } 
}